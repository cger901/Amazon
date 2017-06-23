package com.amazon.service;

import com.amazon.entity.User;

public interface IUserService {
	
	/* Login Area */
	/**
	 * 登录验证业务
	 * @param userName 请求验证的用户名
	 * @param passWord 请求验证的密码
	 * @return 返回验证结果：验证成功返回用户实体/验证失败返回null
	 */
	public User checkLogin(String userName, String passWord);
	
	/* Register Area */
	/**
	 * 注册名检查业务
	 * @param userName 请求注册的用户名
	 * @return 返回检查结果：用户名冲突时返回1/用户名可用时返回0
	 */
	public int checkUserName(String userName);
	/**
	 * 注册邮箱检查业务
	 * @param email 请求注册的邮箱地址
	 * @return 返回检查结果：邮箱地址冲突时返回1/邮箱可用时返回0
	 */
	public int checkEmail(String email);
	/**
	 * 新用户注册业务
	 * @param user 请求提交的用户实体
	 * @return 返回注册结果：注册成功时返回1/注册失败时返回0
	 */
	public int register(User user);
	
}
