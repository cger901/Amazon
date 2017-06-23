package com.amazon.dao;

import java.util.List;

import com.amazon.entity.Product;

public interface IProductDao {
	
	/* Query Area */
	/**
	 * 根据类别编号查询商品
	 * @param categoryId 提供的商品类别
	 * @return 返回查询结果：成功返回商品集合/失败返回null
	 */
	public List<Product> queryProductByCategoryId(long categoryId);
	/**
	 * 根据商品编号查询商品
	 * @param productId 提供的商品编号
	 * @return 返回查询结果：成功返回商品集合/失败返回null
	 */
	public Product queryProductById(long productId);
	/**
	 * 根据商品名称搜索商品
	 * @param productName 提供的商品名称
	 * @return 返回搜索结果：成功返回商品集合/失败返回null
	 */
	public List<Product> queryProductByName(String productName);
}
