package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the CBR_CREDIT_RISK_GUARANTEE_CLAS database table.
 * 
 */
@Entity
@Table(name="CBR_CREDIT_RISK_GUARANTEE_CLAS")
@NamedQuery(name="CbrCreditRiskGuaranteeCla.findAll", query="SELECT c FROM CbrCreditRiskGuaranteeCla c")
public class CbrCreditRiskGuaranteeCla implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
	//This Table Doesn't have A PK 
	//Generated Id 
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
	

	private String class1;

	private String class2;

	private String class3;

	private String class4;

	private String class5;

	@Column(name="COL_NUMBER")
	private BigDecimal colNumber;

	public CbrCreditRiskGuaranteeCla() {
	}

	public String getClass1() {
		return this.class1;
	}

	public void setClass1(String class1) {
		this.class1 = class1;
	}

	public String getClass2() {
		return this.class2;
	}

	public void setClass2(String class2) {
		this.class2 = class2;
	}

	public String getClass3() {
		return this.class3;
	}

	public void setClass3(String class3) {
		this.class3 = class3;
	}

	public String getClass4() {
		return this.class4;
	}

	public void setClass4(String class4) {
		this.class4 = class4;
	}

	public String getClass5() {
		return this.class5;
	}

	public void setClass5(String class5) {
		this.class5 = class5;
	}

	public BigDecimal getColNumber() {
		return this.colNumber;
	}

	public void setColNumber(BigDecimal colNumber) {
		this.colNumber = colNumber;
	}

}