package com.server.poco;

/**
 * om_empposition 实体类的常量
 *@author ZhangRuiLong
 */
public class Om_emppositionPoco
{
   /**
    * 实体中文名
    */
   public static String NAME = "om_empposition";
   /**
    * 实体表名
    */
   public static String TABLE = "Om_empposition";
   /**
    * 实体主键
    */
   public static String[] KEYCOLUMN = {"posempid"};
   /**
    * 实体中文字段
    */
   public static String[] CHINESENAME = {
   		"岗位人员ID",
	 	"岗位编号",
	 	"人员编号",
	 	"是否主岗位",
	};
	/**
	 * 实体英文字段
	 */
   public static final String[] FIELDNAME = {
   		"posempid",
	 	"positionid",
	 	"empid",
	 	"ismain",
   };
   /**
    * 实体排序
    */
   public static final String ORDER = " posempid desc ";
   /**
	 * 要模糊查询字段
	 */
   public static final String[] QUERYFIELDNAME = {
   		"posempid",
	 	"positionid",
	 	"empid",
	 	"ismain",
   };
}

