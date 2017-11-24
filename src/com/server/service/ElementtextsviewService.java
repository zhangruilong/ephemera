package com.server.service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.server.action.ElementtextsviewAction;
import com.server.bean.ElementtextsviewBean;
import com.server.poco.ElementtextsviewPoco;
//import org.apache.solr.common.SolrDocumentList;
import com.server.pojo.Elementtextsview;
import com.system.tools.CommonConst;
import com.system.tools.pojo.Pageinfo;
import com.system.tools.pojo.Queryinfo;

/**
 * elementtextsview 服务层
 *@author ZhangRuiLong
 */
public class ElementtextsviewService extends ElementtextsviewAction {
	//查询所有
	public void selElementtexts(HttpServletRequest request, HttpServletResponse response){
		Queryinfo queryinfo = getQueryinfo(request, Elementtextsview.class, ElementtextsviewPoco.QUERYFIELDNAME, " CONVERT('comment',SIGNED) ", TYPE);
		cuss = (ArrayList<Elementtextsview>) selAll(queryinfo);
		ArrayList<ElementtextsviewBean> beans = new ArrayList<ElementtextsviewBean>();
		for(Elementtextsview temp:cuss){
			ArrayList<Elementtextsview> addbeans = new ArrayList<Elementtextsview>();
			Boolean noexit = true;
			for(ElementtextsviewBean bean:beans){
				if(temp.getElement_id()==bean.getElement_id()) {
					noexit = false;
					addbeans = bean.getElementtexts();
					addbeans.add(temp);
					bean.setElementtexts(addbeans);
					break;
				}else noexit = true;
			}
			if(noexit){
				ElementtextsviewBean mElementtextsviewBean = new ElementtextsviewBean();
				mElementtextsviewBean.setElement_id(temp.getElement_id());
				mElementtextsviewBean.setName(temp.getName());
				addbeans.add(temp);
				mElementtextsviewBean.setElementtexts(addbeans);
				beans.add(mElementtextsviewBean);
			}
		}
		Pageinfo pageinfo = new Pageinfo(0, beans);
		result = CommonConst.GSON.toJson(pageinfo);
		responsePW(response, result);
	}
}
