package com.yoon.model;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@Autowired
	AlienRepo repo;
	
	@ModelAttribute("alien0")
	public Alien getAlien()
	{
		Alien alien = new Alien();
		alien.setId(101);
		alien.setName("A");
		alien.setAge(20);
		alien.setCountry("KO");
		return alien;
	}
	
/*	@RequestMapping("/")
	public String home(){
		return "addAliens";
	}*/
	
	@PostMapping("/addAliens")
	public ModelAndView addAlien(@ModelAttribute("alien") Alien alien,ModelAndView mv) {
		
		repo.save(alien);
		//Find All Aliens
		List<Alien> aliens = (List<Alien>)repo.findAll();
		mv.addObject("aliens", aliens);
		mv.setViewName("addAliens");
		return mv;
	}
}

