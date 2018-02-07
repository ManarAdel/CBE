package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the CUST_ACCT_CLOSED_V database table.
 * 
 */
@Entity
@Table(name="CUST_ACCT_CLOSED_V")
@NamedQuery(name="CustAcctClosedV.findAll", query="SELECT c FROM CustAcctClosedV c")
public class CustAcctClosedV implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACCOUNT_BALANCE")
	private BigDecimal accountBalance;

	@Column(name="ACCOUNT_BALANCE_EQU")
	private BigDecimal accountBalanceEqu;

	@Column(name="ACCOUNT_DESC")
	private String accountDesc;

	@Column(name="ACCOUNT_NUMBER")
	private String accountNumber;

	@Temporal(TemporalType.DATE)
	@Column(name="ACCOUNT_OPEN_DATE")
	private Date accountOpenDate;

	@Column(name="ADDRESS1_CITY_E")
	private String address1CityE;

	@Column(name="AMT_OF_CLASSIFIED_LOAN")
	private String amtOfClassifiedLoan;

	@Column(name="ARREARS_PAST_DUE")
	private BigDecimal arrearsPastDue;

	@Column(name="BAL_PAST_DUE")
	private BigDecimal balPastDue;

	@Column(name="BAL_SIGN")
	private String balSign;

	@Column(name="BALANCE_USD")
	private BigDecimal balanceUsd;

	@Column(name="BANK_LOCATION")
	private String bankLocation;

	@Column(name="BANK_SECTOR")
	private String bankSector;

	@Column(name="BBG_NO")
	private String bbgNo;

	@Temporal(TemporalType.DATE)
	@Column(name="BIRTH_DATE")
	private Date birthDate;

	@Column(name="BIRTH_PLACE")
	private String birthPlace;

	@Column(name="BLOCKAGE_STATUS")
	private String blockageStatus;

	@Column(name="BLOCKED_AMT")
	private BigDecimal blockedAmt;

	@Column(name="BRANCH_CODE")
	private String branchCode;

	@Column(name="BRANCH_GOVERNERATE")
	private String branchGovernerate;

	@Temporal(TemporalType.DATE)
	private Date busdate;

	@Column(name="CENTER_CODE")
	private String centerCode;

	@Column(name="CENTER_CODE1")
	private String centerCode1;

	private String class1;

	private String class2;

	private String class3;

	private String class4;

	private String class5;

	@Column(name="CLASSIFICATION_TYPE")
	private String classificationType;

	@Column(name="CLOSE_DATE")
	private String closeDate;

	@Column(name="COUNTRY_OF_RESIDENCE")
	private String countryOfResidence;

	@Column(name="COUNTRY_OF_RESIDENCE_DESCR")
	private String countryOfResidenceDescr;

	@Column(name="CREDIT_INT_RATE")
	private BigDecimal creditIntRate;

	@Column(name="CURRENCY_CODE")
	private String currencyCode;

	@Column(name="CUST_CBE_CODE")
	private String custCbeCode;

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

	@Column(name="DAYS_PAST_DUE")
	private BigDecimal daysPastDue;

	@Column(name="DEAL_NUMBER")
	private String dealNumber;

	@Column(name="DEBIT_INT_RATE")
	private BigDecimal debitIntRate;

	@Column(name="DR_CR")
	private String drCr;

	@Column(name="ECONOMIC_SECTOR")
	private String economicSector;

	private String email;

	@Column(name="EMP_COMPANY_NAME")
	private String empCompanyName;

	@Column(name="ENTITY_LEGAL_TYPE")
	private String entityLegalType;

	@Column(name="EQUIVALENT_LIMIT_AMT")
	private BigDecimal equivalentLimitAmt;

	@Column(name="FAX_NO")
	private String faxNo;

	@Column(name="FEES_PAST_DUE")
	private BigDecimal feesPastDue;

	@Column(name="FROM_TERM")
	private BigDecimal fromTerm;

	@Column(name="FULL_TERM_DAYS")
	private BigDecimal fullTermDays;

	private String gender;

	@Column(name="GENERAL_STATUS")
	private String generalStatus;

	@Column(name="GL_CODE")
	private String glCode;

	@Column(name="GOV_CODE")
	private String govCode;

	@Column(name="GUARANTEE_AMT")
	private BigDecimal guaranteeAmt;

	@Column(name="GUARANTEE_TYPE")
	private String guaranteeType;

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

	@Column(name="INT_BALANCE")
	private BigDecimal intBalance;

	@Column(name="INT_PAST_DUE")
	private BigDecimal intPastDue;

	@Column(name="JOINT_ACCOUNT_INDICATOR")
	private String jointAccountIndicator;

	@Column(name="JOINT_CBE_CODE")
	private String jointCbeCode;

	@Column(name="LAST_AMOUNT_PAID")
	private String lastAmountPaid;

	@Column(name="LAST_PAYMENT_DATE")
	private String lastPaymentDate;

	@Column(name="LIMIT_AMOUNT")
	private BigDecimal limitAmount;

	@Temporal(TemporalType.DATE)
	@Column(name="LIMIT_EXPIRY_DATE")
	private Date limitExpiryDate;

	@Column(name="LN_TERM")
	private String lnTerm;

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
	private String modSecurityPerc;

	private String nationality;

	@Column(name="NL_MAIN_CODE")
	private String nlMainCode;

	@Column(name="NL_SUB_CODE")
	private String nlSubCode;

	@Column(name="NO_OF_INST_PAST_DUE")
	private String noOfInstPastDue;

	@Column(name="NUMBER_OF_DAYS_CBE_50")
	private BigDecimal numberOfDaysCbe50;

	private String occupation;

	@Column(name="PENALTY_PAST_DUE")
	private BigDecimal penaltyPastDue;

	@Column(name="PERFORMANCE_STATUS")
	private String performanceStatus;

	@Column(name="PRINCIPAL_PAST_DUE")
	private BigDecimal principalPastDue;

	@Column(name="PROD_DESCR")
	private String prodDescr;

	@Column(name="PRODUCT_CODE")
	private String productCode;

	@Column(name="PRODUCT_TYPE")
	private String productType;

	@Column(name="REMAIN_TERM_DAYS")
	private BigDecimal remainTermDays;

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

	@Column(name="SANC_CODE")
	private String sancCode;

	@Column(name="SOURCE_TABLE")
	private String sourceTable;

	@Column(name="SUB_ACCOUNT_NO")
	private String subAccountNo;

	@Column(name="SUB_ACCT")
	private String subAcct;

	@Column(name="SUSPENDED_INTERST")
	private String suspendedInterst;

	@Column(name="SYSTEM_NAME")
	private String systemName;

	@Column(name="TD_TERM")
	private String tdTerm;

	@Column(name="TD_TERM_OLD")
	private String tdTermOld;

	@Column(name="TERM_REMAINING")
	private BigDecimal termRemaining;

	@Column(name="TO_TERM")
	private BigDecimal toTerm;

	@Column(name="TYPE_OF_CLASSIFIED_LOAN")
	private String typeOfClassifiedLoan;

	@Column(name="WORK_PHONE_NO")
	private String workPhoneNo;

	public CustAcctClosedV() {
	}

	public BigDecimal getAccountBalance() {
		return this.accountBalance;
	}

	public void setAccountBalance(BigDecimal accountBalance) {
		this.accountBalance = accountBalance;
	}

	public BigDecimal getAccountBalanceEqu() {
		return this.accountBalanceEqu;
	}

	public void setAccountBalanceEqu(BigDecimal accountBalanceEqu) {
		this.accountBalanceEqu = accountBalanceEqu;
	}

	public String getAccountDesc() {
		return this.accountDesc;
	}

	public void setAccountDesc(String accountDesc) {
		this.accountDesc = accountDesc;
	}

	public String getAccountNumber() {
		return this.accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Date getAccountOpenDate() {
		return this.accountOpenDate;
	}

	public void setAccountOpenDate(Date accountOpenDate) {
		this.accountOpenDate = accountOpenDate;
	}

	public String getAddress1CityE() {
		return this.address1CityE;
	}

	public void setAddress1CityE(String address1CityE) {
		this.address1CityE = address1CityE;
	}

	public String getAmtOfClassifiedLoan() {
		return this.amtOfClassifiedLoan;
	}

	public void setAmtOfClassifiedLoan(String amtOfClassifiedLoan) {
		this.amtOfClassifiedLoan = amtOfClassifiedLoan;
	}

	public BigDecimal getArrearsPastDue() {
		return this.arrearsPastDue;
	}

	public void setArrearsPastDue(BigDecimal arrearsPastDue) {
		this.arrearsPastDue = arrearsPastDue;
	}

	public BigDecimal getBalPastDue() {
		return this.balPastDue;
	}

	public void setBalPastDue(BigDecimal balPastDue) {
		this.balPastDue = balPastDue;
	}

	public String getBalSign() {
		return this.balSign;
	}

	public void setBalSign(String balSign) {
		this.balSign = balSign;
	}

	public BigDecimal getBalanceUsd() {
		return this.balanceUsd;
	}

	public void setBalanceUsd(BigDecimal balanceUsd) {
		this.balanceUsd = balanceUsd;
	}

	public String getBankLocation() {
		return this.bankLocation;
	}

	public void setBankLocation(String bankLocation) {
		this.bankLocation = bankLocation;
	}

	public String getBankSector() {
		return this.bankSector;
	}

	public void setBankSector(String bankSector) {
		this.bankSector = bankSector;
	}

	public String getBbgNo() {
		return this.bbgNo;
	}

	public void setBbgNo(String bbgNo) {
		this.bbgNo = bbgNo;
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

	public String getBlockageStatus() {
		return this.blockageStatus;
	}

	public void setBlockageStatus(String blockageStatus) {
		this.blockageStatus = blockageStatus;
	}

	public BigDecimal getBlockedAmt() {
		return this.blockedAmt;
	}

	public void setBlockedAmt(BigDecimal blockedAmt) {
		this.blockedAmt = blockedAmt;
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

	public String getCenterCode1() {
		return this.centerCode1;
	}

	public void setCenterCode1(String centerCode1) {
		this.centerCode1 = centerCode1;
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

	public String getClassificationType() {
		return this.classificationType;
	}

	public void setClassificationType(String classificationType) {
		this.classificationType = classificationType;
	}

	public String getCloseDate() {
		return this.closeDate;
	}

	public void setCloseDate(String closeDate) {
		this.closeDate = closeDate;
	}

	public String getCountryOfResidence() {
		return this.countryOfResidence;
	}

	public void setCountryOfResidence(String countryOfResidence) {
		this.countryOfResidence = countryOfResidence;
	}

	public String getCountryOfResidenceDescr() {
		return this.countryOfResidenceDescr;
	}

	public void setCountryOfResidenceDescr(String countryOfResidenceDescr) {
		this.countryOfResidenceDescr = countryOfResidenceDescr;
	}

	public BigDecimal getCreditIntRate() {
		return this.creditIntRate;
	}

	public void setCreditIntRate(BigDecimal creditIntRate) {
		this.creditIntRate = creditIntRate;
	}

	public String getCurrencyCode() {
		return this.currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public String getCustCbeCode() {
		return this.custCbeCode;
	}

	public void setCustCbeCode(String custCbeCode) {
		this.custCbeCode = custCbeCode;
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

	public BigDecimal getDaysPastDue() {
		return this.daysPastDue;
	}

	public void setDaysPastDue(BigDecimal daysPastDue) {
		this.daysPastDue = daysPastDue;
	}

	public String getDealNumber() {
		return this.dealNumber;
	}

	public void setDealNumber(String dealNumber) {
		this.dealNumber = dealNumber;
	}

	public BigDecimal getDebitIntRate() {
		return this.debitIntRate;
	}

	public void setDebitIntRate(BigDecimal debitIntRate) {
		this.debitIntRate = debitIntRate;
	}

	public String getDrCr() {
		return this.drCr;
	}

	public void setDrCr(String drCr) {
		this.drCr = drCr;
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

	public BigDecimal getEquivalentLimitAmt() {
		return this.equivalentLimitAmt;
	}

	public void setEquivalentLimitAmt(BigDecimal equivalentLimitAmt) {
		this.equivalentLimitAmt = equivalentLimitAmt;
	}

	public String getFaxNo() {
		return this.faxNo;
	}

	public void setFaxNo(String faxNo) {
		this.faxNo = faxNo;
	}

	public BigDecimal getFeesPastDue() {
		return this.feesPastDue;
	}

	public void setFeesPastDue(BigDecimal feesPastDue) {
		this.feesPastDue = feesPastDue;
	}

	public BigDecimal getFromTerm() {
		return this.fromTerm;
	}

	public void setFromTerm(BigDecimal fromTerm) {
		this.fromTerm = fromTerm;
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

	public String getGeneralStatus() {
		return this.generalStatus;
	}

	public void setGeneralStatus(String generalStatus) {
		this.generalStatus = generalStatus;
	}

	public String getGlCode() {
		return this.glCode;
	}

	public void setGlCode(String glCode) {
		this.glCode = glCode;
	}

	public String getGovCode() {
		return this.govCode;
	}

	public void setGovCode(String govCode) {
		this.govCode = govCode;
	}

	public BigDecimal getGuaranteeAmt() {
		return this.guaranteeAmt;
	}

	public void setGuaranteeAmt(BigDecimal guaranteeAmt) {
		this.guaranteeAmt = guaranteeAmt;
	}

	public String getGuaranteeType() {
		return this.guaranteeType;
	}

	public void setGuaranteeType(String guaranteeType) {
		this.guaranteeType = guaranteeType;
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

	public BigDecimal getIntBalance() {
		return this.intBalance;
	}

	public void setIntBalance(BigDecimal intBalance) {
		this.intBalance = intBalance;
	}

	public BigDecimal getIntPastDue() {
		return this.intPastDue;
	}

	public void setIntPastDue(BigDecimal intPastDue) {
		this.intPastDue = intPastDue;
	}

	public String getJointAccountIndicator() {
		return this.jointAccountIndicator;
	}

	public void setJointAccountIndicator(String jointAccountIndicator) {
		this.jointAccountIndicator = jointAccountIndicator;
	}

	public String getJointCbeCode() {
		return this.jointCbeCode;
	}

	public void setJointCbeCode(String jointCbeCode) {
		this.jointCbeCode = jointCbeCode;
	}

	public String getLastAmountPaid() {
		return this.lastAmountPaid;
	}

	public void setLastAmountPaid(String lastAmountPaid) {
		this.lastAmountPaid = lastAmountPaid;
	}

	public String getLastPaymentDate() {
		return this.lastPaymentDate;
	}

	public void setLastPaymentDate(String lastPaymentDate) {
		this.lastPaymentDate = lastPaymentDate;
	}

	public BigDecimal getLimitAmount() {
		return this.limitAmount;
	}

	public void setLimitAmount(BigDecimal limitAmount) {
		this.limitAmount = limitAmount;
	}

	public Date getLimitExpiryDate() {
		return this.limitExpiryDate;
	}

	public void setLimitExpiryDate(Date limitExpiryDate) {
		this.limitExpiryDate = limitExpiryDate;
	}

	public String getLnTerm() {
		return this.lnTerm;
	}

	public void setLnTerm(String lnTerm) {
		this.lnTerm = lnTerm;
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

	public String getModSecurityPerc() {
		return this.modSecurityPerc;
	}

	public void setModSecurityPerc(String modSecurityPerc) {
		this.modSecurityPerc = modSecurityPerc;
	}

	public String getNationality() {
		return this.nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getNlMainCode() {
		return this.nlMainCode;
	}

	public void setNlMainCode(String nlMainCode) {
		this.nlMainCode = nlMainCode;
	}

	public String getNlSubCode() {
		return this.nlSubCode;
	}

	public void setNlSubCode(String nlSubCode) {
		this.nlSubCode = nlSubCode;
	}

	public String getNoOfInstPastDue() {
		return this.noOfInstPastDue;
	}

	public void setNoOfInstPastDue(String noOfInstPastDue) {
		this.noOfInstPastDue = noOfInstPastDue;
	}

	public BigDecimal getNumberOfDaysCbe50() {
		return this.numberOfDaysCbe50;
	}

	public void setNumberOfDaysCbe50(BigDecimal numberOfDaysCbe50) {
		this.numberOfDaysCbe50 = numberOfDaysCbe50;
	}

	public String getOccupation() {
		return this.occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public BigDecimal getPenaltyPastDue() {
		return this.penaltyPastDue;
	}

	public void setPenaltyPastDue(BigDecimal penaltyPastDue) {
		this.penaltyPastDue = penaltyPastDue;
	}

	public String getPerformanceStatus() {
		return this.performanceStatus;
	}

	public void setPerformanceStatus(String performanceStatus) {
		this.performanceStatus = performanceStatus;
	}

	public BigDecimal getPrincipalPastDue() {
		return this.principalPastDue;
	}

	public void setPrincipalPastDue(BigDecimal principalPastDue) {
		this.principalPastDue = principalPastDue;
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

	public String getProductType() {
		return this.productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public BigDecimal getRemainTermDays() {
		return this.remainTermDays;
	}

	public void setRemainTermDays(BigDecimal remainTermDays) {
		this.remainTermDays = remainTermDays;
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

	public String getSancCode() {
		return this.sancCode;
	}

	public void setSancCode(String sancCode) {
		this.sancCode = sancCode;
	}

	public String getSourceTable() {
		return this.sourceTable;
	}

	public void setSourceTable(String sourceTable) {
		this.sourceTable = sourceTable;
	}

	public String getSubAccountNo() {
		return this.subAccountNo;
	}

	public void setSubAccountNo(String subAccountNo) {
		this.subAccountNo = subAccountNo;
	}

	public String getSubAcct() {
		return this.subAcct;
	}

	public void setSubAcct(String subAcct) {
		this.subAcct = subAcct;
	}

	public String getSuspendedInterst() {
		return this.suspendedInterst;
	}

	public void setSuspendedInterst(String suspendedInterst) {
		this.suspendedInterst = suspendedInterst;
	}

	public String getSystemName() {
		return this.systemName;
	}

	public void setSystemName(String systemName) {
		this.systemName = systemName;
	}

	public String getTdTerm() {
		return this.tdTerm;
	}

	public void setTdTerm(String tdTerm) {
		this.tdTerm = tdTerm;
	}

	public String getTdTermOld() {
		return this.tdTermOld;
	}

	public void setTdTermOld(String tdTermOld) {
		this.tdTermOld = tdTermOld;
	}

	public BigDecimal getTermRemaining() {
		return this.termRemaining;
	}

	public void setTermRemaining(BigDecimal termRemaining) {
		this.termRemaining = termRemaining;
	}

	public BigDecimal getToTerm() {
		return this.toTerm;
	}

	public void setToTerm(BigDecimal toTerm) {
		this.toTerm = toTerm;
	}

	public String getTypeOfClassifiedLoan() {
		return this.typeOfClassifiedLoan;
	}

	public void setTypeOfClassifiedLoan(String typeOfClassifiedLoan) {
		this.typeOfClassifiedLoan = typeOfClassifiedLoan;
	}

	public String getWorkPhoneNo() {
		return this.workPhoneNo;
	}

	public void setWorkPhoneNo(String workPhoneNo) {
		this.workPhoneNo = workPhoneNo;
	}

}