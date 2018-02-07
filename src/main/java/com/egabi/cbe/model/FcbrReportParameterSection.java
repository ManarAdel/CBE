package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the FCBR_REPORT_PARAMETER_SECTION database table.
 * 
 */
@Entity
@Table(name="FCBR_REPORT_PARAMETER_SECTION")
@NamedQuery(name="FcbrReportParameterSection.findAll", query="SELECT f FROM FcbrReportParameterSection f")
public class FcbrReportParameterSection implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private FcbrReportParameterSectionPK id;

	@Column(name="PROCEDURE_NAME")
	private String procedureName;

	@Column(name="SECTION_KIND")
	private BigDecimal sectionKind;

	@Column(name="SECTION_ROWS")
	private BigDecimal sectionRows;

	@Column(name="STARTING_ROW")
	private BigDecimal startingRow;

	@Column(name="WHERE_CONDITION")
	private String whereCondition;

	public FcbrReportParameterSection() {
	}

	public FcbrReportParameterSectionPK getId() {
		return this.id;
	}

	public void setId(FcbrReportParameterSectionPK id) {
		this.id = id;
	}

	public String getProcedureName() {
		return this.procedureName;
	}

	public void setProcedureName(String procedureName) {
		this.procedureName = procedureName;
	}

	public BigDecimal getSectionKind() {
		return this.sectionKind;
	}

	public void setSectionKind(BigDecimal sectionKind) {
		this.sectionKind = sectionKind;
	}

	public BigDecimal getSectionRows() {
		return this.sectionRows;
	}

	public void setSectionRows(BigDecimal sectionRows) {
		this.sectionRows = sectionRows;
	}

	public BigDecimal getStartingRow() {
		return this.startingRow;
	}

	public void setStartingRow(BigDecimal startingRow) {
		this.startingRow = startingRow;
	}

	public String getWhereCondition() {
		return this.whereCondition;
	}

	public void setWhereCondition(String whereCondition) {
		this.whereCondition = whereCondition;
	}

}