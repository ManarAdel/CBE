package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the CORPORATE_LIMITS_V_MASTER database table.
 * 
 */
@Entity
@Table(name="CORPORATE_LIMITS_V_MASTER")
@NamedQuery(name="CorporateLimitsVMaster.findAll", query="SELECT c FROM CorporateLimitsVMaster c")
public class CorporateLimitsVMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ADDRESS1_CITY_E")
	private String address1CityE;

	@Column(name="BBG_NO")
	private String bbgNo;

	@Temporal(TemporalType.DATE)
	@Column(name="BIRTH_DATE")
	private Date birthDate;

	@Column(name="BIRTH_PLACE")
	private String birthPlace;

	@Column(name="BRANCH_CODE")
	private String branchCode;

	@Temporal(TemporalType.DATE)
	private Date busdate;

	@Column(name="CENTER_CODE")
	private String centerCode;

	@Column(name="COL_NUMBER")
	private String colNumber;

	@Column(name="COUNTRY_OF_RESIDENCE")
	private String countryOfResidence;

	private String cur;

	@Column(name="CURRENCY_CODE")
	private String currencyCode;

	@Temporal(TemporalType.DATE)
	@Column(name="CUST_BUSDATE")
	private Date custBusdate;

	@Column(name="CUST_CBE_CODE")
	private String custCbeCode;

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

	@Column(name="ECONOMIC_SECTOR")
	private String economicSector;

	private String email;

	@Column(name="EMP_COMPANY")
	private String empCompany;

	@Column(name="EMP_COMPANY_NAME")
	private String empCompanyName;

	@Column(name="ENTITY_LEGAL_TYPE")
	private String entityLegalType;

	private String gender;

	private String gl;

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

	@Column(name="MAILING_ADDRESS_1")
	private String mailingAddress1;

	@Column(name="MAILING_ADDRESS_2")
	private String mailingAddress2;

	@Column(name="MAILING_ADDRESS_3")
	private String mailingAddress3;

	@Column(name="MAIN_TOTAL_UTILIZATILN")
	private String mainTotalUtilizatiln;

	@Column(name="MOBILE_NO")
	private String mobileNo;

	@Column(name="MOD_FACILITY_ACCOUNT")
	private String modFacilityAccount;

	private String nationality;

	@Temporal(TemporalType.DATE)
	@Column(name="NTL_ID_EXPIRY_DATE")
	private Date ntlIdExpiryDate;

	@Temporal(TemporalType.DATE)
	@Column(name="NTL_ID_ISSUE_DATE")
	private Date ntlIdIssueDate;

	@Column(name="NTL_ID_ISSUE_PLACE")
	private String ntlIdIssuePlace;

	private String occupation;

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

	@Column(name="SAN_CODE")
	private String sanCode;

	@Column(name="SAN_LIMIT")
	private String sanLimit;

	@Column(name="SANC_CODE")
	private String sancCode;

	private String sub;

	@Column(name="SUBS_TOTAL_UTILIZATILN")
	private String subsTotalUtilizatiln;

	@Column(name="UNDRAWN_LIMIT")
	private String undrawnLimit;

	@Column(name="WORK_PHONE_NO")
	private String workPhoneNo;

	public CorporateLimitsVMaster() {
	}

	public String getAddress1CityE() {
		return this.address1CityE;
	}

	public void setAddress1CityE(String address1CityE) {
		this.address1CityE = address1CityE;
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

	public String getColNumber() {
		return this.colNumber;
	}

	public void setColNumber(String colNumber) {
		this.colNumber = colNumber;
	}

	public String getCountryOfResidence() {
		return this.countryOfResidence;
	}

	public void setCountryOfResidence(String countryOfResidence) {
		this.countryOfResidence = countryOfResidence;
	}

	public String getCur() {
		return this.cur;
	}

	public void setCur(String cur) {
		this.cur = cur;
	}

	public String getCurrencyCode() {
		return this.currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public Date getCustBusdate() {
		return this.custBusdate;
	}

	public void setCustBusdate(Date custBusdate) {
		this.custBusdate = custBusdate;
	}

	public String getCustCbeCode() {
		return this.custCbeCode;
	}

	public void setCustCbeCode(String custCbeCode) {
		this.custCbeCode = custCbeCode;
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

	public String getEmpCompany() {
		return this.empCompany;
	}

	public void setEmpCompany(String empCompany) {
		this.empCompany = empCompany;
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

	public String getGl() {
		return this.gl;
	}

	public void setGl(String gl) {
		this.gl = gl;
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

	public String getMainTotalUtilizatiln() {
		return this.mainTotalUtilizatiln;
	}

	public void setMainTotalUtilizatiln(String mainTotalUtilizatiln) {
		this.mainTotalUtilizatiln = mainTotalUtilizatiln;
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

	public String getNationality() {
		return this.nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public Date getNtlIdExpiryDate() {
		return this.ntlIdExpiryDate;
	}

	public void setNtlIdExpiryDate(Date ntlIdExpiryDate) {
		this.ntlIdExpiryDate = ntlIdExpiryDate;
	}

	public Date getNtlIdIssueDate() {
		return this.ntlIdIssueDate;
	}

	public void setNtlIdIssueDate(Date ntlIdIssueDate) {
		this.ntlIdIssueDate = ntlIdIssueDate;
	}

	public String getNtlIdIssuePlace() {
		return this.ntlIdIssuePlace;
	}

	public void setNtlIdIssuePlace(String ntlIdIssuePlace) {
		this.ntlIdIssuePlace = ntlIdIssuePlace;
	}

	public String getOccupation() {
		return this.occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
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

	public String getSanCode() {
		return this.sanCode;
	}

	public void setSanCode(String sanCode) {
		this.sanCode = sanCode;
	}

	public String getSanLimit() {
		return this.sanLimit;
	}

	public void setSanLimit(String sanLimit) {
		this.sanLimit = sanLimit;
	}

	public String getSancCode() {
		return this.sancCode;
	}

	public void setSancCode(String sancCode) {
		this.sancCode = sancCode;
	}

	public String getSub() {
		return this.sub;
	}

	public void setSub(String sub) {
		this.sub = sub;
	}

	public String getSubsTotalUtilizatiln() {
		return this.subsTotalUtilizatiln;
	}

	public void setSubsTotalUtilizatiln(String subsTotalUtilizatiln) {
		this.subsTotalUtilizatiln = subsTotalUtilizatiln;
	}

	public String getUndrawnLimit() {
		return this.undrawnLimit;
	}

	public void setUndrawnLimit(String undrawnLimit) {
		this.undrawnLimit = undrawnLimit;
	}

	public String getWorkPhoneNo() {
		return this.workPhoneNo;
	}

	public void setWorkPhoneNo(String workPhoneNo) {
		this.workPhoneNo = workPhoneNo;
	}

}