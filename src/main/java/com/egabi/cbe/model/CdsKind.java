package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the CDS_KINDS database table.
 * 
 */
@Entity
@Table(name="CDS_KINDS")
@NamedQuery(name="CdsKind.findAll", query="SELECT c FROM CdsKind c")
public class CdsKind implements Serializable {
	private static final long serialVersionUID = 1L;

		//This Table Doesn't have A PK 
		//Generated Id 
		@Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
	    private Long id;
		
	@Temporal(TemporalType.DATE)
	private Date busdate;

	@Column(name="CD_PERIOD")
	private BigDecimal cdPeriod;

	@Column(name="PRODUCT_CODE")
	private BigDecimal productCode;

	@Column(name="PRODUCT_DESC")
	private String productDesc;

	@Column(name="PRODUCT_DESC_AR")
	private String productDescAr;

	private BigDecimal rates;

	public CdsKind() {
	}

	public Date getBusdate() {
		return this.busdate;
	}

	public void setBusdate(Date busdate) {
		this.busdate = busdate;
	}

	public BigDecimal getCdPeriod() {
		return this.cdPeriod;
	}

	public void setCdPeriod(BigDecimal cdPeriod) {
		this.cdPeriod = cdPeriod;
	}

	public BigDecimal getProductCode() {
		return this.productCode;
	}

	public void setProductCode(BigDecimal productCode) {
		this.productCode = productCode;
	}

	public String getProductDesc() {
		return this.productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public String getProductDescAr() {
		return this.productDescAr;
	}

	public void setProductDescAr(String productDescAr) {
		this.productDescAr = productDescAr;
	}

	public BigDecimal getRates() {
		return this.rates;
	}

	public void setRates(BigDecimal rates) {
		this.rates = rates;
	}

}