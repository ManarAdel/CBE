package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the CBR_PROC_BREAKDOWN database table.
 * 
 */
@Entity
@Table(name="CBR_PROC_BREAKDOWN")
@NamedQuery(name="CbrProcBreakdown.findAll", query="SELECT c FROM CbrProcBreakdown c")
public class CbrProcBreakdown implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CbrProcBreakdownPK id;

	private String condition;

	@Column(name="DATA_SOURCE")
	private String dataSource;

	@Column(name="QUERY_SIGN")
	private String querySign;

	public CbrProcBreakdown() {
	}

	public CbrProcBreakdownPK getId() {
		return this.id;
	}

	public void setId(CbrProcBreakdownPK id) {
		this.id = id;
	}

	public String getCondition() {
		return this.condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public String getDataSource() {
		return this.dataSource;
	}

	public void setDataSource(String dataSource) {
		this.dataSource = dataSource;
	}

	public String getQuerySign() {
		return this.querySign;
	}

	public void setQuerySign(String querySign) {
		this.querySign = querySign;
	}

}