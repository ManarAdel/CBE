package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the FCBR_REPORT_PARAMETER database table.
 * 
 */
@Entity
@Table(name="FCBR_REPORT_PARAMETER")
@NamedQuery(name="FcbrReportParameter.findAll", query="SELECT f FROM FcbrReportParameter f")
public class FcbrReportParameter implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="REPORT_ID")
	private long reportId;

	private String aname;

	@Column(name="CHECKER_FLAG")
	private BigDecimal checkerFlag;

	private String ename;

	@Column(name="FILE_CREATION_FLAG")
	private BigDecimal fileCreationFlag;

	@Column(name="FILE_NAME")
	private String fileName;

	@Column(name="PRINT_ORDER")
	private BigDecimal printOrder;

	@Column(name="PROCEDURE_NAME")
	private String procedureName;

	private BigDecimal recurrence;

	@Column(name="RECURRENCE_DAY")
	private BigDecimal recurrenceDay;

	@Column(name="REPORT_KIND")
	private BigDecimal reportKind;

	@Column(name="SHEET_NAME")
	private String sheetName;

	@Column(name="WHERE_CONDITION")
	private String whereCondition;

	//bi-directional many-to-one association to CbrReportsAccess
	@OneToMany(mappedBy="fcbrReportParameter")
	private List<CbrReportsAccess> cbrReportsAccesses;

	//bi-directional many-to-one association to CbrReportResource
	@OneToMany(mappedBy="fcbrReportParameter")
	private List<CbrReportResource> cbrReportResources;

	//bi-directional many-to-one association to CbrRepParamSelect
	@OneToMany(mappedBy="fcbrReportParameter")
	private List<CbrRepParamSelect> cbrRepParamSelects;

	//bi-directional many-to-one association to CbrRepParamSelectHist
	@OneToMany(mappedBy="fcbrReportParameter")
	private List<CbrRepParamSelectHist> cbrRepParamSelectHists;

	public FcbrReportParameter() {
	}

	public long getReportId() {
		return this.reportId;
	}

	public void setReportId(long reportId) {
		this.reportId = reportId;
	}

	public String getAname() {
		return this.aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public BigDecimal getCheckerFlag() {
		return this.checkerFlag;
	}

	public void setCheckerFlag(BigDecimal checkerFlag) {
		this.checkerFlag = checkerFlag;
	}

	public String getEname() {
		return this.ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public BigDecimal getFileCreationFlag() {
		return this.fileCreationFlag;
	}

	public void setFileCreationFlag(BigDecimal fileCreationFlag) {
		this.fileCreationFlag = fileCreationFlag;
	}

	public String getFileName() {
		return this.fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public BigDecimal getPrintOrder() {
		return this.printOrder;
	}

	public void setPrintOrder(BigDecimal printOrder) {
		this.printOrder = printOrder;
	}

	public String getProcedureName() {
		return this.procedureName;
	}

	public void setProcedureName(String procedureName) {
		this.procedureName = procedureName;
	}

	public BigDecimal getRecurrence() {
		return this.recurrence;
	}

	public void setRecurrence(BigDecimal recurrence) {
		this.recurrence = recurrence;
	}

	public BigDecimal getRecurrenceDay() {
		return this.recurrenceDay;
	}

	public void setRecurrenceDay(BigDecimal recurrenceDay) {
		this.recurrenceDay = recurrenceDay;
	}

	public BigDecimal getReportKind() {
		return this.reportKind;
	}

	public void setReportKind(BigDecimal reportKind) {
		this.reportKind = reportKind;
	}

	public String getSheetName() {
		return this.sheetName;
	}

	public void setSheetName(String sheetName) {
		this.sheetName = sheetName;
	}

	public String getWhereCondition() {
		return this.whereCondition;
	}

	public void setWhereCondition(String whereCondition) {
		this.whereCondition = whereCondition;
	}

	public List<CbrReportsAccess> getCbrReportsAccesses() {
		return this.cbrReportsAccesses;
	}

	public void setCbrReportsAccesses(List<CbrReportsAccess> cbrReportsAccesses) {
		this.cbrReportsAccesses = cbrReportsAccesses;
	}

	public CbrReportsAccess addCbrReportsAccess(CbrReportsAccess cbrReportsAccess) {
		getCbrReportsAccesses().add(cbrReportsAccess);
		cbrReportsAccess.setFcbrReportParameter(this);

		return cbrReportsAccess;
	}

	public CbrReportsAccess removeCbrReportsAccess(CbrReportsAccess cbrReportsAccess) {
		getCbrReportsAccesses().remove(cbrReportsAccess);
		cbrReportsAccess.setFcbrReportParameter(null);

		return cbrReportsAccess;
	}

	public List<CbrReportResource> getCbrReportResources() {
		return this.cbrReportResources;
	}

	public void setCbrReportResources(List<CbrReportResource> cbrReportResources) {
		this.cbrReportResources = cbrReportResources;
	}

	public CbrReportResource addCbrReportResource(CbrReportResource cbrReportResource) {
		getCbrReportResources().add(cbrReportResource);
		cbrReportResource.setFcbrReportParameter(this);

		return cbrReportResource;
	}

	public CbrReportResource removeCbrReportResource(CbrReportResource cbrReportResource) {
		getCbrReportResources().remove(cbrReportResource);
		cbrReportResource.setFcbrReportParameter(null);

		return cbrReportResource;
	}

	public List<CbrRepParamSelect> getCbrRepParamSelects() {
		return this.cbrRepParamSelects;
	}

	public void setCbrRepParamSelects(List<CbrRepParamSelect> cbrRepParamSelects) {
		this.cbrRepParamSelects = cbrRepParamSelects;
	}

	public CbrRepParamSelect addCbrRepParamSelect(CbrRepParamSelect cbrRepParamSelect) {
		getCbrRepParamSelects().add(cbrRepParamSelect);
		cbrRepParamSelect.setFcbrReportParameter(this);

		return cbrRepParamSelect;
	}

	public CbrRepParamSelect removeCbrRepParamSelect(CbrRepParamSelect cbrRepParamSelect) {
		getCbrRepParamSelects().remove(cbrRepParamSelect);
		cbrRepParamSelect.setFcbrReportParameter(null);

		return cbrRepParamSelect;
	}

	public List<CbrRepParamSelectHist> getCbrRepParamSelectHists() {
		return this.cbrRepParamSelectHists;
	}

	public void setCbrRepParamSelectHists(List<CbrRepParamSelectHist> cbrRepParamSelectHists) {
		this.cbrRepParamSelectHists = cbrRepParamSelectHists;
	}

	public CbrRepParamSelectHist addCbrRepParamSelectHist(CbrRepParamSelectHist cbrRepParamSelectHist) {
		getCbrRepParamSelectHists().add(cbrRepParamSelectHist);
		cbrRepParamSelectHist.setFcbrReportParameter(this);

		return cbrRepParamSelectHist;
	}

	public CbrRepParamSelectHist removeCbrRepParamSelectHist(CbrRepParamSelectHist cbrRepParamSelectHist) {
		getCbrRepParamSelectHists().remove(cbrRepParamSelectHist);
		cbrRepParamSelectHist.setFcbrReportParameter(null);

		return cbrRepParamSelectHist;
	}

}