package com.server.poco;

/**
 * elementtextsview 实体类的常量
 *@author ZhangRuiLong
 */
public class ElementtextsviewPoco
{
   /**
    * 实体中文名
    */
   public static final String NAME = "elementtextsview";
   /**
    * 实体表名
    */
   public static final String TABLE = "Elementtextsview";
   /**
    * 实体主键
    */
   public static final String[] KEYCOLUMN = {"id"};
   /**
    * 实体中文字段
    */
   public static final String[] CHINESENAME = {
   		"",
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
	 	"record_id",
	 	"record_type",
	 	"element_id",
	 	"html",
	 	"text",
	 	"order",
	 	"name",
	 	"description",
	 	"comment",
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
	 	"element_id",
	 	"text",
	 	"name",
	 	"description",
	 	"comment",
   };
}

