package com.saral.training.msdp.selfcare.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller("/selfcare")
public class BaseController {

	@RequestMapping("/index")
	public ModelAndView getIndex(){
		System.out.println("recieved");
		String s = "welcome ";
		ModelAndView m = new ModelAndView();
		m.setViewName("index");
		m.addObject("index", s);
		return m;
	}
	@RequestMapping("/hello")
	public ModelAndView getHello(){
		System.out.println("recieved");
		String s = "hello ";
		ModelAndView m = new ModelAndView();
		m.setViewName("hello");
		m.addObject("index", s);
		return m;
	}
	
}
