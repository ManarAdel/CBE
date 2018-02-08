package com.egabi.cbe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.egabi.cbe.model.CbrDataSource;

@Repository
public interface CbrDataSourceRepo extends JpaRepository<CbrDataSource, Long> {

	
}
