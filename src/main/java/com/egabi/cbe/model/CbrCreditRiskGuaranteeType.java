package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the CBR_CREDIT_RISK_GUARANTEE_TYPE database table.
 * 
 */
@Entity
@Table(name="CBR_CREDIT_RISK_GUARANTEE_TYPE")
@NamedQuery(name="CbrCreditRiskGuaranteeType.findAll", query="SELECT c FROM CbrCreditRiskGuaranteeType c")
public class CbrCreditRiskGuaranteeType implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CbrCreditRiskGuaranteeTypePK id;

	public CbrCreditRiskGuaranteeType() {
	}

	public CbrCreditRiskGuaranteeTypePK getId() {
		return this.id;
	}

	public void setId(CbrCreditRiskGuaranteeTypePK id) {
		this.id = id;
	}

}