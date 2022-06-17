package com.te.mvclms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(path = "/c2")
public class MvclmsController2 {
	@RequestMapping(path = "/welcome",method=RequestMethod.GET)
	public String welcome() {
		return "welcome";
	}
	@RequestMapping(path = "/aboutUs",method=RequestMethod.GET)
	public String aboutUs() {
		return "aboutUs";
	}
	
}
