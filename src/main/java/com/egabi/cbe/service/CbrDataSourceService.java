package com.egabi.cbe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.egabi.cbe.model.CbrDataSource;
import com.egabi.cbe.repositories.CbrDataSourceRepo;

@Service
public class CbrDataSourceService {

	@Autowired
	CbrDataSourceRepo repo;
	
	public String insertCbrDataSource(CbrDataSource c) {
		repo.saveAndFlush(c);
		return "Added";
	}
	public List<CbrDataSource> getAllCbrDatasource() {
		return repo.findAll();
	}
}
