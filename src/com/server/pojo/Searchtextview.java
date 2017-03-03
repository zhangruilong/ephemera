package com.server.pojo;

import java.sql.Timestamp;
import java.math.BigDecimal;
/**
 * searchtextview 实体类
 *@author ZhangRuiLong
 */
public class Searchtextview
{
   /**
    * ,主键
    */
   private Integer id; 
   /**
    * 
    */
   private Integer harvest_id;   
   /**
    * 
    */
   private Integer item_id;   
   /**
    * 
    */
   private String identifier;   
   /**
    * 
    */
   private String handle;   
   /**
    * 
    */
   private String datestamp;   
   /**
    * 
    */
   private String record_type;   
   /**
    * 
    */
   private String title;   
   /**
    * 
    */
   private String searchtext;   
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
	 *@param harvest_id 实体的Harvest_id属性
	 */
	public void setHarvest_id(Integer harvest_id)
	{
		this.harvest_id = harvest_id;
	}
	
	/**
	 *获取""属性
	 */
	public Integer getHarvest_id()
	{
		return this.harvest_id;
	}	   

	/**
	 *设置""属性
	 *@param item_id 实体的Item_id属性
	 */
	public void setItem_id(Integer item_id)
	{
		this.item_id = item_id;
	}
	
	/**
	 *获取""属性
	 */
	public Integer getItem_id()
	{
		return this.item_id;
	}	   

	/**
	 *设置""属性
	 *@param identifier 实体的Identifier属性
	 */
	public void setIdentifier(String identifier)
	{
		this.identifier = identifier;
	}
	
	/**
	 *获取""属性
	 */
	public String getIdentifier()
	{
		return this.identifier;
	}	   

	/**
	 *设置""属性
	 *@param handle 实体的Handle属性
	 */
	public void setHandle(String handle)
	{
		this.handle = handle;
	}
	
	/**
	 *获取""属性
	 */
	public String getHandle()
	{
		return this.handle;
	}	   

	/**
	 *设置""属性
	 *@param datestamp 实体的Datestamp属性
	 */
	public void setDatestamp(String datestamp)
	{
		this.datestamp = datestamp;
	}
	
	/**
	 *获取""属性
	 */
	public String getDatestamp()
	{
		return this.datestamp;
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
	 *@param searchtext 实体的Searchtext属性
	 */
	public void setSearchtext(String searchtext)
	{
		this.searchtext = searchtext;
	}
	
	/**
	 *获取""属性
	 */
	public String getSearchtext()
	{
		return this.searchtext;
	}	   
	public Searchtextview() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Searchtextview(
		Integer id
	 	,Integer harvest_id
	 	,Integer item_id
	 	,String identifier
	 	,String handle
	 	,String datestamp
	 	,String record_type
	 	,String title
	 	,String searchtext
		 ){
		super();
		this.id = id;
	 	this.harvest_id = harvest_id;
	 	this.item_id = item_id;
	 	this.identifier = identifier;
	 	this.handle = handle;
	 	this.datestamp = datestamp;
	 	this.record_type = record_type;
	 	this.title = title;
	 	this.searchtext = searchtext;
	}
}

