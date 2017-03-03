package com.server.pojo;

import java.sql.Timestamp;
import java.math.BigDecimal;
/**
 * omeka_search_texts 实体类
 *@author ZhangRuiLong
 */
public class Omeka_search_texts
{
   /**
    * ,主键
    */
   private Integer id; 
   /**
    * 
    */
   private String record_type;   
   /**
    * 
    */
   private Integer record_id;   
   /**
    * 
    */
   private Integer public1;   
   /**
    * 
    */
   private String title;   
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
	 *@param public 实体的Public属性
	 */
	public void setPublic(Integer public1)
	{
		this.public1 = public1;
	}
	
	/**
	 *获取""属性
	 */
	public Integer getPublic()
	{
		return this.public1;
	}	   

	/**
	 *设置""属性
	 *@param title 实体的Title属性
	 */
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	/**
	 *获取""属性
	 */
	public String getTitle()
	{
		return this.title;
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
	public Omeka_search_texts() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Omeka_search_texts(
		Integer id
	 	,String record_type
	 	,Integer record_id
	 	,Integer public1
	 	,String title
	 	,String text
		 ){
		super();
		this.id = id;
	 	this.record_type = record_type;
	 	this.record_id = record_id;
	 	this.public1 = public1;
	 	this.title = title;
	 	this.text = text;
	}
}

