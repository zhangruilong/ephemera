Ext.onReady(function() {
	var fid = "images",classify="images";
	var loadurl = basePath + "System_attachAction.do?method=selQueryByFid"; 
	var saveurl = basePath + "System_attachAction.do?other=getch&method=upload";
	var delurl = basePath + "System_attachAction.do?method=delAll";
	var selectfields = [ "id", "code", "name", "detail", "classify", "type",
			"attachsize", "fid", "creator", "createtime" ];// 改
	var selectstore = Ext.create('Ext.data.Store', {
		 fields: selectfields,
	     proxy: {
	         type: 'ajax',
	         url: loadurl + "&fid=" + fid,
	         reader: {
	             type: 'json',
	             rootProperty: 'root',
	             totalProperty : 'total',
	         }
	     }
	 });
	var selectgrid = Ext.create('Ext.grid.Panel', {
			height : document.documentElement.clientHeight - 4,
			width : '100%',
			store : selectstore,
		    selModel: {
		    	type: 'checkboxmodel'
		     },
		     columns : [{xtype: 'rownumberer',width:50}, 
		    {
				header : "编码",
				dataIndex : "code",
				sortable : true
			}, {
				header : "文件",
				dataIndex : "name",
				width : 200,
				sortable : true,
				renderer : domUrl
			}, {
				header : "描述",
				dataIndex : "detail",
				width : 200,
				sortable : true
			}, {
				header : "分类",
				dataIndex : "classify",
				sortable : true
			}, {
				header : "类型",
				dataIndex : "type",
				sortable : true
			}, {
				header : "大小",
				dataIndex : "attachsize",
				sortable : true
			}, {
				header : "外键",
				dataIndex : "fid",
				hidden : true
			}, {
				header : "创建人",
				dataIndex : "creator",
				hidden : true
			}, {
				header : "创建时间",
				dataIndex : "createtime",
				sortable : true
			}, {
				header : "ID",
				dataIndex : "id",
				hidden : true
			}],
			tbar : [{
					text : '新增',
					iconCls : 'add',
					handler : function() {
						commonAttachUpload(saveurl, fid, classify, selectstore);
					}
				},'-',{
					text : '删除',
					iconCls : 'delete',
					handler : function() {
						var selections = selectgrid.getSelection();
						if (Ext.isEmpty(selections)) {
							Ext.Msg.alert('提示', '请选择您要删除的数据！');
							return;
						}
						var keycolumn = [ 'id' ];// 主键
						commonDelete(delurl,selections,selectstore,keycolumn);
					}
				}]
		});
	selectgrid.region = 'center';
	selectstore.load();//加载数据
	var win = new Ext.Viewport({//只能有一个viewport
		resizable : true,
		layout : 'border',
		bodyStyle : 'padding:0px;',
		items : [ selectgrid ]
	});
})
//附件上传
function commonAttachUpload(saveurl,fid, classify, store) {
	var commonAttachUploadForm = new Ext.form.FormPanel({
		id : 'commonAttachUpload-form',
		labelAlign : 'right', // 标签对齐方式
		layout : 'column',
		frame : true,
		items : [ {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '编码',
				id : 'attachcode',
				name : 'code',
				maxLength : 100,
				anchor : '95%'
			} ]
		}, {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '描述',
				id : 'attachdetail',
				name : 'detail',
				maxLength : 100,
				anchor : '95%'
			} ]
		}, {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '分类',
				id : 'attachclassify',
				name : 'classify',
				maxLength : 100,
				value : classify,
				readOnly : true,
				anchor : '95%'
			} ]
		}, {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'hidden',
				fieldLabel : '外键',
				id : 'attachfid',
				name : 'fid',
				maxLength : 100,
				value : fid,
				readOnly : true,
				anchor : '95%'
			} ]
		}, {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'filefield',
				fieldLabel : '文件',
				id : 'upload',
				name : 'upload',
				allowBlank : false,
				anchor : '95%'
			} ]
		} ]
	});
	var commonAttachUploadWindow = new Ext.Window({
		title : '上传附件', // 窗口标题
		layout : 'fit', // 设置窗口布局模式
		width : Ext.os.deviceType === 'Phone' ? '100%' : 420, // 窗口宽度
		height :300, // 窗口高度
		modal : true,//背景失效
		closable : true, // 是否可关闭
		collapsible : true, // 是否可收缩
		maximizable : true, // 设置是否可以最大化
		border : false, // 边框线设置
		pageY : 50, // 页面定位Y坐标
		pageX : Ext.os.deviceType === 'Phone' ? 0 : document.body.clientWidth / 2 - 320 / 2, // 页面定位X坐标
		items : commonAttachUploadForm, // 嵌入的表单面板
		buttons : [
				{
					text : '提交',
					iconCls : 'ok',
					handler : function() {
						if (commonAttachUploadForm.form.isValid()) {
							var json = "[" + Ext.encode(commonAttachUploadForm.form.getValues(false)) + "]";
							commonAttachUploadForm.form.submit({
								url : saveurl+"&json="+json,
								waitTitle : '提示',
								method : 'GET',
								waitMsg : '正在处理数据,请稍候...',
								success : function(form, action) {
									Ext.Msg.alert('提示', '操作成功');
									store.reload();
									commonAttachUploadWindow.close();
								},
								failure : function(form, action) {
									Ext.Msg.alert('提示', '网络出现问题，请稍后再试');
								}
							});
						} else {
					        Ext.Msg.alert('提示', '请正确填写表单!');
					    }
					}
				}, {
					text : '关闭',
					iconCls : 'close',
					handler : function() {
						commonAttachUploadWindow.close();
					}
				} ]
	});
	commonAttachUploadWindow.show(); // 显示窗口
}