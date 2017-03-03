package com.server.pojo;

import java.sql.Timestamp;
import java.math.BigDecimal;
/**
 * omeka_item_types_elements 实体类
 *@author ZhangRuiLong
 */
public class Omeka_item_types_elements
{
   /**
    * ,主键
    */
   private Integer id; 
   /**
    * 
    */
   private Integer item_type_id;   
   /**
    * 
    */
   private Integer element_id;   
   /**
    * 
    */
   private Integer order;   
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
	 *@param item_type_id 实体的Item_type_id属性
	 */
	public void setItem_type_id(Integer item_type_id)
	{
		this.item_type_id = item_type_id;
	}
	
	/**
	 *获取""属性
	 */
	public Integer getItem_type_id()
	{
		return this.item_type_id;
	}	   

	/**
	 *设置""属性
	 *@param element_id 实体的Element_id属性
	 */
	public void setElement_id(Integer element_id)
	{
		this.element_id = element_id;
	}
	
	/**
	 *获取""属性
	 */
	public Integer getElement_id()
	{
		return this.element_id;
	}	   

	/**
	 *设置""属性
	 *@param order 实体的Order属性
	 */
	public void setOrder(Integer order)
	{
		this.order = order;
	}
	
	/**
	 *获取""属性
	 */
	public Integer getOrder()
	{
		return this.order;
	}	   
	public Omeka_item_types_elements() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Omeka_item_types_elements(
		Integer id
	 	,Integer item_type_id
	 	,Integer element_id
	 	,Integer order
		 ){
		super();
		this.id = id;
	 	this.item_type_id = item_type_id;
	 	this.element_id = element_id;
	 	this.order = order;
	}
}

