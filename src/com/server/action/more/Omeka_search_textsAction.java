package com.server.action.more;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.server.pojo.Omeka_search_texts;
import com.system.tools.pojo.Queryinfo;
import com.system.tools.util.CommonUtil;
import com.system.tools.util.TypeUtil;

public class Omeka_search_textsAction extends com.server.action.Omeka_search_textsAction {
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
