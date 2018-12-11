package com.yoon.Lecture3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("home")
	public String home() {
		System.out.println("in HOME!");
		return "home.jsp";
	}
	
	@RequestMapping("product")
	public String product() {
		System.out.println("in HOME!");
		return "product.jsp";
	}
}
