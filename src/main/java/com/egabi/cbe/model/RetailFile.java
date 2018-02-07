package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the RETAIL_FILE database table.
 * 
 */
@Entity
@Table(name="RETAIL_FILE")
@NamedQuery(name="RetailFile.findAll", query="SELECT r FROM RetailFile r")
public class RetailFile implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal balance;

	private String bucket;

	@Temporal(TemporalType.DATE)
	private Date busdate;

	@Column(name="CASH_SECURED")
	private BigDecimal cashSecured;

	@Column(name="OTHERS_SECURED")
	private BigDecimal othersSecured;

	private String product;

	private BigDecimal provision;

	public RetailFile() {
	}

	public BigDecimal getBalance() {
		return this.balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public String getBucket() {
		return this.bucket;
	}

	public void setBucket(String bucket) {
		this.bucket = bucket;
	}

	public Date getBusdate() {
		return this.busdate;
	}

	public void setBusdate(Date busdate) {
		this.busdate = busdate;
	}

	public BigDecimal getCashSecured() {
		return this.cashSecured;
	}

	public void setCashSecured(BigDecimal cashSecured) {
		this.cashSecured = cashSecured;
	}

	public BigDecimal getOthersSecured() {
		return this.othersSecured;
	}

	public void setOthersSecured(BigDecimal othersSecured) {
		this.othersSecured = othersSecured;
	}

	public String getProduct() {
		return this.product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public BigDecimal getProvision() {
		return this.provision;
	}

	public void setProvision(BigDecimal provision) {
		this.provision = provision;
	}

}