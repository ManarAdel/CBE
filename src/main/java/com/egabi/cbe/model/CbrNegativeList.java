package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the CBR_NEGATIVE_LIST database table.
 * 
 */
@Entity
@Table(name="CBR_NEGATIVE_LIST")
@NamedQuery(name="CbrNegativeList.findAll", query="SELECT c FROM CbrNegativeList c")
public class CbrNegativeList implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CbrNegativeListPK id;

	private String address;

	@Column(name="AMT_OF_CLASSIFIED_LOAN")
	private BigDecimal amtOfClassifiedLoan;

	@Column(name="BIRTH_PLACE")
	private String birthPlace;

	@Temporal(TemporalType.DATE)
	private Date birthdate;

	@Column(name="CBE_BRANCH_CODE")
	private BigDecimal cbeBranchCode;

	@Column(name="CBE_CURR_CODE")
	private BigDecimal cbeCurrCode;

	@Column(name="CBE_CUSTOMER_TYPE")
	private BigDecimal cbeCustomerType;

	@Column(name="CBE_GENDER")
	private String cbeGender;

	@Column(name="CBE_ID_TYPE")
	private BigDecimal cbeIdType;

	@Column(name="CBE_LOAN_TYPE")
	private BigDecimal cbeLoanType;

	@Column(name="CBE_LOAN_TYPE_2")
	private BigDecimal cbeLoanType2;

	@Column(name="CENTER_CODE")
	private String centerCode;

	@Column(name="CRITERIA_FLAG")
	private BigDecimal criteriaFlag;

	@Column(name="CURR_CODE")
	private String currCode;

	@Column(name="CUSTOMER_RATE")
	private BigDecimal customerRate;

	@Column(name="CUSTOMER_TYPE")
	private BigDecimal customerType;

	private String email;

	@Column(name="EMP_COMPANY")
	private String empCompany;

	@Column(name="EMP_TEL")
	private BigDecimal empTel;

	@Temporal(TemporalType.DATE)
	@Column(name="EXPIRY_DATE")
	private Date expiryDate;

	@Temporal(TemporalType.DATE)
	@Column(name="FIRST_REPORTING_DATE")
	private Date firstReportingDate;

	private String gender;

	@Column(name="HOME_TEL")
	private BigDecimal homeTel;

	@Column(name="ID_NO")
	private String idNo;

	@Column(name="ID_TYPE")
	private String idType;

	@Temporal(TemporalType.DATE)
	@Column(name="ISSUE_DATE")
	private Date issueDate;

	@Column(name="ISSUE_PLACE")
	private String issuePlace;

	@Column(name="LOAN_BALANCE")
	private BigDecimal loanBalance;

	@Column(name="LOAN_CLIENT_NO")
	private BigDecimal loanClientNo;

	@Column(name="LOAN_LIMIT")
	private BigDecimal loanLimit;

	@Column(name="LOAN_TYPE_2")
	private BigDecimal loanType2;

	@Column(name="MOBILE_NO")
	private BigDecimal mobileNo;

	@Column(name="NAME_CUST_FULL")
	private String nameCustFull;

	@Column(name="NL_MAIN_CODE")
	private BigDecimal nlMainCode;

	@Column(name="NL_SUB_CODE")
	private BigDecimal nlSubCode;

	@Column(name="PERCENT_AMT_OF_CLASSIFIED_LOAN")
	private BigDecimal percentAmtOfClassifiedLoan;

	@Temporal(TemporalType.DATE)
	@Column(name="START_DATE")
	private Date startDate;

	@Temporal(TemporalType.DATE)
	@Column(name="STOP_DATE")
	private Date stopDate;

	@Column(name="TYPE_OF_CLASSIFIED_LOAN")
	private BigDecimal typeOfClassifiedLoan;

	public CbrNegativeList() {
	}

	public CbrNegativeListPK getId() {
		return this.id;
	}

	public void setId(CbrNegativeListPK id) {
		this.id = id;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public BigDecimal getAmtOfClassifiedLoan() {
		return this.amtOfClassifiedLoan;
	}

	public void setAmtOfClassifiedLoan(BigDecimal amtOfClassifiedLoan) {
		this.amtOfClassifiedLoan = amtOfClassifiedLoan;
	}

	public String getBirthPlace() {
		return this.birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	public Date getBirthdate() {
		return this.birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public BigDecimal getCbeBranchCode() {
		return this.cbeBranchCode;
	}

	public void setCbeBranchCode(BigDecimal cbeBranchCode) {
		this.cbeBranchCode = cbeBranchCode;
	}

	public BigDecimal getCbeCurrCode() {
		return this.cbeCurrCode;
	}

	public void setCbeCurrCode(BigDecimal cbeCurrCode) {
		this.cbeCurrCode = cbeCurrCode;
	}

	public BigDecimal getCbeCustomerType() {
		return this.cbeCustomerType;
	}

	public void setCbeCustomerType(BigDecimal cbeCustomerType) {
		this.cbeCustomerType = cbeCustomerType;
	}

	public String getCbeGender() {
		return this.cbeGender;
	}

	public void setCbeGender(String cbeGender) {
		this.cbeGender = cbeGender;
	}

	public BigDecimal getCbeIdType() {
		return this.cbeIdType;
	}

	public void setCbeIdType(BigDecimal cbeIdType) {
		this.cbeIdType = cbeIdType;
	}

	public BigDecimal getCbeLoanType() {
		return this.cbeLoanType;
	}

	public void setCbeLoanType(BigDecimal cbeLoanType) {
		this.cbeLoanType = cbeLoanType;
	}

	public BigDecimal getCbeLoanType2() {
		return this.cbeLoanType2;
	}

	public void setCbeLoanType2(BigDecimal cbeLoanType2) {
		this.cbeLoanType2 = cbeLoanType2;
	}

	public String getCenterCode() {
		return this.centerCode;
	}

	public void setCenterCode(String centerCode) {
		this.centerCode = centerCode;
	}

	public BigDecimal getCriteriaFlag() {
		return this.criteriaFlag;
	}

	public void setCriteriaFlag(BigDecimal criteriaFlag) {
		this.criteriaFlag = criteriaFlag;
	}

	public String getCurrCode() {
		return this.currCode;
	}

	public void setCurrCode(String currCode) {
		this.currCode = currCode;
	}

	public BigDecimal getCustomerRate() {
		return this.customerRate;
	}

	public void setCustomerRate(BigDecimal customerRate) {
		this.customerRate = customerRate;
	}

	public BigDecimal getCustomerType() {
		return this.customerType;
	}

	public void setCustomerType(BigDecimal customerType) {
		this.customerType = customerType;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmpCompany() {
		return this.empCompany;
	}

	public void setEmpCompany(String empCompany) {
		this.empCompany = empCompany;
	}

	public BigDecimal getEmpTel() {
		return this.empTel;
	}

	public void setEmpTel(BigDecimal empTel) {
		this.empTel = empTel;
	}

	public Date getExpiryDate() {
		return this.expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public Date getFirstReportingDate() {
		return this.firstReportingDate;
	}

	public void setFirstReportingDate(Date firstReportingDate) {
		this.firstReportingDate = firstReportingDate;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public BigDecimal getHomeTel() {
		return this.homeTel;
	}

	public void setHomeTel(BigDecimal homeTel) {
		this.homeTel = homeTel;
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

	public Date getIssueDate() {
		return this.issueDate;
	}

	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}

	public String getIssuePlace() {
		return this.issuePlace;
	}

	public void setIssuePlace(String issuePlace) {
		this.issuePlace = issuePlace;
	}

	public BigDecimal getLoanBalance() {
		return this.loanBalance;
	}

	public void setLoanBalance(BigDecimal loanBalance) {
		this.loanBalance = loanBalance;
	}

	public BigDecimal getLoanClientNo() {
		return this.loanClientNo;
	}

	public void setLoanClientNo(BigDecimal loanClientNo) {
		this.loanClientNo = loanClientNo;
	}

	public BigDecimal getLoanLimit() {
		return this.loanLimit;
	}

	public void setLoanLimit(BigDecimal loanLimit) {
		this.loanLimit = loanLimit;
	}

	public BigDecimal getLoanType2() {
		return this.loanType2;
	}

	public void setLoanType2(BigDecimal loanType2) {
		this.loanType2 = loanType2;
	}

	public BigDecimal getMobileNo() {
		return this.mobileNo;
	}

	public void setMobileNo(BigDecimal mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getNameCustFull() {
		return this.nameCustFull;
	}

	public void setNameCustFull(String nameCustFull) {
		this.nameCustFull = nameCustFull;
	}

	public BigDecimal getNlMainCode() {
		return this.nlMainCode;
	}

	public void setNlMainCode(BigDecimal nlMainCode) {
		this.nlMainCode = nlMainCode;
	}

	public BigDecimal getNlSubCode() {
		return this.nlSubCode;
	}

	public void setNlSubCode(BigDecimal nlSubCode) {
		this.nlSubCode = nlSubCode;
	}

	public BigDecimal getPercentAmtOfClassifiedLoan() {
		return this.percentAmtOfClassifiedLoan;
	}

	public void setPercentAmtOfClassifiedLoan(BigDecimal percentAmtOfClassifiedLoan) {
		this.percentAmtOfClassifiedLoan = percentAmtOfClassifiedLoan;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getStopDate() {
		return this.stopDate;
	}

	public void setStopDate(Date stopDate) {
		this.stopDate = stopDate;
	}

	public BigDecimal getTypeOfClassifiedLoan() {
		return this.typeOfClassifiedLoan;
	}

	public void setTypeOfClassifiedLoan(BigDecimal typeOfClassifiedLoan) {
		this.typeOfClassifiedLoan = typeOfClassifiedLoan;
	}

}