package com.yoon.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller					//multi action controller
public class HomeController {
	
	@RequestMapping("/")
	public String home() {
		
		return "home.jsp";
	}
	
/*	@RequestMapping("add")
	public String add(@RequestParam("t1") int num1, @RequestParam("t2") int num2, HttpSession session) {
		
		int result = num1 + num2; 
		
		session.setAttribute("result", result);
		
		return "redirect: result.jsp"; 
		// by default, spring uses request dispatcher but for redirect simply put redirect:
		// In the redirect, request object will be newly created
		  (vs. continues from request dispatcher)
		   so you will lose your data. 
	}
*/
	
	@RequestMapping("add")
	public ModelAndView add(@RequestParam("t1") int num1, @RequestParam("t2") int num2) {
		
		int result = num1 + num2; 
		ModelAndView mv = new ModelAndView();
		mv.addObject("result", result);
		mv.setViewName("result.jsp");
	
		return mv; 
	}

}
