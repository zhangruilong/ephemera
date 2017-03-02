package com.server.pojo;

import java.sql.Date;
/**
 * omeka_dspace_restapi_harvester_elementsets 实体类
 *@author ZhangRuiLong
 */
public class Omeka_dspace_restapi_harvester_elementsets
{
   /**
    * ,主键
    */
   private Integer id; 
   /**
    * 
    */
   private Integer elementset_id;   
   /**
    * 
    */
   private String elementset_name;   
   /**
    * 
    */
   private String elementset_label;   
    //属性方法	    
     /**
	 *设置主键""属性
	 *@param id 实体的Id属性
	 */
	public void setId(Integer id)
	{
		this.id = id;
	}
	
	/**
	 *获取主键""属性
	 */
	public Integer getId()
	{
		return this.id;
	}

	/**
	 *设置""属性
	 *@param elementset_id 实体的Elementset_id属性
	 */
	public void setElementset_id(Integer elementset_id)
	{
		this.elementset_id = elementset_id;
	}
	
	/**
	 *获取""属性
	 */
	public Integer getElementset_id()
	{
		return this.elementset_id;
	}	   

	/**
	 *设置""属性
	 *@param elementset_name 实体的Elementset_name属性
	 */
	public void setElementset_name(String elementset_name)
	{
		this.elementset_name = elementset_name;
	}
	
	/**
	 *获取""属性
	 */
	public String getElementset_name()
	{
		return this.elementset_name;
	}	   

	/**
	 *设置""属性
	 *@param elementset_label 实体的Elementset_label属性
	 */
	public void setElementset_label(String elementset_label)
	{
		this.elementset_label = elementset_label;
	}
	
	/**
	 *获取""属性
	 */
	public String getElementset_label()
	{
		return this.elementset_label;
	}	   
	public Omeka_dspace_restapi_harvester_elementsets() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Omeka_dspace_restapi_harvester_elementsets(
		Integer id
	 	,Integer elementset_id
	 	,String elementset_name
	 	,String elementset_label
		 ){
		super();
		this.id = id;
	 	this.elementset_id = elementset_id;
	 	this.elementset_name = elementset_name;
	 	this.elementset_label = elementset_label;
	}
}

