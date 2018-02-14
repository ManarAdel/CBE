package com.egabi.cbe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.egabi.cbe.model.CbrDataDict;
import com.egabi.cbe.model.CbrDataDictPK;


@Repository
public interface CbrDataDictRepo  extends JpaRepository<CbrDataDict, CbrDataDictPK>
{

}
