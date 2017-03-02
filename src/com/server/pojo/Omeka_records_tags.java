package com.server.pojo;

import java.sql.Date;
/**
 * omeka_records_tags 实体类
 *@author ZhangRuiLong
 */
public class Omeka_records_tags
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
   private Integer tag_id;   
   /**
    * 
    */
   private String time;   
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
	 *@param tag_id 实体的Tag_id属性
	 */
	public void setTag_id(Integer tag_id)
	{
		this.tag_id = tag_id;
	}
	
	/**
	 *获取""属性
	 */
	public Integer getTag_id()
	{
		return this.tag_id;
	}	   

	/**
	 *设置""属性
	 *@param time 实体的Time属性
	 */
	public void setTime(String time)
	{
		this.time = time;
	}
	
	/**
	 *获取""属性
	 */
	public String getTime()
	{
		return this.time;
	}	   
	public Omeka_records_tags() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Omeka_records_tags(
		Integer id
	 	,Integer record_id
	 	,String record_type
	 	,Integer tag_id
	 	,String time
		 ){
		super();
		this.id = id;
	 	this.record_id = record_id;
	 	this.record_type = record_type;
	 	this.tag_id = tag_id;
	 	this.time = time;
	}
}

