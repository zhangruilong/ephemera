package com.server.service;

import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//import org.apache.solr.common.SolrDocumentList;
import com.server.pojo.Server_company;
import com.server.pojo.Server_company;
import com.server.pojo.Server_company;
import com.server.poco.Server_companyPoco;
import com.server.poco.Server_companyPoco;
import com.server.poco.Server_companyPoco;
import com.server.action.Server_companyAction;
import com.system.tools.CommonConst;
import com.system.tools.base.BaseActionDao;
import com.system.tools.pojo.Fileinfo;
import com.system.tools.pojo.Queryinfo;
import com.system.tools.util.CommonUtil;
import com.system.tools.util.FileUtil;
import com.system.tools.util.TypeUtil;
import com.system.tools.pojo.Pageinfo;

/**
 * server_company 服务层
 *@author ZhangRuiLong
 */
public class Server_companyService extends Server_companyAction {
	//导入
	public void impAll(HttpServletRequest request, HttpServletResponse response){
		Fileinfo fileinfo = FileUtil.upload(request,0,null,Server_companyPoco.NAME,"impAll");
		cuss = new ArrayList<Server_company>();
		try {
			InputStream fis = new FileInputStream(fileinfo.getPath());
			// 创建Excel工作薄
			XSSFWorkbook hwb = new XSSFWorkbook(fis);
			// 得到第一个工作表
			XSSFSheet sheet = hwb.getSheetAt(0);
			XSSFRow row = null;
			// 遍历该表格中所有的工作表，i表示工作表的数量 getNumberOfSheets表示工作表的总数
			for (int i = 0; i < hwb.getNumberOfSheets(); i++) {
				sheet = hwb.getSheetAt(i);
				// 遍历该行所有的行,j表示行数 getPhysicalNumberOfRows行的总数
				for (int j = 1; j < sheet.getPhysicalNumberOfRows(); j++) {
					row = sheet.getRow(j);
					Server_company mServer_company = new Server_company(getCellValue(row.getCell(0)), getCellValue(row.getCell(1)), 
							getCellValue(row.getCell(2)), getCellValue(row.getCell(3)), getCellValue(row.getCell(4)), 
							getCellValue(row.getCell(5)), getCellValue(row.getCell(6)));
					cuss.add(mServer_company);
				}
			}
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		for(Server_company temp:cuss){
			if(CommonUtil.isNull(temp.getCompanyid()))
				temp.setCompanyid(CommonUtil.getNewId());
			result = insSingle(temp);
		}
		responsePW(response, result);
	}
	//判断从2007Excel文件中解析出来数据的格式
	public static String getCellValue(XSSFCell cell){
       String value = "";
       //简单的查检列类型
       if (cell != null) {
	       switch(cell.getCellType())
	       {
	           case XSSFCell.CELL_TYPE_STRING://字符串
	               value = cell.getRichStringCellValue().getString().trim();
	               break;
	           case XSSFCell.CELL_TYPE_NUMERIC://数字
	        	   if(HSSFDateUtil.isCellDateFormatted(cell)) {//日期格式
	        		   java.util.Date d = cell.getDateCellValue();  
	        		   DateFormat formater = new SimpleDateFormat("yyyy-MM-dd");  
	        		   value = formater.format(d);
	        	   }else if(cell.getCellStyle().getDataFormatString().indexOf("%") != -1) {
	        		   value = cell.getNumericCellValue()+"";
	        	   }else{
		               cell.setCellType(HSSFCell.CELL_TYPE_STRING);  
		               String temp = cell.getStringCellValue();  
		               //判断是否包含小数点，如果不含小数点，则以字符串读取，如果含小数点，则转换为Double类型的字符串  
		               if(temp.indexOf(".")>-1){  
		            	   value = String.valueOf(new Double(temp)).trim();  
		               }else{  
		            	   value = temp.trim();  
		               }  
	        	   }
	               break;
	           case XSSFCell.CELL_TYPE_BLANK://空
	               value = "";
	               break;   
	           case XSSFCell.CELL_TYPE_FORMULA://函数
	        	 //value = String.valueOf(cell.getCellFormula());
	        	   cell.setCellType(XSSFCell.CELL_TYPE_STRING);
	        	   value = cell.getRichStringCellValue().getString();
	               break;
	           case XSSFCell.CELL_TYPE_BOOLEAN://boolean型值
	               value = String.valueOf(cell.getBooleanCellValue());
	               break;
	           case XSSFCell.CELL_TYPE_ERROR:
	               value = String.valueOf(cell.getErrorCellValue());
	               break;
	           default:
	        	   System.out.println("未知类型");
	               break;
	       }
       }
       return value;
	}
	//分页查询
	public void selQuery(HttpServletRequest request, HttpServletResponse response){
		Queryinfo queryinfo = getQueryinfo(request, Server_company.class, Server_companyPoco.QUERYFIELDNAME, Server_companyPoco.ORDER, TYPE);
		String queryft = request.getParameter("queryft");
		String queryjt = request.getParameter("queryjt");
		if(!CommonUtil.isEmpty(queryft)){
			queryinfo.setQuery(queryinfo.getQuery()+" or "+getQuerysql(queryft,Server_companyPoco.QUERYFIELDNAME));
		}
		if(!CommonUtil.isEmpty(queryjt)){
			queryinfo.setQuery(queryinfo.getQuery()+" or "+getQuerysql(queryjt,Server_companyPoco.QUERYFIELDNAME));
		}
		Pageinfo pageinfo = new Pageinfo(getTotal(queryinfo),selQuery(queryinfo));
		result = CommonConst.GSON.toJson(pageinfo);
		responsePW(response, result);
	}
}
