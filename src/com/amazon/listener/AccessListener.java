package com.amazon.listener;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import com.amazon.entity.Category;
import com.amazon.service.ICategoryService;
import com.amazon.service.impl.CategoryServiceImpl;

public class AccessListener implements HttpSessionListener {

	@Override
	public void sessionCreated(HttpSessionEvent arg0) {
		System.out.println("一个新会话已建立");
		// 会话建立时，检查ServletContext域中是否存在商品分类目录
		ServletContext context = arg0.getSession().getServletContext();
		Object obj = context.getAttribute("categoryList");
		// 若该目录存在，什么也不做
		if (obj != null) {
			List<Category> list = (List<Category>) obj;
			if (!list.isEmpty()) {
				System.out.println("商品分类目录已存在");
				return;
			}
		}
		// 若该目录不存在，或该目录数量为空，则从数据库调用数据建立它
		ICategoryService ics = new CategoryServiceImpl();
		context.setAttribute("categoryList", ics.getCategoryInfo());
		System.out.println("已更新了商品分类目录");
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) {
		// 会话销毁
	}

}
