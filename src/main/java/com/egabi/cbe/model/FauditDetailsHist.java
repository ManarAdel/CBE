package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the FAUDIT_DETAILS_HIST database table.
 * 
 */
@Entity
@Table(name="FAUDIT_DETAILS_HIST")
@NamedQuery(name="FauditDetailsHist.findAll", query="SELECT f FROM FauditDetailsHist f")
public class FauditDetailsHist implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//This Table Doesn't have A PK 
	//Generated Id 
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;


	@Temporal(TemporalType.DATE)
	private Date busdate;

	@Column(name="ITEM_NAME")
	private String itemName;

	@Column(name="NEW_VALUE")
	private String newValue;

	@Column(name="OLD_VALUE")
	private String oldValue;

	private BigDecimal oprno;

	@Column(name="REC_NO")
	private BigDecimal recNo;

	private BigDecimal usrno;

	public FauditDetailsHist() {
	}

	public Date getBusdate() {
		return this.busdate;
	}

	public void setBusdate(Date busdate) {
		this.busdate = busdate;
	}

	public String getItemName() {
		return this.itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
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

	public BigDecimal getOprno() {
		return this.oprno;
	}

	public void setOprno(BigDecimal oprno) {
		this.oprno = oprno;
	}

	public BigDecimal getRecNo() {
		return this.recNo;
	}

	public void setRecNo(BigDecimal recNo) {
		this.recNo = recNo;
	}

	public BigDecimal getUsrno() {
		return this.usrno;
	}

	public void setUsrno(BigDecimal usrno) {
		this.usrno = usrno;
	}

}