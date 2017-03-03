package com.server.pojo;

import java.sql.Timestamp;
import java.math.BigDecimal;
/**
 * omeka_item_types 实体类
 *@author ZhangRuiLong
 */
public class Omeka_item_types
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
   private String description;   
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
	 *@param description 实体的Description属性
	 */
	public void setDescription(String description)
	{
		this.description = description;
	}
	
	/**
	 *获取""属性
	 */
	public String getDescription()
	{
		return this.description;
	}	   
	public Omeka_item_types() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Omeka_item_types(
		Integer id
	 	,String name
	 	,String description
		 ){
		super();
		this.id = id;
	 	this.name = name;
	 	this.description = description;
	}
}

