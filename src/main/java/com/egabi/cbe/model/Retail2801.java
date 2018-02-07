package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the RETAIL2801 database table.
 * 
 */
@Entity
@NamedQuery(name="Retail2801.findAll", query="SELECT r FROM Retail2801 r")
public class Retail2801 implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal balance;

	@Temporal(TemporalType.DATE)
	private Date busdate;

	private String currency;

	private String purpose;

	private String security;

	@Column(name="STAF_FLAG")
	private String stafFlag;

	public Retail2801() {
	}

	public BigDecimal getBalance() {
		return this.balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public Date getBusdate() {
		return this.busdate;
	}

	public void setBusdate(Date busdate) {
		this.busdate = busdate;
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getPurpose() {
		return this.purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getSecurity() {
		return this.security;
	}

	public void setSecurity(String security) {
		this.security = security;
	}

	public String getStafFlag() {
		return this.stafFlag;
	}

	public void setStafFlag(String stafFlag) {
		this.stafFlag = stafFlag;
	}

}