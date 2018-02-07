package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the CBR_ISCORE_CONS_CF database table.
 * 
 */
@Entity
@Table(name="CBR_ISCORE_CONS_CF")
@NamedQuery(name="CbrIscoreConsCf.findAll", query="SELECT c FROM CbrIscoreConsCf c")
public class CbrIscoreConsCf implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CbrIscoreConsCfPK id;

	@Temporal(TemporalType.DATE)
	@Column(name="ACCOUNT_CLOSING_DATE")
	private Date accountClosingDate;

	@Column(name="ACCOUNT_STATUS")
	private String accountStatus;

	@Column(name="AMOUNT_FORGIVEN")
	private String amountForgiven;

	@Column(name="AMOUNT_OF_INSTALLMENT")
	private String amountOfInstallment;

	@Column(name="AMOUNT_OVERDUE")
	private String amountOverdue;

	@Column(name="AMOUNT_WRITTEN_OFF")
	private String amountWrittenOff;

	@Temporal(TemporalType.DATE)
	@Column(name="APPROVAL_DATE")
	private Date approvalDate;

	@Column(name="ASSET_CLASSIFICATION")
	private String assetClassification;

	@Column(name="BRANCH_CODE")
	private String branchCode;

	@Column(name="CENTER_CODE")
	private String centerCode;

	@Temporal(TemporalType.DATE)
	@Column(name="CONSENT_EXPIRY_DATE")
	private Date consentExpiryDate;

	@Column(name="CONSENT_STATUS")
	private String consentStatus;

	private String court;

	@Column(name="COURT_DECREE")
	private String courtDecree;

	@Column(name="COURT_LOCATION")
	private String courtLocation;

	@Column(name="CREDIT_FACILITY_ACC_BAL")
	private String creditFacilityAccBal;

	@Temporal(TemporalType.DATE)
	@Column(name="CREDIT_FACILITY_AMENDMENT_DATE")
	private Date creditFacilityAmendmentDate;

	@Temporal(TemporalType.DATE)
	@Column(name="CREDIT_FACILITY_SETT_DATE")
	private Date creditFacilitySettDate;

	@Column(name="CREDIT_FACILITY_TYPE")
	private String creditFacilityType;

	@Column(name="CREDIT_LIMIT_APPROVAL_AMOUNT")
	private String creditLimitApprovalAmount;

	@Column(name="CRITERIA_FLAG")
	private BigDecimal criteriaFlag;

	private String currency;

	@Column(name="CUSTOMER_CODE")
	private String customerCode;

	@Column(name="CUSTOMER_TYPE")
	private String customerType;

	@Column(name="DATA_PROVIDER_ID")
	private String dataProviderId;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_LATEST_PAYMENT_RECEIVED")
	private Date dateLatestPaymentReceived;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_OF_DECREE")
	private Date dateOfDecree;

	@Column(name="DATE_OF_SUIT")
	private String dateOfSuit;

	@Column(name="DISPUTE_COMPL_INTIMATION_NO")
	private String disputeComplIntimationNo;

	@Column(name="DISPUTE_COMPLAINT_STATUS")
	private String disputeComplaintStatus;

	private String filler;

	@Temporal(TemporalType.DATE)
	@Column(name="FIRST_DISBURSEMENT_DATE")
	private Date firstDisbursementDate;

	@Column(name="HIGHEST_CREDIT")
	private String highestCredit;

	@Column(name="LAST_AMOUNT_PAID")
	private String lastAmountPaid;

	@Column(name="LEGAL_ACTION_ORIGINATOR")
	private String legalActionOriginator;

	@Column(name="LIABILITY_INDICATOR")
	private String liabilityIndicator;

	@Column(name="NO_OF_PAYMENS_INSTAL_OVERDUE")
	private String noOfPaymensInstalOverdue;

	@Column(name="NUMBER_OF_DAYS_PAST_DUE")
	private String numberOfDaysPastDue;

	@Column(name="PREV_CREDIT_FACILITY_ACC_NO")
	private String prevCreditFacilityAccNo;

	@Column(name="PREV_DATA_PROVIDER_BRANCH_ID")
	private String prevDataProviderBranchId;

	@Column(name="PREV_DATA_PROVIDER_ID")
	private String prevDataProviderId;

	@Column(name="PREVIOUS_PRIMARY_CARD_NUMBER")
	private String previousPrimaryCardNumber;

	@Column(name="PRIMARY_CARD_NUMBER")
	private String primaryCardNumber;

	@Column(name="PROTEST_NOTIFICATION")
	private String protestNotification;

	@Temporal(TemporalType.DATE)
	@Column(name="PROTEST_NOTIFICATION_DATE")
	private Date protestNotificationDate;

	@Column(name="REASON_FOR_AMOUNT_FORGIVEN")
	private String reasonForAmountForgiven;

	@Column(name="REASON_FOR_AMOUNT_WRITTEN_OFF")
	private String reasonForAmountWrittenOff;

	@Column(name="REASON_FOR_CLOSURE")
	private String reasonForClosure;

	@Column(name="REPAYMENT_TYPE")
	private String repaymentType;

	@Column(name="SEGMENT_IDEN")
	private String segmentIden;

	@Column(name="SPECIAL_COMMENTS")
	private String specialComments;

	@Column(name="SPECIAL_NOTIFIED_ACCOUNT")
	private String specialNotifiedAccount;

	@Column(name="SUIT_AMOUNT")
	private String suitAmount;

	@Column(name="SUIT_FILED_STATUS")
	private String suitFiledStatus;

	@Column(name="SUIT_REFERENCE_NUMBER")
	private String suitReferenceNumber;

	@Column(name="TERM_OF_LOAN")
	private String termOfLoan;

	@Column(name="TRANSACTION_TYPE_CODE")
	private String transactionTypeCode;

	public CbrIscoreConsCf() {
	}

	public CbrIscoreConsCfPK getId() {
		return this.id;
	}

	public void setId(CbrIscoreConsCfPK id) {
		this.id = id;
	}

	public Date getAccountClosingDate() {
		return this.accountClosingDate;
	}

	public void setAccountClosingDate(Date accountClosingDate) {
		this.accountClosingDate = accountClosingDate;
	}

	public String getAccountStatus() {
		return this.accountStatus;
	}

	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}

	public String getAmountForgiven() {
		return this.amountForgiven;
	}

	public void setAmountForgiven(String amountForgiven) {
		this.amountForgiven = amountForgiven;
	}

	public String getAmountOfInstallment() {
		return this.amountOfInstallment;
	}

	public void setAmountOfInstallment(String amountOfInstallment) {
		this.amountOfInstallment = amountOfInstallment;
	}

	public String getAmountOverdue() {
		return this.amountOverdue;
	}

	public void setAmountOverdue(String amountOverdue) {
		this.amountOverdue = amountOverdue;
	}

	public String getAmountWrittenOff() {
		return this.amountWrittenOff;
	}

	public void setAmountWrittenOff(String amountWrittenOff) {
		this.amountWrittenOff = amountWrittenOff;
	}

	public Date getApprovalDate() {
		return this.approvalDate;
	}

	public void setApprovalDate(Date approvalDate) {
		this.approvalDate = approvalDate;
	}

	public String getAssetClassification() {
		return this.assetClassification;
	}

	public void setAssetClassification(String assetClassification) {
		this.assetClassification = assetClassification;
	}

	public String getBranchCode() {
		return this.branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	public String getCenterCode() {
		return this.centerCode;
	}

	public void setCenterCode(String centerCode) {
		this.centerCode = centerCode;
	}

	public Date getConsentExpiryDate() {
		return this.consentExpiryDate;
	}

	public void setConsentExpiryDate(Date consentExpiryDate) {
		this.consentExpiryDate = consentExpiryDate;
	}

	public String getConsentStatus() {
		return this.consentStatus;
	}

	public void setConsentStatus(String consentStatus) {
		this.consentStatus = consentStatus;
	}

	public String getCourt() {
		return this.court;
	}

	public void setCourt(String court) {
		this.court = court;
	}

	public String getCourtDecree() {
		return this.courtDecree;
	}

	public void setCourtDecree(String courtDecree) {
		this.courtDecree = courtDecree;
	}

	public String getCourtLocation() {
		return this.courtLocation;
	}

	public void setCourtLocation(String courtLocation) {
		this.courtLocation = courtLocation;
	}

	public String getCreditFacilityAccBal() {
		return this.creditFacilityAccBal;
	}

	public void setCreditFacilityAccBal(String creditFacilityAccBal) {
		this.creditFacilityAccBal = creditFacilityAccBal;
	}

	public Date getCreditFacilityAmendmentDate() {
		return this.creditFacilityAmendmentDate;
	}

	public void setCreditFacilityAmendmentDate(Date creditFacilityAmendmentDate) {
		this.creditFacilityAmendmentDate = creditFacilityAmendmentDate;
	}

	public Date getCreditFacilitySettDate() {
		return this.creditFacilitySettDate;
	}

	public void setCreditFacilitySettDate(Date creditFacilitySettDate) {
		this.creditFacilitySettDate = creditFacilitySettDate;
	}

	public String getCreditFacilityType() {
		return this.creditFacilityType;
	}

	public void setCreditFacilityType(String creditFacilityType) {
		this.creditFacilityType = creditFacilityType;
	}

	public String getCreditLimitApprovalAmount() {
		return this.creditLimitApprovalAmount;
	}

	public void setCreditLimitApprovalAmount(String creditLimitApprovalAmount) {
		this.creditLimitApprovalAmount = creditLimitApprovalAmount;
	}

	public BigDecimal getCriteriaFlag() {
		return this.criteriaFlag;
	}

	public void setCriteriaFlag(BigDecimal criteriaFlag) {
		this.criteriaFlag = criteriaFlag;
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
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

	public Date getDateLatestPaymentReceived() {
		return this.dateLatestPaymentReceived;
	}

	public void setDateLatestPaymentReceived(Date dateLatestPaymentReceived) {
		this.dateLatestPaymentReceived = dateLatestPaymentReceived;
	}

	public Date getDateOfDecree() {
		return this.dateOfDecree;
	}

	public void setDateOfDecree(Date dateOfDecree) {
		this.dateOfDecree = dateOfDecree;
	}

	public String getDateOfSuit() {
		return this.dateOfSuit;
	}

	public void setDateOfSuit(String dateOfSuit) {
		this.dateOfSuit = dateOfSuit;
	}

	public String getDisputeComplIntimationNo() {
		return this.disputeComplIntimationNo;
	}

	public void setDisputeComplIntimationNo(String disputeComplIntimationNo) {
		this.disputeComplIntimationNo = disputeComplIntimationNo;
	}

	public String getDisputeComplaintStatus() {
		return this.disputeComplaintStatus;
	}

	public void setDisputeComplaintStatus(String disputeComplaintStatus) {
		this.disputeComplaintStatus = disputeComplaintStatus;
	}

	public String getFiller() {
		return this.filler;
	}

	public void setFiller(String filler) {
		this.filler = filler;
	}

	public Date getFirstDisbursementDate() {
		return this.firstDisbursementDate;
	}

	public void setFirstDisbursementDate(Date firstDisbursementDate) {
		this.firstDisbursementDate = firstDisbursementDate;
	}

	public String getHighestCredit() {
		return this.highestCredit;
	}

	public void setHighestCredit(String highestCredit) {
		this.highestCredit = highestCredit;
	}

	public String getLastAmountPaid() {
		return this.lastAmountPaid;
	}

	public void setLastAmountPaid(String lastAmountPaid) {
		this.lastAmountPaid = lastAmountPaid;
	}

	public String getLegalActionOriginator() {
		return this.legalActionOriginator;
	}

	public void setLegalActionOriginator(String legalActionOriginator) {
		this.legalActionOriginator = legalActionOriginator;
	}

	public String getLiabilityIndicator() {
		return this.liabilityIndicator;
	}

	public void setLiabilityIndicator(String liabilityIndicator) {
		this.liabilityIndicator = liabilityIndicator;
	}

	public String getNoOfPaymensInstalOverdue() {
		return this.noOfPaymensInstalOverdue;
	}

	public void setNoOfPaymensInstalOverdue(String noOfPaymensInstalOverdue) {
		this.noOfPaymensInstalOverdue = noOfPaymensInstalOverdue;
	}

	public String getNumberOfDaysPastDue() {
		return this.numberOfDaysPastDue;
	}

	public void setNumberOfDaysPastDue(String numberOfDaysPastDue) {
		this.numberOfDaysPastDue = numberOfDaysPastDue;
	}

	public String getPrevCreditFacilityAccNo() {
		return this.prevCreditFacilityAccNo;
	}

	public void setPrevCreditFacilityAccNo(String prevCreditFacilityAccNo) {
		this.prevCreditFacilityAccNo = prevCreditFacilityAccNo;
	}

	public String getPrevDataProviderBranchId() {
		return this.prevDataProviderBranchId;
	}

	public void setPrevDataProviderBranchId(String prevDataProviderBranchId) {
		this.prevDataProviderBranchId = prevDataProviderBranchId;
	}

	public String getPrevDataProviderId() {
		return this.prevDataProviderId;
	}

	public void setPrevDataProviderId(String prevDataProviderId) {
		this.prevDataProviderId = prevDataProviderId;
	}

	public String getPreviousPrimaryCardNumber() {
		return this.previousPrimaryCardNumber;
	}

	public void setPreviousPrimaryCardNumber(String previousPrimaryCardNumber) {
		this.previousPrimaryCardNumber = previousPrimaryCardNumber;
	}

	public String getPrimaryCardNumber() {
		return this.primaryCardNumber;
	}

	public void setPrimaryCardNumber(String primaryCardNumber) {
		this.primaryCardNumber = primaryCardNumber;
	}

	public String getProtestNotification() {
		return this.protestNotification;
	}

	public void setProtestNotification(String protestNotification) {
		this.protestNotification = protestNotification;
	}

	public Date getProtestNotificationDate() {
		return this.protestNotificationDate;
	}

	public void setProtestNotificationDate(Date protestNotificationDate) {
		this.protestNotificationDate = protestNotificationDate;
	}

	public String getReasonForAmountForgiven() {
		return this.reasonForAmountForgiven;
	}

	public void setReasonForAmountForgiven(String reasonForAmountForgiven) {
		this.reasonForAmountForgiven = reasonForAmountForgiven;
	}

	public String getReasonForAmountWrittenOff() {
		return this.reasonForAmountWrittenOff;
	}

	public void setReasonForAmountWrittenOff(String reasonForAmountWrittenOff) {
		this.reasonForAmountWrittenOff = reasonForAmountWrittenOff;
	}

	public String getReasonForClosure() {
		return this.reasonForClosure;
	}

	public void setReasonForClosure(String reasonForClosure) {
		this.reasonForClosure = reasonForClosure;
	}

	public String getRepaymentType() {
		return this.repaymentType;
	}

	public void setRepaymentType(String repaymentType) {
		this.repaymentType = repaymentType;
	}

	public String getSegmentIden() {
		return this.segmentIden;
	}

	public void setSegmentIden(String segmentIden) {
		this.segmentIden = segmentIden;
	}

	public String getSpecialComments() {
		return this.specialComments;
	}

	public void setSpecialComments(String specialComments) {
		this.specialComments = specialComments;
	}

	public String getSpecialNotifiedAccount() {
		return this.specialNotifiedAccount;
	}

	public void setSpecialNotifiedAccount(String specialNotifiedAccount) {
		this.specialNotifiedAccount = specialNotifiedAccount;
	}

	public String getSuitAmount() {
		return this.suitAmount;
	}

	public void setSuitAmount(String suitAmount) {
		this.suitAmount = suitAmount;
	}

	public String getSuitFiledStatus() {
		return this.suitFiledStatus;
	}

	public void setSuitFiledStatus(String suitFiledStatus) {
		this.suitFiledStatus = suitFiledStatus;
	}

	public String getSuitReferenceNumber() {
		return this.suitReferenceNumber;
	}

	public void setSuitReferenceNumber(String suitReferenceNumber) {
		this.suitReferenceNumber = suitReferenceNumber;
	}

	public String getTermOfLoan() {
		return this.termOfLoan;
	}

	public void setTermOfLoan(String termOfLoan) {
		this.termOfLoan = termOfLoan;
	}

	public String getTransactionTypeCode() {
		return this.transactionTypeCode;
	}

	public void setTransactionTypeCode(String transactionTypeCode) {
		this.transactionTypeCode = transactionTypeCode;
	}

}