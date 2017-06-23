package com.amazon.service;

import java.util.List;

import com.amazon.entity.News;

public interface INewsService {
	
	/* Get News */
	/**
	 * 获取若干条新闻
	 * @param count 获取的新闻数量
	 * @return 返回获取的结果：获取成功时返回新闻集合/获取失败时返回null
	 */
	public List<News> getSomeNews(int count);
	/**
	 * 获取全部新闻
	 * @return 返回获取的结果：获取成功时返回新闻集合/获取失败时返回null
	 */
	public List<News> getMoreNews();
	
}
