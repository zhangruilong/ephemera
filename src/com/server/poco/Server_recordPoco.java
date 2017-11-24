package com.server.poco;

/**
 * server_record 实体类的常量
 *@author ZhangRuiLong
 */
public class Server_recordPoco
{
   /**
    * 实体中文名
    */
   public static final String NAME = "server_record";
   /**
    * 实体表名
    */
   public static final String TABLE = "Server_record";
   /**
    * 实体主键
    */
   public static final String[] KEYCOLUMN = {"recordid"};
   /**
    * 实体中文字段
    */
   public static final String[] CHINESENAME = {
   		"ID",
	 	"商品",
	 	"分类",
	 	"公司",
	 	"国别",
	 	"版面位置",
	 	"主题词",
	 	"代理商",
	 	"地址",
	 	"相关网站",
	 	"年",
	 	"期号",
	 	"版面",
	 	"公历日期",
	 	"农历日期",
	 	"民国日期",
	 	"帝王纪年",
	 	"全文",
	 	"描述",
	 	"标题",
	 	"出版商",
	 	"备注",
	};
	/**
	 * 实体英文字段
	 */
   public static final String[] FIELDNAME = {
   		"recordid",
	 	"recordproduct",
	 	"recordcategory",
	 	"recordcompany",
	 	"recordnationality",
	 	"recordposition",
	 	"recordsubject",
	 	"recordagency",
	 	"recordaddress",
	 	"recordotherinfo",
	 	"recordyear",
	 	"recordissuenumber",
	 	"recordpage",
	 	"recorddate",
	 	"recordlunadate",
	 	"recordminguodate",
	 	"recordredate",
	 	"recordfulltext",
	 	"recorddescription",
	 	"recordtitle",
	 	"recordpublisher",
	 	"recorddetails",
   };
   /**
    * 实体排序
    */
   public static final String ORDER = " recordid desc ";
   /**
	 * 要模糊查询字段
	 */
   public static final String[] QUERYFIELDNAME = {
   		"recordid",
	 	"recordproduct",
	 	"recordcategory",
	 	"recordcompany",
	 	"recordnationality",
	 	"recordposition",
	 	"recordsubject",
	 	"recordagency",
	 	"recordaddress",
	 	"recordotherinfo",
	 	"recordyear",
	 	"recordissuenumber",
	 	"recordpage",
	 	"recorddate",
	 	"recordlunadate",
	 	"recordminguodate",
	 	"recordredate",
	 	"recordfulltext",
	 	"recorddescription",
	 	"recordtitle",
	 	"recordpublisher",
	 	"recorddetails",
   };
}

