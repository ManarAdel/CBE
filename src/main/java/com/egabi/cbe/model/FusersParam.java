package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the FUSERS_PARAM database table.
 * 
 */
@Entity
@Table(name="FUSERS_PARAM")
@NamedQuery(name="FusersParam.findAll", query="SELECT f FROM FusersParam f")
public class FusersParam implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="AUTO_BLK_DAYS")
	private BigDecimal autoBlkDays;

	@Column(name="CONFIRM_SRT_LOG")
	private BigDecimal confirmSrtLog;

	@Column(name="DEF_PASS")
	private String defPass;

	@Column(name="MAX_PASS_LENGTH")
	private BigDecimal maxPassLength;

	@Column(name="MAX_PASSWORD_COUNT")
	private BigDecimal maxPasswordCount;

	@Column(name="MIN_PASS_LENGTH")
	private BigDecimal minPassLength;

	@Column(name="NMBR_OF_TRY")
	private BigDecimal nmbrOfTry;

	@Column(name="PASSEXP_DAYS")
	private BigDecimal passexpDays;

	@Column(name="PW_INTCAP")
	private BigDecimal pwIntcap;

	@Column(name="SESSION_TIME_OUT")
	private BigDecimal sessionTimeOut;

	public FusersParam() {
	}

	public BigDecimal getAutoBlkDays() {
		return this.autoBlkDays;
	}

	public void setAutoBlkDays(BigDecimal autoBlkDays) {
		this.autoBlkDays = autoBlkDays;
	}

	public BigDecimal getConfirmSrtLog() {
		return this.confirmSrtLog;
	}

	public void setConfirmSrtLog(BigDecimal confirmSrtLog) {
		this.confirmSrtLog = confirmSrtLog;
	}

	public String getDefPass() {
		return this.defPass;
	}

	public void setDefPass(String defPass) {
		this.defPass = defPass;
	}

	public BigDecimal getMaxPassLength() {
		return this.maxPassLength;
	}

	public void setMaxPassLength(BigDecimal maxPassLength) {
		this.maxPassLength = maxPassLength;
	}

	public BigDecimal getMaxPasswordCount() {
		return this.maxPasswordCount;
	}

	public void setMaxPasswordCount(BigDecimal maxPasswordCount) {
		this.maxPasswordCount = maxPasswordCount;
	}

	public BigDecimal getMinPassLength() {
		return this.minPassLength;
	}

	public void setMinPassLength(BigDecimal minPassLength) {
		this.minPassLength = minPassLength;
	}

	public BigDecimal getNmbrOfTry() {
		return this.nmbrOfTry;
	}

	public void setNmbrOfTry(BigDecimal nmbrOfTry) {
		this.nmbrOfTry = nmbrOfTry;
	}

	public BigDecimal getPassexpDays() {
		return this.passexpDays;
	}

	public void setPassexpDays(BigDecimal passexpDays) {
		this.passexpDays = passexpDays;
	}

	public BigDecimal getPwIntcap() {
		return this.pwIntcap;
	}

	public void setPwIntcap(BigDecimal pwIntcap) {
		this.pwIntcap = pwIntcap;
	}

	public BigDecimal getSessionTimeOut() {
		return this.sessionTimeOut;
	}

	public void setSessionTimeOut(BigDecimal sessionTimeOut) {
		this.sessionTimeOut = sessionTimeOut;
	}

}