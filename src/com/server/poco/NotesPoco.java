package com.server.poco;

/**
 * notes 实体类的常量
 *@author ZhangRuiLong
 */
public class NotesPoco
{
   /**
    * 实体中文名
    */
   public static String NAME = "notes";
   /**
    * 实体表名
    */
   public static String TABLE = "Notes";
   /**
    * 实体主键
    */
   public static String[] KEYCOLUMN = {"notesid"};
   /**
    * 实体中文字段
    */
   public static String[] CHINESENAME = {
   		"ID",
	 	"会员ID",
	 	"会员卡ID",
	 	"场地ID",
	 	"课程ID",
	 	"项目",
	 	"入场时间",
	 	"离场时间",
	 	"创建人",
	};
	/**
	 * 实体英文字段
	 */
   public static final String[] FIELDNAME = {
   		"notesid",
	 	"notescustomer",
	 	"notescard",
	 	"notesplace",
	 	"notescourse",
	 	"notesproject",
	 	"notesbegin",
	 	"notesend",
	 	"creator",
   };
   /**
    * 实体排序
    */
   public static final String ORDER = " notesid desc ";
   /**
	 * 要模糊查询字段
	 */
   public static final String[] QUERYFIELDNAME = {
   		"notesid",
	 	"notescustomer",
	 	"notescard",
	 	"notesplace",
	 	"notescourse",
	 	"notesproject",
	 	"notesbegin",
	 	"notesend",
	 	"creator",
   };
}

