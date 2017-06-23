package com.amazon.dao;

import com.amazon.entity.User;

public interface IUserDao {
	
	/* Query Area */
	/**
	 * 根据提供的用户名查询用户
	 * @param userName 提供查询的用户名
	 * @return 返回查询结果：查询成功返回用户实体/查询失败返回null
	 */
	public User queryUser(String userName);
	/**
	 * 根据提供的用户名和密码查询用户
	 * @param userName 提供查询的用户名
	 * @param passWord 提供查询的密码
	 * @return 返回查询结果：查询成功返回用户实体/查询失败返回null
	 */
	public User queryUser(String userName, String passWord);
	/**
	 * 根据提供的邮箱地址查询用户
	 * @param email 提供查询的邮箱
	 * @return 返回查询结果：查询成功返回用户实体/查询失败返回null
	 */
	public User queryUserByEmail(String email);
	
	/* Update Area */
	/**
	 * 向数据库表中插入一条新数据
	 * @param register 提交的注册用户实体
	 * @return 返回操作结果：插入成功返回1/插入失败返回0
	 */
	public int insertUser(User register);
	
}
