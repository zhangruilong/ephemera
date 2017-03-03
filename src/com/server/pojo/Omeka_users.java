package com.server.pojo;

import java.sql.Timestamp;
import java.math.BigDecimal;
/**
 * omeka_users 实体类
 *@author ZhangRuiLong
 */
public class Omeka_users
{
   /**
    * ,主键
    */
   private Integer id; 
   /**
    * 
    */
   private String username;   
   /**
    * 
    */
   private String name;   
   /**
    * 
    */
   private String email;   
   /**
    * 
    */
   private String password;   
   /**
    * 
    */
   private String salt;   
   /**
    * 
    */
   private Integer active;   
   /**
    * 
    */
   private String role;   
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
	 *@param username 实体的Username属性
	 */
	public void setUsername(String username)
	{
		this.username = username;
	}
	
	/**
	 *获取""属性
	 */
	public String getUsername()
	{
		return this.username;
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
	 *@param email 实体的Email属性
	 */
	public void setEmail(String email)
	{
		this.email = email;
	}
	
	/**
	 *获取""属性
	 */
	public String getEmail()
	{
		return this.email;
	}	   

	/**
	 *设置""属性
	 *@param password 实体的Password属性
	 */
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	/**
	 *获取""属性
	 */
	public String getPassword()
	{
		return this.password;
	}	   

	/**
	 *设置""属性
	 *@param salt 实体的Salt属性
	 */
	public void setSalt(String salt)
	{
		this.salt = salt;
	}
	
	/**
	 *获取""属性
	 */
	public String getSalt()
	{
		return this.salt;
	}	   

	/**
	 *设置""属性
	 *@param active 实体的Active属性
	 */
	public void setActive(Integer active)
	{
		this.active = active;
	}
	
	/**
	 *获取""属性
	 */
	public Integer getActive()
	{
		return this.active;
	}	   

	/**
	 *设置""属性
	 *@param role 实体的Role属性
	 */
	public void setRole(String role)
	{
		this.role = role;
	}
	
	/**
	 *获取""属性
	 */
	public String getRole()
	{
		return this.role;
	}	   
	public Omeka_users() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Omeka_users(
		Integer id
	 	,String username
	 	,String name
	 	,String email
	 	,String password
	 	,String salt
	 	,Integer active
	 	,String role
		 ){
		super();
		this.id = id;
	 	this.username = username;
	 	this.name = name;
	 	this.email = email;
	 	this.password = password;
	 	this.salt = salt;
	 	this.active = active;
	 	this.role = role;
	}
}

