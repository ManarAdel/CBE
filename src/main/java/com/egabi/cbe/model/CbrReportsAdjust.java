package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the CBR_REPORTS_ADJUST database table.
 * 
 */
@Entity
@Table(name="CBR_REPORTS_ADJUST")
@NamedQuery(name="CbrReportsAdjust.findAll", query="SELECT c FROM CbrReportsAdjust c")
public class CbrReportsAdjust implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CbrReportsAdjustPK id;

	@Column(name="CURRENT_OP")
	private String currentOp;

	@Column(name="REQUIRED_OP")
	private String requiredOp;

	public CbrReportsAdjust() {
	}

	public CbrReportsAdjustPK getId() {
		return this.id;
	}

	public void setId(CbrReportsAdjustPK id) {
		this.id = id;
	}

	public String getCurrentOp() {
		return this.currentOp;
	}

	public void setCurrentOp(String currentOp) {
		this.currentOp = currentOp;
	}

	public String getRequiredOp() {
		return this.requiredOp;
	}

	public void setRequiredOp(String requiredOp) {
		this.requiredOp = requiredOp;
	}

}