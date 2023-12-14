package com.example.demo.vo;

import lombok.Data;

@Data
public class employee {
	private Integer id;
	private String employeeno;
	private String name;
	private String username;
	private String password;
	private String phone;
	private Integer type;
	public employee(String employeeno, String name, String username, String password, String phone, Integer type) {
		super();
		this.employeeno = employeeno;
		this.name = name;
		this.username = username;
		this.password = password;
		this.phone = phone;
		this.type = type;
	}
	public employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getType() {
		// TODO Auto-generated method stub
		return type;
	}
	
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	
	public String getUsername() {
		// TODO Auto-generated method stub
		return username;
	}
	
	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}
	
	public String getPhone() {
		// TODO Auto-generated method stub
		return phone;
	}
	
	public Integer getId() {
		// TODO Auto-generated method stub
		return id;
	}
	public String getEmployeeno() {
		// TODO Auto-generated method stub
		return employeeno;
	}
	public void setPassword(String newPassword) {
		this.password = newPassword;
		
	}
	public void setType(Integer newType) {
		this.type = newType;
		
	}
}