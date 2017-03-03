package com.server.pojo;

import java.sql.Timestamp;
import java.math.BigDecimal;
/**
 * omeka_dspace_restapi_harvester_elements 实体类
 *@author ZhangRuiLong
 */
public class Omeka_dspace_restapi_harvester_elements
{
   /**
    * ,主键
    */
   private Integer id; 
   /**
    * 
    */
   private Integer element_id;   
   /**
    * 
    */
   private Integer elementset_id;   
   /**
    * 
    */
   private String element_name;   
   /**
    * 
    */
   private String element_label;   
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
	 *@param element_id 实体的Element_id属性
	 */
	public void setElement_id(Integer element_id)
	{
		this.element_id = element_id;
	}
	
	/**
	 *获取""属性
	 */
	public Integer getElement_id()
	{
		return this.element_id;
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
	 *@param element_name 实体的Element_name属性
	 */
	public void setElement_name(String element_name)
	{
		this.element_name = element_name;
	}
	
	/**
	 *获取""属性
	 */
	public String getElement_name()
	{
		return this.element_name;
	}	   

	/**
	 *设置""属性
	 *@param element_label 实体的Element_label属性
	 */
	public void setElement_label(String element_label)
	{
		this.element_label = element_label;
	}
	
	/**
	 *获取""属性
	 */
	public String getElement_label()
	{
		return this.element_label;
	}	   
	public Omeka_dspace_restapi_harvester_elements() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Omeka_dspace_restapi_harvester_elements(
		Integer id
	 	,Integer element_id
	 	,Integer elementset_id
	 	,String element_name
	 	,String element_label
		 ){
		super();
		this.id = id;
	 	this.element_id = element_id;
	 	this.elementset_id = elementset_id;
	 	this.element_name = element_name;
	 	this.element_label = element_label;
	}
}

