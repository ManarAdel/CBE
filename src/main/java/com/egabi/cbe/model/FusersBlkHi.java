package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the FUSERS_BLK_HIS database table.
 * 
 */
@Entity
@Table(name="FUSERS_BLK_HIS")
@NamedQuery(name="FusersBlkHi.findAll", query="SELECT f FROM FusersBlkHi f")
public class FusersBlkHi implements Serializable {
	private static final long serialVersionUID = 1L;
	
			//This Table Doesn't have A PK 
			//Generated Id 
			@Id
		    @GeneratedValue(strategy=GenerationType.IDENTITY)
		    private Long id;

	@Column(name="AUD_USRNO")
	private BigDecimal audUsrno;

	@Temporal(TemporalType.DATE)
	private Date audtime;

	@Column(name="BLK_FLG")
	private BigDecimal blkFlg;

	@Column(name="BLK_REASON")
	private BigDecimal blkReason;

	@Temporal(TemporalType.DATE)
	private Date busdate;

	@Temporal(TemporalType.DATE)
	@Column(name="REACTIVE_DATE")
	private Date reactiveDate;

	@Column(name="REASON_NOTE")
	private String reasonNote;

	private BigDecimal ser;

	private BigDecimal usrno;

	public FusersBlkHi() {
	}

	public BigDecimal getAudUsrno() {
		return this.audUsrno;
	}

	public void setAudUsrno(BigDecimal audUsrno) {
		this.audUsrno = audUsrno;
	}

	public Date getAudtime() {
		return this.audtime;
	}

	public void setAudtime(Date audtime) {
		this.audtime = audtime;
	}

	public BigDecimal getBlkFlg() {
		return this.blkFlg;
	}

	public void setBlkFlg(BigDecimal blkFlg) {
		this.blkFlg = blkFlg;
	}

	public BigDecimal getBlkReason() {
		return this.blkReason;
	}

	public void setBlkReason(BigDecimal blkReason) {
		this.blkReason = blkReason;
	}

	public Date getBusdate() {
		return this.busdate;
	}

	public void setBusdate(Date busdate) {
		this.busdate = busdate;
	}

	public Date getReactiveDate() {
		return this.reactiveDate;
	}

	public void setReactiveDate(Date reactiveDate) {
		this.reactiveDate = reactiveDate;
	}

	public String getReasonNote() {
		return this.reasonNote;
	}

	public void setReasonNote(String reasonNote) {
		this.reasonNote = reasonNote;
	}

	public BigDecimal getSer() {
		return this.ser;
	}

	public void setSer(BigDecimal ser) {
		this.ser = ser;
	}

	public BigDecimal getUsrno() {
		return this.usrno;
	}

	public void setUsrno(BigDecimal usrno) {
		this.usrno = usrno;
	}

}