package com.amazon.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.amazon.dao.ICategoryDao;
import com.amazon.dao.impl.CategoryDaoImpl;
import com.amazon.entity.Category;
import com.amazon.service.ICategoryService;

public class CategoryServiceImpl implements ICategoryService {
	
	ICategoryDao icd;

	@Override
	public List<List<Object>> getCategoryInfo() {
		// 查询结果，默认为null
		List<List<Object>> result = null;
		// 创建接口引用
		icd = new CategoryDaoImpl();
		// 查询列表
		List<Category> list = icd.queryAllCategory();
		int i = 0;
		List<Object> temp = null,temp2 = null;
		for (Category category : list) {
			if (category.getCategoryParentId()>i) {
				if (temp != null) {
					temp.addAll(temp2);
					result.add(temp); 
				}
				temp = new ArrayList<>();
				temp2 = new ArrayList<>();
			}
			
		}
		// 返回查询结果
		return result;
	}

}
