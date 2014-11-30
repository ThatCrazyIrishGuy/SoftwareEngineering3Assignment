package com.example.business;

import java.io.Serializable;

public class User implements Serializable{


	private static final long serialVersionUID = 1L;
	private String username;
	private String password;
	private String name;
	private String userType;
	
	public User(String username, String password, String name, String userType) {
		super();
		this.username = username;
		this.password = password;
		this.name = name;
		this.userType = userType;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	
}
