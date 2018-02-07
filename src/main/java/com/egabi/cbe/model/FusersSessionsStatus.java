package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the FUSERS_SESSIONS_STATUS database table.
 * 
 */
@Entity
@Table(name="FUSERS_SESSIONS_STATUS")
@NamedQuery(name="FusersSessionsStatus.findAll", query="SELECT f FROM FusersSessionsStatus f")
public class FusersSessionsStatus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="INST_ID")
	private BigDecimal instId;

	@Column(name="SESSION_ID")
	private BigDecimal sessionId;

	@Column(name="SESSION_SERIAL")
	private BigDecimal sessionSerial;

	private String status;

	public FusersSessionsStatus() {
	}

	public BigDecimal getInstId() {
		return this.instId;
	}

	public void setInstId(BigDecimal instId) {
		this.instId = instId;
	}

	public BigDecimal getSessionId() {
		return this.sessionId;
	}

	public void setSessionId(BigDecimal sessionId) {
		this.sessionId = sessionId;
	}

	public BigDecimal getSessionSerial() {
		return this.sessionSerial;
	}

	public void setSessionSerial(BigDecimal sessionSerial) {
		this.sessionSerial = sessionSerial;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}