package com.server.pojo;

import java.sql.Date;
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
   private String mclass;   
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
   private String status;   
   /**
    * 
    */
   private String args;   
   /**
    * 
    */
   private String started;   
   /**
    * 
    */
   private String stopped;   
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
	public void setClass(String mclass)
	{
		this.mclass = mclass;
	}
	
	/**
	 *获取""属性
	 */
	public String getmClass()
	{
		return this.mclass;
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
	public void setStatus(String status)
	{
		this.status = status;
	}
	
	/**
	 *获取""属性
	 */
	public String getStatus()
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
	public void setStarted(String started)
	{
		this.started = started;
	}
	
	/**
	 *获取""属性
	 */
	public String getStarted()
	{
		return this.started;
	}	   

	/**
	 *设置""属性
	 *@param stopped 实体的Stopped属性
	 */
	public void setStopped(String stopped)
	{
		this.stopped = stopped;
	}
	
	/**
	 *获取""属性
	 */
	public String getStopped()
	{
		return this.stopped;
	}	   
	public Omeka_processes() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Omeka_processes(
		Integer id
	 	,String mclass
	 	,Integer user_id
	 	,Integer pid
	 	,String status
	 	,String args
	 	,String started
	 	,String stopped
		 ){
		super();
		this.id = id;
	 	this.mclass = mclass;
	 	this.user_id = user_id;
	 	this.pid = pid;
	 	this.status = status;
	 	this.args = args;
	 	this.started = started;
	 	this.stopped = stopped;
	}
}

