package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the FAUDIT database table.
 * 
 */
@Entity
@NamedQuery(name="Faudit.findAll", query="SELECT f FROM Faudit f")
public class Faudit implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private FauditPK id;

	@Column(name="AUD_CODE")
	private BigDecimal audCode;

	@Temporal(TemporalType.DATE)
	@Column(name="AUD_TIME")
	private Date audTime;

	private BigDecimal brcode;

	@Column(name="CONF_LEVEL")
	private BigDecimal confLevel;

	@Column(name="PROG_ID")
	private BigDecimal progId;

	public Faudit() {
	}

	public FauditPK getId() {
		return this.id;
	}

	public void setId(FauditPK id) {
		this.id = id;
	}

	public BigDecimal getAudCode() {
		return this.audCode;
	}

	public void setAudCode(BigDecimal audCode) {
		this.audCode = audCode;
	}

	public Date getAudTime() {
		return this.audTime;
	}

	public void setAudTime(Date audTime) {
		this.audTime = audTime;
	}

	public BigDecimal getBrcode() {
		return this.brcode;
	}

	public void setBrcode(BigDecimal brcode) {
		this.brcode = brcode;
	}

	public BigDecimal getConfLevel() {
		return this.confLevel;
	}

	public void setConfLevel(BigDecimal confLevel) {
		this.confLevel = confLevel;
	}

	public BigDecimal getProgId() {
		return this.progId;
	}

	public void setProgId(BigDecimal progId) {
		this.progId = progId;
	}

}