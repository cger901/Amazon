package com.amazon.dao;

import java.util.List;

import com.amazon.entity.Category;

public interface ICategoryDao {
	
	/* Query Area */
	/**
	 * 查询所有商品类别
	 * @return 返回查询结果：查询成功时返回结果集/查询失败时返回null
	 */
	public List<Category> queryAllCategory();
	/**
	 * 根据提供的商品分类编号查询分类
	 * @param categoryId 请求查询的商品分类编号
	 * @return 返回查询结果：查询成功时返回类别实体/查询失败时返回null
	 */
	public Category queryCategoryById(long categoryId);
}
