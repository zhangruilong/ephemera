package com.server.poco;

/**
 * omeka_records_tags 实体类的常量
 *@author ZhangRuiLong
 */
public class Omeka_records_tagsPoco
{
   /**
    * 实体中文名
    */
   public static String NAME = "omeka_records_tags";
   /**
    * 实体表名
    */
   public static String TABLE = "Omeka_records_tags";
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
	};
	/**
	 * 实体英文字段
	 */
   public static final String[] FIELDNAME = {
   		"id",
	 	"record_id",
	 	"record_type",
	 	"tag_id",
	 	"time",
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
	 	"record_id",
	 	"record_type",
	 	"tag_id",
	 	"time",
   };
}

