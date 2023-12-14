package com.example.demo.vo;

public class member {
	private Integer id;
	private String memberno;
	private String name;
	private String username;
	private String password;
	private String email;
	private Integer type;
	public member(String memberno, String name, String username, String password, String email, Integer type) {
		super();
		this.memberno = memberno;
		this.name = name;
		this.username = username;
		this.password = password;
		this.email = email;
		this.type = type;
	}
	public member() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getMemberno() {
		// TODO Auto-generated method stub
		return memberno;
	}
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	
}
