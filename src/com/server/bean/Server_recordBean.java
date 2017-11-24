package com.server.bean;

import java.sql.Timestamp;
import java.math.BigDecimal;
/**
 * server_record 实体类
 *@author ZhangRuiLong
 */
public class Server_recordBean
{
	/**
	    * ID,主键
	    */
	   private String companyid; 
	   /**
	    * 商品
	    */
	   private String companyproduct;   
	   /**
	    * 公司
	    */
	   private String companycompany;   
	   /**
	    * 商品信息(英文)
	    */
	   private String companypie;   
	   /**
	    * 商品信息(中文)
	    */
	   private String companypic;   
	   /**
	    * 公司信息(英文)
	    */
	   private String companycie;   
	   /**
	    * 公司信息(中文)
	    */
	   private String companycic; 
   /**
    * ID,主键
    */
   private String recordid; 
   /**
    * 商品
    */
   private String recordproduct;   
   /**
    * 分类
    */
   private String recordcategory;   
   /**
    * 公司
    */
   private String recordcompany;   
   /**
    * 国别
    */
   private String recordnationality;   
   /**
    * 版面位置
    */
   private String recordposition;   
   /**
    * 主题词
    */
   private String recordsubject;   
   /**
    * 代理商
    */
   private String recordagency;   
   /**
    * 地址
    */
   private String recordaddress;   
   /**
    * 相关网站
    */
   private String recordotherinfo;   
   /**
    * 年
    */
   private String recordyear;   
   /**
    * 期号
    */
   private String recordissuenumber;   
   /**
    * 版面
    */
   private String recordpage;   
   /**
    * 公历日期
    */
   private String recorddate;   
   /**
    * 农历日期
    */
   private String recordlunadate;   
   /**
    * 民国日期
    */
   private String recordminguodate;   
   /**
    * 帝王纪年
    */
   private String recordredate;   
   /**
    * 全文
    */
   private String recordfulltext;   
   /**
    * 描述
    */
   private String recorddescription;   
   /**
    * 标题
    */
   private String recordtitle;   
   /**
    * 出版商
    */
   private String recordpublisher;   
   /**
    * 备注
    */
   private String recorddetails;   
    //属性方法	    
     /**
	 *设置主键"ID"属性
	 *@param recordid 实体的Recordid属性
	 */
	public void setRecordid(String recordid)
	{
		this.recordid = recordid;
	}
	
	/**
	 *获取主键"ID"属性
	 */
	public String getRecordid()
	{
		return this.recordid;
	}

	/**
	 *设置"商品"属性
	 *@param recordproduct 实体的Recordproduct属性
	 */
	public void setRecordproduct(String recordproduct)
	{
		this.recordproduct = recordproduct;
	}
	
	/**
	 *获取"商品"属性
	 */
	public String getRecordproduct()
	{
		return this.recordproduct;
	}	   

	/**
	 *设置"分类"属性
	 *@param recordcategory 实体的Recordcategory属性
	 */
	public void setRecordcategory(String recordcategory)
	{
		this.recordcategory = recordcategory;
	}
	
	/**
	 *获取"分类"属性
	 */
	public String getRecordcategory()
	{
		return this.recordcategory;
	}	   

	public String getCompanyid() {
		return companyid;
	}

	public void setCompanyid(String companyid) {
		this.companyid = companyid;
	}

	public String getCompanyproduct() {
		return companyproduct;
	}

	public void setCompanyproduct(String companyproduct) {
		this.companyproduct = companyproduct;
	}

	public String getCompanycompany() {
		return companycompany;
	}

	public void setCompanycompany(String companycompany) {
		this.companycompany = companycompany;
	}

	public String getCompanypie() {
		return companypie;
	}

	public void setCompanypie(String companypie) {
		this.companypie = companypie;
	}

	public String getCompanypic() {
		return companypic;
	}

	public void setCompanypic(String companypic) {
		this.companypic = companypic;
	}

	public String getCompanycie() {
		return companycie;
	}

	public void setCompanycie(String companycie) {
		this.companycie = companycie;
	}

	public String getCompanycic() {
		return companycic;
	}

	public void setCompanycic(String companycic) {
		this.companycic = companycic;
	}

	/**
	 *设置"公司"属性
	 *@param recordcompany 实体的Recordcompany属性
	 */
	public void setRecordcompany(String recordcompany)
	{
		this.recordcompany = recordcompany;
	}
	
	/**
	 *获取"公司"属性
	 */
	public String getRecordcompany()
	{
		return this.recordcompany;
	}	   

	/**
	 *设置"国别"属性
	 *@param recordnationality 实体的Recordnationality属性
	 */
	public void setRecordnationality(String recordnationality)
	{
		this.recordnationality = recordnationality;
	}
	
	/**
	 *获取"国别"属性
	 */
	public String getRecordnationality()
	{
		return this.recordnationality;
	}	   

	/**
	 *设置"版面位置"属性
	 *@param recordposition 实体的Recordposition属性
	 */
	public void setRecordposition(String recordposition)
	{
		this.recordposition = recordposition;
	}
	
	/**
	 *获取"版面位置"属性
	 */
	public String getRecordposition()
	{
		return this.recordposition;
	}	   

	/**
	 *设置"主题词"属性
	 *@param recordsubject 实体的Recordsubject属性
	 */
	public void setRecordsubject(String recordsubject)
	{
		this.recordsubject = recordsubject;
	}
	
	/**
	 *获取"主题词"属性
	 */
	public String getRecordsubject()
	{
		return this.recordsubject;
	}	   

	/**
	 *设置"代理商"属性
	 *@param recordagency 实体的Recordagency属性
	 */
	public void setRecordagency(String recordagency)
	{
		this.recordagency = recordagency;
	}
	
	/**
	 *获取"代理商"属性
	 */
	public String getRecordagency()
	{
		return this.recordagency;
	}	   

	/**
	 *设置"地址"属性
	 *@param recordaddress 实体的Recordaddress属性
	 */
	public void setRecordaddress(String recordaddress)
	{
		this.recordaddress = recordaddress;
	}
	
	/**
	 *获取"地址"属性
	 */
	public String getRecordaddress()
	{
		return this.recordaddress;
	}	   

	/**
	 *设置"相关网站"属性
	 *@param recordotherinfo 实体的Recordotherinfo属性
	 */
	public void setRecordotherinfo(String recordotherinfo)
	{
		this.recordotherinfo = recordotherinfo;
	}
	
	/**
	 *获取"相关网站"属性
	 */
	public String getRecordotherinfo()
	{
		return this.recordotherinfo;
	}	   

	/**
	 *设置"年"属性
	 *@param recordyear 实体的Recordyear属性
	 */
	public void setRecordyear(String recordyear)
	{
		this.recordyear = recordyear;
	}
	
	/**
	 *获取"年"属性
	 */
	public String getRecordyear()
	{
		return this.recordyear;
	}	   

	/**
	 *设置"期号"属性
	 *@param recordissuenumber 实体的Recordissuenumber属性
	 */
	public void setRecordissuenumber(String recordissuenumber)
	{
		this.recordissuenumber = recordissuenumber;
	}
	
	/**
	 *获取"期号"属性
	 */
	public String getRecordissuenumber()
	{
		return this.recordissuenumber;
	}	   

	/**
	 *设置"版面"属性
	 *@param recordpage 实体的Recordpage属性
	 */
	public void setRecordpage(String recordpage)
	{
		this.recordpage = recordpage;
	}
	
	/**
	 *获取"版面"属性
	 */
	public String getRecordpage()
	{
		return this.recordpage;
	}	   

	/**
	 *设置"公历日期"属性
	 *@param recorddate 实体的Recorddate属性
	 */
	public void setRecorddate(String recorddate)
	{
		this.recorddate = recorddate;
	}
	
	/**
	 *获取"公历日期"属性
	 */
	public String getRecorddate()
	{
		return this.recorddate;
	}	   

	/**
	 *设置"农历日期"属性
	 *@param recordlunadate 实体的Recordlunadate属性
	 */
	public void setRecordlunadate(String recordlunadate)
	{
		this.recordlunadate = recordlunadate;
	}
	
	/**
	 *获取"农历日期"属性
	 */
	public String getRecordlunadate()
	{
		return this.recordlunadate;
	}	   

	/**
	 *设置"民国日期"属性
	 *@param recordminguodate 实体的Recordminguodate属性
	 */
	public void setRecordminguodate(String recordminguodate)
	{
		this.recordminguodate = recordminguodate;
	}
	
	/**
	 *获取"民国日期"属性
	 */
	public String getRecordminguodate()
	{
		return this.recordminguodate;
	}	   

	/**
	 *设置"帝王纪年"属性
	 *@param recordredate 实体的Recordredate属性
	 */
	public void setRecordredate(String recordredate)
	{
		this.recordredate = recordredate;
	}
	
	/**
	 *获取"帝王纪年"属性
	 */
	public String getRecordredate()
	{
		return this.recordredate;
	}	   

	/**
	 *设置"全文"属性
	 *@param recordfulltext 实体的Recordfulltext属性
	 */
	public void setRecordfulltext(String recordfulltext)
	{
		this.recordfulltext = recordfulltext;
	}
	
	/**
	 *获取"全文"属性
	 */
	public String getRecordfulltext()
	{
		return this.recordfulltext;
	}	   

	/**
	 *设置"描述"属性
	 *@param recorddescription 实体的Recorddescription属性
	 */
	public void setRecorddescription(String recorddescription)
	{
		this.recorddescription = recorddescription;
	}
	
	/**
	 *获取"描述"属性
	 */
	public String getRecorddescription()
	{
		return this.recorddescription;
	}	   

	/**
	 *设置"标题"属性
	 *@param recordtitle 实体的Recordtitle属性
	 */
	public void setRecordtitle(String recordtitle)
	{
		this.recordtitle = recordtitle;
	}
	
	/**
	 *获取"标题"属性
	 */
	public String getRecordtitle()
	{
		return this.recordtitle;
	}	   

	/**
	 *设置"出版商"属性
	 *@param recordpublisher 实体的Recordpublisher属性
	 */
	public void setRecordpublisher(String recordpublisher)
	{
		this.recordpublisher = recordpublisher;
	}
	
	/**
	 *获取"出版商"属性
	 */
	public String getRecordpublisher()
	{
		return this.recordpublisher;
	}	   

	/**
	 *设置"备注"属性
	 *@param recorddetails 实体的Recorddetails属性
	 */
	public void setRecorddetails(String recorddetails)
	{
		this.recorddetails = recorddetails;
	}
	
	/**
	 *获取"备注"属性
	 */
	public String getRecorddetails()
	{
		return this.recorddetails;
	}	   
	public Server_recordBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Server_recordBean(String companyid, String companyproduct, String companycompany, String companypie,
			String companypic, String companycie, String companycic, String recordid, String recordproduct,
			String recordcategory, String recordcompany, String recordnationality, String recordposition,
			String recordsubject, String recordagency, String recordaddress, String recordotherinfo, String recordyear,
			String recordissuenumber, String recordpage, String recorddate, String recordlunadate,
			String recordminguodate, String recordredate, String recordfulltext, String recorddescription,
			String recordtitle, String recordpublisher, String recorddetails) {
		super();
		this.companyid = companyid;
		this.companyproduct = companyproduct;
		this.companycompany = companycompany;
		this.companypie = companypie;
		this.companypic = companypic;
		this.companycie = companycie;
		this.companycic = companycic;
		this.recordid = recordid;
		this.recordproduct = recordproduct;
		this.recordcategory = recordcategory;
		this.recordcompany = recordcompany;
		this.recordnationality = recordnationality;
		this.recordposition = recordposition;
		this.recordsubject = recordsubject;
		this.recordagency = recordagency;
		this.recordaddress = recordaddress;
		this.recordotherinfo = recordotherinfo;
		this.recordyear = recordyear;
		this.recordissuenumber = recordissuenumber;
		this.recordpage = recordpage;
		this.recorddate = recorddate;
		this.recordlunadate = recordlunadate;
		this.recordminguodate = recordminguodate;
		this.recordredate = recordredate;
		this.recordfulltext = recordfulltext;
		this.recorddescription = recorddescription;
		this.recordtitle = recordtitle;
		this.recordpublisher = recordpublisher;
		this.recorddetails = recorddetails;
	}
	
}

