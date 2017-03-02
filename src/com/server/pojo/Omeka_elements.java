package com.server.pojo;

import java.sql.Date;
/**
 * omeka_elements 实体类
 *@author ZhangRuiLong
 */
public class Omeka_elements
{
   /**
    * ,主键
    */
   private Integer id; 
   /**
    * 
    */
   private Integer element_set_id;   
   /**
    * 
    */
   private Integer order;   
   /**
    * 
    */
   private String name;   
   /**
    * 
    */
   private String description;   
   /**
    * 
    */
   private String comment;   
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
	 *@param element_set_id 实体的Element_set_id属性
	 */
	public void setElement_set_id(Integer element_set_id)
	{
		this.element_set_id = element_set_id;
	}
	
	/**
	 *获取""属性
	 */
	public Integer getElement_set_id()
	{
		return this.element_set_id;
	}	   

	/**
	 *设置""属性
	 *@param order 实体的Order属性
	 */
	public void setOrder(Integer order)
	{
		this.order = order;
	}
	
	/**
	 *获取""属性
	 */
	public Integer getOrder()
	{
		return this.order;
	}	   

	/**
	 *设置""属性
	 *@param name 实体的Name属性
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	
	/**
	 *获取""属性
	 */
	public String getName()
	{
		return this.name;
	}	   

	/**
	 *设置""属性
	 *@param description 实体的Description属性
	 */
	public void setDescription(String description)
	{
		this.description = description;
	}
	
	/**
	 *获取""属性
	 */
	public String getDescription()
	{
		return this.description;
	}	   

	/**
	 *设置""属性
	 *@param comment 实体的Comment属性
	 */
	public void setComment(String comment)
	{
		this.comment = comment;
	}
	
	/**
	 *获取""属性
	 */
	public String getComment()
	{
		return this.comment;
	}	   
	public Omeka_elements() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Omeka_elements(
		Integer id
	 	,Integer element_set_id
	 	,Integer order
	 	,String name
	 	,String description
	 	,String comment
		 ){
		super();
		this.id = id;
	 	this.element_set_id = element_set_id;
	 	this.order = order;
	 	this.name = name;
	 	this.description = description;
	 	this.comment = comment;
	}
}

