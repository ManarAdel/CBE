package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the CBR_REPORT_RESOURCES database table.
 * 
 */
@Entity
@Table(name="CBR_REPORT_RESOURCES")
@NamedQuery(name="CbrReportResource.findAll", query="SELECT c FROM CbrReportResource c")
public class CbrReportResource implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CbrReportResourcePK id;

	//bi-directional many-to-one association to FcbrReportParameter
	@ManyToOne
	@JoinColumn(name="REPORT_ID", insertable = false , updatable = false)
	private FcbrReportParameter fcbrReportParameter;

	public CbrReportResource() {
	}

	public CbrReportResourcePK getId() {
		return this.id;
	}

	public void setId(CbrReportResourcePK id) {
		this.id = id;
	}

	public FcbrReportParameter getFcbrReportParameter() {
		return this.fcbrReportParameter;
	}

	public void setFcbrReportParameter(FcbrReportParameter fcbrReportParameter) {
		this.fcbrReportParameter = fcbrReportParameter;
	}

}