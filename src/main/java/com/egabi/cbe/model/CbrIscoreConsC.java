package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the CBR_ISCORE_CONS_CS database table.
 * 
 */
@Entity
@Table(name="CBR_ISCORE_CONS_CS")
@NamedQuery(name="CbrIscoreConsC.findAll", query="SELECT c FROM CbrIscoreConsC c")
public class CbrIscoreConsC implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CbrIscoreConsCPK id;

	@Column(name="ADDRES_2_LINE_1_ARABIC")
	private String addres2Line1Arabic;

	@Column(name="ADDRES_2_LINE_2_ENGLISH")
	private String addres2Line2English;

	@Column(name="ADDRES_2_LINE_3_ARABIC")
	private String addres2Line3Arabic;

	@Column(name="ADDRESS_1_CITY_ARABIC")
	private String address1CityArabic;

	@Column(name="ADDRESS_1_CITY_ENGLISH")
	private String address1CityEnglish;

	@Column(name="ADDRESS_1_COUNTRY")
	private String address1Country;

	@Column(name="ADDRESS_1_GOVERNORATE_CODE")
	private String address1GovernorateCode;

	@Column(name="ADDRESS_1_LINE_1_ARABIC")
	private String address1Line1Arabic;

	@Column(name="ADDRESS_1_LINE_1_ENGLISH")
	private String address1Line1English;

	@Column(name="ADDRESS_1_LINE_2_ARABIC")
	private String address1Line2Arabic;

	@Column(name="ADDRESS_1_LINE_2_ENGLISH")
	private String address1Line2English;

	@Column(name="ADDRESS_1_LINE_3_ARABIC")
	private String address1Line3Arabic;

	@Column(name="ADDRESS_1_LINE_3_ENGLISH")
	private String address1Line3English;

	@Column(name="ADDRESS_1_PO_BOX_NO")
	private String address1PoBoxNo;

	@Column(name="ADDRESS_1_TYPE")
	private String address1Type;

	@Column(name="ADDRESS_1_ZIP_CODE")
	private String address1ZipCode;

	@Column(name="ADDRESS_2_CITY_ARABIC")
	private String address2CityArabic;

	@Column(name="ADDRESS_2_CITY_ENGLISH")
	private String address2CityEnglish;

	@Column(name="ADDRESS_2_COUNTRY")
	private String address2Country;

	@Column(name="ADDRESS_2_GOVERNORATE_CODE")
	private String address2GovernorateCode;

	@Column(name="ADDRESS_2_LINE_1_ENGLISH")
	private String address2Line1English;

	@Column(name="ADDRESS_2_LINE_2_ARABIC")
	private String address2Line2Arabic;

	@Column(name="ADDRESS_2_LINE_3_ENGLISH")
	private String address2Line3English;

	@Column(name="ADDRESS_2_PO_BOX_NO")
	private String address2PoBoxNo;

	@Column(name="ADDRESS_2_TYPE")
	private String address2Type;

	@Column(name="ADDRESS_2_ZIP_CODE")
	private String address2ZipCode;

	@Column(name="BRANCH_CODE")
	private String branchCode;

	@Column(name="BUREAU_SUBJECT_CODE")
	private String bureauSubjectCode;

	@Column(name="BUSINESS_ENTITY_NAME_ARABIC")
	private String businessEntityNameArabic;

	@Column(name="BUSINESS_ENTITY_NAME_ENGLISH")
	private String businessEntityNameEnglish;

	@Column(name="CENTER_CODE")
	private String centerCode;

	private String citizenship;

	@Column(name="CRITERIA_FLAG")
	private BigDecimal criteriaFlag;

	@Column(name="CUSTOMER_CODE")
	private String customerCode;

	@Column(name="CUSTOMER_TYPE")
	private String customerType;

	@Column(name="DATA_PROVIDER_ID")
	private String dataProviderId;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_OF_BIRTH")
	private Date dateOfBirth;

	@Column(name="E_MAIL_ID")
	private String eMailId;

	@Column(name="EMPLOYER_NAME_ARABIC")
	private String employerNameArabic;

	@Column(name="EMPLOYER_NAME_ENGLISH")
	private String employerNameEnglish;

	@Column(name="EMPLOYMENT_COMMERCIAL_REGIS_ID")
	private String employmentCommercialRegisId;

	private String gender;

	@Column(name="IDEN_CODE_1")
	private String idenCode1;

	@Temporal(TemporalType.DATE)
	@Column(name="IDEN_CODE_1_EXPIRY_DATE")
	private Date idenCode1ExpiryDate;

	@Column(name="IDEN_CODE_2")
	private String idenCode2;

	@Temporal(TemporalType.DATE)
	@Column(name="IDEN_CODE_2_EXPIRY_DATE")
	private Date idenCode2ExpiryDate;

	@Column(name="IDEN_CODE_3")
	private String idenCode3;

	@Temporal(TemporalType.DATE)
	@Column(name="IDEN_CODE_3_EXPIRY_DATE")
	private Date idenCode3ExpiryDate;

	@Column(name="ISSUING_AUTHORITY_1")
	private String issuingAuthority1;

	@Column(name="ISSUING_AUTORITY_2")
	private String issuingAutority2;

	@Column(name="ISSUING_AUTORITY_3")
	private String issuingAutority3;

	@Column(name="LANGUAGE_ID")
	private String languageId;

	@Column(name="MARITAL_STATUS")
	private String maritalStatus;

	private String mobile;

	@Column(name="NATIONAL_ID")
	private String nationalId;

	private String occupation;

	@Column(name="PREV_DATA_PROVIDER_IDEN_CODE")
	private String prevDataProviderIdenCode;

	@Column(name="PREV_FNAME_OF_SUBJECT_ARABIC")
	private String prevFnameOfSubjectArabic;

	@Column(name="PREV_LNAME_OF_SUBJECT_ARABIC")
	private String prevLnameOfSubjectArabic;

	@Column(name="PREV_MNAME_OF_SUBJECT_ARABIC")
	private String prevMnameOfSubjectArabic;

	@Column(name="PREVIOUS_FNAME_OF_SUBJECT_ENG")
	private String previousFnameOfSubjectEng;

	@Column(name="PREVIOUS_LNAME_OF_SUBJECT_ENG")
	private String previousLnameOfSubjectEng;

	@Column(name="PREVIOUS_MNAME_OF_SUBJECT_ENG")
	private String previousMnameOfSubjectEng;

	@Column(name="RESIDENCE_PHONE")
	private String residencePhone;

	@Column(name="SEGMENT_IDEN")
	private String segmentIden;

	@Column(name="SUBJECT_FIRST_NAME_ARABIC")
	private String subjectFirstNameArabic;

	@Column(name="SUBJECT_FIRST_NAME_ENGLSH")
	private String subjectFirstNameEnglsh;

	@Column(name="SUBJECT_LAST_NAME_ARABIC")
	private String subjectLastNameArabic;

	@Column(name="SUBJECT_LAST_NAME_ENGLISH")
	private String subjectLastNameEnglish;

	@Column(name="SUBJECT_MIDDLE_NAME_ARABIC")
	private String subjectMiddleNameArabic;

	@Column(name="SUBJECT_MIDDLE_NAME_ENGLISH")
	private String subjectMiddleNameEnglish;

	@Column(name="TELEPHONE_AREA_CODE")
	private String telephoneAreaCode;

	public CbrIscoreConsC() {
	}

	public CbrIscoreConsCPK getId() {
		return this.id;
	}

	public void setId(CbrIscoreConsCPK id) {
		this.id = id;
	}

	public String getAddres2Line1Arabic() {
		return this.addres2Line1Arabic;
	}

	public void setAddres2Line1Arabic(String addres2Line1Arabic) {
		this.addres2Line1Arabic = addres2Line1Arabic;
	}

	public String getAddres2Line2English() {
		return this.addres2Line2English;
	}

	public void setAddres2Line2English(String addres2Line2English) {
		this.addres2Line2English = addres2Line2English;
	}

	public String getAddres2Line3Arabic() {
		return this.addres2Line3Arabic;
	}

	public void setAddres2Line3Arabic(String addres2Line3Arabic) {
		this.addres2Line3Arabic = addres2Line3Arabic;
	}

	public String getAddress1CityArabic() {
		return this.address1CityArabic;
	}

	public void setAddress1CityArabic(String address1CityArabic) {
		this.address1CityArabic = address1CityArabic;
	}

	public String getAddress1CityEnglish() {
		return this.address1CityEnglish;
	}

	public void setAddress1CityEnglish(String address1CityEnglish) {
		this.address1CityEnglish = address1CityEnglish;
	}

	public String getAddress1Country() {
		return this.address1Country;
	}

	public void setAddress1Country(String address1Country) {
		this.address1Country = address1Country;
	}

	public String getAddress1GovernorateCode() {
		return this.address1GovernorateCode;
	}

	public void setAddress1GovernorateCode(String address1GovernorateCode) {
		this.address1GovernorateCode = address1GovernorateCode;
	}

	public String getAddress1Line1Arabic() {
		return this.address1Line1Arabic;
	}

	public void setAddress1Line1Arabic(String address1Line1Arabic) {
		this.address1Line1Arabic = address1Line1Arabic;
	}

	public String getAddress1Line1English() {
		return this.address1Line1English;
	}

	public void setAddress1Line1English(String address1Line1English) {
		this.address1Line1English = address1Line1English;
	}

	public String getAddress1Line2Arabic() {
		return this.address1Line2Arabic;
	}

	public void setAddress1Line2Arabic(String address1Line2Arabic) {
		this.address1Line2Arabic = address1Line2Arabic;
	}

	public String getAddress1Line2English() {
		return this.address1Line2English;
	}

	public void setAddress1Line2English(String address1Line2English) {
		this.address1Line2English = address1Line2English;
	}

	public String getAddress1Line3Arabic() {
		return this.address1Line3Arabic;
	}

	public void setAddress1Line3Arabic(String address1Line3Arabic) {
		this.address1Line3Arabic = address1Line3Arabic;
	}

	public String getAddress1Line3English() {
		return this.address1Line3English;
	}

	public void setAddress1Line3English(String address1Line3English) {
		this.address1Line3English = address1Line3English;
	}

	public String getAddress1PoBoxNo() {
		return this.address1PoBoxNo;
	}

	public void setAddress1PoBoxNo(String address1PoBoxNo) {
		this.address1PoBoxNo = address1PoBoxNo;
	}

	public String getAddress1Type() {
		return this.address1Type;
	}

	public void setAddress1Type(String address1Type) {
		this.address1Type = address1Type;
	}

	public String getAddress1ZipCode() {
		return this.address1ZipCode;
	}

	public void setAddress1ZipCode(String address1ZipCode) {
		this.address1ZipCode = address1ZipCode;
	}

	public String getAddress2CityArabic() {
		return this.address2CityArabic;
	}

	public void setAddress2CityArabic(String address2CityArabic) {
		this.address2CityArabic = address2CityArabic;
	}

	public String getAddress2CityEnglish() {
		return this.address2CityEnglish;
	}

	public void setAddress2CityEnglish(String address2CityEnglish) {
		this.address2CityEnglish = address2CityEnglish;
	}

	public String getAddress2Country() {
		return this.address2Country;
	}

	public void setAddress2Country(String address2Country) {
		this.address2Country = address2Country;
	}

	public String getAddress2GovernorateCode() {
		return this.address2GovernorateCode;
	}

	public void setAddress2GovernorateCode(String address2GovernorateCode) {
		this.address2GovernorateCode = address2GovernorateCode;
	}

	public String getAddress2Line1English() {
		return this.address2Line1English;
	}

	public void setAddress2Line1English(String address2Line1English) {
		this.address2Line1English = address2Line1English;
	}

	public String getAddress2Line2Arabic() {
		return this.address2Line2Arabic;
	}

	public void setAddress2Line2Arabic(String address2Line2Arabic) {
		this.address2Line2Arabic = address2Line2Arabic;
	}

	public String getAddress2Line3English() {
		return this.address2Line3English;
	}

	public void setAddress2Line3English(String address2Line3English) {
		this.address2Line3English = address2Line3English;
	}

	public String getAddress2PoBoxNo() {
		return this.address2PoBoxNo;
	}

	public void setAddress2PoBoxNo(String address2PoBoxNo) {
		this.address2PoBoxNo = address2PoBoxNo;
	}

	public String getAddress2Type() {
		return this.address2Type;
	}

	public void setAddress2Type(String address2Type) {
		this.address2Type = address2Type;
	}

	public String getAddress2ZipCode() {
		return this.address2ZipCode;
	}

	public void setAddress2ZipCode(String address2ZipCode) {
		this.address2ZipCode = address2ZipCode;
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

	public String getBusinessEntityNameArabic() {
		return this.businessEntityNameArabic;
	}

	public void setBusinessEntityNameArabic(String businessEntityNameArabic) {
		this.businessEntityNameArabic = businessEntityNameArabic;
	}

	public String getBusinessEntityNameEnglish() {
		return this.businessEntityNameEnglish;
	}

	public void setBusinessEntityNameEnglish(String businessEntityNameEnglish) {
		this.businessEntityNameEnglish = businessEntityNameEnglish;
	}

	public String getCenterCode() {
		return this.centerCode;
	}

	public void setCenterCode(String centerCode) {
		this.centerCode = centerCode;
	}

	public String getCitizenship() {
		return this.citizenship;
	}

	public void setCitizenship(String citizenship) {
		this.citizenship = citizenship;
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

	public String getDataProviderId() {
		return this.dataProviderId;
	}

	public void setDataProviderId(String dataProviderId) {
		this.dataProviderId = dataProviderId;
	}

	public Date getDateOfBirth() {
		return this.dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getEMailId() {
		return this.eMailId;
	}

	public void setEMailId(String eMailId) {
		this.eMailId = eMailId;
	}

	public String getEmployerNameArabic() {
		return this.employerNameArabic;
	}

	public void setEmployerNameArabic(String employerNameArabic) {
		this.employerNameArabic = employerNameArabic;
	}

	public String getEmployerNameEnglish() {
		return this.employerNameEnglish;
	}

	public void setEmployerNameEnglish(String employerNameEnglish) {
		this.employerNameEnglish = employerNameEnglish;
	}

	public String getEmploymentCommercialRegisId() {
		return this.employmentCommercialRegisId;
	}

	public void setEmploymentCommercialRegisId(String employmentCommercialRegisId) {
		this.employmentCommercialRegisId = employmentCommercialRegisId;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getIdenCode1() {
		return this.idenCode1;
	}

	public void setIdenCode1(String idenCode1) {
		this.idenCode1 = idenCode1;
	}

	public Date getIdenCode1ExpiryDate() {
		return this.idenCode1ExpiryDate;
	}

	public void setIdenCode1ExpiryDate(Date idenCode1ExpiryDate) {
		this.idenCode1ExpiryDate = idenCode1ExpiryDate;
	}

	public String getIdenCode2() {
		return this.idenCode2;
	}

	public void setIdenCode2(String idenCode2) {
		this.idenCode2 = idenCode2;
	}

	public Date getIdenCode2ExpiryDate() {
		return this.idenCode2ExpiryDate;
	}

	public void setIdenCode2ExpiryDate(Date idenCode2ExpiryDate) {
		this.idenCode2ExpiryDate = idenCode2ExpiryDate;
	}

	public String getIdenCode3() {
		return this.idenCode3;
	}

	public void setIdenCode3(String idenCode3) {
		this.idenCode3 = idenCode3;
	}

	public Date getIdenCode3ExpiryDate() {
		return this.idenCode3ExpiryDate;
	}

	public void setIdenCode3ExpiryDate(Date idenCode3ExpiryDate) {
		this.idenCode3ExpiryDate = idenCode3ExpiryDate;
	}

	public String getIssuingAuthority1() {
		return this.issuingAuthority1;
	}

	public void setIssuingAuthority1(String issuingAuthority1) {
		this.issuingAuthority1 = issuingAuthority1;
	}

	public String getIssuingAutority2() {
		return this.issuingAutority2;
	}

	public void setIssuingAutority2(String issuingAutority2) {
		this.issuingAutority2 = issuingAutority2;
	}

	public String getIssuingAutority3() {
		return this.issuingAutority3;
	}

	public void setIssuingAutority3(String issuingAutority3) {
		this.issuingAutority3 = issuingAutority3;
	}

	public String getLanguageId() {
		return this.languageId;
	}

	public void setLanguageId(String languageId) {
		this.languageId = languageId;
	}

	public String getMaritalStatus() {
		return this.maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getNationalId() {
		return this.nationalId;
	}

	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}

	public String getOccupation() {
		return this.occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getPrevDataProviderIdenCode() {
		return this.prevDataProviderIdenCode;
	}

	public void setPrevDataProviderIdenCode(String prevDataProviderIdenCode) {
		this.prevDataProviderIdenCode = prevDataProviderIdenCode;
	}

	public String getPrevFnameOfSubjectArabic() {
		return this.prevFnameOfSubjectArabic;
	}

	public void setPrevFnameOfSubjectArabic(String prevFnameOfSubjectArabic) {
		this.prevFnameOfSubjectArabic = prevFnameOfSubjectArabic;
	}

	public String getPrevLnameOfSubjectArabic() {
		return this.prevLnameOfSubjectArabic;
	}

	public void setPrevLnameOfSubjectArabic(String prevLnameOfSubjectArabic) {
		this.prevLnameOfSubjectArabic = prevLnameOfSubjectArabic;
	}

	public String getPrevMnameOfSubjectArabic() {
		return this.prevMnameOfSubjectArabic;
	}

	public void setPrevMnameOfSubjectArabic(String prevMnameOfSubjectArabic) {
		this.prevMnameOfSubjectArabic = prevMnameOfSubjectArabic;
	}

	public String getPreviousFnameOfSubjectEng() {
		return this.previousFnameOfSubjectEng;
	}

	public void setPreviousFnameOfSubjectEng(String previousFnameOfSubjectEng) {
		this.previousFnameOfSubjectEng = previousFnameOfSubjectEng;
	}

	public String getPreviousLnameOfSubjectEng() {
		return this.previousLnameOfSubjectEng;
	}

	public void setPreviousLnameOfSubjectEng(String previousLnameOfSubjectEng) {
		this.previousLnameOfSubjectEng = previousLnameOfSubjectEng;
	}

	public String getPreviousMnameOfSubjectEng() {
		return this.previousMnameOfSubjectEng;
	}

	public void setPreviousMnameOfSubjectEng(String previousMnameOfSubjectEng) {
		this.previousMnameOfSubjectEng = previousMnameOfSubjectEng;
	}

	public String getResidencePhone() {
		return this.residencePhone;
	}

	public void setResidencePhone(String residencePhone) {
		this.residencePhone = residencePhone;
	}

	public String getSegmentIden() {
		return this.segmentIden;
	}

	public void setSegmentIden(String segmentIden) {
		this.segmentIden = segmentIden;
	}

	public String getSubjectFirstNameArabic() {
		return this.subjectFirstNameArabic;
	}

	public void setSubjectFirstNameArabic(String subjectFirstNameArabic) {
		this.subjectFirstNameArabic = subjectFirstNameArabic;
	}

	public String getSubjectFirstNameEnglsh() {
		return this.subjectFirstNameEnglsh;
	}

	public void setSubjectFirstNameEnglsh(String subjectFirstNameEnglsh) {
		this.subjectFirstNameEnglsh = subjectFirstNameEnglsh;
	}

	public String getSubjectLastNameArabic() {
		return this.subjectLastNameArabic;
	}

	public void setSubjectLastNameArabic(String subjectLastNameArabic) {
		this.subjectLastNameArabic = subjectLastNameArabic;
	}

	public String getSubjectLastNameEnglish() {
		return this.subjectLastNameEnglish;
	}

	public void setSubjectLastNameEnglish(String subjectLastNameEnglish) {
		this.subjectLastNameEnglish = subjectLastNameEnglish;
	}

	public String getSubjectMiddleNameArabic() {
		return this.subjectMiddleNameArabic;
	}

	public void setSubjectMiddleNameArabic(String subjectMiddleNameArabic) {
		this.subjectMiddleNameArabic = subjectMiddleNameArabic;
	}

	public String getSubjectMiddleNameEnglish() {
		return this.subjectMiddleNameEnglish;
	}

	public void setSubjectMiddleNameEnglish(String subjectMiddleNameEnglish) {
		this.subjectMiddleNameEnglish = subjectMiddleNameEnglish;
	}

	public String getTelephoneAreaCode() {
		return this.telephoneAreaCode;
	}

	public void setTelephoneAreaCode(String telephoneAreaCode) {
		this.telephoneAreaCode = telephoneAreaCode;
	}

}