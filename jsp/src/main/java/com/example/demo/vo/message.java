package com.example.demo.vo;

import lombok.Data;

@Data
public class message {
	private String title;
	private String content;
	private String author;
	public message(String title, String content, String author) {
		super();
		this.title = title;
		this.content = content;
		this.author = author;
	}
	public message() {
		super();
		// TODO Auto-generated constructor stub
	}
}
