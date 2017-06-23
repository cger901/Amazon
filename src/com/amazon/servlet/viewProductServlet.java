package com.amazon.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.amazon.entity.Product;
import com.amazon.service.IProductService;
import com.amazon.service.impl.ProductServiceImpl;

public class viewProductServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 提取用户请求的商品编号
		String pId = req.getParameter("p");
		// 查询结果，默认null
		Product result = null;
		if (pId != null) {
			IProductService ips = new ProductServiceImpl();
			result = ips.getProduct(pId);
			req.setAttribute("product", result);
		}
		// 查询失败时，重定向到查询所有类别
		if (result == null) resp.sendRedirect("doShow");
		// 查询成功时，转发到显示商品
		else req.getRequestDispatcher("view.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
