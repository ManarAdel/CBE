package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the CDS_TRANSACTION database table.
 * 
 */
@Entity
@Table(name="CDS_TRANSACTION")
@NamedQuery(name="CdsTransaction.findAll", query="SELECT c FROM CdsTransaction c")
public class CdsTransaction implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CURRENCY_CODE")
	private String currencyCode;

	@Column(name="PRODUCT_CODE")
	private String productCode;

	private BigDecimal refund;

	private String trancode;

	private String typ;

	public CdsTransaction() {
	}

	public String getCurrencyCode() {
		return this.currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public BigDecimal getRefund() {
		return this.refund;
	}

	public void setRefund(BigDecimal refund) {
		this.refund = refund;
	}

	public String getTrancode() {
		return this.trancode;
	}

	public void setTrancode(String trancode) {
		this.trancode = trancode;
	}

	public String getTyp() {
		return this.typ;
	}

	public void setTyp(String typ) {
		this.typ = typ;
	}

}