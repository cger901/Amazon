package com.amazon.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.amazon.entity.Product;
import com.amazon.service.IProductService;
import com.amazon.service.impl.ProductServiceImpl;

public class ShowServlet extends HttpServlet {

	/**
	 * 自动生成的序列化ID
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 从请求中提取分类及浏览页数
		String category = req.getParameter("cate");
		String page = req.getParameter("page");
		// 获取商品列表
		IProductService ips = new ProductServiceImpl();
		List<Product> productList = ips.getListByCategoryId(category);
		// 分页显示
		int pager = 1;
		int item = 10;
		try {
			pager = Integer.parseInt(page);
			if (pager > (productList.size()/item)) pager = 1;
		} catch (Exception e) {
			pager = 1;
		}
		// 截取商品列表
		List<Product> list = new ArrayList<>();
		int start = productList.size()/item - 1;
		for (int i = start; i <= start + item; i ++) {
			list.add(productList.get(i));
		}
		// 将列表保存到请求域中
		req.setAttribute("viewProduct", list);
		// 重定向到结果页
		req.getRequestDispatcher("search.jsp?cate=" + category + "&page=" + page);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
