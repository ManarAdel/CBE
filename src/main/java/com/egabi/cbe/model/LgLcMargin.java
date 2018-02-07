package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the LG_LC_MARGIN database table.
 * 
 */
@Entity
@Table(name="LG_LC_MARGIN")
@NamedQuery(name="LgLcMargin.findAll", query="SELECT l FROM LgLcMargin l")
public class LgLcMargin implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private LgLcMarginPK id;

	@Column(name="DEAL_NUMBER")
	private String dealNumber;

	@Column(name="FIXED_TYPE")
	private BigDecimal fixedType;

	@Column(name="MARGIN_AMT")
	private BigDecimal marginAmt;

	@Column(name="PRODUCT_CODE")
	private String productCode;

	public LgLcMargin() {
	}

	public LgLcMarginPK getId() {
		return this.id;
	}

	public void setId(LgLcMarginPK id) {
		this.id = id;
	}

	public String getDealNumber() {
		return this.dealNumber;
	}

	public void setDealNumber(String dealNumber) {
		this.dealNumber = dealNumber;
	}

	public BigDecimal getFixedType() {
		return this.fixedType;
	}

	public void setFixedType(BigDecimal fixedType) {
		this.fixedType = fixedType;
	}

	public BigDecimal getMarginAmt() {
		return this.marginAmt;
	}

	public void setMarginAmt(BigDecimal marginAmt) {
		this.marginAmt = marginAmt;
	}

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}