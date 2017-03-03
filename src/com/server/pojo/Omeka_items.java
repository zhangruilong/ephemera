package com.server.pojo;

import java.sql.Timestamp;
import java.math.BigDecimal;
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
   private Integer featured;   
   /**
    * 
    */
   private Integer public1;   
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
	public void setFeatured(Integer featured)
	{
		this.featured = featured;
	}
	
	/**
	 *获取""属性
	 */
	public Integer getFeatured()
	{
		return this.featured;
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
	 	,Integer featured
	 	,Integer public1
	 	,Timestamp modified
	 	,Timestamp added
	 	,Integer owner_id
		 ){
		super();
		this.id = id;
	 	this.item_type_id = item_type_id;
	 	this.collection_id = collection_id;
	 	this.featured = featured;
	 	this.public1 = public1;
	 	this.modified = modified;
	 	this.added = added;
	 	this.owner_id = owner_id;
	}
}

