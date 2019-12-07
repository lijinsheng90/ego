package com.ego.manage.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ego.commons.pojo.EasyUIDataGrid;
import com.ego.commons.pojo.EgoResult;
import com.ego.manage.service.TbContentService;
import com.ego.pojo.TbContent;

@Controller
public class TbContentController {
	@Resource
	private TbContentService tbContentServiceImpl;
	
	/**
	 * 显示内容信息
	 * @param categoryId
	 * @param page
	 * @param rows
	 * @return
	  * add by lijinsheng
	 * time 2019-11-29
	 * 
	 */
	@RequestMapping("content/query/list")
	@ResponseBody
	public EasyUIDataGrid showContent(long categoryId,int page,int rows){
		return tbContentServiceImpl.showContent(categoryId, page, rows);
	}
	/**
	 * 新增内容
	 * @param content
	 * @return
	 * add by lijinsheng
	 * time 2019-11-29
	 */
	@RequestMapping("content/save")
	@ResponseBody
	public EgoResult save(TbContent content){
		EgoResult er = new EgoResult();
		int index = tbContentServiceImpl.save(content);
		if(index>0){
			er.setStatus(200);
		}
		return er;
	}
	
	/**
	 * 内容删除
	 * @param ids
	 * @return
	 * add by lijinsheng
	 * time 2019-11-29
	 */
	@RequestMapping("content/delete")
	@ResponseBody
	public EgoResult delete(String ids){
		EgoResult er = new EgoResult();
		int index = tbContentServiceImpl.delete(ids);
		if(index==1){
			er.setStatus(200);
		}
		return er;
	}
}
