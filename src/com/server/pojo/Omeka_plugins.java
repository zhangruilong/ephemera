package com.server.pojo;

import java.sql.Date;
/**
 * omeka_plugins 实体类
 *@author ZhangRuiLong
 */
public class Omeka_plugins
{
   /**
    * ,主键
    */
   private Integer id; 
   /**
    * 
    */
   private String name;   
   /**
    * 
    */
   private String active;   
   /**
    * 
    */
   private String version;   
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
	 *@param name 实体的Name属性
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	
	/**
	 *获取""属性
	 */
	public String getName()
	{
		return this.name;
	}	   

	/**
	 *设置""属性
	 *@param active 实体的Active属性
	 */
	public void setActive(String active)
	{
		this.active = active;
	}
	
	/**
	 *获取""属性
	 */
	public String getActive()
	{
		return this.active;
	}	   

	/**
	 *设置""属性
	 *@param version 实体的Version属性
	 */
	public void setVersion(String version)
	{
		this.version = version;
	}
	
	/**
	 *获取""属性
	 */
	public String getVersion()
	{
		return this.version;
	}	   
	public Omeka_plugins() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Omeka_plugins(
		Integer id
	 	,String name
	 	,String active
	 	,String version
		 ){
		super();
		this.id = id;
	 	this.name = name;
	 	this.active = active;
	 	this.version = version;
	}
}

