package com.amazon.dao.impl;

import java.util.List;

import com.amazon.dao.IProductDao;
import com.amazon.entity.Product;

public class ProductDaoImpl implements IProductDao {

	@Override
	public List<Product> queryProductByCategoryId(long categoryId) {
		// 查询结果，默认null
		List<Product> result = null;
		// 返回结果
		return result;
	}

	@Override
	public Product queryProductById(long productId) {
		// 查询结果，默认null
		Product result = null;
		// 返回结果
		return result;
	}

	@Override
	public List<Product> queryProductByName(String productName) {
		// 查询结果，默认null
		List<Product> result = null;
		// 返回结果
		return result;
	}

}
