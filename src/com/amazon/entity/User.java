package com.amazon.entity;

/**
 * 用户实体类
 * Field: userId/userName/passWord/sex/identity_Code/birthday/email/mobile/address/status
 * @author cc
 */
public class User {
	private long userId;			// Primary Key
	private String userName;		// Unique
	private String passWord;		// Not Null
	private int sex;				// Not Null
	private String identity_Code;	// Unique
	private String birthday;		// Not Null
	private String email;			// Unique
	private String mobile;			// Not Null
	private String address;			// Not Null
	private int status;				// Default 0
	
	public User(){}
	public User(String userName, String passWord, int sex, String identity_Code, String birthday, String email,
			String mobile, String address, int status) {
		this.userName = userName;
		this.passWord = passWord;
		this.sex = sex;
		this.identity_Code = identity_Code;
		this.birthday = birthday;
		this.email = email;
		this.mobile = mobile;
		this.address = address;
		this.status = status;
	}
	public User(long userId, String userName, String passWord, int sex, String identity_Code, String birthday,
			String email, String mobile, String address, int status) {
		this.userId = userId;
		this.userName = userName;
		this.passWord = passWord;
		this.sex = sex;
		this.identity_Code = identity_Code;
		this.birthday = birthday;
		this.email = email;
		this.mobile = mobile;
		this.address = address;
		this.status = status;
	}
	
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public String getIdentity_Code() {
		return identity_Code;
	}
	public void setIdentity_Code(String identity_Code) {
		this.identity_Code = identity_Code;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
}
