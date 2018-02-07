package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the DISCOUNTING_TF_V1 database table.
 * 
 */
@Entity
@Table(name="DISCOUNTING_TF_V1")
@NamedQuery(name="DiscountingTfV1.findAll", query="SELECT d FROM DiscountingTfV1 d")
public class DiscountingTfV1 implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal amount;

	@Column(name="BALANCE_EQU")
	private BigDecimal balanceEqu;

	@Column(name="BALANCE_USD")
	private BigDecimal balanceUsd;

	@Column(name="BANK_ACCT")
	private String bankAcct;

	@Column(name="BANK_NAME")
	private String bankName;

	@Column(name="BENF_ACCT")
	private String benfAcct;

	@Temporal(TemporalType.DATE)
	@Column(name="BIRTH_DATE")
	private Date birthDate;

	@Column(name="BIRTH_PLACE")
	private String birthPlace;

	@Column(name="BRANCH_CODE")
	private String branchCode;

	@Column(name="BRANCH_GOVERNERATE")
	private String branchGovernerate;

	@Temporal(TemporalType.DATE)
	private Date busdate;

	@Column(name="CENTER_CODE")
	private String centerCode;

	@Column(name="COUNTRY_OF_RESIDENCE")
	private String countryOfResidence;

	@Temporal(TemporalType.DATE)
	@Column(name="CREDIT_DATE")
	private Date creditDate;

	@Column(name="CUR_CODE")
	private String curCode;

	@Column(name="CUST_CBE_CODE")
	private String custCbeCode;

	@Column(name="CUST_NAME")
	private String custName;

	@Column(name="CUST_NO")
	private String custNo;

	@Column(name="CUSTOMER_CODE")
	private String customerCode;

	@Column(name="CUSTOMER_FIRST_NAME_A")
	private String customerFirstNameA;

	@Column(name="CUSTOMER_FIRST_NAME_E")
	private String customerFirstNameE;

	@Column(name="CUSTOMER_LAST_NAME_A")
	private String customerLastNameA;

	@Column(name="CUSTOMER_LAST_NAME_E")
	private String customerLastNameE;

	@Column(name="CUSTOMER_MIDDLE_NAME_A")
	private String customerMiddleNameA;

	@Column(name="CUSTOMER_MIDDLE_NAME_E")
	private String customerMiddleNameE;

	@Column(name="CUSTOMER_NAME_A")
	private String customerNameA;

	@Column(name="CUSTOMER_NAME_E")
	private String customerNameE;

	@Column(name="CUSTOMER_SEGMENT")
	private String customerSegment;

	@Column(name="CUSTOMER_TYPE")
	private String customerType;

	@Temporal(TemporalType.DATE)
	@Column(name="DEBIT_DATE")
	private Date debitDate;

	@Column(name="ECONOMIC_SECTOR")
	private String economicSector;

	private String email;

	@Column(name="EMP_COMPANY_NAME")
	private String empCompanyName;

	@Column(name="ENTITY_LEGAL_TYPE")
	private String entityLegalType;

	private String gender;

	@Column(name="GL_NO")
	private BigDecimal glNo;

	@Column(name="HOME_PHONE_NO")
	private String homePhoneNo;

	@Temporal(TemporalType.DATE)
	@Column(name="ID_EXPIRY")
	private Date idExpiry;

	@Temporal(TemporalType.DATE)
	@Column(name="ID_ISSUE_DATE")
	private Date idIssueDate;

	@Column(name="ID_ISSUE_PLACE")
	private String idIssuePlace;

	@Column(name="ID_NO")
	private String idNo;

	@Column(name="ID_TYPE")
	private String idType;

	@Column(name="INDUSTRY_CODE")
	private String industryCode;

	@Column(name="LIABILITY_ON")
	private String liabilityOn;

	private String location;

	@Column(name="MAILING_ADDRESS_1")
	private String mailingAddress1;

	@Column(name="MAILING_ADDRESS_2")
	private String mailingAddress2;

	@Column(name="MAILING_ADDRESS_3")
	private String mailingAddress3;

	@Column(name="MOBILE_NO")
	private String mobileNo;

	private String nationality;

	@Column(name="REF_NO")
	private String refNo;

	@Column(name="REMAIN_TEARM")
	private BigDecimal remainTearm;

	@Column(name="RESIDENT_ADDRESS_1")
	private String residentAddress1;

	@Column(name="RESIDENT_ADDRESS_2")
	private String residentAddress2;

	@Column(name="RESIDENT_ADDRESS_3")
	private String residentAddress3;

	@Column(name="RESIDENT_ADDRESS_4")
	private String residentAddress4;

	@Column(name="RESIDENT_ADDRESS_5")
	private String residentAddress5;

	@Column(name="TRANS_TYPE")
	private String transType;

	@Column(name="WORK_PHONE_NO")
	private String workPhoneNo;

	public DiscountingTfV1() {
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
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

	public Date getBirthDate() {
		return this.birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getBirthPlace() {
		return this.birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	public String getBranchCode() {
		return this.branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	public String getBranchGovernerate() {
		return this.branchGovernerate;
	}

	public void setBranchGovernerate(String branchGovernerate) {
		this.branchGovernerate = branchGovernerate;
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

	public String getCountryOfResidence() {
		return this.countryOfResidence;
	}

	public void setCountryOfResidence(String countryOfResidence) {
		this.countryOfResidence = countryOfResidence;
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

	public String getCustCbeCode() {
		return this.custCbeCode;
	}

	public void setCustCbeCode(String custCbeCode) {
		this.custCbeCode = custCbeCode;
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

	public String getCustomerCode() {
		return this.customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}

	public String getCustomerFirstNameA() {
		return this.customerFirstNameA;
	}

	public void setCustomerFirstNameA(String customerFirstNameA) {
		this.customerFirstNameA = customerFirstNameA;
	}

	public String getCustomerFirstNameE() {
		return this.customerFirstNameE;
	}

	public void setCustomerFirstNameE(String customerFirstNameE) {
		this.customerFirstNameE = customerFirstNameE;
	}

	public String getCustomerLastNameA() {
		return this.customerLastNameA;
	}

	public void setCustomerLastNameA(String customerLastNameA) {
		this.customerLastNameA = customerLastNameA;
	}

	public String getCustomerLastNameE() {
		return this.customerLastNameE;
	}

	public void setCustomerLastNameE(String customerLastNameE) {
		this.customerLastNameE = customerLastNameE;
	}

	public String getCustomerMiddleNameA() {
		return this.customerMiddleNameA;
	}

	public void setCustomerMiddleNameA(String customerMiddleNameA) {
		this.customerMiddleNameA = customerMiddleNameA;
	}

	public String getCustomerMiddleNameE() {
		return this.customerMiddleNameE;
	}

	public void setCustomerMiddleNameE(String customerMiddleNameE) {
		this.customerMiddleNameE = customerMiddleNameE;
	}

	public String getCustomerNameA() {
		return this.customerNameA;
	}

	public void setCustomerNameA(String customerNameA) {
		this.customerNameA = customerNameA;
	}

	public String getCustomerNameE() {
		return this.customerNameE;
	}

	public void setCustomerNameE(String customerNameE) {
		this.customerNameE = customerNameE;
	}

	public String getCustomerSegment() {
		return this.customerSegment;
	}

	public void setCustomerSegment(String customerSegment) {
		this.customerSegment = customerSegment;
	}

	public String getCustomerType() {
		return this.customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public Date getDebitDate() {
		return this.debitDate;
	}

	public void setDebitDate(Date debitDate) {
		this.debitDate = debitDate;
	}

	public String getEconomicSector() {
		return this.economicSector;
	}

	public void setEconomicSector(String economicSector) {
		this.economicSector = economicSector;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmpCompanyName() {
		return this.empCompanyName;
	}

	public void setEmpCompanyName(String empCompanyName) {
		this.empCompanyName = empCompanyName;
	}

	public String getEntityLegalType() {
		return this.entityLegalType;
	}

	public void setEntityLegalType(String entityLegalType) {
		this.entityLegalType = entityLegalType;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public BigDecimal getGlNo() {
		return this.glNo;
	}

	public void setGlNo(BigDecimal glNo) {
		this.glNo = glNo;
	}

	public String getHomePhoneNo() {
		return this.homePhoneNo;
	}

	public void setHomePhoneNo(String homePhoneNo) {
		this.homePhoneNo = homePhoneNo;
	}

	public Date getIdExpiry() {
		return this.idExpiry;
	}

	public void setIdExpiry(Date idExpiry) {
		this.idExpiry = idExpiry;
	}

	public Date getIdIssueDate() {
		return this.idIssueDate;
	}

	public void setIdIssueDate(Date idIssueDate) {
		this.idIssueDate = idIssueDate;
	}

	public String getIdIssuePlace() {
		return this.idIssuePlace;
	}

	public void setIdIssuePlace(String idIssuePlace) {
		this.idIssuePlace = idIssuePlace;
	}

	public String getIdNo() {
		return this.idNo;
	}

	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}

	public String getIdType() {
		return this.idType;
	}

	public void setIdType(String idType) {
		this.idType = idType;
	}

	public String getIndustryCode() {
		return this.industryCode;
	}

	public void setIndustryCode(String industryCode) {
		this.industryCode = industryCode;
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

	public String getMailingAddress1() {
		return this.mailingAddress1;
	}

	public void setMailingAddress1(String mailingAddress1) {
		this.mailingAddress1 = mailingAddress1;
	}

	public String getMailingAddress2() {
		return this.mailingAddress2;
	}

	public void setMailingAddress2(String mailingAddress2) {
		this.mailingAddress2 = mailingAddress2;
	}

	public String getMailingAddress3() {
		return this.mailingAddress3;
	}

	public void setMailingAddress3(String mailingAddress3) {
		this.mailingAddress3 = mailingAddress3;
	}

	public String getMobileNo() {
		return this.mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getNationality() {
		return this.nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getRefNo() {
		return this.refNo;
	}

	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}

	public BigDecimal getRemainTearm() {
		return this.remainTearm;
	}

	public void setRemainTearm(BigDecimal remainTearm) {
		this.remainTearm = remainTearm;
	}

	public String getResidentAddress1() {
		return this.residentAddress1;
	}

	public void setResidentAddress1(String residentAddress1) {
		this.residentAddress1 = residentAddress1;
	}

	public String getResidentAddress2() {
		return this.residentAddress2;
	}

	public void setResidentAddress2(String residentAddress2) {
		this.residentAddress2 = residentAddress2;
	}

	public String getResidentAddress3() {
		return this.residentAddress3;
	}

	public void setResidentAddress3(String residentAddress3) {
		this.residentAddress3 = residentAddress3;
	}

	public String getResidentAddress4() {
		return this.residentAddress4;
	}

	public void setResidentAddress4(String residentAddress4) {
		this.residentAddress4 = residentAddress4;
	}

	public String getResidentAddress5() {
		return this.residentAddress5;
	}

	public void setResidentAddress5(String residentAddress5) {
		this.residentAddress5 = residentAddress5;
	}

	public String getTransType() {
		return this.transType;
	}

	public void setTransType(String transType) {
		this.transType = transType;
	}

	public String getWorkPhoneNo() {
		return this.workPhoneNo;
	}

	public void setWorkPhoneNo(String workPhoneNo) {
		this.workPhoneNo = workPhoneNo;
	}

}