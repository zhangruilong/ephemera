package com.server.pojo;

import java.sql.Timestamp;
import java.math.BigDecimal;
/**
 * omeka_users_activations 实体类
 *@author ZhangRuiLong
 */
public class Omeka_users_activations
{
   /**
    * ,主键
    */
   private Integer id; 
   /**
    * 
    */
   private Integer user_id;   
   /**
    * 
    */
   private String url;   
   /**
    * 
    */
   private Timestamp added;   
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
	 *@param user_id 实体的User_id属性
	 */
	public void setUser_id(Integer user_id)
	{
		this.user_id = user_id;
	}
	
	/**
	 *获取""属性
	 */
	public Integer getUser_id()
	{
		return this.user_id;
	}	   

	/**
	 *设置""属性
	 *@param url 实体的Url属性
	 */
	public void setUrl(String url)
	{
		this.url = url;
	}
	
	/**
	 *获取""属性
	 */
	public String getUrl()
	{
		return this.url;
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
	public Omeka_users_activations() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Omeka_users_activations(
		Integer id
	 	,Integer user_id
	 	,String url
	 	,Timestamp added
		 ){
		super();
		this.id = id;
	 	this.user_id = user_id;
	 	this.url = url;
	 	this.added = added;
	}
}

