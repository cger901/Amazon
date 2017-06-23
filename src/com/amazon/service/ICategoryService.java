package com.amazon.service;

import java.util.List;

import com.amazon.entity.Category;

public interface ICategoryService {
	/* Query List */
	/**
	 * 从数据库获取商品分类表
	 * @return 返回查询结果：查询成功时返回表/查询失败时返回null
	 */
	public List<List<Object>> getCategoryInfo();
}
