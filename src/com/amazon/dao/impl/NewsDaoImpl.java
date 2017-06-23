package com.amazon.dao.impl;

import java.util.List;

import com.amazon.dao.INewsDao;
import com.amazon.entity.News;

public class NewsDaoImpl implements INewsDao {

	@Override
	public List<News> queryNews(int count) {
		// 查询结果，默认null
		List<News> result = null;
		// 返回结果
		return result;
	}

}
