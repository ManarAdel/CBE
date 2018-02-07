package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the CBR_REPORTS_ADJUST_HIST database table.
 * 
 */
@Entity
@Table(name="CBR_REPORTS_ADJUST_HIST")
@NamedQuery(name="CbrReportsAdjustHist.findAll", query="SELECT c FROM CbrReportsAdjustHist c")
public class CbrReportsAdjustHist implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CbrReportsAdjustHistPK id;

	@Temporal(TemporalType.DATE)
	@Column(name="AUD_TIME")
	private Date audTime;

	@Column(name="CURRENT_OP")
	private String currentOp;

	@Column(name="REQUIRED_OP")
	private String requiredOp;

	public CbrReportsAdjustHist() {
	}

	public CbrReportsAdjustHistPK getId() {
		return this.id;
	}

	public void setId(CbrReportsAdjustHistPK id) {
		this.id = id;
	}

	public Date getAudTime() {
		return this.audTime;
	}

	public void setAudTime(Date audTime) {
		this.audTime = audTime;
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