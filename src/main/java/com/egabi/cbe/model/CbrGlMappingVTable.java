package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the CBR_GL_MAPPING_V_TABLE database table.
 * 
 */
@Entity
@Table(name="CBR_GL_MAPPING_V_TABLE")
@NamedQuery(name="CbrGlMappingVTable.findAll", query="SELECT c FROM CbrGlMappingVTable c")
public class CbrGlMappingVTable implements Serializable {
	private static final long serialVersionUID = 1L;

	//This Table Doesn't have A PK 
	//Generated Id 
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
	
	private BigDecimal balance;

	@Column(name="BALANCE_EQU")
	private BigDecimal balanceEqu;

	@Column(name="BALANCE_USD")
	private BigDecimal balanceUsd;

	@Column(name="BRANCH_CODE")
	private String branchCode;

	@Temporal(TemporalType.DATE)
	private Date busdate;

	@Column(name="CENTER_CODE")
	private String centerCode;

	private String class1;

	private String class2;

	private String class3;

	private String class4;

	private String class5;

	@Column(name="CURRENCY_CODE")
	private String currencyCode;

	@Column(name="CUSTOMER_CODE")
	private BigDecimal customerCode;

	@Column(name="DR_CR")
	private String drCr;

	@Column(name="ENTRY_DESCRIPTION")
	private String entryDescription;

	@Column(name="GL_CODE")
	private String glCode;

	@Column(name="GL_TYPE")
	private String glType;

	@Column(name="GROUP_CODE")
	private BigDecimal groupCode;

	@Column(name="GROUP_DESCR")
	private String groupDescr;

	private String regions;

	private String segments;

	@Column(name="SUB_ACCOUNT_NO")
	private String subAccountNo;

	public CbrGlMappingVTable() {
	}

	public BigDecimal getBalance() {
		return this.balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public BigDecimal getBalanceEqu() {
		return this.balanceEqu;
	}

	public void setBalanceEqu(BigDecimal balanceEqu) {
		this.balanceEqu = balanceEqu;
	}

	public BigDecimal getBalanceUsd() {
		return this.balanceUsd;
	}

	public void setBalanceUsd(BigDecimal balanceUsd) {
		this.balanceUsd = balanceUsd;
	}

	public String getBranchCode() {
		return this.branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
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

	public String getCurrencyCode() {
		return this.currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public BigDecimal getCustomerCode() {
		return this.customerCode;
	}

	public void setCustomerCode(BigDecimal customerCode) {
		this.customerCode = customerCode;
	}

	public String getDrCr() {
		return this.drCr;
	}

	public void setDrCr(String drCr) {
		this.drCr = drCr;
	}

	public String getEntryDescription() {
		return this.entryDescription;
	}

	public void setEntryDescription(String entryDescription) {
		this.entryDescription = entryDescription;
	}

	public String getGlCode() {
		return this.glCode;
	}

	public void setGlCode(String glCode) {
		this.glCode = glCode;
	}

	public String getGlType() {
		return this.glType;
	}

	public void setGlType(String glType) {
		this.glType = glType;
	}

	public BigDecimal getGroupCode() {
		return this.groupCode;
	}

	public void setGroupCode(BigDecimal groupCode) {
		this.groupCode = groupCode;
	}

	public String getGroupDescr() {
		return this.groupDescr;
	}

	public void setGroupDescr(String groupDescr) {
		this.groupDescr = groupDescr;
	}

	public String getRegions() {
		return this.regions;
	}

	public void setRegions(String regions) {
		this.regions = regions;
	}

	public String getSegments() {
		return this.segments;
	}

	public void setSegments(String segments) {
		this.segments = segments;
	}

	public String getSubAccountNo() {
		return this.subAccountNo;
	}

	public void setSubAccountNo(String subAccountNo) {
		this.subAccountNo = subAccountNo;
	}

}