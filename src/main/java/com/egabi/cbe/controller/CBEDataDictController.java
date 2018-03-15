package com.egabi.cbe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.validation.BindingResult;

import java.util.List;

import javax.validation.Valid;
import org.springframework.ui.Model;

import com.egabi.cbe.model.CbrDataDict;
import com.egabi.cbe.service.CbrDataDictService;
import com.egabi.cbe.views.CbrDataDictView;

@Controller
//@RequestMapping("CBEDataDict")
public class CBEDataDictController {
	
	@Autowired
	CbrDataDictService service;
	
	@RequestMapping(value="/CBEDataDict", method=RequestMethod.GET)
	public String dict(CbrDataDictView dataDict, BindingResult bindingResult , Model model , @ModelAttribute ("CbrDataDict") CbrDataDict data) {
		System.out.println("In GET Dict");
		if (bindingResult.hasErrors()) {
			return "CBEDataDict";
		}
		
		
	//	List<CbrDataDict> dataView = service.getAll();
	//	model.addAttribute("CbrDataDict" , dataView);
		
		
		
		
		service.insertCbrDataDict(dataDict);
		return "CBEDataDict";
	}
 
	@RequestMapping(value = "/CBEDataDict", method = RequestMethod.POST)
	public String saveDict(CbrDataDictView dataDict, BindingResult bindingResult, Model model ,@ModelAttribute ("CbrDataDict") CbrDataDict data) {
		System.out.println("In POST saveDict");
		if (bindingResult.hasErrors()) {
			return "CBEDataDict";
		}
		
		

	//	List<CbrDataDict> dataView = service.getAll();
	//	model.addAttribute("CbrDataDict" , dataView);
		
		
		
		/*model.addAttribute("CbrDataDict");
		model.addAttribute("aname" , data.getAname());
		model.addAttribute("ename" , data.getEname());*/
		
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
