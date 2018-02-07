package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the FERR_LOG database table.
 * 
 */
@Entity
@Table(name="FERR_LOG")
@NamedQuery(name="FerrLog.findAll", query="SELECT f FROM FerrLog f")
public class FerrLog implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private FerrLogPK id;

	@Column(name="AUD_OPRNO")
	private BigDecimal audOprno;

	@Column(name="AUD_USRNO")
	private BigDecimal audUsrno;

	@Column(name="ERR_BLOCK")
	private String errBlock;

	@Column(name="ERR_ITEM")
	private String errItem;

	@Column(name="ERROR_CODE")
	private String errorCode;

	@Column(name="ERROR_TEXT")
	private String errorText;

	@Column(name="ERROR_TYPE")
	private String errorType;

	public FerrLog() {
	}

	public FerrLogPK getId() {
		return this.id;
	}

	public void setId(FerrLogPK id) {
		this.id = id;
	}

	public BigDecimal getAudOprno() {
		return this.audOprno;
	}

	public void setAudOprno(BigDecimal audOprno) {
		this.audOprno = audOprno;
	}

	public BigDecimal getAudUsrno() {
		return this.audUsrno;
	}

	public void setAudUsrno(BigDecimal audUsrno) {
		this.audUsrno = audUsrno;
	}

	public String getErrBlock() {
		return this.errBlock;
	}

	public void setErrBlock(String errBlock) {
		this.errBlock = errBlock;
	}

	public String getErrItem() {
		return this.errItem;
	}

	public void setErrItem(String errItem) {
		this.errItem = errItem;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorText() {
		return this.errorText;
	}

	public void setErrorText(String errorText) {
		this.errorText = errorText;
	}

	public String getErrorType() {
		return this.errorType;
	}

	public void setErrorType(String errorType) {
		this.errorType = errorType;
	}

}