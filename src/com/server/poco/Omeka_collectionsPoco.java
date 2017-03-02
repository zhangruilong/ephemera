package com.server.poco;

/**
 * omeka_collections 实体类的常量
 *@author ZhangRuiLong
 */
public class Omeka_collectionsPoco
{
   /**
    * 实体中文名
    */
   public static String NAME = "omeka_collections";
   /**
    * 实体表名
    */
   public static String TABLE = "Omeka_collections";
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
	};
	/**
	 * 实体英文字段
	 */
   public static final String[] FIELDNAME = {
   		"id",
	 	"public",
	 	"featured",
	 	"added",
	 	"modified",
	 	"owner_id",
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
	 	"public",
	 	"featured",
	 	"added",
	 	"modified",
	 	"owner_id",
   };
}

