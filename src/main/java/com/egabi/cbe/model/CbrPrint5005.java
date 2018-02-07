package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the CBR_PRINT5005 database table.
 * 
 */
@Entity
@Table(name="CBR_PRINT5005")
@NamedQuery(name="CbrPrint5005.findAll", query="SELECT c FROM CbrPrint5005 c")
public class CbrPrint5005 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="A_C")
	private BigDecimal aC;

	private BigDecimal alloc;

	@Column(name="AMT_CAT")
	private BigDecimal amtCat;

	@Temporal(TemporalType.DATE)
	private Date busdate;

	@Column(name="CATEGORY_CODE")
	private BigDecimal categoryCode;

	private BigDecimal cbe;

	private BigDecimal comm;

	@Column(name="CUST_STATUS")
	private String custStatus;

	@Column(name="E_O_W")
	private BigDecimal eOW;

	private String goods;

	@Column(name="IDC_REF")
	private String idcRef;

	private String name;

	public CbrPrint5005() {
	}

	public BigDecimal getAC() {
		return this.aC;
	}

	public void setAC(BigDecimal aC) {
		this.aC = aC;
	}

	public BigDecimal getAlloc() {
		return this.alloc;
	}

	public void setAlloc(BigDecimal alloc) {
		this.alloc = alloc;
	}

	public BigDecimal getAmtCat() {
		return this.amtCat;
	}

	public void setAmtCat(BigDecimal amtCat) {
		this.amtCat = amtCat;
	}

	public Date getBusdate() {
		return this.busdate;
	}

	public void setBusdate(Date busdate) {
		this.busdate = busdate;
	}

	public BigDecimal getCategoryCode() {
		return this.categoryCode;
	}

	public void setCategoryCode(BigDecimal categoryCode) {
		this.categoryCode = categoryCode;
	}

	public BigDecimal getCbe() {
		return this.cbe;
	}

	public void setCbe(BigDecimal cbe) {
		this.cbe = cbe;
	}

	public BigDecimal getComm() {
		return this.comm;
	}

	public void setComm(BigDecimal comm) {
		this.comm = comm;
	}

	public String getCustStatus() {
		return this.custStatus;
	}

	public void setCustStatus(String custStatus) {
		this.custStatus = custStatus;
	}

	public BigDecimal getEOW() {
		return this.eOW;
	}

	public void setEOW(BigDecimal eOW) {
		this.eOW = eOW;
	}

	public String getGoods() {
		return this.goods;
	}

	public void setGoods(String goods) {
		this.goods = goods;
	}

	public String getIdcRef() {
		return this.idcRef;
	}

	public void setIdcRef(String idcRef) {
		this.idcRef = idcRef;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}