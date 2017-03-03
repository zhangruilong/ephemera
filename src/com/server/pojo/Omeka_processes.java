package com.server.pojo;

import java.sql.Timestamp;
import java.math.BigDecimal;
/**
 * omeka_processes 实体类
 *@author ZhangRuiLong
 */
public class Omeka_processes
{
   /**
    * ,主键
    */
   private Integer id; 
   /**
    * 
    */
   private String class1;   
   /**
    * 
    */
   private Integer user_id;   
   /**
    * 
    */
   private Integer pid;   
   /**
    * 
    */
   private Integer status;   
   /**
    * 
    */
   private String args;   
   /**
    * 
    */
   private Timestamp started;   
   /**
    * 
    */
   private Timestamp stopped;   
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
	 *@param class 实体的Class属性
	 */
	public void setClass(String class1)
	{
		this.class1 = class1;
	}
	
	/**
	 *获取""属性
	 */
	public String getClass1()
	{
		return this.class1;
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
	 *@param pid 实体的Pid属性
	 */
	public void setPid(Integer pid)
	{
		this.pid = pid;
	}
	
	/**
	 *获取""属性
	 */
	public Integer getPid()
	{
		return this.pid;
	}	   

	/**
	 *设置""属性
	 *@param status 实体的Status属性
	 */
	public void setStatus(Integer status)
	{
		this.status = status;
	}
	
	/**
	 *获取""属性
	 */
	public Integer getStatus()
	{
		return this.status;
	}	   

	/**
	 *设置""属性
	 *@param args 实体的Args属性
	 */
	public void setArgs(String args)
	{
		this.args = args;
	}
	
	/**
	 *获取""属性
	 */
	public String getArgs()
	{
		return this.args;
	}	   

	/**
	 *设置""属性
	 *@param started 实体的Started属性
	 */
	public void setStarted(Timestamp started)
	{
		this.started = started;
	}
	
	/**
	 *获取""属性
	 */
	public Timestamp getStarted()
	{
		return this.started;
	}	   

	/**
	 *设置""属性
	 *@param stopped 实体的Stopped属性
	 */
	public void setStopped(Timestamp stopped)
	{
		this.stopped = stopped;
	}
	
	/**
	 *获取""属性
	 */
	public Timestamp getStopped()
	{
		return this.stopped;
	}	   
	public Omeka_processes() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Omeka_processes(
		Integer id
	 	,String class1
	 	,Integer user_id
	 	,Integer pid
	 	,Integer status
	 	,String args
	 	,Timestamp started
	 	,Timestamp stopped
		 ){
		super();
		this.id = id;
	 	this.class1 = class1;
	 	this.user_id = user_id;
	 	this.pid = pid;
	 	this.status = status;
	 	this.args = args;
	 	this.started = started;
	 	this.stopped = stopped;
	}
}

