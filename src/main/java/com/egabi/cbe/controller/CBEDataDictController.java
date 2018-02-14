package com.egabi.cbe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.validation.BindingResult;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;
import org.springframework.ui.Model;

import com.egabi.cbe.model.CbrDataDict;
import com.egabi.cbe.service.CbrDataDictService;
import com.egabi.cbe.service.CbrDataSourceService;
import com.egabi.cbe.views.CbrDataDictView;

@Controller
//@RequestMapping("CBEDataDict")
public class CBEDataDictController {
	
	@Autowired
	CbrDataDictService service;
	
	@RequestMapping(value="/CBEDataDict", method=RequestMethod.GET)
	public String dict(Model model) {
		System.out.println("In GET Dict");
		model.addAttribute("name" , "Manar Adel :)");
		model.addAttribute("dataDict", new CbrDataDictView());
		
		List<String> operators = new ArrayList<>();
		operators.add("Sunday");
		operators.add("Monday");
		
		model.addAttribute("operators", operators);
		
		
		return "CBEDataDict";
	}
 
	@RequestMapping(value = "/CBEDataDict", method = RequestMethod.POST)
	public String saveDict(@Valid CbrDataDictView dataDict, BindingResult bindingResult, Model model) {
		System.out.println("In POST saveDict");
		if (bindingResult.hasErrors()) {
			return "CBEDataDict";
		}
		//model.addAttribute("title", post.getTitle());
		//model.addAttribute("content", post.getContent());
		service.insertCbrDataDict(dataDict);
		return "CBEDataDict";
	}
	
//	@ModelAttribute("multiCheckboxAllValues")
//	public String[] getMultiCheckboxAllValues() {
//		System.out.println("getMultiCheckboxAllValues");
//	    return new String[] {
//	        "Monday", "Tuesday", "Wednesday", "Thursday", 
//	        "Friday", "Saturday", "Sunday"
//	    };
//	}
}
