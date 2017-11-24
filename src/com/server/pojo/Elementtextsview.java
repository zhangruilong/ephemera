package com.server.pojo;

import java.sql.Timestamp;
import java.math.BigDecimal;
/**
 * elementtextsview 实体类
 *@author ZhangRuiLong
 */
public class Elementtextsview
{
   /**
    * ,主键
    */
   private Integer id; 
   /**
    * 
    */
   private Integer record_id;   
   /**
    * 
    */
   private String record_type;   
   /**
    * 
    */
   private Integer element_id;   
   /**
    * 
    */
   private Integer html;   
   /**
    * 
    */
   private String text;   
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
	 *@param record_id 实体的Record_id属性
	 */
	public void setRecord_id(Integer record_id)
	{
		this.record_id = record_id;
	}
	
	/**
	 *获取""属性
	 */
	public Integer getRecord_id()
	{
		return this.record_id;
	}	   

	/**
	 *设置""属性
	 *@param record_type 实体的Record_type属性
	 */
	public void setRecord_type(String record_type)
	{
		this.record_type = record_type;
	}
	
	/**
	 *获取""属性
	 */
	public String getRecord_type()
	{
		return this.record_type;
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
	 *@param html 实体的Html属性
	 */
	public void setHtml(Integer html)
	{
		this.html = html;
	}
	
	/**
	 *获取""属性
	 */
	public Integer getHtml()
	{
		return this.html;
	}	   

	/**
	 *设置""属性
	 *@param text 实体的Text属性
	 */
	public void setText(String text)
	{
		this.text = text;
	}
	
	/**
	 *获取""属性
	 */
	public String getText()
	{
		return this.text;
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
	public Elementtextsview() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Elementtextsview(
		Integer id
	 	,Integer record_id
	 	,String record_type
	 	,Integer element_id
	 	,Integer html
	 	,String text
	 	,Integer order
	 	,String name
	 	,String description
	 	,String comment
		 ){
		super();
		this.id = id;
	 	this.record_id = record_id;
	 	this.record_type = record_type;
	 	this.element_id = element_id;
	 	this.html = html;
	 	this.text = text;
	 	this.order = order;
	 	this.name = name;
	 	this.description = description;
	 	this.comment = comment;
	}
}

