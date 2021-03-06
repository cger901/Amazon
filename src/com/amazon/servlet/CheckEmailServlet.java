package com.amazon.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.amazon.service.IUserService;
import com.amazon.service.impl.UserServiceImpl;

public class CheckEmailServlet extends HttpServlet {
	
	/**
	 * 自动生成的序列化ID
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 提取用户提交的注册邮箱
		String email = req.getParameter("email");
		// 执行业务处理
		IUserService ius = new UserServiceImpl();
		int result = ius.checkEmail(email);
		// 返回处理结果
		resp.getWriter().write(result);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
	
}
