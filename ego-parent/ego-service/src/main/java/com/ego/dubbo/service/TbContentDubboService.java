package com.ego.dubbo.service;

import java.util.List;

import com.ego.commons.pojo.EasyUIDataGrid;
import com.ego.pojo.TbContent;

public interface TbContentDubboService {
	/**
	 * 分页查询
	 * @param categoryId
	 * @param page
	 * @param rows
	 * @return
	 * add by lijinsheng
	 */
	EasyUIDataGrid selContentByPage(long categoryId,int page,int rows);
	/**
	 * 新增
	 * @param content
	 * @return
	 * add by lijinsheng
	 */
	int insContent(TbContent content);
	
	/**
	 * 查询出最近的前n个
	 * @param count
	 * @return
	 * add by lijinsheng
	 */
	List<TbContent> selByCount(int count,boolean isSort);
	
	/**
	 * 删除内容
	 * @param content
	 * @return
	 * add by lijinsheng
	 */
	int delContent(long id);
}
