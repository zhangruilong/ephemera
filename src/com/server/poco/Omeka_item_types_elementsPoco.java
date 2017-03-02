package com.server.poco;

/**
 * omeka_item_types_elements 实体类的常量
 *@author ZhangRuiLong
 */
public class Omeka_item_types_elementsPoco
{
   /**
    * 实体中文名
    */
   public static String NAME = "omeka_item_types_elements";
   /**
    * 实体表名
    */
   public static String TABLE = "Omeka_item_types_elements";
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
	};
	/**
	 * 实体英文字段
	 */
   public static final String[] FIELDNAME = {
   		"id",
	 	"item_type_id",
	 	"element_id",
	 	"order",
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
	 	"element_id",
	 	"order",
   };
}

