Ext.onReady(function() {
	var Server_recordclassify = "server_record";
	var Server_recordtitle = "当前位置:业务管理》" + Server_recordclassify;
	var Server_recordaction = "Server_recordService.do";
	var Server_recordfields = ['recordid'
	        			    ,'recordproduct' 
	        			    ,'recordcategory' 
	        			    ,'recordcompany' 
	        			    ,'recordnationality' 
	        			    ,'recordposition' 
	        			    ,'recordsubject' 
	        			    ,'recordagency' 
	        			    ,'recordaddress' 
	        			    ,'recordotherinfo' 
	        			    ,'recordyear' 
	        			    ,'recordissuenumber' 
	        			    ,'recordpage' 
	        			    ,'recorddate' 
	        			    ,'recordlunadate' 
	        			    ,'recordminguodate' 
	        			    ,'recordredate' 
	        			    ,'recordfulltext' 
	        			    ,'recorddescription' 
	        			    ,'recordtitle' 
	        			    ,'recordpublisher' 
	        			    ,'recorddetails' 
	        			      ];// 全部字段
	var Server_recordkeycolumn = [ 'recordid' ];// 主键
	var Server_recordstore = dataStore(Server_recordfields, basePath + Server_recordaction + "?method=selQuery");// 定义Server_recordstore
	var Server_recorddataForm = Ext.create('Ext.form.Panel', {// 定义新增和修改的FormPanel
		id:'Server_recorddataForm',
		labelAlign : 'right',
		frame : true,
		layout : 'column',
		items : [{
			columnWidth : .5,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : 'ID',
				allowBlank : false,
				id : 'Server_recordrecordid',
				name : 'recordid'
			} ]
		}
		, {
			columnWidth : .5,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				allowBlank : false,
				fieldLabel : '商品',
				id : 'Server_recordrecordproduct',
				name : 'recordproduct'
			} ]
		}
		, {
			columnWidth : .5,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '分类',
				allowBlank : false,
				id : 'Server_recordrecordcategory',
				name : 'recordcategory'
			} ]
		}
		, {
			columnWidth : .5,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '公司',
				id : 'Server_recordrecordcompany',
				name : 'recordcompany'
			} ]
		}
		, {
			columnWidth : .5,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '国别',
				allowBlank : false,
				id : 'Server_recordrecordnationality',
				name : 'recordnationality'
			} ]
		}
		, {
			columnWidth : .5,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				allowBlank : false,
				fieldLabel : '版面位置',
				id : 'Server_recordrecordposition',
				name : 'recordposition'
			} ]
		}
		, {
			columnWidth : .5,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '主题词',
				allowBlank : false,
				id : 'Server_recordrecordsubject',
				name : 'recordsubject'
			} ]
		}
		, {
			columnWidth : .5,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '代理商',
				id : 'Server_recordrecordagency',
				name : 'recordagency'
			} ]
		}
		, {
			columnWidth : .5,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '地址',
				id : 'Server_recordrecordaddress',
				name : 'recordaddress'
			} ]
		}
		, {
			columnWidth : .5,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '相关网站',
				id : 'Server_recordrecordotherinfo',
				name : 'recordotherinfo'
			} ]
		}
		, {
			columnWidth : .5,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '年',
				allowBlank : false,
				id : 'Server_recordrecordyear',
				name : 'recordyear'
			} ]
		}
		, {
			columnWidth : .5,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '期号',
				id : 'Server_recordrecordissuenumber',
				name : 'recordissuenumber'
			} ]
		}
		, {
			columnWidth : .5,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '版面',
				id : 'Server_recordrecordpage',
				name : 'recordpage'
			} ]
		}
		, {
			columnWidth : .5,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '公历日期',
				id : 'Server_recordrecorddate',
				name : 'recorddate'
			} ]
		}
		, {
			columnWidth : .5,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				allowBlank : false,
				fieldLabel : '农历日期',
				id : 'Server_recordrecordlunadate',
				name : 'recordlunadate'
			} ]
		}
		, {
			columnWidth : .5,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '民国日期',
				id : 'Server_recordrecordminguodate',
				name : 'recordminguodate'
			} ]
		}
		, {
			columnWidth : .5,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '帝王纪年',
				id : 'Server_recordrecordredate',
				name : 'recordredate'
			} ]
		}
		, {
			columnWidth : .5,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '全文',
				allowBlank : false,
				id : 'Server_recordrecordfulltext',
				name : 'recordfulltext'
			} ]
		}
		, {
			columnWidth : .5,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '描述',
				allowBlank : false,
				id : 'Server_recordrecorddescription',
				name : 'recorddescription'
			} ]
		}
		, {
			columnWidth : .5,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				allowBlank : false,
				fieldLabel : '标题',
				id : 'Server_recordrecordtitle',
				name : 'recordtitle'
			} ]
		}
		, {
			columnWidth : .5,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '出版商',
				id : 'Server_recordrecordpublisher',
				name : 'recordpublisher'
			} ]
		}
//		, {
//			columnWidth : .5,
//			layout : 'form',
//			items : [ {
//				xtype : 'textfield',
//				fieldLabel : '备注',
//				id : 'Server_recordrecorddetails',
//				name : 'recorddetails'
//			} ]
//		}
		]
	});
	
	var Server_recordbbar = pagesizebar(Server_recordstore);//定义分页
	var Server_recordgrid =  Ext.create('Ext.grid.Panel', {
		height : document.documentElement.clientHeight - 4,
		width : '100%',
		//title : Server_recordtitle,
		store : Server_recordstore,
		bbar : Server_recordbbar,
	    selModel: {
	        type: 'checkboxmodel'
	    },
	    plugins: {
	         ptype: 'cellediting',
	         clicksToEdit: 1
	    },
		columns : [{xtype: 'rownumberer',width:50}, 
		{// 改
			header : 'ID',
			dataIndex : 'recordid',
			sortable : true, 
			editor: {
                xtype: 'textfield',
                editable: false
            }
		}
		, {
			header : '商品',
			dataIndex : 'recordproduct',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '分类',
			dataIndex : 'recordcategory',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '公司',
			dataIndex : 'recordcompany',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '国别',
			dataIndex : 'recordnationality',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '版面位置',
			dataIndex : 'recordposition',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '主题词',
			dataIndex : 'recordsubject',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '代理商',
			dataIndex : 'recordagency',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '地址',
			dataIndex : 'recordaddress',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '相关网站',
			dataIndex : 'recordotherinfo',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '年',
			dataIndex : 'recordyear',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '期号',
			dataIndex : 'recordissuenumber',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '版面',
			dataIndex : 'recordpage',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '公历日期',
			dataIndex : 'recorddate',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '农历日期',
			dataIndex : 'recordlunadate',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '民国日期',
			dataIndex : 'recordminguodate',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '帝王纪年',
			dataIndex : 'recordredate',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '全文',
			dataIndex : 'recordfulltext',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '描述',
			dataIndex : 'recorddescription',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '标题',
			dataIndex : 'recordtitle',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '出版商',
			dataIndex : 'recordpublisher',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
//		, {
//			header : '备注',
//			dataIndex : 'recorddetails',
//			sortable : true,  
//			editor: {
//                xtype: 'textfield'
//            }
//		}
		],
		tbar : [{
				text : Ext.os.deviceType === 'Phone' ? null : "查看",
				iconCls : 'query',
				handler : function() {
					var selections = Server_recordgrid.getSelection();
					if (selections.length != 1) {
						Ext.Msg.alert('提示', '请选择一条数据！', function() {
						});
						return;
					}
					createchakanWindow( selections[0]);
				}
			},'-',{
				text : Ext.os.deviceType === 'Phone' ? null : "新增",
				iconCls : 'add',
				handler : function() {
					Server_recorddataForm.form.reset();
					Ext.getCmp("Server_recordrecordid").setEditable (true);
					createTextWindow(basePath + Server_recordaction + "?method=insAll", "新增", Server_recorddataForm, Server_recordstore);
				}
			},'-',{
				text : Ext.os.deviceType === 'Phone' ? null : "保存",
				iconCls : 'ok',
				handler : function() {
					var selections = Server_recordgrid.getSelection();
					if (Ext.isEmpty(selections)) {
						Ext.Msg.alert('提示', '请至少选择一条数据！');
						return;
					}
					commonSave(basePath + Server_recordaction + "?method=updAll",selections);
				}
			},'-',{
				text : Ext.os.deviceType === 'Phone' ? null : "修改",
				iconCls : 'edit',
				handler : function() {
					var selections = Server_recordgrid.getSelection();
					if (selections.length != 1) {
						Ext.Msg.alert('提示', '请选择一条数据！', function() {
						});
						return;
					}
//					Server_recorddataForm.form.reset();
//					Ext.getCmp("Server_recordrecordid").setEditable (false);
					createimgWindow(basePath + Server_recordaction + "?method=updAll", "修改", selections[0], Server_recordstore);
//					Server_recorddataForm.form.loadRecord(selections[0]);
				}
			},'-',{
	            text: '操作',
	            menu: {
	                xtype: 'menu',
	                items: {
	                    xtype: 'buttongroup',
	                    columns: 3,
	                    items: [{
	                    	text : "删除",
	        				iconCls : 'delete',
	        				handler : function() {
	        					var selections = Server_recordgrid.getSelection();
	        					if (Ext.isEmpty(selections)) {
	        						Ext.Msg.alert('提示', '请至少选择一条数据！');
	        						return;
	        					}
	        					commonDelete(basePath + Server_recordaction + "?method=delAll",selections,Server_recordstore,Server_recordkeycolumn);
	        				}
	                    },{
	                    	text : "导入",
	        				iconCls : 'imp',
	        				handler : function() {
	        					commonImp(basePath + Server_recordaction + "?method=impAll","导入",Server_recordstore);
	        				}
	                    },{
	                    	text : "导出",
	        				iconCls : 'exp',
	        				handler : function() {
	        					Ext.Msg.confirm('请确认', '<b>提示:</b>请确认要导出当前数据？', function(btn, text) {
	        						if (btn == 'yes') {
	        							window.location.href = basePath + Server_recordaction + "?method=expAll&json="+queryjson+"&query="+Ext.getCmp("queryServer_recordaction").getValue(); 
	        						}
	        					});
	        				}
	                    },{
	        				text : "筛选",
    						iconCls : 'select',
    						handler : function() {
    							Ext.getCmp("Server_recordrecordid").setEditable (true);
    							createQueryWindow("筛选", Server_recorddataForm, Server_recordstore,Ext.getCmp("queryServer_recordaction").getValue());
    						}
    					}]
	                }
	            }
			},'->',{
				xtype : 'textfield',
				id : 'queryServer_recordaction',
				name : 'query',
				emptyText : '模糊匹配',
				width : 100,
				enableKeyEvents : true,
				listeners : {
					specialkey : function(field, e) {
						if (e.getKey() == Ext.EventObject.ENTER) {
							var querystr = Ext.getCmp("queryServer_recordaction").getValue();
							querystr = querystr.replace("'", "''");
							Server_recordstore.load({
									params : {
										start : 0,
										limit : PAGESIZE,
										json : queryjson,
										query : querystr
									}
							});
						}
					}
				}
			},{
				text : "查询",
				xtype: 'button',
				handler : function() {
					var querystr = Ext.getCmp("queryServer_recordaction").getValue();
					querystr = querystr.replace("'", "''");
					var strjt = simplized(querystr);
					var strft = traditionalized(querystr);
					Server_recordstore.load({
							params : {
								start : 0,
								limit : PAGESIZE,
								json : queryjson,
								query : querystr,
								queryft : strft,
								queryjt : strjt
							}
					});
				}
			}
		]
	});
	Server_recordgrid.region = 'center';
	Server_recordstore.on("beforeload",function(){ 
		var querystr = Ext.getCmp("queryServer_recordaction").getValue();
		querystr = querystr.replace("'", "''");
		var strjt = simplized(querystr);
		var strft = traditionalized(querystr);
		Server_recordstore.getProxy().extraParams = {
				json : queryjson,
				query : querystr,
				queryft : strft,
				queryjt : strjt
		}; 
	});
	Server_recordstore.load();//加载数据
	var win = new Ext.Viewport({//只能有一个viewport
		resizable : true,
		layout : 'border',
		bodyStyle : 'padding:0px;',
		items : [ Server_recordgrid ]
	});
})
function createimgWindow(url,title,selections,store) {
	var imgForm = Ext.create('Ext.form.Panel', {// 定义新增和修改的FormPanel
		id:'imgForm',
		labelAlign : 'right',
		frame : true,
		layout : 'column',
		items : [{
			columnWidth : .5,
			layout : 'form',
			items : [ {
				xtype: 'image',
				id : 'imgxiaoid',
				height: 150,
			    width: 150
			},{
				xtype: 'image',
				id : 'imgdaid',
				height: 150,
			    width: 150
			} ]
		}
		,  {
			columnWidth : .5,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : 'ID',
				editEnble : false,
				name : 'recordid'
			} ]
		}
		, {
			columnWidth : .5,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '商品',
				name : 'recordproduct'
			} ]
		}
		, {
			columnWidth : .5,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '分类',
				name : 'recordcategory'
			} ]
		}
		, {
			columnWidth : .5,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '公司',
				name : 'recordcompany'
			} ]
		}
		, {
			columnWidth : .5,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '国别',
				name : 'recordnationality'
			} ]
		}
		, {
			columnWidth : .5,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '版面位置',
				name : 'recordposition'
			} ]
		}
		, {
			columnWidth : .5,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '主题词',
				name : 'recordsubject'
			} ]
		}
		, {
			columnWidth : .5,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '代理商',
				name : 'recordagency'
			} ]
		}
		, {
			columnWidth : .5,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '地址',
				name : 'recordaddress'
			} ]
		}
		, {
			columnWidth : .5,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '相关网站',
				name : 'recordotherinfo'
			} ]
		}
		, {
			columnWidth : .5,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '年',
				name : 'recordyear'
			} ]
		}
		, {
			columnWidth : .5,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '期号',
				name : 'recordissuenumber'
			} ]
		}
		, {
			columnWidth : .5,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '版面',
				name : 'recordpage'
			} ]
		}
		, {
			columnWidth : .5,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '公历日期',
				name : 'recorddate'
			} ]
		}
		, {
			columnWidth : .5,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '农历日期',
				name : 'recordlunadate'
			} ]
		}
		, {
			columnWidth : .5,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '民国日期',
				name : 'recordminguodate'
			} ]
		}
		, {
			columnWidth : .5,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '帝王纪年',
				name : 'recordredate'
			} ]
		}
		, {
			columnWidth : .5,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '全文',
				name : 'recordfulltext'
			} ]
		}
		, {
			columnWidth : .5,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '描述',
				name : 'recorddescription'
			} ]
		}
		, {
			columnWidth : .5,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '标题',
				name : 'recordtitle'
			} ]
		}
		, {
			columnWidth : .5,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '出版商',
				name : 'recordpublisher'
			} ]
		}
//		, {
//			columnWidth : .5,
//			layout : 'form',
//			items : [ {
//				xtype : 'textfield',
//				fieldLabel : '备注',
//				name : 'recorddetails'
//			} ]
//		}
		]
	});
	imgForm.form.loadRecord(selections);
	Ext.getCmp("imgxiaoid").setSrc ("../../html/tupian/"+selections.data['recordid']+".png");
	Ext.getCmp("imgdaid").setSrc ("../../html/tupian/"+selections.data['recordid']+"PAGE.png");
	var dataWindow1 = new Ext.Window({
		title : title, // 窗口标题
		layout : 'fit', // 设置窗口布局模式
		width : Ext.os.deviceType === 'Phone' ? '100%' : 750, // 窗口宽度
		modal : true,
//		closeAction: 'hide',
		closable : true, // 是否可关闭
		collapsible : true, // 是否可收缩
		maximizable : true, // 设置是否可以最大化
		border : false, // 边框线设置
		animateTarget : Ext.getBody(),
		pageY : 0, // 页面定位Y坐标
		pageX : Ext.os.deviceType === 'Phone' ? 0 : document.body.clientWidth / 2 - 720 / 2, // 页面定位X坐标
		items : imgForm, // 嵌入的表单面板
		buttons : [
				{
					text : '提交',
					iconCls : 'ok',
					handler : function() {
						if (imgForm.form.isValid()) {
							var json = "[" + Ext.encode(imgForm.form.getValues(false)) + "]";
							imgForm.form.submit({
								url : url,
								waitTitle : '提示',
								params : {//改
									json : json
								},
								success : function(form, action) {
									Ext.Msg.alert('提示', action.result.msg,function(){
										dataWindow1.close();
										store.reload();
									});
								},
								failure : function(form, action) {
									Ext.Msg.alert('提示', '网络出现问题，请稍后再试');
								},
								waitMsg : '正在处理数据,请稍候...'
							});
						} else {
					        Ext.Msg.alert('提示', '请正确填写表单!');
					    }
					}
				}, {
					text : '关闭',
					iconCls : 'close',
					handler : function() {
						dataWindow.close();
					}
				}]
	});
	dataWindow1.show();
}

function createchakanWindow(selections) {
	var imgForm = Ext.create('Ext.form.Panel', {// 定义新增和修改的FormPanel
		id:'imgForm',
		labelAlign : 'right',
		frame : true,
		layout : 'column',
		items : [{
			columnWidth : .5,
			layout : 'form',
			items : [ {
				xtype: 'image',
				id : 'imgxiaoid',
				height: 150,
			    width: 150
			},{
				xtype: 'image',
				id : 'imgdaid',
				height: 150,
			    width: 150
			} ]
		}
		,  {
			columnWidth : .5,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : 'ID',
				editEnble : false,
				name : 'recordid'
			} ]
		}
		, {
			columnWidth : .5,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				readOnly:true,
				fieldLabel : '商品',
				name : 'recordproduct'
			} ]
		}
		, {
			columnWidth : .5,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				readOnly:true,
				fieldLabel : '分类',
				name : 'recordcategory'
			} ]
		}
		, {
			columnWidth : .5,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				readOnly:true,
				fieldLabel : '公司',
				name : 'recordcompany'
			} ]
		}
		, {
			columnWidth : .5,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '国别',
				readOnly:true,
				name : 'recordnationality'
			} ]
		}
		, {
			columnWidth : .5,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '版面位置',
				readOnly:true,
				name : 'recordposition'
			} ]
		}
		, {
			columnWidth : .5,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				readOnly:true,
				fieldLabel : '主题词',
				name : 'recordsubject'
			} ]
		}
		, {
			columnWidth : .5,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				readOnly:true,
				fieldLabel : '代理商',
				name : 'recordagency'
			} ]
		}
		, {
			columnWidth : .5,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				readOnly:true,
				fieldLabel : '地址',
				name : 'recordaddress'
			} ]
		}
		, {
			columnWidth : .5,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '相关网站',
				readOnly:true,
				name : 'recordotherinfo'
			} ]
		}
		, {
			columnWidth : .5,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				readOnly:true,
				fieldLabel : '年',
				name : 'recordyear'
			} ]
		}
		, {
			columnWidth : .5,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '期号',
				readOnly:true,
				name : 'recordissuenumber'
			} ]
		}
		, {
			columnWidth : .5,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				readOnly:true,
				fieldLabel : '版面',
				name : 'recordpage'
			} ]
		}
		, {
			columnWidth : .5,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				readOnly:true,
				fieldLabel : '公历日期',
				name : 'recorddate'
			} ]
		}
		, {
			columnWidth : .5,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				readOnly:true,
				fieldLabel : '农历日期',
				name : 'recordlunadate'
			} ]
		}
		, {
			columnWidth : .5,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				readOnly:true,
				fieldLabel : '民国日期',
				name : 'recordminguodate'
			} ]
		}
		, {
			columnWidth : .5,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				readOnly:true,
				fieldLabel : '帝王纪年',
				name : 'recordredate'
			} ]
		}
		, {
			columnWidth : .5,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '全文',
				readOnly:true,
				name : 'recordfulltext'
			} ]
		}
		, {
			columnWidth : .5,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '描述',
				readOnly:true,
				name : 'recorddescription'
			} ]
		}
		, {
			columnWidth : .5,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				readOnly:true,
				fieldLabel : '标题',
				name : 'recordtitle'
			} ]
		}
		, {
			columnWidth : .5,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				readOnly:true,
				fieldLabel : '出版商',
				name : 'recordpublisher'
			} ]
		}
//		, {
//			columnWidth : .5,
//			layout : 'form',
//			items : [ {
//				xtype : 'textfield',
//				fieldLabel : '备注',
//				name : 'recorddetails'
//			} ]
//		}
		]
	});
	imgForm.form.loadRecord(selections);
	Ext.getCmp("imgxiaoid").setSrc ("../../html/tupian/"+selections.data['recordid']+".png");
	Ext.getCmp("imgdaid").setSrc ("../../html/tupian/"+selections.data['recordid']+"PAGE.png");
	var dataWindow1 = new Ext.Window({
		title : '查看', // 窗口标题
		layout : 'fit', // 设置窗口布局模式
		width : Ext.os.deviceType === 'Phone' ? '100%' : 750, // 窗口宽度
		modal : true,
//		closeAction: 'hide',
		closable : true, // 是否可关闭
		collapsible : true, // 是否可收缩
		maximizable : true, // 设置是否可以最大化
		border : false, // 边框线设置
		animateTarget : Ext.getBody(),
		pageY : 0, // 页面定位Y坐标
		pageX : Ext.os.deviceType === 'Phone' ? 0 : document.body.clientWidth / 2 - 720 / 2, // 页面定位X坐标
		items : imgForm
	});
	dataWindow1.show();
}