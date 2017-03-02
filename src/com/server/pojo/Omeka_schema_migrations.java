package com.server.pojo;

import java.sql.Date;
/**
 * omeka_schema_migrations 实体类
 *@author ZhangRuiLong
 */
public class Omeka_schema_migrations
{
   /**
    * ,主键
    */
   private String version; 
    //属性方法	    
     /**
	 *设置主键""属性
	 *@param version 实体的Version属性
	 */
	public void setVersion(String version)
	{
		this.version = version;
	}
	
	/**
	 *获取主键""属性
	 */
	public String getVersion()
	{
		return this.version;
	}
	public Omeka_schema_migrations() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Omeka_schema_migrations(
		String version
		 ){
		super();
		this.version = version;
	}
}

