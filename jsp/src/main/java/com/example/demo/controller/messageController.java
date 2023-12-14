package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dao.messageMapper;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("message")
public class messageController {
	@Autowired
	messageMapper messageMapper;
	@Autowired
	HttpSession session;
}
