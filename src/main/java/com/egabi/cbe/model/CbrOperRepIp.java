package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the CBR_OPER_REP_IP database table.
 * 
 */
@Entity
@Table(name="CBR_OPER_REP_IP")
@NamedQuery(name="CbrOperRepIp.findAll", query="SELECT c FROM CbrOperRepIp c")
public class CbrOperRepIp implements Serializable {
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	private Date busdate;

	@Column(name="CELL_NAME")
	private String cellName;

	@Column(name="CELL_VALUE")
	private String cellValue;

	@Column(name="COLUMN_ID")
	private String columnId;

	private BigDecimal oprno;

	@Column(name="REPORT_ID")
	private BigDecimal reportId;

	@Column(name="ROW_ID")
	private BigDecimal rowId;

	private BigDecimal usrno;

	public CbrOperRepIp() {
	}

	public Date getBusdate() {
		return this.busdate;
	}

	public void setBusdate(Date busdate) {
		this.busdate = busdate;
	}

	public String getCellName() {
		return this.cellName;
	}

	public void setCellName(String cellName) {
		this.cellName = cellName;
	}

	public String getCellValue() {
		return this.cellValue;
	}

	public void setCellValue(String cellValue) {
		this.cellValue = cellValue;
	}

	public String getColumnId() {
		return this.columnId;
	}

	public void setColumnId(String columnId) {
		this.columnId = columnId;
	}

	public BigDecimal getOprno() {
		return this.oprno;
	}

	public void setOprno(BigDecimal oprno) {
		this.oprno = oprno;
	}

	public BigDecimal getReportId() {
		return this.reportId;
	}

	public void setReportId(BigDecimal reportId) {
		this.reportId = reportId;
	}

	public BigDecimal getRowId() {
		return this.rowId;
	}

	public void setRowId(BigDecimal rowId) {
		this.rowId = rowId;
	}

	public BigDecimal getUsrno() {
		return this.usrno;
	}

	public void setUsrno(BigDecimal usrno) {
		this.usrno = usrno;
	}

}