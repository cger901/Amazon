package com.amazon.service;

import java.util.List;

import com.amazon.entity.Product;

public interface IProductService {
	
	/* Show Area */
	/**
	 * 按分类编号查询该类别商品
	 * @param categoryId 商品类别编号
	 * @return 返回查询结果：查询成功返回商品集合/查询失败返回null
	 */
	public List<Product> getListByCategoryId(String categoryId);
	/**
	 * 根据商品编号查询商品
	 * @param pid 提交的商品编号
	 * @return 返回查询结果：查询成功返回商品/查询失败返回null
	 */
	public Product getProduct(String pid);
	/**
	 * 根据商品名搜索商品
	 * @param productName 提交的商品名
	 * @return 返回搜索结果：搜索成功返回商品/失败返回null
	 */
	public List<Product> searchProduct(String productName);
	/**
	 * 根据商品名和类别搜索商品
	 * @param productName 提交的商品名
	 * @param category 提交的商品类别
	 * @return 返回搜索结果：搜索成功返回商品/失败返回null
	 */
	public List<Product> searchProduct(String productName, String category);
}
