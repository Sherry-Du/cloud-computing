package com.bjtu.cloud.user.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="zew_user")
public class User implements Serializable{
	private static final long serialVersionUID = 1162363897733736823L;
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column(name = "loginname", nullable = true, length = 255)
	private String loginName; // 登录名
	@Column(name = "password", nullable = true, length = 255)
	private String password; // 密码
	@Column(name = "name", nullable = true, length = 255)
	private String name; // 真实姓名
	@Column(name = "gender", nullable = true, length = 255)
	private String gender; // 性别
	@Column(name = "phonenumber", nullable = true, length = 255)
	private String phoneNumber; // 电话号码
	@Column(name = "email", nullable = true, length = 255)
	private String email; // 电子邮件
	@Column(name = "description", nullable = true, length = 255)
	private String description; // 说明
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
