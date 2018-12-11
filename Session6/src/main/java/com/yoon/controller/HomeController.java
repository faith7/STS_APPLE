package com.yoon.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home() {
		
		return "home.jsp";
	}
	
	@RequestMapping("add")
	public String add(HttpServletRequest req, HttpServletResponse res) {
		
		int num1 = Integer.parseInt(req.getParameter("t1"));
		int num2 = Integer.parseInt(req.getParameter("t2"));
		int result = num1+num2; 
		
		HttpSession session = req.getSession(); 
		session.setAttribute("result", result);
		
		return "result.jsp";

	}
}
