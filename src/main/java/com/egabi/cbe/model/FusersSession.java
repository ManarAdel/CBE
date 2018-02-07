package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the FUSERS_SESSIONS database table.
 * 
 */
@Entity
@Table(name="FUSERS_SESSIONS")
@NamedQuery(name="FusersSession.findAll", query="SELECT f FROM FusersSession f")
public class FusersSession implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long usrno;

	private BigDecimal brcode;

	@Column(name="INST_ID")
	private BigDecimal instId;

	@Column(name="IP_ADDRESS")
	private String ipAddress;

	@Column(name="LOGIN_TIME")
	private Timestamp loginTime;

	private BigDecimal progid;

	private BigDecimal serial;

	@Column(name="SESSION_ID")
	private BigDecimal sessionId;

	@Column(name="SESSION_SERIAL")
	private BigDecimal sessionSerial;

	@Column(name="SOCKET_PORT")
	private BigDecimal socketPort;

	public FusersSession() {
	}

	public long getUsrno() {
		return this.usrno;
	}

	public void setUsrno(long usrno) {
		this.usrno = usrno;
	}

	public BigDecimal getBrcode() {
		return this.brcode;
	}

	public void setBrcode(BigDecimal brcode) {
		this.brcode = brcode;
	}

	public BigDecimal getInstId() {
		return this.instId;
	}

	public void setInstId(BigDecimal instId) {
		this.instId = instId;
	}

	public String getIpAddress() {
		return this.ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public Timestamp getLoginTime() {
		return this.loginTime;
	}

	public void setLoginTime(Timestamp loginTime) {
		this.loginTime = loginTime;
	}

	public BigDecimal getProgid() {
		return this.progid;
	}

	public void setProgid(BigDecimal progid) {
		this.progid = progid;
	}

	public BigDecimal getSerial() {
		return this.serial;
	}

	public void setSerial(BigDecimal serial) {
		this.serial = serial;
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

	public BigDecimal getSocketPort() {
		return this.socketPort;
	}

	public void setSocketPort(BigDecimal socketPort) {
		this.socketPort = socketPort;
	}

}