//package com.egabi.cbe.model;
//
//import java.io.Serializable;
//import javax.persistence.*;
//
//
///**
// * The persistent class for the SUSPENDED_INTERST_V_MASTER database table.
// * 
// */
//@Entity
//@Table(name="SUSPENDED_INTERST_V_MASTER")
//@NamedQuery(name="SuspendedInterstVMaster.findAll", query="SELECT s FROM SuspendedInterstVMaster s")
//public class SuspendedInterstVMaster implements Serializable {
//	private static final long serialVersionUID = 1L;
//	
//	//This Table Doesn't have A PK 
//	//Generated Id 
//	@Id
//    @GeneratedValue(strategy=GenerationType.IDENTITY)
//    private Long id;
//	
//
//	@Column(name="ADDRESS1_CITY_E")
//	private Object address1CityE;
//
//	@Column(name="BBG_NO")
//	private Object bbgNo;
//
//	@Column(name="BIRTH_DATE")
//	private Object birthDate;
//
//	@Column(name="BIRTH_PLACE")
//	private Object birthPlace;
//
//	@Column(name="BRANCH_CODE")
//	private Object branchCode;
//
//	private Object busdate;
//
//	@Column(name="CENTER_CODE")
//	private Object centerCode;
//
//	@Column(name="COUNTRY_OF_RESIDENCE")
//	private Object countryOfResidence;
//
//	@Column(name="CUST_BUSDATE")
//	private Object custBusdate;
//
//	@Column(name="CUST_CBE_CODE")
//	private Object custCbeCode;
//
//	@Column(name="CUST_NO")
//	private Object custNo;
//
//	@Column(name="CUSTOMER_CODE")
//	private Object customerCode;
//
//	@Column(name="CUSTOMER_FIRST_NAME_A")
//	private Object customerFirstNameA;
//
//	@Column(name="CUSTOMER_FIRST_NAME_E")
//	private Object customerFirstNameE;
//
//	@Column(name="CUSTOMER_LAST_NAME_A")
//	private Object customerLastNameA;
//
//	@Column(name="CUSTOMER_LAST_NAME_E")
//	private Object customerLastNameE;
//
//	@Column(name="CUSTOMER_MIDDLE_NAME_A")
//	private Object customerMiddleNameA;
//
//	@Column(name="CUSTOMER_MIDDLE_NAME_E")
//	private Object customerMiddleNameE;
//
//	@Column(name="CUSTOMER_NAME_A")
//	private Object customerNameA;
//
//	@Column(name="CUSTOMER_NAME_E")
//	private Object customerNameE;
//
//	@Column(name="CUSTOMER_SEGMENT")
//	private Object customerSegment;
//
//	@Column(name="CUSTOMER_TYPE")
//	private Object customerType;
//
//	@Column(name="ECONOMIC_SECTOR")
//	private Object economicSector;
//
//	private Object email;
//
//	@Column(name="EMP_COMPANY")
//	private Object empCompany;
//
//	@Column(name="EMP_COMPANY_NAME")
//	private Object empCompanyName;
//
//	@Column(name="ENTITY_LEGAL_TYPE")
//	private Object entityLegalType;
//
//	private Object gender;
//
//	@Column(name="HOME_PHONE_NO")
//	private Object homePhoneNo;
//
//	@Column(name="ID_EXPIRY")
//	private Object idExpiry;
//
//	@Column(name="ID_ISSUE_DATE")
//	private Object idIssueDate;
//
//	@Column(name="ID_ISSUE_PLACE")
//	private Object idIssuePlace;
//
//	@Column(name="ID_NO")
//	private Object idNo;
//
//	@Column(name="ID_TYPE")
//	private Object idType;
//
//	@Column(name="INDUSTRY_CODE")
//	private Object industryCode;
//
//	@Column(name="MAILING_ADDRESS_1")
//	private Object mailingAddress1;
//
//	@Column(name="MAILING_ADDRESS_2")
//	private Object mailingAddress2;
//
//	@Column(name="MAILING_ADDRESS_3")
//	private Object mailingAddress3;
//
//	@Column(name="MOBILE_NO")
//	private Object mobileNo;
//
//	private Object nationality;
//
//	@Column(name="NTL_ID_EXPIRY_DATE")
//	private Object ntlIdExpiryDate;
//
//	@Column(name="NTL_ID_ISSUE_DATE")
//	private Object ntlIdIssueDate;
//
//	@Column(name="NTL_ID_ISSUE_PLACE")
//	private Object ntlIdIssuePlace;
//
//	private Object occupation;
//
//	@Column(name="RESERVE_DATE")
//	private Object reserveDate;
//
//	@Column(name="RESERVE_EQUIV")
//	private Object reserveEquiv;
//
//	@Column(name="RESIDENT_ADDRESS_1")
//	private Object residentAddress1;
//
//	@Column(name="RESIDENT_ADDRESS_2")
//	private Object residentAddress2;
//
//	@Column(name="RESIDENT_ADDRESS_3")
//	private Object residentAddress3;
//
//	@Column(name="RESIDENT_ADDRESS_4")
//	private Object residentAddress4;
//
//	@Column(name="RESIDENT_ADDRESS_5")
//	private Object residentAddress5;
//
//	@Column(name="SANC_CODE")
//	private Object sancCode;
//
//	@Column(name="SMI_BAL_EQUIV")
//	private Object smiBalEquiv;
//
//	@Column(name="WORK_PHONE_NO")
//	private Object workPhoneNo;
//
//	public SuspendedInterstVMaster() {
//	}
//
//	public Object getAddress1CityE() {
//		return this.address1CityE;
//	}
//
//	public void setAddress1CityE(Object address1CityE) {
//		this.address1CityE = address1CityE;
//	}
//
//	public Object getBbgNo() {
//		return this.bbgNo;
//	}
//
//	public void setBbgNo(Object bbgNo) {
//		this.bbgNo = bbgNo;
//	}
//
//	public Object getBirthDate() {
//		return this.birthDate;
//	}
//
//	public void setBirthDate(Object birthDate) {
//		this.birthDate = birthDate;
//	}
//
//	public Object getBirthPlace() {
//		return this.birthPlace;
//	}
//
//	public void setBirthPlace(Object birthPlace) {
//		this.birthPlace = birthPlace;
//	}
//
//	public Object getBranchCode() {
//		return this.branchCode;
//	}
//
//	public void setBranchCode(Object branchCode) {
//		this.branchCode = branchCode;
//	}
//
//	public Object getBusdate() {
//		return this.busdate;
//	}
//
//	public void setBusdate(Object busdate) {
//		this.busdate = busdate;
//	}
//
//	public Object getCenterCode() {
//		return this.centerCode;
//	}
//
//	public void setCenterCode(Object centerCode) {
//		this.centerCode = centerCode;
//	}
//
//	public Object getCountryOfResidence() {
//		return this.countryOfResidence;
//	}
//
//	public void setCountryOfResidence(Object countryOfResidence) {
//		this.countryOfResidence = countryOfResidence;
//	}
//
//	public Object getCustBusdate() {
//		return this.custBusdate;
//	}
//
//	public void setCustBusdate(Object custBusdate) {
//		this.custBusdate = custBusdate;
//	}
//
//	public Object getCustCbeCode() {
//		return this.custCbeCode;
//	}
//
//	public void setCustCbeCode(Object custCbeCode) {
//		this.custCbeCode = custCbeCode;
//	}
//
//	public Object getCustNo() {
//		return this.custNo;
//	}
//
//	public void setCustNo(Object custNo) {
//		this.custNo = custNo;
//	}
//
//	public Object getCustomerCode() {
//		return this.customerCode;
//	}
//
//	public void setCustomerCode(Object customerCode) {
//		this.customerCode = customerCode;
//	}
//
//	public Object getCustomerFirstNameA() {
//		return this.customerFirstNameA;
//	}
//
//	public void setCustomerFirstNameA(Object customerFirstNameA) {
//		this.customerFirstNameA = customerFirstNameA;
//	}
//
//	public Object getCustomerFirstNameE() {
//		return this.customerFirstNameE;
//	}
//
//	public void setCustomerFirstNameE(Object customerFirstNameE) {
//		this.customerFirstNameE = customerFirstNameE;
//	}
//
//	public Object getCustomerLastNameA() {
//		return this.customerLastNameA;
//	}
//
//	public void setCustomerLastNameA(Object customerLastNameA) {
//		this.customerLastNameA = customerLastNameA;
//	}
//
//	public Object getCustomerLastNameE() {
//		return this.customerLastNameE;
//	}
//
//	public void setCustomerLastNameE(Object customerLastNameE) {
//		this.customerLastNameE = customerLastNameE;
//	}
//
//	public Object getCustomerMiddleNameA() {
//		return this.customerMiddleNameA;
//	}
//
//	public void setCustomerMiddleNameA(Object customerMiddleNameA) {
//		this.customerMiddleNameA = customerMiddleNameA;
//	}
//
//	public Object getCustomerMiddleNameE() {
//		return this.customerMiddleNameE;
//	}
//
//	public void setCustomerMiddleNameE(Object customerMiddleNameE) {
//		this.customerMiddleNameE = customerMiddleNameE;
//	}
//
//	public Object getCustomerNameA() {
//		return this.customerNameA;
//	}
//
//	public void setCustomerNameA(Object customerNameA) {
//		this.customerNameA = customerNameA;
//	}
//
//	public Object getCustomerNameE() {
//		return this.customerNameE;
//	}
//
//	public void setCustomerNameE(Object customerNameE) {
//		this.customerNameE = customerNameE;
//	}
//
//	public Object getCustomerSegment() {
//		return this.customerSegment;
//	}
//
//	public void setCustomerSegment(Object customerSegment) {
//		this.customerSegment = customerSegment;
//	}
//
//	public Object getCustomerType() {
//		return this.customerType;
//	}
//
//	public void setCustomerType(Object customerType) {
//		this.customerType = customerType;
//	}
//
//	public Object getEconomicSector() {
//		return this.economicSector;
//	}
//
//	public void setEconomicSector(Object economicSector) {
//		this.economicSector = economicSector;
//	}
//
//	public Object getEmail() {
//		return this.email;
//	}
//
//	public void setEmail(Object email) {
//		this.email = email;
//	}
//
//	public Object getEmpCompany() {
//		return this.empCompany;
//	}
//
//	public void setEmpCompany(Object empCompany) {
//		this.empCompany = empCompany;
//	}
//
//	public Object getEmpCompanyName() {
//		return this.empCompanyName;
//	}
//
//	public void setEmpCompanyName(Object empCompanyName) {
//		this.empCompanyName = empCompanyName;
//	}
//
//	public Object getEntityLegalType() {
//		return this.entityLegalType;
//	}
//
//	public void setEntityLegalType(Object entityLegalType) {
//		this.entityLegalType = entityLegalType;
//	}
//
//	public Object getGender() {
//		return this.gender;
//	}
//
//	public void setGender(Object gender) {
//		this.gender = gender;
//	}
//
//	public Object getHomePhoneNo() {
//		return this.homePhoneNo;
//	}
//
//	public void setHomePhoneNo(Object homePhoneNo) {
//		this.homePhoneNo = homePhoneNo;
//	}
//
//	public Object getIdExpiry() {
//		return this.idExpiry;
//	}
//
//	public void setIdExpiry(Object idExpiry) {
//		this.idExpiry = idExpiry;
//	}
//
//	public Object getIdIssueDate() {
//		return this.idIssueDate;
//	}
//
//	public void setIdIssueDate(Object idIssueDate) {
//		this.idIssueDate = idIssueDate;
//	}
//
//	public Object getIdIssuePlace() {
//		return this.idIssuePlace;
//	}
//
//	public void setIdIssuePlace(Object idIssuePlace) {
//		this.idIssuePlace = idIssuePlace;
//	}
//
//	public Object getIdNo() {
//		return this.idNo;
//	}
//
//	public void setIdNo(Object idNo) {
//		this.idNo = idNo;
//	}
//
//	public Object getIdType() {
//		return this.idType;
//	}
//
//	public void setIdType(Object idType) {
//		this.idType = idType;
//	}
//
//	public Object getIndustryCode() {
//		return this.industryCode;
//	}
//
//	public void setIndustryCode(Object industryCode) {
//		this.industryCode = industryCode;
//	}
//
//	public Object getMailingAddress1() {
//		return this.mailingAddress1;
//	}
//
//	public void setMailingAddress1(Object mailingAddress1) {
//		this.mailingAddress1 = mailingAddress1;
//	}
//
//	public Object getMailingAddress2() {
//		return this.mailingAddress2;
//	}
//
//	public void setMailingAddress2(Object mailingAddress2) {
//		this.mailingAddress2 = mailingAddress2;
//	}
//
//	public Object getMailingAddress3() {
//		return this.mailingAddress3;
//	}
//
//	public void setMailingAddress3(Object mailingAddress3) {
//		this.mailingAddress3 = mailingAddress3;
//	}
//
//	public Object getMobileNo() {
//		return this.mobileNo;
//	}
//
//	public void setMobileNo(Object mobileNo) {
//		this.mobileNo = mobileNo;
//	}
//
//	public Object getNationality() {
//		return this.nationality;
//	}
//
//	public void setNationality(Object nationality) {
//		this.nationality = nationality;
//	}
//
//	public Object getNtlIdExpiryDate() {
//		return this.ntlIdExpiryDate;
//	}
//
//	public void setNtlIdExpiryDate(Object ntlIdExpiryDate) {
//		this.ntlIdExpiryDate = ntlIdExpiryDate;
//	}
//
//	public Object getNtlIdIssueDate() {
//		return this.ntlIdIssueDate;
//	}
//
//	public void setNtlIdIssueDate(Object ntlIdIssueDate) {
//		this.ntlIdIssueDate = ntlIdIssueDate;
//	}
//
//	public Object getNtlIdIssuePlace() {
//		return this.ntlIdIssuePlace;
//	}
//
//	public void setNtlIdIssuePlace(Object ntlIdIssuePlace) {
//		this.ntlIdIssuePlace = ntlIdIssuePlace;
//	}
//
//	public Object getOccupation() {
//		return this.occupation;
//	}
//
//	public void setOccupation(Object occupation) {
//		this.occupation = occupation;
//	}
//
//	public Object getReserveDate() {
//		return this.reserveDate;
//	}
//
//	public void setReserveDate(Object reserveDate) {
//		this.reserveDate = reserveDate;
//	}
//
//	public Object getReserveEquiv() {
//		return this.reserveEquiv;
//	}
//
//	public void setReserveEquiv(Object reserveEquiv) {
//		this.reserveEquiv = reserveEquiv;
//	}
//
//	public Object getResidentAddress1() {
//		return this.residentAddress1;
//	}
//
//	public void setResidentAddress1(Object residentAddress1) {
//		this.residentAddress1 = residentAddress1;
//	}
//
//	public Object getResidentAddress2() {
//		return this.residentAddress2;
//	}
//
//	public void setResidentAddress2(Object residentAddress2) {
//		this.residentAddress2 = residentAddress2;
//	}
//
//	public Object getResidentAddress3() {
//		return this.residentAddress3;
//	}
//
//	public void setResidentAddress3(Object residentAddress3) {
//		this.residentAddress3 = residentAddress3;
//	}
//
//	public Object getResidentAddress4() {
//		return this.residentAddress4;
//	}
//
//	public void setResidentAddress4(Object residentAddress4) {
//		this.residentAddress4 = residentAddress4;
//	}
//
//	public Object getResidentAddress5() {
//		return this.residentAddress5;
//	}
//
//	public void setResidentAddress5(Object residentAddress5) {
//		this.residentAddress5 = residentAddress5;
//	}
//
//	public Object getSancCode() {
//		return this.sancCode;
//	}
//
//	public void setSancCode(Object sancCode) {
//		this.sancCode = sancCode;
//	}
//
//	public Object getSmiBalEquiv() {
//		return this.smiBalEquiv;
//	}
//
//	public void setSmiBalEquiv(Object smiBalEquiv) {
//		this.smiBalEquiv = smiBalEquiv;
//	}
//
//	public Object getWorkPhoneNo() {
//		return this.workPhoneNo;
//	}
//
//	public void setWorkPhoneNo(Object workPhoneNo) {
//		this.workPhoneNo = workPhoneNo;
//	}
//
//}