package com.server.poco;

/**
 * omeka_processes 实体类的常量
 *@author ZhangRuiLong
 */
public class Omeka_processesPoco
{
   /**
    * 实体中文名
    */
   public static String NAME = "omeka_processes";
   /**
    * 实体表名
    */
   public static String TABLE = "Omeka_processes";
   /**
    * 实体主键
    */
   public static String[] KEYCOLUMN = {"id"};
   /**
    * 实体中文字段
    */
   public static String[] CHINESENAME = {
   		"",
	 	"",
	 	"",
	 	"",
	 	"",
	 	"",
	 	"",
	 	"",
	};
	/**
	 * 实体英文字段
	 */
   public static final String[] FIELDNAME = {
   		"id",
	 	"class",
	 	"user_id",
	 	"pid",
	 	"status",
	 	"args",
	 	"started",
	 	"stopped",
   };
   /**
    * 实体排序
    */
   public static final String ORDER = " id desc ";
   /**
	 * 要模糊查询字段
	 */
   public static final String[] QUERYFIELDNAME = {
   		"id",
	 	"class",
	 	"user_id",
	 	"pid",
	 	"status",
	 	"args",
	 	"started",
	 	"stopped",
   };
}

