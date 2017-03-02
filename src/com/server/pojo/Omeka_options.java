package com.server.pojo;

import java.sql.Date;
/**
 * omeka_options 实体类
 *@author ZhangRuiLong
 */
public class Omeka_options
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
   private String value;   
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
	 *@param value 实体的Value属性
	 */
	public void setValue(String value)
	{
		this.value = value;
	}
	
	/**
	 *获取""属性
	 */
	public String getValue()
	{
		return this.value;
	}	   
	public Omeka_options() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Omeka_options(
		Integer id
	 	,String name
	 	,String value
		 ){
		super();
		this.id = id;
	 	this.name = name;
	 	this.value = value;
	}
}

