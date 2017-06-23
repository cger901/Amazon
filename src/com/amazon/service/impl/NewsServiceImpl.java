package com.amazon.service.impl;

import java.util.List;

import com.amazon.dao.INewsDao;
import com.amazon.dao.impl.NewsDaoImpl;
import com.amazon.entity.News;
import com.amazon.service.INewsService;

public class NewsServiceImpl implements INewsService {

	INewsDao ind;
	
	@Override
	public List<News> getSomeNews(int count) {
		// 查询结果，默认null
		List<News> result = null;
		// 创建接口引用
		ind = new NewsDaoImpl();
		// 获取新闻
		result = ind.queryNews(count);
		// 返回查询结果
		return result;
	}

	@Override
	public List<News> getMoreNews() {
		// 查询结果，默认null
		List<News> result = null;
		// 创建接口引用
		ind = new NewsDaoImpl();
		// 获取新闻
		result = ind.queryNews(0);
		// 返回查询结果
		return result;
	}

}
