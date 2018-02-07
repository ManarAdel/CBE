package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the RETAIL_FILE_TEMP database table.
 * 
 */
@Entity
@Table(name="RETAIL_FILE_TEMP")
@NamedQuery(name="RetailFileTemp.findAll", query="SELECT r FROM RetailFileTemp r")
public class RetailFileTemp implements Serializable {
	private static final long serialVersionUID = 1L;

	private String balance;

	private String bucket;

	private String busdate;

	@Column(name="CASH_SECURED")
	private String cashSecured;

	@Column(name="OTHERS_SECURED")
	private String othersSecured;

	private String product;

	private String provision;

	public RetailFileTemp() {
	}

	public String getBalance() {
		return this.balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	public String getBucket() {
		return this.bucket;
	}

	public void setBucket(String bucket) {
		this.bucket = bucket;
	}

	public String getBusdate() {
		return this.busdate;
	}

	public void setBusdate(String busdate) {
		this.busdate = busdate;
	}

	public String getCashSecured() {
		return this.cashSecured;
	}

	public void setCashSecured(String cashSecured) {
		this.cashSecured = cashSecured;
	}

	public String getOthersSecured() {
		return this.othersSecured;
	}

	public void setOthersSecured(String othersSecured) {
		this.othersSecured = othersSecured;
	}

	public String getProduct() {
		return this.product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getProvision() {
		return this.provision;
	}

	public void setProvision(String provision) {
		this.provision = provision;
	}

}