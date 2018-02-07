package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the CBR_CREDIT_PARAM_PRODUCTS_CODE database table.
 * 
 */
@Entity
@Table(name="CBR_CREDIT_PARAM_PRODUCTS_CODE")
@NamedQuery(name="CbrCreditParamProductsCode.findAll", query="SELECT c FROM CbrCreditParamProductsCode c")
public class CbrCreditParamProductsCode implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CBR_TYPE")
	private String cbrType;

	private String class1;

	private String class2;

	private String class3;

	private String class4;

	private String class5;

	@Column(name="POT_ACT_FLAG")
	private BigDecimal potActFlag;

	public CbrCreditParamProductsCode() {
	}

	public String getCbrType() {
		return this.cbrType;
	}

	public void setCbrType(String cbrType) {
		this.cbrType = cbrType;
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

	public BigDecimal getPotActFlag() {
		return this.potActFlag;
	}

	public void setPotActFlag(BigDecimal potActFlag) {
		this.potActFlag = potActFlag;
	}

}