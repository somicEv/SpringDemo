package com.springDemo.entity;

/**
 * 基础用户类
 * Created by 浩瀚 on 2017/7/18.
 */
public class User {

	private Integer uid;
	private String username;
	private String password;
	private String realname;
	private String email;
	private String phone;
	private String address;
	private String sex;

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "User{" +
				"uid=" + uid +
				", username='" + username + '\'' +
				", password='" + password + '\'' +
				", realname='" + realname + '\'' +
				", email='" + email + '\'' +
				", phone='" + phone + '\'' +
				", address='" + address + '\'' +
				", sex='" + sex + '\'' +
				'}';
	}
}
