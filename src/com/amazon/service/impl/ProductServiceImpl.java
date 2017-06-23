package com.amazon.service.impl;

import java.util.List;

import com.amazon.dao.ICategoryDao;
import com.amazon.dao.IProductDao;
import com.amazon.dao.impl.CategoryDaoImpl;
import com.amazon.dao.impl.ProductDaoImpl;
import com.amazon.entity.Product;
import com.amazon.service.IProductService;

public class ProductServiceImpl implements IProductService {

	IProductDao ipd;
	ICategoryDao icd;

	@Override
	public List<Product> getListByCategoryId(String categoryId) {
		// 商品类别，默认0
		long category = 0;
		// 转换ID类型
		try {
			category = Long.parseLong(categoryId);
			// 创建接口引用
			icd = new CategoryDaoImpl();
			// 验证商品分类是否存在
			if (icd.queryCategoryById(category)==null) category = 0; 
		} catch (Exception e) {
			category = 0;
		}
		// 创建接口引用
		ipd = new ProductDaoImpl();
		// 查询商品列表
		List<Product> result = ipd.queryProductByCategoryId(category);
		// 返回查询结果
		return result;
	}

	@Override
	public Product getProduct(String pid) {
		// 查询结果，默认null
		Product result = null;
		// 转换ID类型
		try {
			long productId = Long.parseLong(pid);
			// 创建接口引用
			ipd = new ProductDaoImpl();
			// 查询商品
			result = ipd.queryProductById(productId);
		} catch (Exception e) {
			result = null;
		}
		// 返回结果
		return result;
	}

	@Override
	public List<Product> searchProduct(String productName) {
		// 搜索结果，默认null
		List<Product> result = null;
		// 创建接口引用
		ipd = new ProductDaoImpl();
		// 搜索商品
		result = ipd.queryProductByName(productName);
		// 返回结果
		return result;
	}

}
