package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the CBR_ISCORE_SME_CS database table.
 * 
 */
@Entity
@Table(name="CBR_ISCORE_SME_CS")
@NamedQuery(name="CbrIscoreSmeC.findAll", query="SELECT c FROM CbrIscoreSmeC c")
public class CbrIscoreSmeC implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CbrIscoreSmeCPK id;

	@Column(name="ADDRESS_TYPE")
	private String addressType;

	private String address1;

	@Column(name="ADDRESS1_BOX")
	private String address1Box;

	@Column(name="ADDRESS1_CITY")
	private String address1City;

	@Column(name="ADDRESS1_COUNTRY")
	private String address1Country;

	@Column(name="ADDRESS1_GOVRN")
	private String address1Govrn;

	@Column(name="ADDRESS1_ZIP")
	private String address1Zip;

	private String address2;

	private String address3;

	@Column(name="ARB_ADDRESS1")
	private String arbAddress1;

	@Column(name="ARB_ADDRESS1_CITY")
	private String arbAddress1City;

	@Column(name="ARB_ADDRESS2")
	private String arbAddress2;

	@Column(name="ARB_ADDRESS3")
	private String arbAddress3;

	@Column(name="ARB_PRV_SUBJECT_NAME")
	private String arbPrvSubjectName;

	@Column(name="ARB_REGISTERED_OFFICE_CITY")
	private String arbRegisteredOfficeCity;

	@Column(name="ARB_REGISTERED_OFFICE1")
	private String arbRegisteredOffice1;

	@Column(name="ARB_REGISTERED_OFFICE2")
	private String arbRegisteredOffice2;

	@Column(name="ARB_REGISTERED_OFFICE3")
	private String arbRegisteredOffice3;

	@Column(name="ARB_SHORT_NAME")
	private String arbShortName;

	@Column(name="ARB_SUBJECT_NAME")
	private String arbSubjectName;

	private String bac1;

	private String bac2;

	private String bac3;

	@Column(name="BRANCH_CODE")
	private String branchCode;

	@Column(name="BUREAU_SUBJECT_CODE")
	private String bureauSubjectCode;

	@Column(name="CENTER_CODE")
	private String centerCode;

	@Column(name="CRITERIA_FLAG")
	private BigDecimal criteriaFlag;

	@Column(name="CUSTOMER_CODE")
	private String customerCode;

	@Column(name="CUSTOMER_TYPE")
	private String customerType;

	@Column(name="FAX_NO")
	private String faxNo;

	@Column(name="ID_CODE1")
	private String idCode1;

	@Column(name="ID_CODE2")
	private String idCode2;

	@Column(name="ID_CODE3")
	private String idCode3;

	@Column(name="ID_CODE4")
	private String idCode4;

	@Temporal(TemporalType.DATE)
	@Column(name="ID_EXPIRY_DATE1")
	private Date idExpiryDate1;

	@Temporal(TemporalType.DATE)
	@Column(name="ID_EXPIRY_DATE2")
	private Date idExpiryDate2;

	@Temporal(TemporalType.DATE)
	@Column(name="ID_EXPIRY_DATE3")
	private Date idExpiryDate3;

	@Temporal(TemporalType.DATE)
	@Column(name="ID_EXPIRY_DATE4")
	private Date idExpiryDate4;

	@Column(name="ISSUING_AUTHORITY1")
	private String issuingAuthority1;

	@Column(name="ISSUING_AUTHORITY2")
	private String issuingAuthority2;

	@Column(name="ISSUING_AUTHORITY3")
	private String issuingAuthority3;

	@Column(name="ISSUING_AUTHORITY4")
	private String issuingAuthority4;

	@Column(name="LANGUAGE_ID")
	private String languageId;

	@Column(name="LEGAL_CONS")
	private String legalCons;

	@Column(name="PHONE_NO")
	private String phoneNo;

	@Column(name="PROVIDER_ID")
	private String providerId;

	@Column(name="PRV_SUBJECT_CODE")
	private String prvSubjectCode;

	@Column(name="PRV_SUBJECT_NAME")
	private String prvSubjectName;

	@Column(name="REGISTERED_BOX")
	private String registeredBox;

	@Column(name="REGISTERED_COUNTRY")
	private String registeredCountry;

	@Column(name="REGISTERED_GOVRN")
	private String registeredGovrn;

	@Column(name="REGISTERED_OFFICE_CITY")
	private String registeredOfficeCity;

	@Column(name="REGISTERED_OFFICE1")
	private String registeredOffice1;

	@Column(name="REGISTERED_OFFICE2")
	private String registeredOffice2;

	@Column(name="REGISTERED_OFFICE3")
	private String registeredOffice3;

	@Column(name="REGISTERED_ZIP")
	private String registeredZip;

	@Column(name="SEG_ID")
	private String segId;

	@Column(name="SHORT_NAME")
	private String shortName;

	@Column(name="START_YEAR")
	private BigDecimal startYear;

	@Column(name="SUBJECT_NAME")
	private String subjectName;

	@Column(name="TELEPHONE_AREA_CODE")
	private String telephoneAreaCode;

	private String url;

	public CbrIscoreSmeC() {
	}

	public CbrIscoreSmeCPK getId() {
		return this.id;
	}

	public void setId(CbrIscoreSmeCPK id) {
		this.id = id;
	}

	public String getAddressType() {
		return this.addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public String getAddress1() {
		return this.address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress1Box() {
		return this.address1Box;
	}

	public void setAddress1Box(String address1Box) {
		this.address1Box = address1Box;
	}

	public String getAddress1City() {
		return this.address1City;
	}

	public void setAddress1City(String address1City) {
		this.address1City = address1City;
	}

	public String getAddress1Country() {
		return this.address1Country;
	}

	public void setAddress1Country(String address1Country) {
		this.address1Country = address1Country;
	}

	public String getAddress1Govrn() {
		return this.address1Govrn;
	}

	public void setAddress1Govrn(String address1Govrn) {
		this.address1Govrn = address1Govrn;
	}

	public String getAddress1Zip() {
		return this.address1Zip;
	}

	public void setAddress1Zip(String address1Zip) {
		this.address1Zip = address1Zip;
	}

	public String getAddress2() {
		return this.address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getAddress3() {
		return this.address3;
	}

	public void setAddress3(String address3) {
		this.address3 = address3;
	}

	public String getArbAddress1() {
		return this.arbAddress1;
	}

	public void setArbAddress1(String arbAddress1) {
		this.arbAddress1 = arbAddress1;
	}

	public String getArbAddress1City() {
		return this.arbAddress1City;
	}

	public void setArbAddress1City(String arbAddress1City) {
		this.arbAddress1City = arbAddress1City;
	}

	public String getArbAddress2() {
		return this.arbAddress2;
	}

	public void setArbAddress2(String arbAddress2) {
		this.arbAddress2 = arbAddress2;
	}

	public String getArbAddress3() {
		return this.arbAddress3;
	}

	public void setArbAddress3(String arbAddress3) {
		this.arbAddress3 = arbAddress3;
	}

	public String getArbPrvSubjectName() {
		return this.arbPrvSubjectName;
	}

	public void setArbPrvSubjectName(String arbPrvSubjectName) {
		this.arbPrvSubjectName = arbPrvSubjectName;
	}

	public String getArbRegisteredOfficeCity() {
		return this.arbRegisteredOfficeCity;
	}

	public void setArbRegisteredOfficeCity(String arbRegisteredOfficeCity) {
		this.arbRegisteredOfficeCity = arbRegisteredOfficeCity;
	}

	public String getArbRegisteredOffice1() {
		return this.arbRegisteredOffice1;
	}

	public void setArbRegisteredOffice1(String arbRegisteredOffice1) {
		this.arbRegisteredOffice1 = arbRegisteredOffice1;
	}

	public String getArbRegisteredOffice2() {
		return this.arbRegisteredOffice2;
	}

	public void setArbRegisteredOffice2(String arbRegisteredOffice2) {
		this.arbRegisteredOffice2 = arbRegisteredOffice2;
	}

	public String getArbRegisteredOffice3() {
		return this.arbRegisteredOffice3;
	}

	public void setArbRegisteredOffice3(String arbRegisteredOffice3) {
		this.arbRegisteredOffice3 = arbRegisteredOffice3;
	}

	public String getArbShortName() {
		return this.arbShortName;
	}

	public void setArbShortName(String arbShortName) {
		this.arbShortName = arbShortName;
	}

	public String getArbSubjectName() {
		return this.arbSubjectName;
	}

	public void setArbSubjectName(String arbSubjectName) {
		this.arbSubjectName = arbSubjectName;
	}

	public String getBac1() {
		return this.bac1;
	}

	public void setBac1(String bac1) {
		this.bac1 = bac1;
	}

	public String getBac2() {
		return this.bac2;
	}

	public void setBac2(String bac2) {
		this.bac2 = bac2;
	}

	public String getBac3() {
		return this.bac3;
	}

	public void setBac3(String bac3) {
		this.bac3 = bac3;
	}

	public String getBranchCode() {
		return this.branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	public String getBureauSubjectCode() {
		return this.bureauSubjectCode;
	}

	public void setBureauSubjectCode(String bureauSubjectCode) {
		this.bureauSubjectCode = bureauSubjectCode;
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

	public String getCustomerCode() {
		return this.customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}

	public String getCustomerType() {
		return this.customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public String getFaxNo() {
		return this.faxNo;
	}

	public void setFaxNo(String faxNo) {
		this.faxNo = faxNo;
	}

	public String getIdCode1() {
		return this.idCode1;
	}

	public void setIdCode1(String idCode1) {
		this.idCode1 = idCode1;
	}

	public String getIdCode2() {
		return this.idCode2;
	}

	public void setIdCode2(String idCode2) {
		this.idCode2 = idCode2;
	}

	public String getIdCode3() {
		return this.idCode3;
	}

	public void setIdCode3(String idCode3) {
		this.idCode3 = idCode3;
	}

	public String getIdCode4() {
		return this.idCode4;
	}

	public void setIdCode4(String idCode4) {
		this.idCode4 = idCode4;
	}

	public Date getIdExpiryDate1() {
		return this.idExpiryDate1;
	}

	public void setIdExpiryDate1(Date idExpiryDate1) {
		this.idExpiryDate1 = idExpiryDate1;
	}

	public Date getIdExpiryDate2() {
		return this.idExpiryDate2;
	}

	public void setIdExpiryDate2(Date idExpiryDate2) {
		this.idExpiryDate2 = idExpiryDate2;
	}

	public Date getIdExpiryDate3() {
		return this.idExpiryDate3;
	}

	public void setIdExpiryDate3(Date idExpiryDate3) {
		this.idExpiryDate3 = idExpiryDate3;
	}

	public Date getIdExpiryDate4() {
		return this.idExpiryDate4;
	}

	public void setIdExpiryDate4(Date idExpiryDate4) {
		this.idExpiryDate4 = idExpiryDate4;
	}

	public String getIssuingAuthority1() {
		return this.issuingAuthority1;
	}

	public void setIssuingAuthority1(String issuingAuthority1) {
		this.issuingAuthority1 = issuingAuthority1;
	}

	public String getIssuingAuthority2() {
		return this.issuingAuthority2;
	}

	public void setIssuingAuthority2(String issuingAuthority2) {
		this.issuingAuthority2 = issuingAuthority2;
	}

	public String getIssuingAuthority3() {
		return this.issuingAuthority3;
	}

	public void setIssuingAuthority3(String issuingAuthority3) {
		this.issuingAuthority3 = issuingAuthority3;
	}

	public String getIssuingAuthority4() {
		return this.issuingAuthority4;
	}

	public void setIssuingAuthority4(String issuingAuthority4) {
		this.issuingAuthority4 = issuingAuthority4;
	}

	public String getLanguageId() {
		return this.languageId;
	}

	public void setLanguageId(String languageId) {
		this.languageId = languageId;
	}

	public String getLegalCons() {
		return this.legalCons;
	}

	public void setLegalCons(String legalCons) {
		this.legalCons = legalCons;
	}

	public String getPhoneNo() {
		return this.phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getProviderId() {
		return this.providerId;
	}

	public void setProviderId(String providerId) {
		this.providerId = providerId;
	}

	public String getPrvSubjectCode() {
		return this.prvSubjectCode;
	}

	public void setPrvSubjectCode(String prvSubjectCode) {
		this.prvSubjectCode = prvSubjectCode;
	}

	public String getPrvSubjectName() {
		return this.prvSubjectName;
	}

	public void setPrvSubjectName(String prvSubjectName) {
		this.prvSubjectName = prvSubjectName;
	}

	public String getRegisteredBox() {
		return this.registeredBox;
	}

	public void setRegisteredBox(String registeredBox) {
		this.registeredBox = registeredBox;
	}

	public String getRegisteredCountry() {
		return this.registeredCountry;
	}

	public void setRegisteredCountry(String registeredCountry) {
		this.registeredCountry = registeredCountry;
	}

	public String getRegisteredGovrn() {
		return this.registeredGovrn;
	}

	public void setRegisteredGovrn(String registeredGovrn) {
		this.registeredGovrn = registeredGovrn;
	}

	public String getRegisteredOfficeCity() {
		return this.registeredOfficeCity;
	}

	public void setRegisteredOfficeCity(String registeredOfficeCity) {
		this.registeredOfficeCity = registeredOfficeCity;
	}

	public String getRegisteredOffice1() {
		return this.registeredOffice1;
	}

	public void setRegisteredOffice1(String registeredOffice1) {
		this.registeredOffice1 = registeredOffice1;
	}

	public String getRegisteredOffice2() {
		return this.registeredOffice2;
	}

	public void setRegisteredOffice2(String registeredOffice2) {
		this.registeredOffice2 = registeredOffice2;
	}

	public String getRegisteredOffice3() {
		return this.registeredOffice3;
	}

	public void setRegisteredOffice3(String registeredOffice3) {
		this.registeredOffice3 = registeredOffice3;
	}

	public String getRegisteredZip() {
		return this.registeredZip;
	}

	public void setRegisteredZip(String registeredZip) {
		this.registeredZip = registeredZip;
	}

	public String getSegId() {
		return this.segId;
	}

	public void setSegId(String segId) {
		this.segId = segId;
	}

	public String getShortName() {
		return this.shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public BigDecimal getStartYear() {
		return this.startYear;
	}

	public void setStartYear(BigDecimal startYear) {
		this.startYear = startYear;
	}

	public String getSubjectName() {
		return this.subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getTelephoneAreaCode() {
		return this.telephoneAreaCode;
	}

	public void setTelephoneAreaCode(String telephoneAreaCode) {
		this.telephoneAreaCode = telephoneAreaCode;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}