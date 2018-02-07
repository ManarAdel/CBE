package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the FAUDIT_REP_PARAM database table.
 * 
 */
@Entity
@Table(name="FAUDIT_REP_PARAM")
@NamedQuery(name="FauditRepParam.findAll", query="SELECT f FROM FauditRepParam f")
public class FauditRepParam implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private FauditRepParamPK id;

	private String aname;

	@Column(name="BRCODE_ITEM_NAME")
	private String brcodeItemName;

	@Column(name="COUNT_FLAG")
	private BigDecimal countFlag;

	@Column(name="CURCODE_ITEM_NAME")
	private String curcodeItemName;

	private String ename;

	@Column(name="GROUP_BRCODE_FLAG")
	private BigDecimal groupBrcodeFlag;

	@Column(name="GROUP_CURCODE_FLAG")
	private BigDecimal groupCurcodeFlag;

	private String progname;

	@Column(name="TOTAL_FLAG")
	private BigDecimal totalFlag;

	@Column(name="TOTAL_ITEM_NAME")
	private String totalItemName;

	@Column(name="WHERE_COND")
	private String whereCond;

	public FauditRepParam() {
	}

	public FauditRepParamPK getId() {
		return this.id;
	}

	public void setId(FauditRepParamPK id) {
		this.id = id;
	}

	public String getAname() {
		return this.aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public String getBrcodeItemName() {
		return this.brcodeItemName;
	}

	public void setBrcodeItemName(String brcodeItemName) {
		this.brcodeItemName = brcodeItemName;
	}

	public BigDecimal getCountFlag() {
		return this.countFlag;
	}

	public void setCountFlag(BigDecimal countFlag) {
		this.countFlag = countFlag;
	}

	public String getCurcodeItemName() {
		return this.curcodeItemName;
	}

	public void setCurcodeItemName(String curcodeItemName) {
		this.curcodeItemName = curcodeItemName;
	}

	public String getEname() {
		return this.ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public BigDecimal getGroupBrcodeFlag() {
		return this.groupBrcodeFlag;
	}

	public void setGroupBrcodeFlag(BigDecimal groupBrcodeFlag) {
		this.groupBrcodeFlag = groupBrcodeFlag;
	}

	public BigDecimal getGroupCurcodeFlag() {
		return this.groupCurcodeFlag;
	}

	public void setGroupCurcodeFlag(BigDecimal groupCurcodeFlag) {
		this.groupCurcodeFlag = groupCurcodeFlag;
	}

	public String getProgname() {
		return this.progname;
	}

	public void setProgname(String progname) {
		this.progname = progname;
	}

	public BigDecimal getTotalFlag() {
		return this.totalFlag;
	}

	public void setTotalFlag(BigDecimal totalFlag) {
		this.totalFlag = totalFlag;
	}

	public String getTotalItemName() {
		return this.totalItemName;
	}

	public void setTotalItemName(String totalItemName) {
		this.totalItemName = totalItemName;
	}

	public String getWhereCond() {
		return this.whereCond;
	}

	public void setWhereCond(String whereCond) {
		this.whereCond = whereCond;
	}

}