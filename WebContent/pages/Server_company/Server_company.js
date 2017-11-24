Ext.onReady(function() {
	var Server_companyclassify = "server_company";
	var Server_companytitle = "当前位置:业务管理》" + Server_companyclassify;
	var Server_companyaction = "Server_companyService.do";
	var Server_companyfields = ['companyid'
	        			    ,'companyproduct' 
	        			    ,'companycompany' 
	        			    ,'companypie' 
	        			    ,'companypic' 
	        			    ,'companycie' 
	        			    ,'companycic' 
	        			      ];// 全部字段
	var Server_companykeycolumn = [ 'companyid' ];// 主键
	var Server_companystore = dataStore(Server_companyfields, basePath + Server_companyaction + "?method=selQuery");// 定义Server_companystore
	var Server_companydataForm = Ext.create('Ext.form.Panel', {// 定义新增和修改的FormPanel
		id:'Server_companydataForm',
		labelAlign : 'right',
		frame : true,
		layout : 'column',
		items : [ {
			columnWidth : .5,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : 'ID',
				id : 'Server_companycompanyid',
				name : 'companyid'
			} ]
		}
		, {
			columnWidth : .5,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '商品',
				id : 'Server_companycompanyproduct',
				name : 'companyproduct'
			} ]
		}
		, {
			columnWidth : .5,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '公司',
				id : 'Server_companycompanycompany',
				name : 'companycompany'
			} ]
		}
		, {
			columnWidth : .5,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '商品信息(英文)',
				id : 'Server_companycompanypie',
				name : 'companypie'
			} ]
		}
		, {
			columnWidth : .5,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '商品信息(中文)',
				id : 'Server_companycompanypic',
				name : 'companypic'
			} ]
		}
		, {
			columnWidth : .5,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '公司信息(英文)',
				id : 'Server_companycompanycie',
				name : 'companycie'
			} ]
		}
		, {
			columnWidth : .5,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '公司信息(中文)',
				id : 'Server_companycompanycic',
				name : 'companycic'
			} ]
		}
		]
	});
	
	var Server_companybbar = pagesizebar(Server_companystore);//定义分页
	var Server_companygrid =  Ext.create('Ext.grid.Panel', {
		height : document.documentElement.clientHeight - 4,
		width : '100%',
		//title : Server_companytitle,
		store : Server_companystore,
		bbar : Server_companybbar,
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
			dataIndex : 'companyid',
			sortable : true, 
			editor: {
                xtype: 'textfield',
                editable: false
            }
		}
		, {
			header : '商品',
			dataIndex : 'companyproduct',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '公司',
			dataIndex : 'companycompany',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '商品信息(英文)',
			dataIndex : 'companypie',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '商品信息(中文)',
			dataIndex : 'companypic',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '公司信息(英文)',
			dataIndex : 'companycie',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '公司信息(中文)',
			dataIndex : 'companycic',
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
					Server_companydataForm.form.reset();
					Ext.getCmp("Server_companycompanyid").setEditable (true);
					createTextWindow(basePath + Server_companyaction + "?method=insAll", "新增", Server_companydataForm, Server_companystore);
				}
			},'-',{
				text : Ext.os.deviceType === 'Phone' ? null : "保存",
				iconCls : 'ok',
				handler : function() {
					var selections = Server_companygrid.getSelection();
					if (Ext.isEmpty(selections)) {
						Ext.Msg.alert('提示', '请至少选择一条数据！');
						return;
					}
					commonSave(basePath + Server_companyaction + "?method=updAll",selections);
				}
			},'-',{
				text : Ext.os.deviceType === 'Phone' ? null : "修改",
				iconCls : 'edit',
				handler : function() {
					var selections = Server_companygrid.getSelection();
					if (selections.length != 1) {
						Ext.Msg.alert('提示', '请选择一条数据！', function() {
						});
						return;
					}
					Server_companydataForm.form.reset();
					Ext.getCmp("Server_companycompanyid").setEditable (false);
					createTextWindow(basePath + Server_companyaction + "?method=updAll", "修改", Server_companydataForm, Server_companystore);
					Server_companydataForm.form.loadRecord(selections[0]);
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
	        					var selections = Server_companygrid.getSelection();
	        					if (Ext.isEmpty(selections)) {
	        						Ext.Msg.alert('提示', '请至少选择一条数据！');
	        						return;
	        					}
	        					commonDelete(basePath + Server_companyaction + "?method=delAll",selections,Server_companystore,Server_companykeycolumn);
	        				}
	                    },{
	                    	text : "导入",
	        				iconCls : 'imp',
	        				handler : function() {
	        					commonImp(basePath + Server_companyaction + "?method=impAll","导入",Server_companystore);
	        				}
	                    },{
	                    	text : "导出",
	        				iconCls : 'exp',
	        				handler : function() {
	        					Ext.Msg.confirm('请确认', '<b>提示:</b>请确认要导出当前数据？', function(btn, text) {
	        						if (btn == 'yes') {
	        							window.location.href = basePath + Server_companyaction + "?method=expAll&json="+queryjson+"&query="+Ext.getCmp("queryServer_companyaction").getValue(); 
	        						}
	        					});
	        				}
	                    },{
	        				text : "筛选",
    						iconCls : 'select',
    						handler : function() {
    							Ext.getCmp("Server_companycompanyid").setEditable (true);
    							createQueryWindow("筛选", Server_companydataForm, Server_companystore,Ext.getCmp("queryServer_companyaction").getValue());
    						}
    					}]
	                }
	            }
			},'->',{
				xtype : 'textfield',
				id : 'queryServer_companyaction',
				name : 'query',
				emptyText : '模糊匹配',
				width : 100,
				enableKeyEvents : true,
				listeners : {
					specialkey : function(field, e) {
						if (e.getKey() == Ext.EventObject.ENTER) {
							var querystr = Ext.getCmp("queryServer_companyaction").getValue();
							querystr = querystr.replace("'", "''");
							Server_companystore.load({
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
					var querystr = Ext.getCmp("queryServer_companyaction").getValue();
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
	Server_companygrid.region = 'center';
	Server_companystore.on("beforeload",function(){ 
		var querystr = Ext.getCmp("queryServer_companyaction").getValue();
		querystr = querystr.replace("'", "''");
		var strjt = simplized(querystr);
		var strft = traditionalized(querystr);
		Server_companystore.getProxy().extraParams = {
				json : queryjson,
				query : querystr,
				queryft : strft,
				queryjt : strjt
		}; 
	});
	Server_companystore.load();//加载数据
	var win = new Ext.Viewport({//只能有一个viewport
		resizable : true,
		layout : 'border',
		bodyStyle : 'padding:0px;',
		items : [ Server_companygrid ]
	});
})
