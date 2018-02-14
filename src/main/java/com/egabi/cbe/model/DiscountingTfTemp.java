package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the DISCOUNTING_TF_TEMP database table.
 * 
 */
@Entity
@Table(name="DISCOUNTING_TF_TEMP")
@NamedQuery(name="DiscountingTfTemp.findAll", query="SELECT d FROM DiscountingTfTemp d")
public class DiscountingTfTemp implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
	//This Table Doesn't have A PK 
	//Generated Id 
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
	

	private String amount;

	@Column(name="BANK_ACCT")
	private String bankAcct;

	@Column(name="BANK_NAME")
	private String bankName;

	@Column(name="BENF_ACCT")
	private String benfAcct;

	private String busdate;

	@Column(name="CENTER_CODE")
	private String centerCode;

	@Column(name="CREDIT_DATE")
	private String creditDate;

	@Column(name="CUR_CODE")
	private String curCode;

	@Column(name="CUST_NAME")
	private String custName;

	@Column(name="CUST_NO")
	private String custNo;

	@Column(name="DEBIT_DATE")
	private String debitDate;

	@Column(name="GL_NO")
	private String glNo;

	@Column(name="LIABILITY_ON")
	private String liabilityOn;

	private String location;

	@Column(name="REF_NO")
	private String refNo;

	@Column(name="TRANS_TYPE")
	private String transType;

	public DiscountingTfTemp() {
	}

	public String getAmount() {
		return this.amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBankAcct() {
		return this.bankAcct;
	}

	public void setBankAcct(String bankAcct) {
		this.bankAcct = bankAcct;
	}

	public String getBankName() {
		return this.bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBenfAcct() {
		return this.benfAcct;
	}

	public void setBenfAcct(String benfAcct) {
		this.benfAcct = benfAcct;
	}

	public String getBusdate() {
		return this.busdate;
	}

	public void setBusdate(String busdate) {
		this.busdate = busdate;
	}

	public String getCenterCode() {
		return this.centerCode;
	}

	public void setCenterCode(String centerCode) {
		this.centerCode = centerCode;
	}

	public String getCreditDate() {
		return this.creditDate;
	}

	public void setCreditDate(String creditDate) {
		this.creditDate = creditDate;
	}

	public String getCurCode() {
		return this.curCode;
	}

	public void setCurCode(String curCode) {
		this.curCode = curCode;
	}

	public String getCustName() {
		return this.custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustNo() {
		return this.custNo;
	}

	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}

	public String getDebitDate() {
		return this.debitDate;
	}

	public void setDebitDate(String debitDate) {
		this.debitDate = debitDate;
	}

	public String getGlNo() {
		return this.glNo;
	}

	public void setGlNo(String glNo) {
		this.glNo = glNo;
	}

	public String getLiabilityOn() {
		return this.liabilityOn;
	}

	public void setLiabilityOn(String liabilityOn) {
		this.liabilityOn = liabilityOn;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getRefNo() {
		return this.refNo;
	}

	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}

	public String getTransType() {
		return this.transType;
	}

	public void setTransType(String transType) {
		this.transType = transType;
	}

}