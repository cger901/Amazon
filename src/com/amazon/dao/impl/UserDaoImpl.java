package com.amazon.dao.impl;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.amazon.dao.IUserDao;
import com.amazon.entity.User;
import com.amazon.utils.JDBCUtils;

public class UserDaoImpl implements IUserDao {

	@Override
	public User queryUser(String userName) {
		// 查询结果，默认为null
		User result = null;
		// 创建SQL语句
		String sql = "SELECT * FROM T_USER WHERE USERNAME = ?";
		// 数据库查询
		QueryRunner run = JDBCUtils.getQueryRunner();
		try {
			result = run.query(sql, new BeanHandler<>(User.class), userName);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// 返回查询结果
		return result;
	}

	@Override
	public User queryUser(String userName, String passWord) {
		// 查询结果，默认为null
		User result = null;
		// 创建SQL语句
		String sql = "SELECT * FROM T_USER WHERE USERNAME = ? AND PASSWORD = ?";
		// 数据库查询
		QueryRunner run = JDBCUtils.getQueryRunner();
		try {
			result = run.query(sql, new BeanHandler<>(User.class), userName, passWord);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// 返回查询结果
		return result;
	}

	@Override
	public User queryUserByEmail(String email) {
		// 查询结果，默认为null
		User result = null;
		// 创建SQL语句
		String sql = "SELECT * FROM T_USER WHERE EMAIL = ?";
		// 数据库查询
		QueryRunner run = JDBCUtils.getQueryRunner();
		try {
			result = run.query(sql, new BeanHandler<>(User.class), email);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// 返回查询结果
		return result;
	}

	@Override
	public int insertUser(User register) {
		// 成功插入的行数，默认为0
		int result = 0;
		// 创建SQL语句
		String sql = "INSERT INTO T_USER VALUES(T_USER_SEQ.NEXTVAL, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		// 数据库插入
		QueryRunner run = JDBCUtils.getQueryRunner();
		try {
			result = run.update(sql, register.getUserName(), register.getPassWord(), register.getSex(), register.getIdentity_Code(), register.getBirthday(), register.getEmail(), register.getMobile(), register.getAddress(), register.getStatus());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// 返回查询结果
		return result;
	}

}
