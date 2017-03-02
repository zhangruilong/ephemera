package com.server.pojo;

import java.sql.Date;
/**
 * omeka_items 实体类
 *@author ZhangRuiLong
 */
public class Omeka_items
{
   /**
    * ,主键
    */
   private Integer id; 
   /**
    * 
    */
   private Integer item_type_id;   
   /**
    * 
    */
   private Integer collection_id;   
   /**
    * 
    */
   private String featured;   
   /**
    * 
    */
   private String mpublic;   
   /**
    * 
    */
   private String modified;   
   /**
    * 
    */
   private String added;   
   /**
    * 
    */
   private Integer owner_id;   
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
	 *@param item_type_id 实体的Item_type_id属性
	 */
	public void setItem_type_id(Integer item_type_id)
	{
		this.item_type_id = item_type_id;
	}
	
	/**
	 *获取""属性
	 */
	public Integer getItem_type_id()
	{
		return this.item_type_id;
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
	 *@param featured 实体的Featured属性
	 */
	public void setFeatured(String featured)
	{
		this.featured = featured;
	}
	
	/**
	 *获取""属性
	 */
	public String getFeatured()
	{
		return this.featured;
	}	   

	/**
	 *设置""属性
	 *@param public 实体的Public属性
	 */
	public void setPublic(String mpublic)
	{
		this.mpublic = mpublic;
	}
	
	/**
	 *获取""属性
	 */
	public String getPublic()
	{
		return this.mpublic;
	}	   

	/**
	 *设置""属性
	 *@param modified 实体的Modified属性
	 */
	public void setModified(String modified)
	{
		this.modified = modified;
	}
	
	/**
	 *获取""属性
	 */
	public String getModified()
	{
		return this.modified;
	}	   

	/**
	 *设置""属性
	 *@param added 实体的Added属性
	 */
	public void setAdded(String added)
	{
		this.added = added;
	}
	
	/**
	 *获取""属性
	 */
	public String getAdded()
	{
		return this.added;
	}	   

	/**
	 *设置""属性
	 *@param owner_id 实体的Owner_id属性
	 */
	public void setOwner_id(Integer owner_id)
	{
		this.owner_id = owner_id;
	}
	
	/**
	 *获取""属性
	 */
	public Integer getOwner_id()
	{
		return this.owner_id;
	}	   
	public Omeka_items() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Omeka_items(
		Integer id
	 	,Integer item_type_id
	 	,Integer collection_id
	 	,String featured
	 	,String mpublic
	 	,String modified
	 	,String added
	 	,Integer owner_id
		 ){
		super();
		this.id = id;
	 	this.item_type_id = item_type_id;
	 	this.collection_id = collection_id;
	 	this.featured = featured;
	 	this.mpublic = mpublic;
	 	this.modified = modified;
	 	this.added = added;
	 	this.owner_id = owner_id;
	}
}

