package com.te.mvclms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(path="/c1")
public class MvclmsController1 {
	@RequestMapping(path = "/contact")
public String contact(Model model) {
		String name="Krishna Rawat";
		String email="krishna.22@ty.com";
		int age=21;
		model.addAttribute("name", name);
		model.addAttribute("email", email);
		model.addAttribute("age", age);
		
	return "contact";
	}
	
	@RequestMapping(path = "/contact1")
public String contact(ModelMap modelMap) {
		String name="Krishna chaudhary";
		String email="krishna.82@ty.com";
		int age=65;
		modelMap.addAttribute("name", name);
		modelMap.addAttribute("email", email);
		modelMap.addAttribute("age", age);
		
	return "contact";
}
	@RequestMapping(path = "/contact2")
	public ModelAndView contact() {
			String name="chaudhary";
			String email="krishna.92@ty.com";
			int age=105;
		ModelAndView modelandview=new	ModelAndView();
		modelandview.addObject("name", name);
		modelandview.addObject("email", email);
		modelandview.addObject("age", age);
		modelandview.setViewName("contact");
		return modelandview;
	}
}