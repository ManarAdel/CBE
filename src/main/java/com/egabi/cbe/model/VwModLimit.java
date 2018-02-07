package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the VW_MOD_LIMITS database table.
 * 
 */
@Entity
@Table(name="VW_MOD_LIMITS")
@NamedQuery(name="VwModLimit.findAll", query="SELECT v FROM VwModLimit v")
public class VwModLimit implements Serializable {
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	@Column(name="BUSINESS_DATE")
	private Date businessDate;

	private String cur;

	@Column(name="CURRENCY_CODE")
	private String currencyCode;

	@Column(name="CUST_NO")
	private String custNo;

	private String gl;

	@Column(name="MAIN_TOTAL_UTILIZATILN")
	private String mainTotalUtilizatiln;

	@Column(name="MOD_FACILITY_ACCOUNT")
	private String modFacilityAccount;

	@Column(name="SAN_CODE")
	private String sanCode;

	@Column(name="SAN_LIMIT")
	private String sanLimit;

	private String sub;

	@Column(name="SUBS_TOTAL_UTILIZATILN")
	private String subsTotalUtilizatiln;

	@Column(name="UNDRAWN_LIMIT")
	private String undrawnLimit;

	public VwModLimit() {
	}

	public Date getBusinessDate() {
		return this.businessDate;
	}

	public void setBusinessDate(Date businessDate) {
		this.businessDate = businessDate;
	}

	public String getCur() {
		return this.cur;
	}

	public void setCur(String cur) {
		this.cur = cur;
	}

	public String getCurrencyCode() {
		return this.currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public String getCustNo() {
		return this.custNo;
	}

	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}

	public String getGl() {
		return this.gl;
	}

	public void setGl(String gl) {
		this.gl = gl;
	}

	public String getMainTotalUtilizatiln() {
		return this.mainTotalUtilizatiln;
	}

	public void setMainTotalUtilizatiln(String mainTotalUtilizatiln) {
		this.mainTotalUtilizatiln = mainTotalUtilizatiln;
	}

	public String getModFacilityAccount() {
		return this.modFacilityAccount;
	}

	public void setModFacilityAccount(String modFacilityAccount) {
		this.modFacilityAccount = modFacilityAccount;
	}

	public String getSanCode() {
		return this.sanCode;
	}

	public void setSanCode(String sanCode) {
		this.sanCode = sanCode;
	}

	public String getSanLimit() {
		return this.sanLimit;
	}

	public void setSanLimit(String sanLimit) {
		this.sanLimit = sanLimit;
	}

	public String getSub() {
		return this.sub;
	}

	public void setSub(String sub) {
		this.sub = sub;
	}

	public String getSubsTotalUtilizatiln() {
		return this.subsTotalUtilizatiln;
	}

	public void setSubsTotalUtilizatiln(String subsTotalUtilizatiln) {
		this.subsTotalUtilizatiln = subsTotalUtilizatiln;
	}

	public String getUndrawnLimit() {
		return this.undrawnLimit;
	}

	public void setUndrawnLimit(String undrawnLimit) {
		this.undrawnLimit = undrawnLimit;
	}

}