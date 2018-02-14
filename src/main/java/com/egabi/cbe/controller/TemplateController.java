package com.egabi.cbe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TemplateController {
	
	@RequestMapping("/header")
	public String header(Model model) {
		//model.addAttribute("name" , "Manar");
		return "header";
	}
	
	@RequestMapping("/sidebar")
	public String sidebar(Model model) {
		//model.addAttribute("name" , "Manar");
		return "sidebar";
	}
	
	@RequestMapping("/footer")
	public String footer(Model model) {
		//model.addAttribute("name" , "Manar");
		return "footer";
	}
}
