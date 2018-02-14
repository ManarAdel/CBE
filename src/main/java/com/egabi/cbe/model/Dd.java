package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the DD database table.
 * 
 */
@Entity
@NamedQuery(name="Dd.findAll", query="SELECT d FROM Dd d")
public class Dd implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
	//This Table Doesn't have A PK 
	//Generated Id 
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;


	private BigDecimal ac;

	private String idc;

	public Dd() {
	}

	public BigDecimal getAc() {
		return this.ac;
	}

	public void setAc(BigDecimal ac) {
		this.ac = ac;
	}

	public String getIdc() {
		return this.idc;
	}

	public void setIdc(String idc) {
		this.idc = idc;
	}

}