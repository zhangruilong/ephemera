Ext.onReady(function() {
	var Searchtextviewclassify = "searchtextview";
	var Searchtextviewtitle = "当前位置:业务管理》" + Searchtextviewclassify;
	var Searchtextviewaction = "Omeka_dspace_restapi_harvester_recordsService.do";
	var Searchtextviewfields = ['id'
	        			    ,'harvest_id' 
	        			    ,'item_id' 
	        			    ,'identifier' 
	        			    ,'handle' 
	        			    ,'datestamp' 
	        			    ,'record_type' 
	        			    ,'title' 
	        			    ,'searchtext' 
	        			      ];// 全部字段
	var Searchtextviewkeycolumn = [ 'id' ];// 主键
	var Searchtextviewstore = dataStore(Searchtextviewfields, basePath + Searchtextviewaction + "?method=selQuery");// 定义Searchtextviewstore
	var SearchtextviewdataForm = Ext.create('Ext.form.Panel', {// 定义新增和修改的FormPanel
		id:'SearchtextviewdataForm',
		labelAlign : 'right',
		frame : true,
		layout : 'column',
		items : [ {
			columnWidth : .5,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : 'id',
				id : 'Searchtextviewid',
				name : 'id'
			} ]
		}
		, {
			columnWidth : .5,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : 'harvest_id',
				id : 'Searchtextviewharvest_id',
				name : 'harvest_id'
			} ]
		}
		, {
			columnWidth : .5,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : 'item_id',
				id : 'Searchtextviewitem_id',
				name : 'item_id'
			} ]
		}
		, {
			columnWidth : .5,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : 'identifier',
				id : 'Searchtextviewidentifier',
				name : 'identifier'
			} ]
		}
		, {
			columnWidth : .5,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : 'handle',
				id : 'Searchtextviewhandle',
				name : 'handle'
			} ]
		}
		]
	});
	
	var Searchtextviewbbar = pagesizebar(Searchtextviewstore);//定义分页
	var Searchtextviewgrid =  Ext.create('Ext.grid.Panel', {
		height : document.documentElement.clientHeight - 4,
		width : '100%',
		//title : Searchtextviewtitle,
		store : Searchtextviewstore,
		bbar : Searchtextviewbbar,
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
			header : 'harvest_id',
			dataIndex : 'harvest_id',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : 'item_id',
			dataIndex : 'item_id',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : 'identifier',
			dataIndex : 'identifier',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : 'handle',
			dataIndex : 'handle',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : 'datestamp',
			dataIndex : 'datestamp',
			sortable : true
		}
//		, {
//			header : 'record_type',
//			dataIndex : 'record_type',
//			sortable : true
//		}
//		, {
//			header : 'title',
//			dataIndex : 'title',
//			sortable : true
//		}
//		, {
//			header : 'searchtext',
//			dataIndex : 'searchtext',
//			sortable : true
//		}
		],
		tbar : [{
				text : Ext.os.deviceType === 'Phone' ? null : "新增",
				iconCls : 'add',
				handler : function() {
					SearchtextviewdataForm.form.reset();
					Ext.getCmp("Searchtextviewid").setEditable (true);
					createTextWindow(basePath + Searchtextviewaction + "?method=insAll", "新增", SearchtextviewdataForm, Searchtextviewstore);
				}
			},'-',{
				text : Ext.os.deviceType === 'Phone' ? null : "保存",
				iconCls : 'ok',
				handler : function() {
					var selections = Searchtextviewgrid.getSelection();
					if (Ext.isEmpty(selections)) {
						Ext.Msg.alert('提示', '请至少选择一条数据！');
						return;
					}
					commonSave(basePath + Searchtextviewaction + "?method=updAll",selections);
				}
			},'-',{
				text : Ext.os.deviceType === 'Phone' ? null : "修改",
				iconCls : 'edit',
				handler : function() {
					var selections = Searchtextviewgrid.getSelection();
					if (selections.length != 1) {
						Ext.Msg.alert('提示', '请选择一条数据！', function() {
						});
						return;
					}
					SearchtextviewdataForm.form.reset();
					Ext.getCmp("Searchtextviewid").setEditable (false);
					createTextWindow(basePath + Searchtextviewaction + "?method=updAll", "修改", SearchtextviewdataForm, Searchtextviewstore);
					SearchtextviewdataForm.form.loadRecord(selections[0]);
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
	        					var selections = Searchtextviewgrid.getSelection();
	        					if (Ext.isEmpty(selections)) {
	        						Ext.Msg.alert('提示', '请至少选择一条数据！');
	        						return;
	        					}
	        					commonDelete(basePath + Searchtextviewaction + "?method=delAll",selections,Searchtextviewstore,Searchtextviewkeycolumn);
	        				}
	                    },{
	                    	text : "导入",
	        				iconCls : 'imp',
	        				handler : function() {
	        					commonImp(basePath + Searchtextviewaction + "?method=impAll","导入",Searchtextviewstore);
	        				}
	                    },{
	                    	text : "导出",
	        				iconCls : 'exp',
	        				handler : function() {
	        					Ext.Msg.confirm('请确认', '<b>提示:</b>请确认要导出当前数据？', function(btn, text) {
	        						if (btn == 'yes') {
	        							window.location.href = basePath + Searchtextviewaction + "?method=expAll&json="+queryjson+"&query="+Ext.getCmp("querySearchtextviewaction").getValue(); 
	        						}
	        					});
	        				}
	                    },{
	                    	text : "附件",
	        				iconCls : 'attach',
	        				handler : function() {
	        					var selections = Searchtextviewgrid.getSelection();
	        					if (selections.length != 1) {
	        						Ext.Msg.alert('提示', '请选择一条数据！', function() {
	        						});
	        						return;
	        					}
	        					var fid = '';
	        					for (var i=0;i<Searchtextviewkeycolumn.length;i++){
	        						fid += selections[0].data[Searchtextviewkeycolumn[i]] + ","
	        					}
	        					commonAttach(fid, Searchtextviewclassify);
	        				}
	                    },{
	        				text : "筛选",
    						iconCls : 'select',
    						handler : function() {
    							Ext.getCmp("Searchtextviewid").setEditable (true);
    							createQueryWindow("筛选", SearchtextviewdataForm, Searchtextviewstore,Ext.getCmp("querySearchtextviewaction").getValue());
    						}
    					}]
	                }
	            }
			},'->',{
				xtype : 'textfield',
				id : 'querySearchtextviewaction',
				name : 'query',
				emptyText : '模糊匹配',
				width : 100,
				enableKeyEvents : true,
				listeners : {
					specialkey : function(field, e) {
						if (e.getKey() == Ext.EventObject.ENTER) {
							Searchtextviewstore.load({
									params : {
										start : 0,
										limit : PAGESIZE,
										json : queryjson,
										query : Ext.getCmp("querySearchtextviewaction").getValue()
									}
							});
						}
					}
				}
			},{
				text : "查询",
				xtype: 'button',
				handler : function() {
					Searchtextviewstore.load({
							params : {
								start : 0,
								limit : PAGESIZE,
								json : queryjson,
								query : Ext.getCmp("querySearchtextviewaction").getValue()
							}
					});
				}
			}
		]
	});
	Searchtextviewgrid.region = 'center';
	Searchtextviewstore.load();//加载数据
	var win = new Ext.Viewport({//只能有一个viewport
		resizable : true,
		layout : 'border',
		bodyStyle : 'padding:0px;',
		items : [ Searchtextviewgrid ]
	});
})
