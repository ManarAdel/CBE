package com.egabi.cbe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.egabi.cbe.model.CbrDataSource;
import com.egabi.cbe.service.CbrDataSourceService;

@RestController
@RequestMapping("CbrDataSource")
public class CbrDataSourceController {

	@Autowired
	CbrDataSourceService service;
	
	@RequestMapping(value = "/insert" , method = RequestMethod.POST)
	public String saveCbrDataSource(@RequestBody CbrDataSource c)
	{
		return service.insertCbrDataSource(c);
		
	}
	@RequestMapping("/All")
	public List<?> getAllCbrDataSource()
	{
		return service.getAllCbrDatasource();
		
	}
}
