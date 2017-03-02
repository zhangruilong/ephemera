package com.server.poco;

/**
 * omeka_items 实体类的常量
 *@author ZhangRuiLong
 */
public class Omeka_itemsPoco
{
   /**
    * 实体中文名
    */
   public static String NAME = "omeka_items";
   /**
    * 实体表名
    */
   public static String TABLE = "Omeka_items";
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
	 	"item_type_id",
	 	"collection_id",
	 	"featured",
	 	"public",
	 	"modified",
	 	"added",
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
	 	"item_type_id",
	 	"collection_id",
	 	"featured",
	 	"public",
	 	"modified",
	 	"added",
	 	"owner_id",
   };
}

