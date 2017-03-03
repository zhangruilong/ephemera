package com.server.pojo;

import java.sql.Timestamp;
import java.math.BigDecimal;
/**
 * omeka_element_texts 实体类
 *@author ZhangRuiLong
 */
public class Omeka_element_texts
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
	public Omeka_element_texts() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Omeka_element_texts(
		Integer id
	 	,Integer record_id
	 	,String record_type
	 	,Integer element_id
	 	,Integer html
	 	,String text
		 ){
		super();
		this.id = id;
	 	this.record_id = record_id;
	 	this.record_type = record_type;
	 	this.element_id = element_id;
	 	this.html = html;
	 	this.text = text;
	}
}

