package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the CBR_CREDIT_PARAM_DETAIL database table.
 * 
 */
@Entity
@Table(name="CBR_CREDIT_PARAM_DETAIL")
@NamedQuery(name="CbrCreditParamDetail.findAll", query="SELECT c FROM CbrCreditParamDetail c")
public class CbrCreditParamDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CbrCreditParamDetailPK id;

	//bi-directional many-to-one association to CbrCreditParam
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="CBR_TYPE", referencedColumnName="CBR_TYPE", insertable = false , updatable = false),
		@JoinColumn(name="POT_ACT_FLAG", referencedColumnName="POT_ACT_FLAG", insertable = false , updatable = false)
		})
	private CbrCreditParam cbrCreditParam;

	public CbrCreditParamDetail() {
	}

	public CbrCreditParamDetailPK getId() {
		return this.id;
	}

	public void setId(CbrCreditParamDetailPK id) {
		this.id = id;
	}

	public CbrCreditParam getCbrCreditParam() {
		return this.cbrCreditParam;
	}

	public void setCbrCreditParam(CbrCreditParam cbrCreditParam) {
		this.cbrCreditParam = cbrCreditParam;
	}

}