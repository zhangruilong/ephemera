package com.server.action;

import java.lang.reflect.Type;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.server.pojo.Omeka_dspace_restapi_harvester_elementsets;
import com.server.poco.Omeka_dspace_restapi_harvester_elementsetsPoco;
import com.system.tools.CommonConst;
import com.system.tools.base.BaseActionDao;
import com.system.tools.pojo.Fileinfo;
import com.system.tools.pojo.Queryinfo;
import com.system.tools.util.CommonUtil;
import com.system.tools.util.FileUtil;
import com.system.tools.pojo.Pageinfo;

/**
 * omeka_dspace_restapi_harvester_elementsets 逻辑层
 *@author ZhangRuiLong
 */
public class Omeka_dspace_restapi_harvester_elementsetsAction extends BaseActionDao {
	public String result = CommonConst.FAILURE;
	public ArrayList<Omeka_dspace_restapi_harvester_elementsets> cuss = null;
	public Type TYPE = new TypeToken<ArrayList<Omeka_dspace_restapi_harvester_elementsets>>() {}.getType();

	//新增
	public void insAll(HttpServletRequest request, HttpServletResponse response){
		String json = request.getParameter("json");
		System.out.println("json : " + json);
		json = json.replace("\"\"", "null");
		if(CommonUtil.isNotEmpty(json)) cuss = CommonConst.GSON.fromJson(json, TYPE);
		for(Omeka_dspace_restapi_harvester_elementsets temp:cuss){
			//if(CommonUtil.isNull(temp.getId()))
			//	temp.setId(CommonUtil.getNewId());
			result = insSingle(temp);
		}
		responsePW(response, result);
	}
	//删除
	public void delAll(HttpServletRequest request, HttpServletResponse response){
		String json = request.getParameter("json");
		System.out.println("json : " + json);
		if(CommonUtil.isNotEmpty(json)) cuss = CommonConst.GSON.fromJson(json, TYPE);
		for(Omeka_dspace_restapi_harvester_elementsets temp:cuss){
			result = delSingle(temp,Omeka_dspace_restapi_harvester_elementsetsPoco.KEYCOLUMN);
		}
		responsePW(response, result);
	}
	//修改
	public void updAll(HttpServletRequest request, HttpServletResponse response){
		String json = request.getParameter("json");
		System.out.println("json : " + json);
		if(CommonUtil.isNotEmpty(json)) cuss = CommonConst.GSON.fromJson(json, TYPE);
		for(Omeka_dspace_restapi_harvester_elementsets temp:cuss){
			result = updSingle(temp,Omeka_dspace_restapi_harvester_elementsetsPoco.KEYCOLUMN);
		}
		responsePW(response, result);
	}
	//导入
	public void impAll(HttpServletRequest request, HttpServletResponse response){
		Fileinfo fileinfo = FileUtil.upload(request,0,null,Omeka_dspace_restapi_harvester_elementsetsPoco.NAME,"impAll");
		String json = FileUtil.impExcel(fileinfo.getPath(),Omeka_dspace_restapi_harvester_elementsetsPoco.FIELDNAME); 
		if(CommonUtil.isNotEmpty(json)) cuss = CommonConst.GSON.fromJson(json, TYPE);
		for(Omeka_dspace_restapi_harvester_elementsets temp:cuss){
		//	if(CommonUtil.isNull(temp.getId()))
		//		temp.setId(CommonUtil.getNewId());
			result = insSingle(temp);
		}
		responsePW(response, result);
	}
	//导出
	public void expAll(HttpServletRequest request, HttpServletResponse response) throws Exception{
		Queryinfo queryinfo = getQueryinfo(request, Omeka_dspace_restapi_harvester_elementsets.class, Omeka_dspace_restapi_harvester_elementsetsPoco.QUERYFIELDNAME, Omeka_dspace_restapi_harvester_elementsetsPoco.ORDER, TYPE);
		cuss = (ArrayList<Omeka_dspace_restapi_harvester_elementsets>) selAll(queryinfo);
		FileUtil.expExcel(response,cuss,Omeka_dspace_restapi_harvester_elementsetsPoco.CHINESENAME,Omeka_dspace_restapi_harvester_elementsetsPoco.NAME);
	}
	//查询所有
	public void selAll(HttpServletRequest request, HttpServletResponse response){
		Queryinfo queryinfo = getQueryinfo(request, Omeka_dspace_restapi_harvester_elementsets.class, Omeka_dspace_restapi_harvester_elementsetsPoco.QUERYFIELDNAME, Omeka_dspace_restapi_harvester_elementsetsPoco.ORDER, TYPE);
		Pageinfo pageinfo = new Pageinfo(0, selAll(queryinfo));
		result = CommonConst.GSON.toJson(pageinfo);
		responsePW(response, result);
	}
	//分页查询
	public void selQuery(HttpServletRequest request, HttpServletResponse response){
		Queryinfo queryinfo = getQueryinfo(request, Omeka_dspace_restapi_harvester_elementsets.class, Omeka_dspace_restapi_harvester_elementsetsPoco.QUERYFIELDNAME, Omeka_dspace_restapi_harvester_elementsetsPoco.ORDER, TYPE);
		Pageinfo pageinfo = new Pageinfo(getTotal(queryinfo), selQuery(queryinfo));
		result = CommonConst.GSON.toJson(pageinfo);
		responsePW(response, result);
	}
	//查询LIMIT条
	public void selLimit(HttpServletRequest request, HttpServletResponse response){
		Queryinfo queryinfo = getQueryinfo(request, Omeka_dspace_restapi_harvester_elementsets.class, Omeka_dspace_restapi_harvester_elementsetsPoco.QUERYFIELDNAME, Omeka_dspace_restapi_harvester_elementsetsPoco.ORDER, TYPE, CommonConst.LIMIT);
		Pageinfo pageinfo = new Pageinfo(0, selQuery(queryinfo));
		result = CommonConst.GSON.toJson(pageinfo);
		responsePW(response, result);
	}
}
