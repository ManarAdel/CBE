package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the CREDIT_RISK_JOINT_GRANTORS database table.
 * 
 */
@Entity
@Table(name="CREDIT_RISK_JOINT_GRANTORS")
@NamedQuery(name="CreditRiskJointGrantor.findAll", query="SELECT c FROM CreditRiskJointGrantor c")
public class CreditRiskJointGrantor implements Serializable {
	private static final long serialVersionUID = 1L;
	
		//This Table Doesn't have A PK 
		//Generated Id 
		@Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
	    private Long id;

	@Temporal(TemporalType.DATE)
	private Date busdate;

	@Column(name="GRANTOR_SINGLE_CBE_CODE")
	private String grantorSingleCbeCode;

	@Column(name="JOINT_ACCOUNT_NUMBER")
	private String jointAccountNumber;

	@Column(name="JOINT_MAPPED_CBE_NO")
	private String jointMappedCbeNo;

	public CreditRiskJointGrantor() {
	}

	public Date getBusdate() {
		return this.busdate;
	}

	public void setBusdate(Date busdate) {
		this.busdate = busdate;
	}

	public String getGrantorSingleCbeCode() {
		return this.grantorSingleCbeCode;
	}

	public void setGrantorSingleCbeCode(String grantorSingleCbeCode) {
		this.grantorSingleCbeCode = grantorSingleCbeCode;
	}

	public String getJointAccountNumber() {
		return this.jointAccountNumber;
	}

	public void setJointAccountNumber(String jointAccountNumber) {
		this.jointAccountNumber = jointAccountNumber;
	}

	public String getJointMappedCbeNo() {
		return this.jointMappedCbeNo;
	}

	public void setJointMappedCbeNo(String jointMappedCbeNo) {
		this.jointMappedCbeNo = jointMappedCbeNo;
	}

}