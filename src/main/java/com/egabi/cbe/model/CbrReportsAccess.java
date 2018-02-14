package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the CBR_REPORTS_ACCESS database table.
 * 
 */
@Entity
@Table(name="CBR_REPORTS_ACCESS")
@NamedQuery(name="CbrReportsAccess.findAll", query="SELECT c FROM CbrReportsAccess c")
public class CbrReportsAccess implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CbrReportsAccessPK id;

	@Column(name="PRINT_FLAG")
	private BigDecimal printFlag;

	@Column(name="REPORT_DEFINITION_FLAG")
	private BigDecimal reportDefinitionFlag;

	//bi-directional many-to-one association to FcbrReportParameter
	@ManyToOne
	@JoinColumn(name="REPORT_ID" , insertable = false , updatable = false)
	private FcbrReportParameter fcbrReportParameter;

	//bi-directional many-to-one association to Frole
	@ManyToOne
	@JoinColumn(name="ROLE_ID" , insertable = false , updatable = false)
	private Frole frole;

	public CbrReportsAccess() {
	}

	public CbrReportsAccessPK getId() {
		return this.id;
	}

	public void setId(CbrReportsAccessPK id) {
		this.id = id;
	}

	public BigDecimal getPrintFlag() {
		return this.printFlag;
	}

	public void setPrintFlag(BigDecimal printFlag) {
		this.printFlag = printFlag;
	}

	public BigDecimal getReportDefinitionFlag() {
		return this.reportDefinitionFlag;
	}

	public void setReportDefinitionFlag(BigDecimal reportDefinitionFlag) {
		this.reportDefinitionFlag = reportDefinitionFlag;
	}

	public FcbrReportParameter getFcbrReportParameter() {
		return this.fcbrReportParameter;
	}

	public void setFcbrReportParameter(FcbrReportParameter fcbrReportParameter) {
		this.fcbrReportParameter = fcbrReportParameter;
	}

	public Frole getFrole() {
		return this.frole;
	}

	public void setFrole(Frole frole) {
		this.frole = frole;
	}

}