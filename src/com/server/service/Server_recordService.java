package com.server.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.FileUploadBase.SizeLimitExceededException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//import org.apache.solr.common.SolrDocumentList;
import com.server.pojo.Server_record;
import com.server.poco.Server_companyPoco;
import com.server.poco.Server_recordPoco;
import com.server.action.Server_recordAction;
import com.server.bean.Server_recordBean;
import com.system.tools.CommonConst;
import com.system.tools.base.BaseActionDao;
import com.system.tools.pojo.Fileinfo;
import com.system.tools.pojo.Queryinfo;
import com.system.tools.util.CommonUtil;
import com.system.tools.util.FileUtil;
import com.system.tools.util.TypeUtil;
import com.system.tools.pojo.Pageinfo;

/**
 * server_record 服务层
 *@author ZhangRuiLong
 */
public class Server_recordService extends Server_recordAction {
	//查询company
	public void selCompany(HttpServletRequest request, HttpServletResponse response){
		String wheresql = request.getParameter("wheresql");
		String sql = "SELECT co.*,re.* from server_record re left join server_company co on re.recordproduct=co.companyproduct where "+wheresql;
		Pageinfo pageinfo = new Pageinfo(0, selAll(Server_recordBean.class, sql));
		result = CommonConst.GSON.toJson(pageinfo);
		responsePW(response, result);
	}
	//查询图片
	public void selImages(HttpServletRequest request, HttpServletResponse response){
		String wheresql = request.getParameter("wheresql");
		if(CommonUtil.isNull(wheresql)) wheresql="1=1";
		String sql = "SELECT count(re.recordfulltext) as recorddetails,re.recordid,re.recordproduct,re.recordcategory,re.recordcompany,re.recordfulltext"
				+ " from server_record re where "+wheresql+" group by re.recordfulltext";
		Pageinfo pageinfo = new Pageinfo(0, selAll(Server_record.class, sql));
		result = CommonConst.GSON.toJson(pageinfo);
		responsePW(response, result);
	}
	//导入
	public void impAll(HttpServletRequest request, HttpServletResponse response){
		Fileinfo fileinfo = FileUtil.upload(request,0,null,Server_recordPoco.NAME,"impAll");
		cuss = new ArrayList<Server_record>();
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
					Server_record mServer_record = new Server_record(getCellValue(row.getCell(0)), getCellValue(row.getCell(1)), 
							getCellValue(row.getCell(2)), getCellValue(row.getCell(3)), getCellValue(row.getCell(4)), 
							getCellValue(row.getCell(5)), getCellValue(row.getCell(6)), getCellValue(row.getCell(7)), 
							getCellValue(row.getCell(8)), getCellValue(row.getCell(9)), getCellValue(row.getCell(10)), 
							getCellValue(row.getCell(11)), getCellValue(row.getCell(12)), getCellValue(row.getCell(13)), 
							getCellValue(row.getCell(14)), getCellValue(row.getCell(15)), getCellValue(row.getCell(16)), 
							getCellValue(row.getCell(17)), getCellValue(row.getCell(18)), getCellValue(row.getCell(19)), 
							getCellValue(row.getCell(20)), getCellValue(row.getCell(21)));
					cuss.add(mServer_record);
				}
			}
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		for(Server_record temp:cuss){
			if(CommonUtil.isNull(temp.getRecordid()))
				temp.setRecordid(CommonUtil.getNewId());
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
	//批量上传文件
		public void upload(HttpServletRequest request, HttpServletResponse response) {
			Fileinfo fileinfo = upload(request,0,null,null,"html/tupian");
			responsePW(response, "{success:true,code:202,msg:'操作成功',aUrl:'"+fileinfo.getFullname()+"'}");
		}
		/**
		 * 上传接口
		 * @param request
		 * @param MAX_SIZE
		 * @param allowedExt
		 * @param name
		 * @param contents
		 * @return
		 */
		public Fileinfo upload(HttpServletRequest request,long MAX_SIZE,String[] allowedExt,String name,String contents) {
			String fullname = "";
			if(contents==null||"".equals(contents)){
				contents = "";  
			}else{
				contents +="/";
			}
			String type = "";
			String fileurl = "";
			long size = 0;
			if(MAX_SIZE==0){
				MAX_SIZE = 30 * 1024 * 1024;// 设置上传文件最大为 30M  
			}
	        // 允许上传的文件格式的列表  
	        //final String[] allowedExt = new String[] { "jpg", "jpeg", "gif", "bmp",  "png" };  
	        //String newfilepath = System.getProperty("catalina.home");//tomcat地址
	        // 实例化一个硬盘文件工厂,用来配置上传组件ServletFileUpload  
	        DiskFileItemFactory dfif = new DiskFileItemFactory();  
	        dfif.setSizeThreshold(4096);// 设置上传文件时用于临时存放文件的内存大小,这里是4K.多于的部分将临时存在硬盘  
	        dfif.setRepository(new File(request.getRealPath("")));// 设置存放临时文件的目录,web根目录下的ImagesUploadTemp目录  
	  
	        // 用以上工厂实例化上传组件  
	        ServletFileUpload sfu = new ServletFileUpload(dfif);  
	        // 设置最大上传尺寸  
	        sfu.setSizeMax(MAX_SIZE);  
	  
	        // 从request得到 所有 上传域的列表  
	        List fileList = null;  
	        try {  
	            fileList = sfu.parseRequest(request);  
	        } catch (FileUploadException e) {// 处理文件尺寸过大异常  
	            if (e instanceof SizeLimitExceededException) {  
	                System.out.println("文件尺寸超过规定大小:" + MAX_SIZE + "字节<p />");  
	                return null;  
	            }  
	            e.printStackTrace();  
	        }  
	        // 没有文件上传  
	        if (fileList == null || fileList.size() == 0) {  
	            return null;  
	        }  
	        // 得到所有上传的文件  
	        Iterator fileItr = fileList.iterator();  
	        // 循环处理所有文件  
	        while (fileItr.hasNext()) {  
	            FileItem fileItem = null;  
	            String path = null;  
	            // 得到当前文件  
	            fileItem = (FileItem) fileItr.next();  
	            // 忽略简单form字段而不是上传域的文件域(<input type="text" />等)  
	            if (fileItem == null || fileItem.isFormField()) {  
	                continue;  
	            }  
	            size = 0;  
	            // 得到文件的完整路径  
	            path = fileItem.getName();  
	            // 得到文件的大小  
	            size = fileItem.getSize();  
	            if ("".equals(path) || size == 0) {  
	                return null;  
	            }  
	  
	            // 得到去除路径的文件名  
	            String t_name = path.substring(path.lastIndexOf("\\") + 1);  
	            // 得到文件的扩展名(无扩展名时将得到全名)  
	            if(!CommonUtil.isNull(name)){
	    			name = name + t_name.substring(0,t_name.lastIndexOf("."));  
	    		}else{
	    			name = t_name.substring(0,t_name.lastIndexOf("."));  
	    		}
	            type = t_name.substring(t_name.lastIndexOf(".") + 1);
	            // 拒绝接受规定文件格式之外的文件类型  
	            if(allowedExt==null||allowedExt.length==0){
	            }else{
	            	int allowFlag = 0;  
	 	            int allowedExtCount = allowedExt.length;  
	 	            for (; allowFlag < allowedExtCount; allowFlag++) {  
	 	                if (allowedExt[allowFlag].equals(type))  
	 	                    break;  
	 	            }  
	 	            if (allowFlag == allowedExtCount) {  
	 	                System.out.println("请上传文件类型不在规定范围内！");  
	 	                return null;  
	 	            }
	            }
	            fullname = name + "." + type;
		            // 保存的最终文件完整路径,保存在web根目录下的uploaded目录下  
		        fileurl = request.getRealPath("/")+ contents + fullname; 
				/*String u_name = catalinaHome + "/Uploaded/"  
	                    + prefix + "." + type; */ 
		        try {
		        	File file = new File(fileurl);  
		        	if(!file.getParentFile().exists()) file.getParentFile().mkdirs();  
					fileItem.write(file);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				System.out.println("文件上传成功. 已保存为: " + fullname 
	                        + " &nbsp;&nbsp;文件大小: " + size + "字节<p />");  
		 }
	        Fileinfo fileinfo = new Fileinfo(contents + fullname,name,type,fileurl,size);
			return fileinfo;
		}
		//分页查询
		public void selQuery(HttpServletRequest request, HttpServletResponse response){
			Queryinfo queryinfo = getQueryinfo(request, Server_record.class, Server_recordPoco.QUERYFIELDNAME, Server_recordPoco.ORDER, TYPE);
			String queryft = request.getParameter("queryft");
			String queryjt = request.getParameter("queryjt");
			if(!CommonUtil.isEmpty(queryft)){
				queryinfo.setQuery(queryinfo.getQuery()+" or "+getQuerysql(queryft,Server_recordPoco.QUERYFIELDNAME));
			}
			if(!CommonUtil.isEmpty(queryjt)){
				queryinfo.setQuery(queryinfo.getQuery()+" or "+getQuerysql(queryjt,Server_recordPoco.QUERYFIELDNAME));
			}
			Pageinfo pageinfo = new Pageinfo(getTotal(queryinfo),selQuery(queryinfo));
			result = CommonConst.GSON.toJson(pageinfo);
			responsePW(response, result);
		}	 
}
