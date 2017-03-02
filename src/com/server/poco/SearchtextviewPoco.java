package com.server.poco;

/**
 * searchtextview 实体类的常量
 *@author ZhangRuiLong
 */
public class SearchtextviewPoco
{
   /**
    * 实体中文名
    */
   public static String NAME = "searchtextview";
   /**
    * 实体表名
    */
   public static String TABLE = "Searchtextview";
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
	 	"",
	};
	/**
	 * 实体英文字段
	 */
   public static final String[] FIELDNAME = {
   		"id",
	 	"harvest_id",
	 	"item_id",
	 	"identifier",
	 	"handle",
	 	"datestamp",
	 	"record_type",
	 	"title",
	 	"searchtext",
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
	 	"harvest_id",
	 	"item_id",
	 	"identifier",
	 	"handle",
	 	"datestamp",
	 	"record_type",
	 	"title",
	 	"searchtext",
   };
}

