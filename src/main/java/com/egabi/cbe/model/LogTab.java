package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the LOG_TAB database table.
 * 
 */
@Entity
@Table(name="LOG_TAB")
@NamedQuery(name="LogTab.findAll", query="SELECT l FROM LogTab l")
public class LogTab implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//This Table Doesn't have A PK 
	//Generated Id 
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;


	@Temporal(TemporalType.DATE)
	@Column(name="ACTION_TIME")
	private Date actionTime;

	@Column(name="ACTION_TYPE_CODE")
	private BigDecimal actionTypeCode;

	private BigDecimal brcode;

	@Column(name="COLUMN_NAME")
	private String columnName;

	@Column(name="IP_ADDRESS")
	private String ipAddress;

	@Column(name="NEW_VALUE")
	private String newValue;

	@Column(name="OLD_VALUE")
	private String oldValue;

	private BigDecimal progid;

	@Column(name="SESSION_ID")
	private BigDecimal sessionId;

	@Column(name="TABLE_NAME")
	private String tableName;

	private BigDecimal userno;

	public LogTab() {
	}

	public Date getActionTime() {
		return this.actionTime;
	}

	public void setActionTime(Date actionTime) {
		this.actionTime = actionTime;
	}

	public BigDecimal getActionTypeCode() {
		return this.actionTypeCode;
	}

	public void setActionTypeCode(BigDecimal actionTypeCode) {
		this.actionTypeCode = actionTypeCode;
	}

	public BigDecimal getBrcode() {
		return this.brcode;
	}

	public void setBrcode(BigDecimal brcode) {
		this.brcode = brcode;
	}

	public String getColumnName() {
		return this.columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public String getIpAddress() {
		return this.ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public String getNewValue() {
		return this.newValue;
	}

	public void setNewValue(String newValue) {
		this.newValue = newValue;
	}

	public String getOldValue() {
		return this.oldValue;
	}

	public void setOldValue(String oldValue) {
		this.oldValue = oldValue;
	}

	public BigDecimal getProgid() {
		return this.progid;
	}

	public void setProgid(BigDecimal progid) {
		this.progid = progid;
	}

	public BigDecimal getSessionId() {
		return this.sessionId;
	}

	public void setSessionId(BigDecimal sessionId) {
		this.sessionId = sessionId;
	}

	public String getTableName() {
		return this.tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public BigDecimal getUserno() {
		return this.userno;
	}

	public void setUserno(BigDecimal userno) {
		this.userno = userno;
	}

}