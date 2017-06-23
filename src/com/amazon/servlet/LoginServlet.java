package com.amazon.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.amazon.entity.User;
import com.amazon.service.IUserService;
import com.amazon.service.impl.UserServiceImpl;

public class LoginServlet extends HttpServlet {
	
	/**
	 * 自动生成的序列化ID
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 提取用户提交的登录名和密码
		String userName = req.getParameter("username");
		String passWord = req.getParameter("password");
		// 执行业务处理
		IUserService ius = new UserServiceImpl();
		User result = ius.checkLogin(userName, passWord);
		// 返回处理结果
		if (result != null) {
			req.getSession().setAttribute("user", result);
		}
		// 转发到指定页面
		resp.sendRedirect("");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
	
}
