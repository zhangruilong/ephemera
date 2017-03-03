package com.server.pojo;

import java.sql.Timestamp;
import java.math.BigDecimal;
/**
 * omeka_dspace_restapi_harvester_harvests 实体类
 *@author ZhangRuiLong
 */
public class Omeka_dspace_restapi_harvester_harvests
{
   /**
    * ,主键
    */
   private Integer id; 
   /**
    * 
    */
   private Integer collection_id;   
   /**
    * 
    */
   private Integer source_collection_id;   
   /**
    * 
    */
   private String base_url;   
   /**
    * 
    */
   private String collection_spec;   
   /**
    * 
    */
   private String collection_name;   
   /**
    * 
    */
   private String collection_handle;   
   /**
    * 
    */
   private Integer collection_size;   
   /**
    * 
    */
   private Integer status;   
   /**
    * 
    */
   private String status_messages;   
   /**
    * 
    */
   private String resumption_token;   
   /**
    * 
    */
   private Timestamp initiated;   
   /**
    * 
    */
   private Timestamp completed;   
   /**
    * 
    */
   private Timestamp start_from;   
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
	 *@param collection_id 实体的Collection_id属性
	 */
	public void setCollection_id(Integer collection_id)
	{
		this.collection_id = collection_id;
	}
	
	/**
	 *获取""属性
	 */
	public Integer getCollection_id()
	{
		return this.collection_id;
	}	   

	/**
	 *设置""属性
	 *@param source_collection_id 实体的Source_collection_id属性
	 */
	public void setSource_collection_id(Integer source_collection_id)
	{
		this.source_collection_id = source_collection_id;
	}
	
	/**
	 *获取""属性
	 */
	public Integer getSource_collection_id()
	{
		return this.source_collection_id;
	}	   

	/**
	 *设置""属性
	 *@param base_url 实体的Base_url属性
	 */
	public void setBase_url(String base_url)
	{
		this.base_url = base_url;
	}
	
	/**
	 *获取""属性
	 */
	public String getBase_url()
	{
		return this.base_url;
	}	   

	/**
	 *设置""属性
	 *@param collection_spec 实体的Collection_spec属性
	 */
	public void setCollection_spec(String collection_spec)
	{
		this.collection_spec = collection_spec;
	}
	
	/**
	 *获取""属性
	 */
	public String getCollection_spec()
	{
		return this.collection_spec;
	}	   

	/**
	 *设置""属性
	 *@param collection_name 实体的Collection_name属性
	 */
	public void setCollection_name(String collection_name)
	{
		this.collection_name = collection_name;
	}
	
	/**
	 *获取""属性
	 */
	public String getCollection_name()
	{
		return this.collection_name;
	}	   

	/**
	 *设置""属性
	 *@param collection_handle 实体的Collection_handle属性
	 */
	public void setCollection_handle(String collection_handle)
	{
		this.collection_handle = collection_handle;
	}
	
	/**
	 *获取""属性
	 */
	public String getCollection_handle()
	{
		return this.collection_handle;
	}	   

	/**
	 *设置""属性
	 *@param collection_size 实体的Collection_size属性
	 */
	public void setCollection_size(Integer collection_size)
	{
		this.collection_size = collection_size;
	}
	
	/**
	 *获取""属性
	 */
	public Integer getCollection_size()
	{
		return this.collection_size;
	}	   

	/**
	 *设置""属性
	 *@param status 实体的Status属性
	 */
	public void setStatus(Integer status)
	{
		this.status = status;
	}
	
	/**
	 *获取""属性
	 */
	public Integer getStatus()
	{
		return this.status;
	}	   

	/**
	 *设置""属性
	 *@param status_messages 实体的Status_messages属性
	 */
	public void setStatus_messages(String status_messages)
	{
		this.status_messages = status_messages;
	}
	
	/**
	 *获取""属性
	 */
	public String getStatus_messages()
	{
		return this.status_messages;
	}	   

	/**
	 *设置""属性
	 *@param resumption_token 实体的Resumption_token属性
	 */
	public void setResumption_token(String resumption_token)
	{
		this.resumption_token = resumption_token;
	}
	
	/**
	 *获取""属性
	 */
	public String getResumption_token()
	{
		return this.resumption_token;
	}	   

	/**
	 *设置""属性
	 *@param initiated 实体的Initiated属性
	 */
	public void setInitiated(Timestamp initiated)
	{
		this.initiated = initiated;
	}
	
	/**
	 *获取""属性
	 */
	public Timestamp getInitiated()
	{
		return this.initiated;
	}	   

	/**
	 *设置""属性
	 *@param completed 实体的Completed属性
	 */
	public void setCompleted(Timestamp completed)
	{
		this.completed = completed;
	}
	
	/**
	 *获取""属性
	 */
	public Timestamp getCompleted()
	{
		return this.completed;
	}	   

	/**
	 *设置""属性
	 *@param start_from 实体的Start_from属性
	 */
	public void setStart_from(Timestamp start_from)
	{
		this.start_from = start_from;
	}
	
	/**
	 *获取""属性
	 */
	public Timestamp getStart_from()
	{
		return this.start_from;
	}	   
	public Omeka_dspace_restapi_harvester_harvests() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Omeka_dspace_restapi_harvester_harvests(
		Integer id
	 	,Integer collection_id
	 	,Integer source_collection_id
	 	,String base_url
	 	,String collection_spec
	 	,String collection_name
	 	,String collection_handle
	 	,Integer collection_size
	 	,Integer status
	 	,String status_messages
	 	,String resumption_token
	 	,Timestamp initiated
	 	,Timestamp completed
	 	,Timestamp start_from
		 ){
		super();
		this.id = id;
	 	this.collection_id = collection_id;
	 	this.source_collection_id = source_collection_id;
	 	this.base_url = base_url;
	 	this.collection_spec = collection_spec;
	 	this.collection_name = collection_name;
	 	this.collection_handle = collection_handle;
	 	this.collection_size = collection_size;
	 	this.status = status;
	 	this.status_messages = status_messages;
	 	this.resumption_token = resumption_token;
	 	this.initiated = initiated;
	 	this.completed = completed;
	 	this.start_from = start_from;
	}
}

