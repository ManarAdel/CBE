package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the CBR_CREDIT_BREAKDOWN database table.
 * 
 */
@Entity
@Table(name="CBR_CREDIT_BREAKDOWN")
@NamedQuery(name="CbrCreditBreakdown.findAll", query="SELECT c FROM CbrCreditBreakdown c")
public class CbrCreditBreakdown implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CbrCreditBreakdownPK id;

	@Temporal(TemporalType.DATE)
	@Column(name="ACCOUNT_OPEN_DATE")
	private Date accountOpenDate;

	@Column(name="ACCOUNT_STATUS")
	private String accountStatus;

	@Column(name="ADDRESS1_CITY_E")
	private String address1CityE;

	@Column(name="AMOUNT_OVERDUE")
	private BigDecimal amountOverdue;

	@Column(name="AMT_OF_CLASSIFIED_LOAN")
	private BigDecimal amtOfClassifiedLoan;

	@Column(name="BAL_SIGN")
	private String balSign;

	@Column(name="BBG_ORR")
	private String bbgOrr;

	@Temporal(TemporalType.DATE)
	@Column(name="BIRTH_DATE")
	private Date birthDate;

	@Column(name="BIRTH_PLACE")
	private String birthPlace;

	@Column(name="CBE_BRANCH_CODE")
	private String cbeBranchCode;

	@Column(name="CBE_CURR_CODE")
	private String cbeCurrCode;

	@Column(name="CBE_CUSTOMER_TYPE")
	private BigDecimal cbeCustomerType;

	@Column(name="CBE_GENDER")
	private String cbeGender;

	@Column(name="CBE_ID_TYPE")
	private BigDecimal cbeIdType;

	@Column(name="CBE_PRODUCT_TYPE")
	private String cbeProductType;

	@Column(name="CENTER_CODE_CUST")
	private String centerCodeCust;

	private String class1;

	private String class2;

	private String class3;

	private String class4;

	private String class5;

	@Temporal(TemporalType.DATE)
	@Column(name="CLOSED_DATE")
	private Date closedDate;

	@Column(name="COL_NUMBER")
	private BigDecimal colNumber;

	@Temporal(TemporalType.DATE)
	@Column(name="CONS_LAST_PAYMENT_DATE")
	private Date consLastPaymentDate;

	@Column(name="CONSENT_STATUS")
	private String consentStatus;

	@Column(name="CORP_EQUIVALENT_LIMIT_AMT")
	private BigDecimal corpEquivalentLimitAmt;

	@Column(name="CORP_LIMIT_AMT")
	private BigDecimal corpLimitAmt;

	@Column(name="CR_CRITERIA_FLAG")
	private BigDecimal crCriteriaFlag;

	@Column(name="CREDIT_FAC_ACCOUNT_BALANCE")
	private String creditFacAccountBalance;

	@Column(name="CUST_CBE_CODE")
	private String custCbeCode;

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

	@Column(name="CUSTOMER_TYPE")
	private String customerType;

	@Column(name="DAYS_PAST_DUE")
	private BigDecimal daysPastDue;

	@Column(name="DR_CR")
	private String drCr;

	private String email;

	@Column(name="EMP_COMPANY_NAME")
	private String empCompanyName;

	@Column(name="FULL_TERM_DAYS")
	private BigDecimal fullTermDays;

	private String gender;

	@Column(name="GROSS_ACCOUNT_BALANCE")
	private BigDecimal grossAccountBalance;

	@Column(name="GROSS_ACCOUNT_BALANCE_EQU")
	private BigDecimal grossAccountBalanceEqu;

	@Column(name="GUARAN_AMOUNT")
	private BigDecimal guaranAmount;

	@Column(name="GUARAN_REF_ACCOUNT_NO")
	private String guaranRefAccountNo;

	@Column(name="GUARANTEE_AMT")
	private BigDecimal guaranteeAmt;

	@Column(name="GUARANTEE_LIMIT")
	private BigDecimal guaranteeLimit;

	@Column(name="GUARANTEE_TYPE")
	private String guaranteeType;

	@Column(name="GUARANTEED_BRANCH_CODE")
	private String guaranteedBranchCode;

	@Column(name="GUARANTEED_CBE_BRANCH_CODE")
	private String guaranteedCbeBranchCode;

	@Column(name="GUARANTEED_CUST_CODE")
	private String guaranteedCustCode;

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

	@Column(name="ISC_CRITERIA_FLAG")
	private BigDecimal iscCriteriaFlag;

	@Column(name="JOINT_ACCOUNT_INDICATOR")
	private String jointAccountIndicator;

	@Column(name="LAST_AMOUNT_PAID")
	private BigDecimal lastAmountPaid;

	@Column(name="MAILING_ADDRESS_1")
	private String mailingAddress1;

	@Column(name="MAILING_ADDRESS_2")
	private String mailingAddress2;

	@Column(name="MAILING_ADDRESS_3")
	private String mailingAddress3;

	@Temporal(TemporalType.DATE)
	@Column(name="MATURITY_DATE")
	private Date maturityDate;

	@Column(name="MOBILE_NO")
	private String mobileNo;

	@Column(name="MOD_FACILITY_ACCOUNT")
	private String modFacilityAccount;

	@Column(name="MOD_FACILITY_CODE")
	private String modFacilityCode;

	@Column(name="MOD_SECURITY_PERC")
	private BigDecimal modSecurityPerc;

	private String nationality;

	@Column(name="NET_ACCOUNT_BALANCE")
	private BigDecimal netAccountBalance;

	@Column(name="NET_ACCOUNT_BALANCE_EQU")
	private BigDecimal netAccountBalanceEqu;

	@Column(name="NL_CBE_LOAN_TYPE_2")
	private BigDecimal nlCbeLoanType2;

	@Column(name="NL_CRITERIA_FLAG")
	private BigDecimal nlCriteriaFlag;

	@Column(name="NL_CUSTOMER_RATE")
	private BigDecimal nlCustomerRate;

	@Temporal(TemporalType.DATE)
	@Column(name="NL_FIRST_REPORTING_DATE")
	private Date nlFirstReportingDate;

	@Column(name="NL_LOAN_CLIENT_NO")
	private BigDecimal nlLoanClientNo;

	@Column(name="NL_LOAN_TYPE")
	private BigDecimal nlLoanType;

	@Column(name="NL_MAIN_CODE")
	private String nlMainCode;

	@Column(name="NL_PERC_AMT_OF_CLASSIFIED_LOAN")
	private BigDecimal nlPercAmtOfClassifiedLoan;

	@Temporal(TemporalType.DATE)
	@Column(name="NL_STOP_DATE")
	private Date nlStopDate;

	@Column(name="NL_SUB_CODE")
	private String nlSubCode;

	@Column(name="NO_OF_INST_PAST_DUE")
	private BigDecimal noOfInstPastDue;

	private String occupation;

	@Column(name="ORR_RESERVE_AMOUNT")
	private BigDecimal orrReserveAmount;

	@Temporal(TemporalType.DATE)
	@Column(name="ORR_RESERVE_DATE")
	private Date orrReserveDate;

	@Column(name="PREV_CREDIT_FACILITY_ACC_NO")
	private String prevCreditFacilityAccNo;

	@Column(name="PREV_DATA_PROV_ID_BRANCH_ID")
	private String prevDataProvIdBranchId;

	@Column(name="PRIMARY_JOINT_ACCT_REF_NO")
	private BigDecimal primaryJointAcctRefNo;

	@Column(name="PROD_DESCR")
	private String prodDescr;

	@Column(name="PRODUCT_CODE")
	private String productCode;

	@Column(name="RESIDENT_ADDRESS_1")
	private String residentAddress1;

	@Column(name="RETAIL_EQUIVALENT_LIMIT_AMT")
	private BigDecimal retailEquivalentLimitAmt;

	@Column(name="RETAIL_LIMIT_AMT")
	private BigDecimal retailLimitAmt;

	@Column(name="SME_ACT_ST")
	private String smeActSt;

	@Column(name="SME_ADDRESS1")
	private String smeAddress1;

	@Column(name="SME_ADDRESS1_GOVRN")
	private String smeAddress1Govrn;

	@Column(name="SME_ADDRESS2")
	private String smeAddress2;

	@Column(name="SME_ADDRESS3")
	private String smeAddress3;

	@Column(name="SME_AMT_OVR_DUE")
	private BigDecimal smeAmtOvrDue;

	@Column(name="SME_APR_AMT")
	private BigDecimal smeAprAmt;

	@Temporal(TemporalType.DATE)
	@Column(name="SME_APR_DAT")
	private Date smeAprDat;

	@Column(name="SME_BAC1")
	private String smeBac1;

	@Temporal(TemporalType.DATE)
	@Column(name="SME_CON_EXP_DAT")
	private Date smeConExpDat;

	@Column(name="SME_COUNTRY")
	private BigDecimal smeCountry;

	@Column(name="SME_CRD_FAC")
	private String smeCrdFac;

	@Column(name="SME_CRD_FAC_BAL")
	private BigDecimal smeCrdFacBal;

	@Column(name="SME_CRD_FAC_TYP")
	private BigDecimal smeCrdFacTyp;

	@Column(name="SME_CUR")
	private String smeCur;

	@Column(name="SME_DATA_BRN_ID")
	private String smeDataBrnId;

	@Column(name="SME_FAX_NO")
	private String smeFaxNo;

	@Temporal(TemporalType.DATE)
	@Column(name="SME_FRS_DAT")
	private Date smeFrsDat;

	@Column(name="SME_ID_CODE1")
	private String smeIdCode1;

	@Temporal(TemporalType.DATE)
	@Column(name="SME_ID_EXPIRY_DATE1")
	private Date smeIdExpiryDate1;

	@Column(name="SME_INS_AMT")
	private BigDecimal smeInsAmt;

	@Column(name="SME_ISSUING_AUTHORITY1")
	private String smeIssuingAuthority1;

	@Column(name="SME_LEGAL_CONS")
	private String smeLegalCons;

	@Column(name="SME_NO_DAY")
	private BigDecimal smeNoDay;

	@Column(name="SME_P_CRD_FAC")
	private String smePCrdFac;

	@Column(name="SME_P_DATA_BRN_ID")
	private String smePDataBrnId;

	@Column(name="SME_PHONE_NO")
	private String smePhoneNo;

	@Column(name="SME_REGISTERED_COUNTRY")
	private String smeRegisteredCountry;

	@Column(name="SME_REP_TYP")
	private String smeRepTyp;

	@Column(name="SME_START_YEAR")
	private BigDecimal smeStartYear;

	@Column(name="SME_SUBJECT_CODE")
	private BigDecimal smeSubjectCode;

	@Column(name="SME_SUBJECT_NAME")
	private String smeSubjectName;

	@Column(name="SME_TRM_LON")
	private String smeTrmLon;

	@Column(name="SME_URL")
	private String smeUrl;

	@Column(name="SUB_ACCT")
	private String subAcct;

	@Column(name="SUSPENDED_INTERST")
	private BigDecimal suspendedInterst;

	@Column(name="TYPE_OF_CLASSIFIED_LOAN")
	private BigDecimal typeOfClassifiedLoan;

	@Column(name="UNDRAWN_FLAG")
	private BigDecimal undrawnFlag;

	@Column(name="UNDRAWN_LIMIT")
	private BigDecimal undrawnLimit;

	@Column(name="WORK_PHONE_NO")
	private String workPhoneNo;

	public CbrCreditBreakdown() {
	}

	public CbrCreditBreakdownPK getId() {
		return this.id;
	}

	public void setId(CbrCreditBreakdownPK id) {
		this.id = id;
	}

	public Date getAccountOpenDate() {
		return this.accountOpenDate;
	}

	public void setAccountOpenDate(Date accountOpenDate) {
		this.accountOpenDate = accountOpenDate;
	}

	public String getAccountStatus() {
		return this.accountStatus;
	}

	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}

	public String getAddress1CityE() {
		return this.address1CityE;
	}

	public void setAddress1CityE(String address1CityE) {
		this.address1CityE = address1CityE;
	}

	public BigDecimal getAmountOverdue() {
		return this.amountOverdue;
	}

	public void setAmountOverdue(BigDecimal amountOverdue) {
		this.amountOverdue = amountOverdue;
	}

	public BigDecimal getAmtOfClassifiedLoan() {
		return this.amtOfClassifiedLoan;
	}

	public void setAmtOfClassifiedLoan(BigDecimal amtOfClassifiedLoan) {
		this.amtOfClassifiedLoan = amtOfClassifiedLoan;
	}

	public String getBalSign() {
		return this.balSign;
	}

	public void setBalSign(String balSign) {
		this.balSign = balSign;
	}

	public String getBbgOrr() {
		return this.bbgOrr;
	}

	public void setBbgOrr(String bbgOrr) {
		this.bbgOrr = bbgOrr;
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

	public String getCbeBranchCode() {
		return this.cbeBranchCode;
	}

	public void setCbeBranchCode(String cbeBranchCode) {
		this.cbeBranchCode = cbeBranchCode;
	}

	public String getCbeCurrCode() {
		return this.cbeCurrCode;
	}

	public void setCbeCurrCode(String cbeCurrCode) {
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

	public String getCbeProductType() {
		return this.cbeProductType;
	}

	public void setCbeProductType(String cbeProductType) {
		this.cbeProductType = cbeProductType;
	}

	public String getCenterCodeCust() {
		return this.centerCodeCust;
	}

	public void setCenterCodeCust(String centerCodeCust) {
		this.centerCodeCust = centerCodeCust;
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

	public Date getClosedDate() {
		return this.closedDate;
	}

	public void setClosedDate(Date closedDate) {
		this.closedDate = closedDate;
	}

	public BigDecimal getColNumber() {
		return this.colNumber;
	}

	public void setColNumber(BigDecimal colNumber) {
		this.colNumber = colNumber;
	}

	public Date getConsLastPaymentDate() {
		return this.consLastPaymentDate;
	}

	public void setConsLastPaymentDate(Date consLastPaymentDate) {
		this.consLastPaymentDate = consLastPaymentDate;
	}

	public String getConsentStatus() {
		return this.consentStatus;
	}

	public void setConsentStatus(String consentStatus) {
		this.consentStatus = consentStatus;
	}

	public BigDecimal getCorpEquivalentLimitAmt() {
		return this.corpEquivalentLimitAmt;
	}

	public void setCorpEquivalentLimitAmt(BigDecimal corpEquivalentLimitAmt) {
		this.corpEquivalentLimitAmt = corpEquivalentLimitAmt;
	}

	public BigDecimal getCorpLimitAmt() {
		return this.corpLimitAmt;
	}

	public void setCorpLimitAmt(BigDecimal corpLimitAmt) {
		this.corpLimitAmt = corpLimitAmt;
	}

	public BigDecimal getCrCriteriaFlag() {
		return this.crCriteriaFlag;
	}

	public void setCrCriteriaFlag(BigDecimal crCriteriaFlag) {
		this.crCriteriaFlag = crCriteriaFlag;
	}

	public String getCreditFacAccountBalance() {
		return this.creditFacAccountBalance;
	}

	public void setCreditFacAccountBalance(String creditFacAccountBalance) {
		this.creditFacAccountBalance = creditFacAccountBalance;
	}

	public String getCustCbeCode() {
		return this.custCbeCode;
	}

	public void setCustCbeCode(String custCbeCode) {
		this.custCbeCode = custCbeCode;
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

	public String getCustomerType() {
		return this.customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public BigDecimal getDaysPastDue() {
		return this.daysPastDue;
	}

	public void setDaysPastDue(BigDecimal daysPastDue) {
		this.daysPastDue = daysPastDue;
	}

	public String getDrCr() {
		return this.drCr;
	}

	public void setDrCr(String drCr) {
		this.drCr = drCr;
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

	public BigDecimal getFullTermDays() {
		return this.fullTermDays;
	}

	public void setFullTermDays(BigDecimal fullTermDays) {
		this.fullTermDays = fullTermDays;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public BigDecimal getGrossAccountBalance() {
		return this.grossAccountBalance;
	}

	public void setGrossAccountBalance(BigDecimal grossAccountBalance) {
		this.grossAccountBalance = grossAccountBalance;
	}

	public BigDecimal getGrossAccountBalanceEqu() {
		return this.grossAccountBalanceEqu;
	}

	public void setGrossAccountBalanceEqu(BigDecimal grossAccountBalanceEqu) {
		this.grossAccountBalanceEqu = grossAccountBalanceEqu;
	}

	public BigDecimal getGuaranAmount() {
		return this.guaranAmount;
	}

	public void setGuaranAmount(BigDecimal guaranAmount) {
		this.guaranAmount = guaranAmount;
	}

	public String getGuaranRefAccountNo() {
		return this.guaranRefAccountNo;
	}

	public void setGuaranRefAccountNo(String guaranRefAccountNo) {
		this.guaranRefAccountNo = guaranRefAccountNo;
	}

	public BigDecimal getGuaranteeAmt() {
		return this.guaranteeAmt;
	}

	public void setGuaranteeAmt(BigDecimal guaranteeAmt) {
		this.guaranteeAmt = guaranteeAmt;
	}

	public BigDecimal getGuaranteeLimit() {
		return this.guaranteeLimit;
	}

	public void setGuaranteeLimit(BigDecimal guaranteeLimit) {
		this.guaranteeLimit = guaranteeLimit;
	}

	public String getGuaranteeType() {
		return this.guaranteeType;
	}

	public void setGuaranteeType(String guaranteeType) {
		this.guaranteeType = guaranteeType;
	}

	public String getGuaranteedBranchCode() {
		return this.guaranteedBranchCode;
	}

	public void setGuaranteedBranchCode(String guaranteedBranchCode) {
		this.guaranteedBranchCode = guaranteedBranchCode;
	}

	public String getGuaranteedCbeBranchCode() {
		return this.guaranteedCbeBranchCode;
	}

	public void setGuaranteedCbeBranchCode(String guaranteedCbeBranchCode) {
		this.guaranteedCbeBranchCode = guaranteedCbeBranchCode;
	}

	public String getGuaranteedCustCode() {
		return this.guaranteedCustCode;
	}

	public void setGuaranteedCustCode(String guaranteedCustCode) {
		this.guaranteedCustCode = guaranteedCustCode;
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

	public BigDecimal getIscCriteriaFlag() {
		return this.iscCriteriaFlag;
	}

	public void setIscCriteriaFlag(BigDecimal iscCriteriaFlag) {
		this.iscCriteriaFlag = iscCriteriaFlag;
	}

	public String getJointAccountIndicator() {
		return this.jointAccountIndicator;
	}

	public void setJointAccountIndicator(String jointAccountIndicator) {
		this.jointAccountIndicator = jointAccountIndicator;
	}

	public BigDecimal getLastAmountPaid() {
		return this.lastAmountPaid;
	}

	public void setLastAmountPaid(BigDecimal lastAmountPaid) {
		this.lastAmountPaid = lastAmountPaid;
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

	public Date getMaturityDate() {
		return this.maturityDate;
	}

	public void setMaturityDate(Date maturityDate) {
		this.maturityDate = maturityDate;
	}

	public String getMobileNo() {
		return this.mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getModFacilityAccount() {
		return this.modFacilityAccount;
	}

	public void setModFacilityAccount(String modFacilityAccount) {
		this.modFacilityAccount = modFacilityAccount;
	}

	public String getModFacilityCode() {
		return this.modFacilityCode;
	}

	public void setModFacilityCode(String modFacilityCode) {
		this.modFacilityCode = modFacilityCode;
	}

	public BigDecimal getModSecurityPerc() {
		return this.modSecurityPerc;
	}

	public void setModSecurityPerc(BigDecimal modSecurityPerc) {
		this.modSecurityPerc = modSecurityPerc;
	}

	public String getNationality() {
		return this.nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public BigDecimal getNetAccountBalance() {
		return this.netAccountBalance;
	}

	public void setNetAccountBalance(BigDecimal netAccountBalance) {
		this.netAccountBalance = netAccountBalance;
	}

	public BigDecimal getNetAccountBalanceEqu() {
		return this.netAccountBalanceEqu;
	}

	public void setNetAccountBalanceEqu(BigDecimal netAccountBalanceEqu) {
		this.netAccountBalanceEqu = netAccountBalanceEqu;
	}

	public BigDecimal getNlCbeLoanType2() {
		return this.nlCbeLoanType2;
	}

	public void setNlCbeLoanType2(BigDecimal nlCbeLoanType2) {
		this.nlCbeLoanType2 = nlCbeLoanType2;
	}

	public BigDecimal getNlCriteriaFlag() {
		return this.nlCriteriaFlag;
	}

	public void setNlCriteriaFlag(BigDecimal nlCriteriaFlag) {
		this.nlCriteriaFlag = nlCriteriaFlag;
	}

	public BigDecimal getNlCustomerRate() {
		return this.nlCustomerRate;
	}

	public void setNlCustomerRate(BigDecimal nlCustomerRate) {
		this.nlCustomerRate = nlCustomerRate;
	}

	public Date getNlFirstReportingDate() {
		return this.nlFirstReportingDate;
	}

	public void setNlFirstReportingDate(Date nlFirstReportingDate) {
		this.nlFirstReportingDate = nlFirstReportingDate;
	}

	public BigDecimal getNlLoanClientNo() {
		return this.nlLoanClientNo;
	}

	public void setNlLoanClientNo(BigDecimal nlLoanClientNo) {
		this.nlLoanClientNo = nlLoanClientNo;
	}

	public BigDecimal getNlLoanType() {
		return this.nlLoanType;
	}

	public void setNlLoanType(BigDecimal nlLoanType) {
		this.nlLoanType = nlLoanType;
	}

	public String getNlMainCode() {
		return this.nlMainCode;
	}

	public void setNlMainCode(String nlMainCode) {
		this.nlMainCode = nlMainCode;
	}

	public BigDecimal getNlPercAmtOfClassifiedLoan() {
		return this.nlPercAmtOfClassifiedLoan;
	}

	public void setNlPercAmtOfClassifiedLoan(BigDecimal nlPercAmtOfClassifiedLoan) {
		this.nlPercAmtOfClassifiedLoan = nlPercAmtOfClassifiedLoan;
	}

	public Date getNlStopDate() {
		return this.nlStopDate;
	}

	public void setNlStopDate(Date nlStopDate) {
		this.nlStopDate = nlStopDate;
	}

	public String getNlSubCode() {
		return this.nlSubCode;
	}

	public void setNlSubCode(String nlSubCode) {
		this.nlSubCode = nlSubCode;
	}

	public BigDecimal getNoOfInstPastDue() {
		return this.noOfInstPastDue;
	}

	public void setNoOfInstPastDue(BigDecimal noOfInstPastDue) {
		this.noOfInstPastDue = noOfInstPastDue;
	}

	public String getOccupation() {
		return this.occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public BigDecimal getOrrReserveAmount() {
		return this.orrReserveAmount;
	}

	public void setOrrReserveAmount(BigDecimal orrReserveAmount) {
		this.orrReserveAmount = orrReserveAmount;
	}

	public Date getOrrReserveDate() {
		return this.orrReserveDate;
	}

	public void setOrrReserveDate(Date orrReserveDate) {
		this.orrReserveDate = orrReserveDate;
	}

	public String getPrevCreditFacilityAccNo() {
		return this.prevCreditFacilityAccNo;
	}

	public void setPrevCreditFacilityAccNo(String prevCreditFacilityAccNo) {
		this.prevCreditFacilityAccNo = prevCreditFacilityAccNo;
	}

	public String getPrevDataProvIdBranchId() {
		return this.prevDataProvIdBranchId;
	}

	public void setPrevDataProvIdBranchId(String prevDataProvIdBranchId) {
		this.prevDataProvIdBranchId = prevDataProvIdBranchId;
	}

	public BigDecimal getPrimaryJointAcctRefNo() {
		return this.primaryJointAcctRefNo;
	}

	public void setPrimaryJointAcctRefNo(BigDecimal primaryJointAcctRefNo) {
		this.primaryJointAcctRefNo = primaryJointAcctRefNo;
	}

	public String getProdDescr() {
		return this.prodDescr;
	}

	public void setProdDescr(String prodDescr) {
		this.prodDescr = prodDescr;
	}

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getResidentAddress1() {
		return this.residentAddress1;
	}

	public void setResidentAddress1(String residentAddress1) {
		this.residentAddress1 = residentAddress1;
	}

	public BigDecimal getRetailEquivalentLimitAmt() {
		return this.retailEquivalentLimitAmt;
	}

	public void setRetailEquivalentLimitAmt(BigDecimal retailEquivalentLimitAmt) {
		this.retailEquivalentLimitAmt = retailEquivalentLimitAmt;
	}

	public BigDecimal getRetailLimitAmt() {
		return this.retailLimitAmt;
	}

	public void setRetailLimitAmt(BigDecimal retailLimitAmt) {
		this.retailLimitAmt = retailLimitAmt;
	}

	public String getSmeActSt() {
		return this.smeActSt;
	}

	public void setSmeActSt(String smeActSt) {
		this.smeActSt = smeActSt;
	}

	public String getSmeAddress1() {
		return this.smeAddress1;
	}

	public void setSmeAddress1(String smeAddress1) {
		this.smeAddress1 = smeAddress1;
	}

	public String getSmeAddress1Govrn() {
		return this.smeAddress1Govrn;
	}

	public void setSmeAddress1Govrn(String smeAddress1Govrn) {
		this.smeAddress1Govrn = smeAddress1Govrn;
	}

	public String getSmeAddress2() {
		return this.smeAddress2;
	}

	public void setSmeAddress2(String smeAddress2) {
		this.smeAddress2 = smeAddress2;
	}

	public String getSmeAddress3() {
		return this.smeAddress3;
	}

	public void setSmeAddress3(String smeAddress3) {
		this.smeAddress3 = smeAddress3;
	}

	public BigDecimal getSmeAmtOvrDue() {
		return this.smeAmtOvrDue;
	}

	public void setSmeAmtOvrDue(BigDecimal smeAmtOvrDue) {
		this.smeAmtOvrDue = smeAmtOvrDue;
	}

	public BigDecimal getSmeAprAmt() {
		return this.smeAprAmt;
	}

	public void setSmeAprAmt(BigDecimal smeAprAmt) {
		this.smeAprAmt = smeAprAmt;
	}

	public Date getSmeAprDat() {
		return this.smeAprDat;
	}

	public void setSmeAprDat(Date smeAprDat) {
		this.smeAprDat = smeAprDat;
	}

	public String getSmeBac1() {
		return this.smeBac1;
	}

	public void setSmeBac1(String smeBac1) {
		this.smeBac1 = smeBac1;
	}

	public Date getSmeConExpDat() {
		return this.smeConExpDat;
	}

	public void setSmeConExpDat(Date smeConExpDat) {
		this.smeConExpDat = smeConExpDat;
	}

	public BigDecimal getSmeCountry() {
		return this.smeCountry;
	}

	public void setSmeCountry(BigDecimal smeCountry) {
		this.smeCountry = smeCountry;
	}

	public String getSmeCrdFac() {
		return this.smeCrdFac;
	}

	public void setSmeCrdFac(String smeCrdFac) {
		this.smeCrdFac = smeCrdFac;
	}

	public BigDecimal getSmeCrdFacBal() {
		return this.smeCrdFacBal;
	}

	public void setSmeCrdFacBal(BigDecimal smeCrdFacBal) {
		this.smeCrdFacBal = smeCrdFacBal;
	}

	public BigDecimal getSmeCrdFacTyp() {
		return this.smeCrdFacTyp;
	}

	public void setSmeCrdFacTyp(BigDecimal smeCrdFacTyp) {
		this.smeCrdFacTyp = smeCrdFacTyp;
	}

	public String getSmeCur() {
		return this.smeCur;
	}

	public void setSmeCur(String smeCur) {
		this.smeCur = smeCur;
	}

	public String getSmeDataBrnId() {
		return this.smeDataBrnId;
	}

	public void setSmeDataBrnId(String smeDataBrnId) {
		this.smeDataBrnId = smeDataBrnId;
	}

	public String getSmeFaxNo() {
		return this.smeFaxNo;
	}

	public void setSmeFaxNo(String smeFaxNo) {
		this.smeFaxNo = smeFaxNo;
	}

	public Date getSmeFrsDat() {
		return this.smeFrsDat;
	}

	public void setSmeFrsDat(Date smeFrsDat) {
		this.smeFrsDat = smeFrsDat;
	}

	public String getSmeIdCode1() {
		return this.smeIdCode1;
	}

	public void setSmeIdCode1(String smeIdCode1) {
		this.smeIdCode1 = smeIdCode1;
	}

	public Date getSmeIdExpiryDate1() {
		return this.smeIdExpiryDate1;
	}

	public void setSmeIdExpiryDate1(Date smeIdExpiryDate1) {
		this.smeIdExpiryDate1 = smeIdExpiryDate1;
	}

	public BigDecimal getSmeInsAmt() {
		return this.smeInsAmt;
	}

	public void setSmeInsAmt(BigDecimal smeInsAmt) {
		this.smeInsAmt = smeInsAmt;
	}

	public String getSmeIssuingAuthority1() {
		return this.smeIssuingAuthority1;
	}

	public void setSmeIssuingAuthority1(String smeIssuingAuthority1) {
		this.smeIssuingAuthority1 = smeIssuingAuthority1;
	}

	public String getSmeLegalCons() {
		return this.smeLegalCons;
	}

	public void setSmeLegalCons(String smeLegalCons) {
		this.smeLegalCons = smeLegalCons;
	}

	public BigDecimal getSmeNoDay() {
		return this.smeNoDay;
	}

	public void setSmeNoDay(BigDecimal smeNoDay) {
		this.smeNoDay = smeNoDay;
	}

	public String getSmePCrdFac() {
		return this.smePCrdFac;
	}

	public void setSmePCrdFac(String smePCrdFac) {
		this.smePCrdFac = smePCrdFac;
	}

	public String getSmePDataBrnId() {
		return this.smePDataBrnId;
	}

	public void setSmePDataBrnId(String smePDataBrnId) {
		this.smePDataBrnId = smePDataBrnId;
	}

	public String getSmePhoneNo() {
		return this.smePhoneNo;
	}

	public void setSmePhoneNo(String smePhoneNo) {
		this.smePhoneNo = smePhoneNo;
	}

	public String getSmeRegisteredCountry() {
		return this.smeRegisteredCountry;
	}

	public void setSmeRegisteredCountry(String smeRegisteredCountry) {
		this.smeRegisteredCountry = smeRegisteredCountry;
	}

	public String getSmeRepTyp() {
		return this.smeRepTyp;
	}

	public void setSmeRepTyp(String smeRepTyp) {
		this.smeRepTyp = smeRepTyp;
	}

	public BigDecimal getSmeStartYear() {
		return this.smeStartYear;
	}

	public void setSmeStartYear(BigDecimal smeStartYear) {
		this.smeStartYear = smeStartYear;
	}

	public BigDecimal getSmeSubjectCode() {
		return this.smeSubjectCode;
	}

	public void setSmeSubjectCode(BigDecimal smeSubjectCode) {
		this.smeSubjectCode = smeSubjectCode;
	}

	public String getSmeSubjectName() {
		return this.smeSubjectName;
	}

	public void setSmeSubjectName(String smeSubjectName) {
		this.smeSubjectName = smeSubjectName;
	}

	public String getSmeTrmLon() {
		return this.smeTrmLon;
	}

	public void setSmeTrmLon(String smeTrmLon) {
		this.smeTrmLon = smeTrmLon;
	}

	public String getSmeUrl() {
		return this.smeUrl;
	}

	public void setSmeUrl(String smeUrl) {
		this.smeUrl = smeUrl;
	}

	public String getSubAcct() {
		return this.subAcct;
	}

	public void setSubAcct(String subAcct) {
		this.subAcct = subAcct;
	}

	public BigDecimal getSuspendedInterst() {
		return this.suspendedInterst;
	}

	public void setSuspendedInterst(BigDecimal suspendedInterst) {
		this.suspendedInterst = suspendedInterst;
	}

	public BigDecimal getTypeOfClassifiedLoan() {
		return this.typeOfClassifiedLoan;
	}

	public void setTypeOfClassifiedLoan(BigDecimal typeOfClassifiedLoan) {
		this.typeOfClassifiedLoan = typeOfClassifiedLoan;
	}

	public BigDecimal getUndrawnFlag() {
		return this.undrawnFlag;
	}

	public void setUndrawnFlag(BigDecimal undrawnFlag) {
		this.undrawnFlag = undrawnFlag;
	}

	public BigDecimal getUndrawnLimit() {
		return this.undrawnLimit;
	}

	public void setUndrawnLimit(BigDecimal undrawnLimit) {
		this.undrawnLimit = undrawnLimit;
	}

	public String getWorkPhoneNo() {
		return this.workPhoneNo;
	}

	public void setWorkPhoneNo(String workPhoneNo) {
		this.workPhoneNo = workPhoneNo;
	}

}