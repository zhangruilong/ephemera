package com.server.pojo;

import java.sql.Timestamp;
import java.math.BigDecimal;
/**
 * omeka_files 实体类
 *@author ZhangRuiLong
 */
public class Omeka_files
{
   /**
    * ,主键
    */
   private Integer id; 
   /**
    * 
    */
   private Integer item_id;   
   /**
    * 
    */
   private Integer order;   
   /**
    * 
    */
   private Integer size;   
   /**
    * 
    */
   private Integer has_derivative_image;   
   /**
    * 
    */
   private String authentication;   
   /**
    * 
    */
   private String mime_type;   
   /**
    * 
    */
   private String type_os;   
   /**
    * 
    */
   private String filename;   
   /**
    * 
    */
   private String original_filename;   
   /**
    * 
    */
   private Timestamp modified;   
   /**
    * 
    */
   private Timestamp added;   
   /**
    * 
    */
   private Integer stored;   
   /**
    * 
    */
   private String metadata;   
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
	 *@param size 实体的Size属性
	 */
	public void setSize(Integer size)
	{
		this.size = size;
	}
	
	/**
	 *获取""属性
	 */
	public Integer getSize()
	{
		return this.size;
	}	   

	/**
	 *设置""属性
	 *@param has_derivative_image 实体的Has_derivative_image属性
	 */
	public void setHas_derivative_image(Integer has_derivative_image)
	{
		this.has_derivative_image = has_derivative_image;
	}
	
	/**
	 *获取""属性
	 */
	public Integer getHas_derivative_image()
	{
		return this.has_derivative_image;
	}	   

	/**
	 *设置""属性
	 *@param authentication 实体的Authentication属性
	 */
	public void setAuthentication(String authentication)
	{
		this.authentication = authentication;
	}
	
	/**
	 *获取""属性
	 */
	public String getAuthentication()
	{
		return this.authentication;
	}	   

	/**
	 *设置""属性
	 *@param mime_type 实体的Mime_type属性
	 */
	public void setMime_type(String mime_type)
	{
		this.mime_type = mime_type;
	}
	
	/**
	 *获取""属性
	 */
	public String getMime_type()
	{
		return this.mime_type;
	}	   

	/**
	 *设置""属性
	 *@param type_os 实体的Type_os属性
	 */
	public void setType_os(String type_os)
	{
		this.type_os = type_os;
	}
	
	/**
	 *获取""属性
	 */
	public String getType_os()
	{
		return this.type_os;
	}	   

	/**
	 *设置""属性
	 *@param filename 实体的Filename属性
	 */
	public void setFilename(String filename)
	{
		this.filename = filename;
	}
	
	/**
	 *获取""属性
	 */
	public String getFilename()
	{
		return this.filename;
	}	   

	/**
	 *设置""属性
	 *@param original_filename 实体的Original_filename属性
	 */
	public void setOriginal_filename(String original_filename)
	{
		this.original_filename = original_filename;
	}
	
	/**
	 *获取""属性
	 */
	public String getOriginal_filename()
	{
		return this.original_filename;
	}	   

	/**
	 *设置""属性
	 *@param modified 实体的Modified属性
	 */
	public void setModified(Timestamp modified)
	{
		this.modified = modified;
	}
	
	/**
	 *获取""属性
	 */
	public Timestamp getModified()
	{
		return this.modified;
	}	   

	/**
	 *设置""属性
	 *@param added 实体的Added属性
	 */
	public void setAdded(Timestamp added)
	{
		this.added = added;
	}
	
	/**
	 *获取""属性
	 */
	public Timestamp getAdded()
	{
		return this.added;
	}	   

	/**
	 *设置""属性
	 *@param stored 实体的Stored属性
	 */
	public void setStored(Integer stored)
	{
		this.stored = stored;
	}
	
	/**
	 *获取""属性
	 */
	public Integer getStored()
	{
		return this.stored;
	}	   

	/**
	 *设置""属性
	 *@param metadata 实体的Metadata属性
	 */
	public void setMetadata(String metadata)
	{
		this.metadata = metadata;
	}
	
	/**
	 *获取""属性
	 */
	public String getMetadata()
	{
		return this.metadata;
	}	   
	public Omeka_files() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Omeka_files(
		Integer id
	 	,Integer item_id
	 	,Integer order
	 	,Integer size
	 	,Integer has_derivative_image
	 	,String authentication
	 	,String mime_type
	 	,String type_os
	 	,String filename
	 	,String original_filename
	 	,Timestamp modified
	 	,Timestamp added
	 	,Integer stored
	 	,String metadata
		 ){
		super();
		this.id = id;
	 	this.item_id = item_id;
	 	this.order = order;
	 	this.size = size;
	 	this.has_derivative_image = has_derivative_image;
	 	this.authentication = authentication;
	 	this.mime_type = mime_type;
	 	this.type_os = type_os;
	 	this.filename = filename;
	 	this.original_filename = original_filename;
	 	this.modified = modified;
	 	this.added = added;
	 	this.stored = stored;
	 	this.metadata = metadata;
	}
}

