package com.amazon.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.amazon.entity.Product;
import com.amazon.service.IProductService;
import com.amazon.service.impl.ProductServiceImpl;

public class SearchProductServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 提取请求的参数
		String category = req.getParameter("cate");
		String productName = req.getParameter("p");
		// 查询结果，默认为null
		List<Product> result = null;
		IProductService ips = new ProductServiceImpl();
		// 检查参数，不符合时做全部查询处理
		if (category==null) result = ips.searchProduct(productName);
		else result = ips.searchProduct(productName, category);
		req.setAttribute("productList", result);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
