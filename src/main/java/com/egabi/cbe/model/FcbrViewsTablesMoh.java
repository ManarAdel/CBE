package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the FCBR_VIEWS_TABLES_MOH database table.
 * 
 */
@Entity
@Table(name="FCBR_VIEWS_TABLES_MOH")
@NamedQuery(name="FcbrViewsTablesMoh.findAll", query="SELECT f FROM FcbrViewsTablesMoh f")
public class FcbrViewsTablesMoh implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="INDEXES_COLUMNS1")
	private String indexesColumns1;

	@Column(name="INDEXES_COLUMNS2")
	private String indexesColumns2;

	@Column(name="INDEXES_COLUMNS3")
	private String indexesColumns3;

	@Column(name="MASTER_VIEW_NAME")
	private String masterViewName;

	@Column(name="SEQ_NO")
	private BigDecimal seqNo;

	@Column(name="SOURCE_ID")
	private BigDecimal sourceId;

	@Column(name="WORK_TABLE_NAME")
	private String workTableName;

	@Column(name="WORK_VIEW_NAME")
	private String workViewName;

	public FcbrViewsTablesMoh() {
	}

	public String getIndexesColumns1() {
		return this.indexesColumns1;
	}

	public void setIndexesColumns1(String indexesColumns1) {
		this.indexesColumns1 = indexesColumns1;
	}

	public String getIndexesColumns2() {
		return this.indexesColumns2;
	}

	public void setIndexesColumns2(String indexesColumns2) {
		this.indexesColumns2 = indexesColumns2;
	}

	public String getIndexesColumns3() {
		return this.indexesColumns3;
	}

	public void setIndexesColumns3(String indexesColumns3) {
		this.indexesColumns3 = indexesColumns3;
	}

	public String getMasterViewName() {
		return this.masterViewName;
	}

	public void setMasterViewName(String masterViewName) {
		this.masterViewName = masterViewName;
	}

	public BigDecimal getSeqNo() {
		return this.seqNo;
	}

	public void setSeqNo(BigDecimal seqNo) {
		this.seqNo = seqNo;
	}

	public BigDecimal getSourceId() {
		return this.sourceId;
	}

	public void setSourceId(BigDecimal sourceId) {
		this.sourceId = sourceId;
	}

	public String getWorkTableName() {
		return this.workTableName;
	}

	public void setWorkTableName(String workTableName) {
		this.workTableName = workTableName;
	}

	public String getWorkViewName() {
		return this.workViewName;
	}

	public void setWorkViewName(String workViewName) {
		this.workViewName = workViewName;
	}

}