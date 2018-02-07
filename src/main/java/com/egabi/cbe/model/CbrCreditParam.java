package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the CBR_CREDIT_PARAM database table.
 * 
 */
@Entity
@Table(name="CBR_CREDIT_PARAM")
@NamedQuery(name="CbrCreditParam.findAll", query="SELECT c FROM CbrCreditParam c")
public class CbrCreditParam implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CbrCreditParamPK id;

	@Column(name="ALL_DEBT_PRODUCTS")
	private BigDecimal allDebtProducts;

	@Column(name="NO_DAYS_DUE")
	private BigDecimal noDaysDue;

	@Column(name="TOTAL_FAC")
	private BigDecimal totalFac;

	//bi-directional many-to-one association to CbrCreditParamDetail
	@OneToMany(mappedBy="cbrCreditParam")
	private List<CbrCreditParamDetail> cbrCreditParamDetails;

	public CbrCreditParam() {
	}

	public CbrCreditParamPK getId() {
		return this.id;
	}

	public void setId(CbrCreditParamPK id) {
		this.id = id;
	}

	public BigDecimal getAllDebtProducts() {
		return this.allDebtProducts;
	}

	public void setAllDebtProducts(BigDecimal allDebtProducts) {
		this.allDebtProducts = allDebtProducts;
	}

	public BigDecimal getNoDaysDue() {
		return this.noDaysDue;
	}

	public void setNoDaysDue(BigDecimal noDaysDue) {
		this.noDaysDue = noDaysDue;
	}

	public BigDecimal getTotalFac() {
		return this.totalFac;
	}

	public void setTotalFac(BigDecimal totalFac) {
		this.totalFac = totalFac;
	}

	public List<CbrCreditParamDetail> getCbrCreditParamDetails() {
		return this.cbrCreditParamDetails;
	}

	public void setCbrCreditParamDetails(List<CbrCreditParamDetail> cbrCreditParamDetails) {
		this.cbrCreditParamDetails = cbrCreditParamDetails;
	}

	public CbrCreditParamDetail addCbrCreditParamDetail(CbrCreditParamDetail cbrCreditParamDetail) {
		getCbrCreditParamDetails().add(cbrCreditParamDetail);
		cbrCreditParamDetail.setCbrCreditParam(this);

		return cbrCreditParamDetail;
	}

	public CbrCreditParamDetail removeCbrCreditParamDetail(CbrCreditParamDetail cbrCreditParamDetail) {
		getCbrCreditParamDetails().remove(cbrCreditParamDetail);
		cbrCreditParamDetail.setCbrCreditParam(null);

		return cbrCreditParamDetail;
	}

}