package com.amazon.dao;

import java.util.List;

import com.amazon.entity.News;

public interface INewsDao {

	/* Query Area */
	/**
	 * 查询一定数量的新闻
	 * @param count 查询的数量，参数为0时返回所有
	 * @return 返回查询结果：查询成功时返回新闻集合/查询失败时返回null
	 */
	public List<News> queryNews(int count);
	
}
