package com.server.pojo;

import java.sql.Timestamp;
import java.math.BigDecimal;
/**
 * server_company 实体类
 *@author ZhangRuiLong
 */
public class Server_company
{
   /**
    * ID,主键
    */
   private String companyid; 
   /**
    * 商品
    */
   private String companyproduct;   
   /**
    * 公司
    */
   private String companycompany;   
   /**
    * 商品信息(英文)
    */
   private String companypie;   
   /**
    * 商品信息(中文)
    */
   private String companypic;   
   /**
    * 公司信息(英文)
    */
   private String companycie;   
   /**
    * 公司信息(中文)
    */
   private String companycic;   
    //属性方法	    
     /**
	 *设置主键"ID"属性
	 *@param companyid 实体的Companyid属性
	 */
	public void setCompanyid(String companyid)
	{
		this.companyid = companyid;
	}
	
	/**
	 *获取主键"ID"属性
	 */
	public String getCompanyid()
	{
		return this.companyid;
	}

	/**
	 *设置"商品"属性
	 *@param companyproduct 实体的Companyproduct属性
	 */
	public void setCompanyproduct(String companyproduct)
	{
		this.companyproduct = companyproduct;
	}
	
	/**
	 *获取"商品"属性
	 */
	public String getCompanyproduct()
	{
		return this.companyproduct;
	}	   

	/**
	 *设置"公司"属性
	 *@param companycompany 实体的Companycompany属性
	 */
	public void setCompanycompany(String companycompany)
	{
		this.companycompany = companycompany;
	}
	
	/**
	 *获取"公司"属性
	 */
	public String getCompanycompany()
	{
		return this.companycompany;
	}	   

	/**
	 *设置"商品信息(英文)"属性
	 *@param companypie 实体的Companypie属性
	 */
	public void setCompanypie(String companypie)
	{
		this.companypie = companypie;
	}
	
	/**
	 *获取"商品信息(英文)"属性
	 */
	public String getCompanypie()
	{
		return this.companypie;
	}	   

	/**
	 *设置"商品信息(中文)"属性
	 *@param companypic 实体的Companypic属性
	 */
	public void setCompanypic(String companypic)
	{
		this.companypic = companypic;
	}
	
	/**
	 *获取"商品信息(中文)"属性
	 */
	public String getCompanypic()
	{
		return this.companypic;
	}	   

	/**
	 *设置"公司信息(英文)"属性
	 *@param companycie 实体的Companycie属性
	 */
	public void setCompanycie(String companycie)
	{
		this.companycie = companycie;
	}
	
	/**
	 *获取"公司信息(英文)"属性
	 */
	public String getCompanycie()
	{
		return this.companycie;
	}	   

	/**
	 *设置"公司信息(中文)"属性
	 *@param companycic 实体的Companycic属性
	 */
	public void setCompanycic(String companycic)
	{
		this.companycic = companycic;
	}
	
	/**
	 *获取"公司信息(中文)"属性
	 */
	public String getCompanycic()
	{
		return this.companycic;
	}	   
	public Server_company() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Server_company(
		String companyid
	 	,String companyproduct
	 	,String companycompany
	 	,String companypie
	 	,String companypic
	 	,String companycie
	 	,String companycic
		 ){
		super();
		this.companyid = companyid;
	 	this.companyproduct = companyproduct;
	 	this.companycompany = companycompany;
	 	this.companypie = companypie;
	 	this.companypic = companypic;
	 	this.companycie = companycie;
	 	this.companycic = companycic;
	}
}

