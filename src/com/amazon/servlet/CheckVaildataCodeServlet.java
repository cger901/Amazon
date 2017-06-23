package com.amazon.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CheckVaildataCodeServlet extends HttpServlet {

	/**
	 * 自动生成的序列化ID
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 提取用户提交的验证码
		String verycode = req.getParameter("verycode");
		// 提取会话保存的验证码
		String validataCode = (String) req.getSession().getAttribute("validataCode");
		// 校验并返回结果：验证通过返回1/验证失败返回0
		resp.getWriter().write(verycode.equals(validataCode)?1:0);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
