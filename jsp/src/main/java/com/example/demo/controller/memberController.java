package com.example.demo.controller;

import java.io.IOException;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dao.memberMapper;
import com.example.demo.vo.member;

import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("member")
public class memberController {
	@Autowired
	private memberMapper mm;
	@Autowired
	private HttpSession session;
	@Autowired
	HttpServletResponse response;
	
	@RequestMapping("/")
	public void index(HttpServletResponse response) throws IOException {
	    response.sendRedirect("../index.html");
	}
	@RequestMapping("gotoLogin")
	public void gotoLogin(HttpServletResponse response) throws IOException {
	    response.sendRedirect("../login.html");
	}
	@RequestMapping("login")
	public String login(String username,String password)
	{
		member m=mm.query(username, password);
		if(m!=null)
		{
			session.setAttribute("M", m);
			
			return "loginSuccess";
		}
		else
		{
			return "loginError";
		}
	}
	
	@RequestMapping("addMember")
	public String addMember()
	{
		return "/member/addMember";
	}
	
	@RequestMapping("add")
	public String add(String name,String username,String password,String email,Integer type)
	{
		member m=mm.queryUser(username);
		if(m!=null)
		{
			return "/member/addMemberError";
		}
		else
		{
			String memberno1=UUID.randomUUID().toString();
			member m1=new member(memberno1,name,username,password,email,type);
			mm.add(m1);
			return "/member/addMemberSuccess";
		}
	}
	
	@RequestMapping("function")
	public String function()
	{
		return "function";
	}
}
