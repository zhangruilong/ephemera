package com.server.pojo;

import java.sql.Timestamp;
import java.math.BigDecimal;
/**
 * omeka_sessions 实体类
 *@author ZhangRuiLong
 */
public class Omeka_sessions
{
   /**
    * ,主键
    */
   private String id; 
   /**
    * 
    */
   private Integer modified;   
   /**
    * 
    */
   private Integer lifetime;   
   /**
    * 
    */
   private String data;   
    //属性方法	    
     /**
	 *设置主键""属性
	 *@param id 实体的Id属性
	 */
	public void setId(String id)
	{
		this.id = id;
	}
	
	/**
	 *获取主键""属性
	 */
	public String getId()
	{
		return this.id;
	}

	/**
	 *设置""属性
	 *@param modified 实体的Modified属性
	 */
	public void setModified(Integer modified)
	{
		this.modified = modified;
	}
	
	/**
	 *获取""属性
	 */
	public Integer getModified()
	{
		return this.modified;
	}	   

	/**
	 *设置""属性
	 *@param lifetime 实体的Lifetime属性
	 */
	public void setLifetime(Integer lifetime)
	{
		this.lifetime = lifetime;
	}
	
	/**
	 *获取""属性
	 */
	public Integer getLifetime()
	{
		return this.lifetime;
	}	   

	/**
	 *设置""属性
	 *@param data 实体的Data属性
	 */
	public void setData(String data)
	{
		this.data = data;
	}
	
	/**
	 *获取""属性
	 */
	public String getData()
	{
		return this.data;
	}	   
	public Omeka_sessions() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Omeka_sessions(
		String id
	 	,Integer modified
	 	,Integer lifetime
	 	,String data
		 ){
		super();
		this.id = id;
	 	this.modified = modified;
	 	this.lifetime = lifetime;
	 	this.data = data;
	}
}

