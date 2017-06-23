package com.amazon.service.impl;

import com.amazon.dao.IUserDao;
import com.amazon.dao.impl.UserDaoImpl;
import com.amazon.entity.User;
import com.amazon.service.IUserService;

public class UserServiceImpl implements IUserService {

	IUserDao iud;
	
	@Override
	public User checkLogin(String userName, String passWord) {
		// 验证结果，默认为null
		User result = null;
		// 检查提交的用户名和密码数据存在且不为空
		if (userName!=null && passWord!=null && !userName.isEmpty() && !passWord.isEmpty()){
			// 校验约束条件格式正确
			if (userName.matches("^[a-zA-z][a-zA-z0-9]{3,15}$") && passWord.matches("^[a-zA-Z0-9]{4,10}$")) {
				// 创建接口引用
				iud = new UserDaoImpl();
				// 验证用户
				result = iud.queryUser(userName, passWord);
			}
		}
		// 返回结果
		return result;
	}

	@Override
	public int checkUserName(String userName) {
		// 检查结果，默认为0
		int result = 0;
		// 检查提交的用户名数据存在且不为空
		if (userName!=null && !userName.isEmpty()){
			// 校验约束条件格式正确
			if (userName.matches("^[a-zA-z][a-zA-z0-9]{3,15}$")) {
				// 创建接口引用
				iud = new UserDaoImpl();
				// 检查数据冲突
				if (iud.queryUser(userName)!=null) result = 1;
			}
		}
		// 返回结果
		return result;
	}

	@Override
	public int checkEmail(String email) {
		// 检查结果，默认为0
		int result = 0;
		// 检查提交的用户名数据存在且不为空
		if (email!=null && !email.isEmpty()){
			// 校验约束条件格式正确
			if (email.matches("^\\w+@\\w+(\\.[a-zA-Z]{2,3}){1,2}$")) {
				// 创建接口引用
				iud = new UserDaoImpl();
				// 检查数据冲突
				if (iud.queryUserByEmail(email)!=null) result = 1;
			}
		}
		// 返回结果
		return result;
	}

	@Override
	public int register(User user) {
		// 操作结果，默认为0
		int result = 0;
		// 检查提交的用户实体存在且数据完整
		if (user!= null && user.getUserName()!=null && user.getPassWord()!=null &&
				user.getBirthday()!=null && user.getEmail()!=null && user.getIdentity_Code()!=null &&
				user.getMobile()!=null && user.getAddress()!=null) {
			// 校验约束条件格式正确
			if (user.getUserName().matches("^[a-zA-z][a-zA-z0-9]{3,15}$") &&
					user.getPassWord().matches("^[a-zA-Z0-9]{4,10}$") &&
					user.getIdentity_Code().matches("(^\\d{15}$)|(^\\d{17}([0-9]|X)$)") &&
					user.getBirthday().matches("^((19\\d{2})|(200\\d))-(0?[1-9]|1[0-2])-(0?[1-9]|[1-2]\\d|3[0-1])$") &&
					user.getEmail().matches("^\\w+@\\w+(\\.[a-zA-Z]{2,3}){1,2}$") &&
					user.getMobile().matches("^1\\d{10}$")){
				// 创建接口引用
				iud = new UserDaoImpl();
				// 检查数据冲突
				if (iud.queryUser(user.getUserName())==null && iud.queryUserByEmail(user.getEmail())==null) {
					// 向数据库中插入数据
					result = iud.insertUser(user);
				}
			}
		}
		// 返回结果
		return result;
	}

}
