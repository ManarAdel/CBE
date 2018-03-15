package com.egabi.cbe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.egabi.cbe.model.CbrDataDict;
import com.egabi.cbe.model.CbrDataDictPK;
import com.egabi.cbe.repositories.CbrDataDictRepo;
import com.egabi.cbe.views.CbrDataDictView;


@Service
public class CbrDataDictService {

	@Autowired
	CbrDataDictRepo repo;
	
	public String insertCbrDataDict(CbrDataDictView view) {
		CbrDataDict c = new CbrDataDict();
		CbrDataDictPK cPK = new CbrDataDictPK(view.getSourceName(),view.getColumnName());
		c.setEname(view.getEname());
		c.setAname(view.getAname());
		repo.saveAndFlush(c);
		return "Added";
	}
	
	public List<CbrDataDict> getAll(){
		return repo.findAll();
	}

}
