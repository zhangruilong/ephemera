Ext.onReady(function() {
	var Elementtextsviewclassify = "elementtextsview";
	var Elementtextsviewtitle = "当前位置:业务管理》" + Elementtextsviewclassify;
	var Elementtextsviewaction = "Omeka_element_textsService.do";
	var Elementtextsviewfields = ['id'
	        			    ,'record_id' 
	        			    ,'record_type' 
	        			    ,'element_id' 
	        			    ,'html' 
	        			    ,'text' 
	        			    ,'name' 
	        			    ,'description' 
	        			    ,'comment' 
	        			      ];// 全部字段
	var Elementtextsviewkeycolumn = [ 'id' ];// 主键
	var Elementtextsviewstore = dataStore(Elementtextsviewfields, basePath + "ElementtextsviewService.do" + "?method=selQuery");// 定义Elementtextsviewstore
	var ElementtextsviewdataForm = Ext.create('Ext.form.Panel', {// 定义新增和修改的FormPanel
		id:'ElementtextsviewdataForm',
		labelAlign : 'right',
		frame : true,
		layout : 'column',
		items : [ {
			columnWidth : .5,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : 'id',
				id : 'Elementtextsviewid',
				name : 'id'
			} ]
		}
		, {
			columnWidth : .5,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : 'record_id',
				id : 'Elementtextsviewrecord_id',
				name : 'record_id'
			} ]
		}
		, {
//			columnWidth : .5,
			hidden : true,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : 'record_type',
				id : 'Elementtextsviewrecord_type',
				name : 'record_type',
				value : 'Item'
			} ]
		}
		, {
			columnWidth : .5,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : 'element_id',
				id : 'Elementtextsviewelement_id',
				name : 'element_id'
			} ]
		}
		, {
//			columnWidth : .5,
			hidden : true,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : 'html',
				id : 'Elementtextsviewhtml',
				name : 'html',
				value : 1
			} ]
		}
		, {
			columnWidth : .5,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : 'text',
				id : 'Elementtextsviewtext',
				name : 'text'
			} ]
		}
		]
	});
	
	var Elementtextsviewbbar = pagesizebar(Elementtextsviewstore);//定义分页
	var Elementtextsviewgrid =  Ext.create('Ext.grid.Panel', {
		height : document.documentElement.clientHeight - 4,
		width : '100%',
		//title : Elementtextsviewtitle,
		store : Elementtextsviewstore,
		bbar : Elementtextsviewbbar,
	    selModel: {
	        type: 'checkboxmodel'
	    },
	    plugins: {
	         ptype: 'cellediting',
	         clicksToEdit: 1
	    },
		columns : [{xtype: 'rownumberer',width:50}, 
		{// 改
			header : 'id',
			dataIndex : 'id',
			sortable : true, 
			editor: {
                xtype: 'textfield',
                editable: false
            }
		}
		, {
			header : 'record_id',
			dataIndex : 'record_id',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : 'record_type',
			dataIndex : 'record_type',
			hidden : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : 'element_id',
			dataIndex : 'element_id',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : 'html',
			dataIndex : 'html',
			hidden : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : 'text',
			dataIndex : 'text',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : 'name',
			dataIndex : 'name',
			sortable : true
		}
		, {
			header : 'description',
			dataIndex : 'description',
			sortable : true
		}
		, {
			header : 'comment',
			dataIndex : 'comment',
			sortable : true
		}
		],
		tbar : [{
				text : Ext.os.deviceType === 'Phone' ? null : "新增",
				iconCls : 'add',
				handler : function() {
					ElementtextsviewdataForm.form.reset();
					Ext.getCmp("Elementtextsviewid").setEditable (true);
					createTextWindow(basePath + Elementtextsviewaction + "?method=insAll", "新增", ElementtextsviewdataForm, Elementtextsviewstore);
				}
			},'-',{
				text : Ext.os.deviceType === 'Phone' ? null : "保存",
				iconCls : 'ok',
				handler : function() {
					var selections = Elementtextsviewgrid.getSelection();
					if (Ext.isEmpty(selections)) {
						Ext.Msg.alert('提示', '请至少选择一条数据！');
						return;
					}
					commonSave(basePath + Elementtextsviewaction + "?method=updAll",selections);
				}
			},'-',{
				text : Ext.os.deviceType === 'Phone' ? null : "修改",
				iconCls : 'edit',
				handler : function() {
					var selections = Elementtextsviewgrid.getSelection();
					if (selections.length != 1) {
						Ext.Msg.alert('提示', '请选择一条数据！', function() {
						});
						return;
					}
					ElementtextsviewdataForm.form.reset();
					Ext.getCmp("Elementtextsviewid").setEditable (false);
					createTextWindow(basePath + Elementtextsviewaction + "?method=updAll", "修改", ElementtextsviewdataForm, Elementtextsviewstore);
					ElementtextsviewdataForm.form.loadRecord(selections[0]);
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
	        					var selections = Elementtextsviewgrid.getSelection();
	        					if (Ext.isEmpty(selections)) {
	        						Ext.Msg.alert('提示', '请至少选择一条数据！');
	        						return;
	        					}
	        					commonDelete(basePath + Elementtextsviewaction + "?method=delAll",selections,Elementtextsviewstore,Elementtextsviewkeycolumn);
	        				}
	                    },{
	                    	text : "导入",
	        				iconCls : 'imp',
	        				handler : function() {
	        					commonImp(basePath + Elementtextsviewaction + "?method=impAll","导入",Elementtextsviewstore);
	        				}
	                    },{
	                    	text : "导出",
	        				iconCls : 'exp',
	        				handler : function() {
	        					Ext.Msg.confirm('请确认', '<b>提示:</b>请确认要导出当前数据？', function(btn, text) {
	        						if (btn == 'yes') {
	        							window.location.href = basePath + Elementtextsviewaction + "?method=expAll&json="+queryjson+"&query="+Ext.getCmp("queryElementtextsviewaction").getValue(); 
	        						}
	        					});
	        				}
	                    },{
	                    	text : "附件",
	        				iconCls : 'attach',
	        				handler : function() {
	        					var selections = Elementtextsviewgrid.getSelection();
	        					if (selections.length != 1) {
	        						Ext.Msg.alert('提示', '请选择一条数据！', function() {
	        						});
	        						return;
	        					}
	        					var fid = '';
	        					for (var i=0;i<Elementtextsviewkeycolumn.length;i++){
	        						fid += selections[0].data[Elementtextsviewkeycolumn[i]] + ","
	        					}
	        					commonAttach(fid, Elementtextsviewclassify);
	        				}
	                    },{
	        				text : "筛选",
    						iconCls : 'select',
    						handler : function() {
    							Ext.getCmp("Elementtextsviewid").setEditable (true);
    							createQueryWindow("筛选", ElementtextsviewdataForm, Elementtextsviewstore,Ext.getCmp("queryElementtextsviewaction").getValue());
    						}
    					}]
	                }
	            }
			},'->',{
				xtype : 'textfield',
				id : 'queryElementtextsviewaction',
				name : 'query',
				emptyText : '模糊匹配',
				width : 100,
				enableKeyEvents : true,
				listeners : {
					specialkey : function(field, e) {
						if (e.getKey() == Ext.EventObject.ENTER) {
							Elementtextsviewstore.load({
									params : {
										start : 0,
										limit : PAGESIZE,
										json : queryjson,
										query : Ext.getCmp("queryElementtextsviewaction").getValue()
									}
							});
						}
					}
				}
			},{
				text : "查询",
				xtype: 'button',
				handler : function() {
					Elementtextsviewstore.load({
							params : {
								start : 0,
								limit : PAGESIZE,
								json : queryjson,
								query : Ext.getCmp("queryElementtextsviewaction").getValue()
							}
					});
				}
			}
		]
	});
	Elementtextsviewgrid.region = 'center';
	Elementtextsviewstore.load();//加载数据
	var win = new Ext.Viewport({//只能有一个viewport
		resizable : true,
		layout : 'border',
		bodyStyle : 'padding:0px;',
		items : [ Elementtextsviewgrid ]
	});
})
