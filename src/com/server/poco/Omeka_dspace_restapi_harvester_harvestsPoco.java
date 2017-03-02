package com.server.poco;

/**
 * omeka_dspace_restapi_harvester_harvests 实体类的常量
 *@author ZhangRuiLong
 */
public class Omeka_dspace_restapi_harvester_harvestsPoco
{
   /**
    * 实体中文名
    */
   public static String NAME = "omeka_dspace_restapi_harvester_harvests";
   /**
    * 实体表名
    */
   public static String TABLE = "Omeka_dspace_restapi_harvester_harvests";
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
	 	"collection_id",
	 	"source_collection_id",
	 	"base_url",
	 	"collection_spec",
	 	"collection_name",
	 	"collection_handle",
	 	"collection_size",
	 	"status",
	 	"status_messages",
	 	"resumption_token",
	 	"initiated",
	 	"completed",
	 	"start_from",
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
	 	"collection_id",
	 	"source_collection_id",
	 	"base_url",
	 	"collection_spec",
	 	"collection_name",
	 	"collection_handle",
	 	"collection_size",
	 	"status",
	 	"status_messages",
	 	"resumption_token",
	 	"initiated",
	 	"completed",
	 	"start_from",
   };
}

