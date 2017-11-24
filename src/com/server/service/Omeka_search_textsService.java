package com.server.service;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.server.action.Omeka_search_textsAction;
import com.server.poco.Omeka_search_textsPoco;
import com.server.pojo.Omeka_search_texts;
import com.system.tools.CommonConst;
import com.system.tools.pojo.Fileinfo;
import com.system.tools.pojo.Queryinfo;
import com.system.tools.util.CommonUtil;
import com.system.tools.util.FileUtil;
import com.system.tools.util.TypeUtil;

/**
 * searchtextview 服务层
 *@author ZhangRuiLong
 */
public class Omeka_search_textsService extends Omeka_search_textsAction {
	//新增
	public void insAll(HttpServletRequest request, HttpServletResponse response){
		String json = request.getParameter("json");
		System.out.println("json : " + json);
		json = json.replace("\"\"", "null");
		if(CommonUtil.isNotEmpty(json)) cuss = CommonConst.GSON.fromJson(json, TYPE);
		for(Omeka_search_texts temp:cuss){
			//if(CommonUtil.isNull(temp.getId()))
			//	temp.setId(CommonUtil.getNewId());
			String sql = "insert into Omeka_search_texts (record_type,record_id,public,title,text) values ('"
			+temp.getRecord_type()+"',"
			+temp.getRecord_id()+","
			+1+",'"
			+temp.getTitle()+"','"
			+temp.getText()+"')";
			result = doSingle(sql);
		}
		responsePW(response, result);
	}
	//导入
	public void impAll(HttpServletRequest request, HttpServletResponse response){
		Fileinfo fileinfo = FileUtil.upload(request,0,null,Omeka_search_textsPoco.NAME,"impAll");
		String json = FileUtil.impExcel(fileinfo.getPath(),Omeka_search_textsPoco.FIELDNAME); 
		if(CommonUtil.isNotEmpty(json)) cuss = CommonConst.GSON.fromJson(json, TYPE);
		for(Omeka_search_texts temp:cuss){
		//	if(CommonUtil.isNull(temp.getId()))
		//		temp.setId(CommonUtil.getNewId());
			String sql = "insert into Omeka_search_texts (record_type,record_id,public,title,text) values ('"
					+temp.getRecord_type()+"',"
					+temp.getRecord_id()+","
					+temp.getPublic()+",'"
					+temp.getTitle()+"','"
					+temp.getText()+"')";
			result = doSingle(sql);
		}
		responsePW(response, result);
	}
	@SuppressWarnings("finally")
	public List selQuery(Queryinfo queryinfo) {
		String mDSNAME = queryinfo.getDsname();
		if(CommonUtil.isNull(mDSNAME))
			mDSNAME = connectionMan.getDsname();
		Connection  conn=connectionMan.getConnection(mDSNAME); 
		Statement stmt = null;
		ResultSet rs = null;
		List objs = new ArrayList();
		try {
			String sql = "";
			if(mDSNAME.equals("oracle")){
				sql += "select * from (select A.*, ROWNUM RN from (";
			}
			sql += "select * from " + queryinfo.getType().getSimpleName() + " where 1=1 ";
			if(!CommonUtil.isNull(queryinfo.getJson())){
				String jsonsql = TypeUtil.beanToSql(queryinfo.getJson());
				if(!CommonUtil.isNull(jsonsql))
				sql += " and (" + TypeUtil.beanToSql(queryinfo.getJson()) + ") ";
			}
			if(!CommonUtil.isNull(queryinfo.getWheresql())){
				sql += " and (" + queryinfo.getWheresql() + ") ";
			}
			if(!CommonUtil.isNull(queryinfo.getQuery())){
				sql += " and (" + queryinfo.getQuery() + ") ";
			}
			if(!CommonUtil.isNull(queryinfo.getOrder())){
				sql += " order by " + queryinfo.getOrder();
			}
			if(mDSNAME.equals("oracle")){
				if(queryinfo.getEnd().equals("0"))
					sql += ") A where ROWNUM  > "+queryinfo.getEnd()+" ) ";
				else
					sql += ") A where ROWNUM  <= "+queryinfo.getEnd()+" ) where RN > "+queryinfo.getStart();
			}else if(!queryinfo.getEnd().equals("0")){
				sql += " limit " + queryinfo.getStart() + "," + queryinfo.getLimit();
			}
			stmt = conn.createStatement();
			System.out.println(sql);
			rs = stmt.executeQuery(sql);
			//所有的属性
	        Field[] field = queryinfo.getType().getDeclaredFields(); 
			while (rs.next()) {
				Omeka_search_texts mOmeka_search_texts = new Omeka_search_texts(rs.getInt(1), rs.getString(2), rs.getInt(3),  rs.getInt(4), rs.getString(5), rs.getString(6));
				objs.add(mOmeka_search_texts);
			}
		} catch (Exception e) {
			System.out.println("Exception:" + e.getMessage());
		} finally{
			connectionMan.freeConnection(mDSNAME,conn,stmt,rs);
			return objs;
		}
	}
}
