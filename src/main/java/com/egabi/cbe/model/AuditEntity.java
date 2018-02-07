package com.egabi.cbe.model;

import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FAUDIT")
public class AuditEntity {
	@Id
	@Column(name = "USRNO")
	private Long usrNo;
	@Column(name = "OPRNO")
	private Long oprNo;
	@Column(name = "AUD_CODE")
	private Long audCode;
	@Column(name = "AUD_TIME")
	private Time audTime;
	@Column(name = "BRCODE")
	private Long brCode;
	@Column(name = "PROG_ID")
	private Long progId;
	@Column(name = "CONF_LEVEL")
	private Long confLevel;

	public Long getUsrNo() {
		return usrNo;
	}

	public void setUsrNo(Long usrNo) {
		this.usrNo = usrNo;
	}

	public Long getOprNo() {
		return oprNo;
	}

	public void setOprNo(Long oprNo) {
		this.oprNo = oprNo;
	}

	public Long getAudCode() {
		return audCode;
	}

	public void setAudCode(Long audCode) {
		this.audCode = audCode;
	}

	public Time getAudTime() {
		return audTime;
	}

	public void setAudTime(Time audTime) {
		this.audTime = audTime;
	}

	public Long getBrCode() {
		return brCode;
	}

	public void setBrCode(Long brCode) {
		this.brCode = brCode;
	}

	public Long getProgId() {
		return progId;
	}

	public void setProgId(Long progId) {
		this.progId = progId;
	}

	public Long getConfLevel() {
		return confLevel;
	}

	public void setConfLevel(Long confLevel) {
		this.confLevel = confLevel;
	}
}
