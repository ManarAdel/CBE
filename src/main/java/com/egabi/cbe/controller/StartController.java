package com.egabi.cbe.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.egabi.cbe.model.CbrDataSource;


@Controller
public class StartController {
	
	
	
	
	@Autowired
	CbrDataSourceController cont;
	
	/*@RequestMapping("/header")
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
	}*/
	
	
	
	
	
	@RequestMapping(value="/home", method=RequestMethod.POST)
	public String homee(@Valid CbrDataSource src , BindingResult bindingresult , Model model , @ModelAttribute ("CbrDataSource") CbrDataSource data ) {
		
		if(bindingresult.hasErrors()) {
			return "home";
		}
		
		
		model.addAttribute("CbrDataSource");
		
		
		
		model.addAttribute("sourceName" , data.getSourceName());
		model.addAttribute("aname" , data.getAname());
		model.addAttribute("ename" , data.getEname());
		model.addAttribute("delimiter" , data.getDelimiter());
		model.addAttribute("dateFormat" , data.getDateFormat());
		model.addAttribute("idenType" , data.getIdenType());
		model.addAttribute("owner" , data.getOwner());
		model.addAttribute("path" , data.getPath());
		model.addAttribute("sheetName" , data.getSheetName());
		model.addAttribute("sourceType" , data.getSourceType());
		model.addAttribute("startingLine" , data.getStartingLine());
		model.addAttribute("tableName" , data.getTableName());
	
		cont.saveCbrDataSource(data);
		
		return "home";
	}
	
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String home(Model model , @ModelAttribute ("CbrDataSource") CbrDataSource data , BindingResult bindingresult) {
		model.addAttribute("CbrDataSource" , data);
		 
		/*
		model.addAttribute("sourceName" , data.getSourceName());
		model.addAttribute("aname" , data.getAname());
		model.addAttribute("ename" , data.getEname());
		model.addAttribute("delimiter" , data.getDelimiter());
		model.addAttribute("dateFormat" , data.getDateFormat());
		model.addAttribute("idenType" , data.getIdenType());
		model.addAttribute("owner" , data.getOwner());
		model.addAttribute("path" , data.getPath());
		model.addAttribute("sheetName" , data.getSheetName());
		model.addAttribute("sourceType" , data.getSourceType());
		model.addAttribute("startingLine" , data.getStartingLine());
		model.addAttribute("tableName" , data.getTableName());
		
		*/
		
		return "home";
	}
	
	 
	
	
	
}
