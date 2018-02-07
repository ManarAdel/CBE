package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the FWAUDIT database table.
 * 
 */
@Entity
@NamedQuery(name="Fwaudit.findAll", query="SELECT f FROM Fwaudit f")
public class Fwaudit implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="AUD_CODE")
	private BigDecimal audCode;

	@Temporal(TemporalType.DATE)
	@Column(name="AUD_TIME")
	private Date audTime;

	private BigDecimal brcode;

	@Column(name="CONF_LEVEL")
	private BigDecimal confLevel;

	private BigDecimal oprno;

	@Column(name="PROG_ID")
	private BigDecimal progId;

	private BigDecimal usrno;

	public Fwaudit() {
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

	public BigDecimal getOprno() {
		return this.oprno;
	}

	public void setOprno(BigDecimal oprno) {
		this.oprno = oprno;
	}

	public BigDecimal getProgId() {
		return this.progId;
	}

	public void setProgId(BigDecimal progId) {
		this.progId = progId;
	}

	public BigDecimal getUsrno() {
		return this.usrno;
	}

	public void setUsrno(BigDecimal usrno) {
		this.usrno = usrno;
	}

}