package com.server.poco;

/**
 * cms_seo 实体类的常量
 *@author ZhangRuiLong
 */
public class Cms_seoPoco
{
   /**
    * 实体中文名
    */
   public static String NAME = "cms_seo";
   /**
    * 实体表名
    */
   public static String TABLE = "Cms_seo";
   /**
    * 实体主键
    */
   public static String[] KEYCOLUMN = {"seoid"};
   /**
    * 实体中文字段
    */
   public static String[] CHINESENAME = {
   		"ID",
	 	"关键字",
	 	"详细",
	 	"模板",
	 	"LOGO",
	 	"公司",
	 	"地址",
	 	"电话",
	 	"邮编",
	 	"邮箱",
	 	"COPYRIGHT",
	 	"备案",
	};
	/**
	 * 实体英文字段
	 */
   public static final String[] FIELDNAME = {
   		"seoid",
	 	"seokeyword",
	 	"seodetail",
	 	"seomodel",
	 	"logo",
	 	"seocompany",
	 	"seoaddress",
	 	"seotel",
	 	"seoposcode",
	 	"seoemail",
	 	"seocopyright",
	 	"seoicp",
   };
   /**
    * 实体排序
    */
   public static final String ORDER = " seoid desc ";
   /**
	 * 要模糊查询字段
	 */
   public static final String[] QUERYFIELDNAME = {
   		"seoid",
	 	"seokeyword",
	 	"seodetail",
	 	"seomodel",
	 	"logo",
	 	"seocompany",
	 	"seoaddress",
	 	"seotel",
	 	"seoposcode",
	 	"seoemail",
	 	"seocopyright",
	 	"seoicp",
   };
}

