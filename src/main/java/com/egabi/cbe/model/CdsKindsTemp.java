package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the CDS_KINDS_TEMP database table.
 * 
 */
@Entity
@Table(name="CDS_KINDS_TEMP")
@NamedQuery(name="CdsKindsTemp.findAll", query="SELECT c FROM CdsKindsTemp c")
public class CdsKindsTemp implements Serializable {
	private static final long serialVersionUID = 1L;
	
		//This Table Doesn't have A PK 
		//Generated Id 
		@Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
	    private Long id;

	private String busdate;

	@Column(name="CD_PERIOD")
	private String cdPeriod;

	@Column(name="PRODUCT_CODE")
	private String productCode;

	@Column(name="PRODUCT_DESC")
	private String productDesc;

	@Column(name="PRODUCT_DESC_AR")
	private String productDescAr;

	private String rates;

	public CdsKindsTemp() {
	}

	public String getBusdate() {
		return this.busdate;
	}

	public void setBusdate(String busdate) {
		this.busdate = busdate;
	}

	public String getCdPeriod() {
		return this.cdPeriod;
	}

	public void setCdPeriod(String cdPeriod) {
		this.cdPeriod = cdPeriod;
	}

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
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

	public String getRates() {
		return this.rates;
	}

	public void setRates(String rates) {
		this.rates = rates;
	}

}