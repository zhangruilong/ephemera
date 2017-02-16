Ext.onReady(function() {
	var Mycourseclassify = "mycourse";
	var Mycoursetitle = "当前位置:业务管理》" + Mycourseclassify;
	var Mycourseaction = "MycourseAction.do";
	var Mycoursefields = ['mycourseid'
	        			    ,'mycoursecoach' 
	        			    ,'mycoursecustomer' 
	        			    ,'mycoursename' 
	        			    ,'mycourseproject' 
	        			    ,'mycoursenum' 
	        			    ,'mycoursenuma' 
	        			    ,'mycoursemoney' 
	        			    ,'createtime' 
	        			    ,'creator' 
	        			    ,'updtime' 
	        			    ,'updor' 
	        			      ];// 全部字段
	var Mycoursekeycolumn = [ 'mycourseid' ];// 主键
	var Mycoursestore = dataStore(Mycoursefields, basePath + Mycourseaction + "?method=selLimit");// 定义Mycoursestore
	var MycoursedataForm = Ext.create('Ext.form.Panel', {// 定义新增和修改的FormPanel
		id:'MycoursedataForm',
		labelAlign : 'right',
		frame : true,
		layout : 'column',
		items : [ {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : 'ID',
				id : 'Mycoursemycourseid',
				name : 'mycourseid',
				maxLength : 100
			} ]
		}
		, {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '教练ID',
				id : 'Mycoursemycoursecoach',
				name : 'mycoursecoach',
				maxLength : 100
			} ]
		}
		, {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '会员ID',
				id : 'Mycoursemycoursecustomer',
				name : 'mycoursecustomer',
				maxLength : 100
			} ]
		}
		, {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '课程名',
				id : 'Mycoursemycoursename',
				name : 'mycoursename',
				maxLength : 100
			} ]
		}
		, {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '项目',
				id : 'Mycoursemycourseproject',
				name : 'mycourseproject',
				maxLength : 100
			} ]
		}
		, {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '课时',
				id : 'Mycoursemycoursenum',
				name : 'mycoursenum',
				maxLength : 100
			} ]
		}
		, {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '剩余课时',
				id : 'Mycoursemycoursenuma',
				name : 'mycoursenuma',
				maxLength : 100
			} ]
		}
		, {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '费用',
				id : 'Mycoursemycoursemoney',
				name : 'mycoursemoney',
				maxLength : 100
			} ]
		}
		, {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '创建时间',
				id : 'Mycoursecreatetime',
				name : 'createtime',
				maxLength : 100
			} ]
		}
		, {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '创建人',
				id : 'Mycoursecreator',
				name : 'creator',
				maxLength : 100
			} ]
		}
		, {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '更新时间',
				id : 'Mycourseupdtime',
				name : 'updtime',
				maxLength : 100
			} ]
		}
		, {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '更新人',
				id : 'Mycourseupdor',
				name : 'updor',
				maxLength : 100
			} ]
		}
		]
	});
	
	//var Mycoursebbar = pagesizebar(Mycoursestore);//定义分页
	var Mycoursegrid =  Ext.create('Ext.grid.Panel', {
		height : document.documentElement.clientHeight - 4,
		width : '100%',
		//title : Mycoursetitle,
		store : Mycoursestore,
		//bbar : Mycoursebbar,
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
			dataIndex : 'mycourseid',
			sortable : true, 
			editor: {
                xtype: 'textfield',
                editable: false
            }
		}
		, {
			header : '教练ID',
			dataIndex : 'mycoursecoach',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '会员ID',
			dataIndex : 'mycoursecustomer',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '课程名',
			dataIndex : 'mycoursename',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '项目',
			dataIndex : 'mycourseproject',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '课时',
			dataIndex : 'mycoursenum',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '剩余课时',
			dataIndex : 'mycoursenuma',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '费用',
			dataIndex : 'mycoursemoney',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '创建时间',
			dataIndex : 'createtime',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '创建人',
			dataIndex : 'creator',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '更新时间',
			dataIndex : 'updtime',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '更新人',
			dataIndex : 'updor',
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
					MycoursedataForm.form.reset();
					Ext.getCmp("Mycoursemycourseid").setEditable (true);
					createTextWindow(basePath + Mycourseaction + "?method=insAll", "新增", MycoursedataForm, Mycoursestore);
				}
			},'-',{
				text : Ext.os.deviceType === 'Phone' ? null : "保存",
				iconCls : 'ok',
				handler : function() {
					var selections = Mycoursegrid.getSelection();
					if (Ext.isEmpty(selections)) {
						Ext.Msg.alert('提示', '请至少选择一条数据！');
						return;
					}
					commonSave(basePath + Mycourseaction + "?method=updAll",selections);
				}
			},'-',{
				text : Ext.os.deviceType === 'Phone' ? null : "修改",
				iconCls : 'edit',
				handler : function() {
					var selections = Mycoursegrid.getSelection();
					if (selections.length != 1) {
						Ext.Msg.alert('提示', '请选择一条数据！', function() {
						});
						return;
					}
					MycoursedataForm.form.reset();
					Ext.getCmp("Mycoursemycourseid").setEditable (false);
					createTextWindow(basePath + Mycourseaction + "?method=updAll", "修改", MycoursedataForm, Mycoursestore);
					MycoursedataForm.form.loadRecord(selections[0]);
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
	        					var selections = Mycoursegrid.getSelection();
	        					if (Ext.isEmpty(selections)) {
	        						Ext.Msg.alert('提示', '请至少选择一条数据！');
	        						return;
	        					}
	        					commonDelete(basePath + Mycourseaction + "?method=delAll",selections,Mycoursestore,Mycoursekeycolumn);
	        				}
	                    },{
	                    	text : "导入",
	        				iconCls : 'imp',
	        				handler : function() {
	        					commonImp(basePath + Mycourseaction + "?method=impAll","导入",Mycoursestore);
	        				}
	                    },{
	                    	text : "导出",
	        				iconCls : 'exp',
	        				handler : function() {
	        					Ext.Msg.confirm('请确认', '<b>提示:</b>请确认要导出当前数据？', function(btn, text) {
	        						if (btn == 'yes') {
	        							window.location.href = basePath + Mycourseaction + "?method=expAll&json="+queryjson+"&query="+Ext.getCmp("queryMycourseaction").getValue(); 
	        						}
	        					});
	        				}
	                    },{
	                    	text : "附件",
	        				iconCls : 'attach',
	        				handler : function() {
	        					var selections = Mycoursegrid.getSelection();
	        					if (selections.length != 1) {
	        						Ext.Msg.alert('提示', '请选择一条数据！', function() {
	        						});
	        						return;
	        					}
	        					var fid = '';
	        					for (var i=0;i<Mycoursekeycolumn.length;i++){
	        						fid += selections[0].data[Mycoursekeycolumn[i]] + ","
	        					}
	        					commonAttach(fid, Mycourseclassify);
	        				}
	                    },{
	        				text : "筛选",
    						iconCls : 'select',
    						handler : function() {
    							Ext.getCmp("Mycoursemycourseid").setEditable (true);
    							createQueryWindow("筛选", MycoursedataForm, Mycoursestore,Ext.getCmp("queryMycourseaction").getValue());
    						}
    					}]
	                }
	            }
			},'->',{
				xtype : 'textfield',
				id : 'queryMycourseaction',
				name : 'query',
				emptyText : '模糊匹配',
				width : 100,
				enableKeyEvents : true,
				listeners : {
					specialkey : function(field, e) {
						if (e.getKey() == Ext.EventObject.ENTER) {
							if ("" == Ext.getCmp("queryMycourseaction").getValue()) {
								Mycoursestore.load({
									params : {
										json : queryjson
									}
								});
							} else {
								Mycoursestore.load({
									params : {
										json : queryjson,
										query : Ext.getCmp("queryMycourseaction").getValue()
									}
								});
							}
						}
					}
				}
			}
		]
	});
	Mycoursegrid.region = 'center';
	Mycoursestore.load();//加载数据
	var win = new Ext.Viewport({//只能有一个viewport
		resizable : true,
		layout : 'border',
		bodyStyle : 'padding:0px;',
		items : [ Mycoursegrid ]
	});
})
