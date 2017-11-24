Ext.onReady(function() {
	var Omeka_search_textsclassify = "omeka_search_texts";
	var Omeka_search_textstitle = "当前位置:业务管理》" + Omeka_search_textsclassify;
	var Omeka_search_textsaction = "Omeka_search_textsService.do";
	var Omeka_search_textsfields = ['id'
	        			    ,'record_type' 
	        			    ,'record_id' 
	        			    ,'public' 
	        			    ,'title' 
	        			    ,'text' 
	        			      ];// 全部字段
	var Omeka_search_textskeycolumn = [ 'id' ];// 主键
	var Omeka_search_textsstore = dataStore(Omeka_search_textsfields, basePath + Omeka_search_textsaction + "?method=selQuery");// 定义Omeka_search_textsstore
	var Omeka_search_textsdataForm = Ext.create('Ext.form.Panel', {// 定义新增和修改的FormPanel
		id:'Omeka_search_textsdataForm',
		labelAlign : 'right',
		frame : true,
		layout : 'column',
		items : [ {
			columnWidth : .5,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : 'id',
				id : 'Omeka_search_textsid',
				name : 'id'
			} ]
		}
		, {
			columnWidth : .5,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : 'record_type',
				id : 'Omeka_search_textsrecord_type',
				name : 'record_type'
			} ]
		}
		, {
			columnWidth : .5,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : 'record_id',
				id : 'Omeka_search_textsrecord_id',
				name : 'record_id'
			} ]
		}
		, {
//			columnWidth : .5,
			hidden : true,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : 'public',
				id : 'Omeka_search_textspublic',
				name : 'public',
				value : 1
			} ]
		}
		, {
			columnWidth : .5,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : 'title',
				id : 'Omeka_search_textstitle',
				name : 'title'
			} ]
		}
		, {
			columnWidth : .5,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : 'text',
				id : 'Omeka_search_textstext',
				name : 'text'
			} ]
		}
		]
	});
	
	var Omeka_search_textsbbar = pagesizebar(Omeka_search_textsstore);//定义分页
	var Omeka_search_textsgrid =  Ext.create('Ext.grid.Panel', {
		height : document.documentElement.clientHeight - 4,
		width : '100%',
		//title : Omeka_search_textstitle,
		store : Omeka_search_textsstore,
		bbar : Omeka_search_textsbbar,
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
			header : 'record_type',
			dataIndex : 'record_type',
			sortable : true,  
			editor: {
                xtype: 'textfield'
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
			header : 'public',
			dataIndex : 'public',
			hidden : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : 'title',
			dataIndex : 'title',
			sortable : true,  
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
		],
		tbar : [{
				text : Ext.os.deviceType === 'Phone' ? null : "新增",
				iconCls : 'add',
				handler : function() {
					Omeka_search_textsdataForm.form.reset();
					Ext.getCmp("Omeka_search_textsid").setEditable (true);
					createTextWindow(basePath + Omeka_search_textsaction + "?method=insAll", "新增", Omeka_search_textsdataForm, Omeka_search_textsstore);
				}
			},'-',{
				text : Ext.os.deviceType === 'Phone' ? null : "修改",
				iconCls : 'edit',
				handler : function() {
					var selections = Omeka_search_textsgrid.getSelection();
					if (selections.length != 1) {
						Ext.Msg.alert('提示', '请选择一条数据！', function() {
						});
						return;
					}
					Omeka_search_textsdataForm.form.reset();
					Ext.getCmp("Omeka_search_textsid").setEditable (false);
					createTextWindow(basePath + Omeka_search_textsaction + "?method=updAll", "修改", Omeka_search_textsdataForm, Omeka_search_textsstore);
					Omeka_search_textsdataForm.form.loadRecord(selections[0]);
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
	        					var selections = Omeka_search_textsgrid.getSelection();
	        					if (Ext.isEmpty(selections)) {
	        						Ext.Msg.alert('提示', '请至少选择一条数据！');
	        						return;
	        					}
	        					commonDelete(basePath + Omeka_search_textsaction + "?method=delAll",selections,Omeka_search_textsstore,Omeka_search_textskeycolumn);
	        				}
	                    },{
	                    	text : "导入",
	        				iconCls : 'imp',
	        				handler : function() {
	        					commonImp(basePath + Omeka_search_textsaction + "?method=impAll","导入",Omeka_search_textsstore);
	        				}
	                    },{
	                    	text : "导出",
	        				iconCls : 'exp',
	        				handler : function() {
	        					Ext.Msg.confirm('请确认', '<b>提示:</b>请确认要导出当前数据？', function(btn, text) {
	        						if (btn == 'yes') {
	        							window.location.href = basePath + Omeka_search_textsaction + "?method=expAll&json="+queryjson+"&query="+Ext.getCmp("queryOmeka_search_textsaction").getValue(); 
	        						}
	        					});
	        				}
	                    },{
	                    	text : "附件",
	        				iconCls : 'attach',
	        				handler : function() {
	        					var selections = Omeka_search_textsgrid.getSelection();
	        					if (selections.length != 1) {
	        						Ext.Msg.alert('提示', '请选择一条数据！', function() {
	        						});
	        						return;
	        					}
	        					var fid = '';
	        					for (var i=0;i<Omeka_search_textskeycolumn.length;i++){
	        						fid += selections[0].data[Omeka_search_textskeycolumn[i]] + ","
	        					}
	        					commonAttach(fid, Omeka_search_textsclassify);
	        				}
	                    },{
	        				text : "筛选",
    						iconCls : 'select',
    						handler : function() {
    							Ext.getCmp("Omeka_search_textsid").setEditable (true);
    							createQueryWindow("筛选", Omeka_search_textsdataForm, Omeka_search_textsstore,Ext.getCmp("queryOmeka_search_textsaction").getValue());
    						}
    					}]
	                }
	            }
			},'->',{
				xtype : 'textfield',
				id : 'queryOmeka_search_textsaction',
				name : 'query',
				emptyText : '模糊匹配',
				width : 100,
				enableKeyEvents : true,
				listeners : {
					specialkey : function(field, e) {
						if (e.getKey() == Ext.EventObject.ENTER) {
							Omeka_search_textsstore.load({
									params : {
										start : 0,
										limit : PAGESIZE,
										json : queryjson,
										query : Ext.getCmp("queryOmeka_search_textsaction").getValue()
									}
							});
						}
					}
				}
			},{
				text : "查询",
				xtype: 'button',
				handler : function() {
					Omeka_search_textsstore.load({
							params : {
								start : 0,
								limit : PAGESIZE,
								json : queryjson,
								query : Ext.getCmp("queryOmeka_search_textsaction").getValue()
							}
					});
				}
			}
		]
	});
	Omeka_search_textsgrid.region = 'center';
	Omeka_search_textsstore.load();//加载数据
	var win = new Ext.Viewport({//只能有一个viewport
		resizable : true,
		layout : 'border',
		bodyStyle : 'padding:0px;',
		items : [ Omeka_search_textsgrid ]
	});
})
