package com.example.demo.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dao.productMapper;
import com.example.demo.vo.product;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("product")
public class productController {
	@Autowired
	productMapper pm;
	@Autowired
	HttpSession session;
	
	@RequestMapping("product")
	public String product(HttpServletRequest request)
	{
		List<product> p=pm.queryAll();
		session.setAttribute("products", p);
		for(product product:p) {
			
		}
		return "/product/product";
	}
	
	@RequestMapping("product2")
	public String product2(HttpServletRequest request)
	{
		List<product> p=pm.queryAll();
		session.setAttribute("products", p);
		for(product product:p) {
			
		}
		return "/employee/manager/product/allProduct";
	}
	
	@RequestMapping("product3")
	public String product3(HttpServletRequest request)
	{
		List<product> p=pm.queryAll();
		session.setAttribute("products", p);
		for(product product:p) {
			
		}
		return "/employee/employee/product/product";
	}
	
	@RequestMapping("addProduct")
	public String addProduct()
	{
		return "/product/addProduct";
	}
	
	@RequestMapping("add")
	public String addProduct(String productno,String productname,Integer price)
	{
		product p=new product(productno,productname,price);
		session.setAttribute("product", p);
		pm.add(p);
		
		return "/product/addProductSuccess";
	}
}
