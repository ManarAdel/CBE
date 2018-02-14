package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the DISCOUNTING_TF database table.
 * 
 */
@Entity
@Table(name="DISCOUNTING_TF")
@NamedQuery(name="DiscountingTf.findAll", query="SELECT d FROM DiscountingTf d")
public class DiscountingTf implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
	//This Table Doesn't have A PK 
	//Generated Id 
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
	


	private BigDecimal amount;

	@Column(name="BANK_ACCT")
	private String bankAcct;

	@Column(name="BANK_NAME")
	private String bankName;

	@Column(name="BENF_ACCT")
	private String benfAcct;

	@Temporal(TemporalType.DATE)
	private Date busdate;

	@Column(name="CENTER_CODE")
	private String centerCode;

	@Temporal(TemporalType.DATE)
	@Column(name="CREDIT_DATE")
	private Date creditDate;

	@Column(name="CUR_CODE")
	private String curCode;

	@Column(name="CUST_NAME")
	private String custName;

	@Column(name="CUST_NO")
	private String custNo;

	@Temporal(TemporalType.DATE)
	@Column(name="DEBIT_DATE")
	private Date debitDate;

	@Column(name="GL_NO")
	private BigDecimal glNo;

	@Column(name="LIABILITY_ON")
	private String liabilityOn;

	private String location;

	@Column(name="REF_NO")
	private String refNo;

	@Column(name="TRANS_TYPE")
	private String transType;

	public DiscountingTf() {
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
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

	public Date getBusdate() {
		return this.busdate;
	}

	public void setBusdate(Date busdate) {
		this.busdate = busdate;
	}

	public String getCenterCode() {
		return this.centerCode;
	}

	public void setCenterCode(String centerCode) {
		this.centerCode = centerCode;
	}

	public Date getCreditDate() {
		return this.creditDate;
	}

	public void setCreditDate(Date creditDate) {
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

	public Date getDebitDate() {
		return this.debitDate;
	}

	public void setDebitDate(Date debitDate) {
		this.debitDate = debitDate;
	}

	public BigDecimal getGlNo() {
		return this.glNo;
	}

	public void setGlNo(BigDecimal glNo) {
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