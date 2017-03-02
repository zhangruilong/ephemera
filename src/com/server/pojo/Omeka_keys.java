package com.server.pojo;

import java.sql.Date;
/**
 * omeka_keys 实体类
 *@author ZhangRuiLong
 */
public class Omeka_keys
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
   private String label;   
   /**
    * 
    */
   private String key;   
   /**
    * 
    */
   private String ip;   
   /**
    * 
    */
   private String accessed;   
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
	 *@param label 实体的Label属性
	 */
	public void setLabel(String label)
	{
		this.label = label;
	}
	
	/**
	 *获取""属性
	 */
	public String getLabel()
	{
		return this.label;
	}	   

	/**
	 *设置""属性
	 *@param key 实体的Key属性
	 */
	public void setKey(String key)
	{
		this.key = key;
	}
	
	/**
	 *获取""属性
	 */
	public String getKey()
	{
		return this.key;
	}	   

	/**
	 *设置""属性
	 *@param ip 实体的Ip属性
	 */
	public void setIp(String ip)
	{
		this.ip = ip;
	}
	
	/**
	 *获取""属性
	 */
	public String getIp()
	{
		return this.ip;
	}	   

	/**
	 *设置""属性
	 *@param accessed 实体的Accessed属性
	 */
	public void setAccessed(String accessed)
	{
		this.accessed = accessed;
	}
	
	/**
	 *获取""属性
	 */
	public String getAccessed()
	{
		return this.accessed;
	}	   
	public Omeka_keys() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Omeka_keys(
		Integer id
	 	,Integer user_id
	 	,String label
	 	,String key
	 	,String ip
	 	,String accessed
		 ){
		super();
		this.id = id;
	 	this.user_id = user_id;
	 	this.label = label;
	 	this.key = key;
	 	this.ip = ip;
	 	this.accessed = accessed;
	}
}

