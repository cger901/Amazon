package com.amazon.dao.impl;

import java.util.List;

import com.amazon.dao.ICategoryDao;
import com.amazon.entity.Category;

public class CategoryDaoImpl implements ICategoryDao {

	@Override
	public List<Category> queryAllCategory() {
		// 查询结果，默认为null
		List<Category> result = null;
		// 返回查询结果
		return result;
	}

	@Override
	public Category queryCategoryById(long categoryId) {
		// 查询结果，默认为null
		Category result = null;
		// 返回查询结果
		return result;
	}

}
