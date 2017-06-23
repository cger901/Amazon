package com.amazon.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.amazon.entity.User;
import com.amazon.service.IUserService;
import com.amazon.service.impl.UserServiceImpl;

public class RegisterServlet extends HttpServlet {
	
	/**
	 * 自动生成的序列化ID
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 提取用户提交的表单信息
		String userName = req.getParameter("username");
		String passWord = req.getParameter("password");
		String sex = req.getParameter("sex");
		String identity_Code = req.getParameter("identity_code");
		String birthday = req.getParameter("birthday");
		String email = req.getParameter("email");
		String mobile = req.getParameter("mobile");
		String address = req.getParameter("address");
		// 提交结果，默认0
		int result = 0;
		// 创建临时消息对象
		try {
			User register = new User(userName, passWord, Integer.parseInt(sex), identity_Code, birthday, email, mobile, address, 0);
			IUserService ius = new UserServiceImpl();
			System.out.println("请求注册的用户数据：" + register);
			result = ius.register(register);
		} catch (Exception e) {
			result = 0;
		}
		// 返回注册结果，并根据结果处理请求
		if (result == 1) {
			System.out.println("注册成功");
			req.getSession().setAttribute("user", result);
			resp.sendRedirect("");
		}
		else {
			System.out.println("注册失败");
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
	
}
