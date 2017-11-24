package com.server.poco;

/**
 * server_company 实体类的常量
 *@author ZhangRuiLong
 */
public class Server_companyPoco
{
   /**
    * 实体中文名
    */
   public static final String NAME = "server_company";
   /**
    * 实体表名
    */
   public static final String TABLE = "Server_company";
   /**
    * 实体主键
    */
   public static final String[] KEYCOLUMN = {"companyid"};
   /**
    * 实体中文字段
    */
   public static final String[] CHINESENAME = {
   		"ID",
	 	"商品",
	 	"公司",
	 	"商品信息(英文)",
	 	"商品信息(中文)",
	 	"公司信息(英文)",
	 	"公司信息(中文)",
	};
	/**
	 * 实体英文字段
	 */
   public static final String[] FIELDNAME = {
   		"companyid",
	 	"companyproduct",
	 	"companycompany",
	 	"companypie",
	 	"companypic",
	 	"companycie",
	 	"companycic",
   };
   /**
    * 实体排序
    */
   public static final String ORDER = " companyid desc ";
   /**
	 * 要模糊查询字段
	 */
   public static final String[] QUERYFIELDNAME = {
   		"companyid",
	 	"companyproduct",
	 	"companycompany",
	 	"companypie",
	 	"companypic",
	 	"companycie",
	 	"companycic",
   };
}

