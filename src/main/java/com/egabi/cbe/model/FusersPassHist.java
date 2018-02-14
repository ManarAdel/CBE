package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the FUSERS_PASS_HIST database table.
 * 
 */
@Entity
@Table(name="FUSERS_PASS_HIST")
@NamedQuery(name="FusersPassHist.findAll", query="SELECT f FROM FusersPassHist f")
public class FusersPassHist implements Serializable {
	private static final long serialVersionUID = 1L;

		//This Table Doesn't have A PK 
		//Generated Id 
		@Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
	    private Long id;
		
	@Temporal(TemporalType.DATE)
	@Column(name="AUDIT_DATETIME")
	private Date auditDatetime;

	private String password;

	@Column(name="USER_NO")
	private BigDecimal userNo;

	public FusersPassHist() {
	}

	public Date getAuditDatetime() {
		return this.auditDatetime;
	}

	public void setAuditDatetime(Date auditDatetime) {
		this.auditDatetime = auditDatetime;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public BigDecimal getUserNo() {
		return this.userNo;
	}

	public void setUserNo(BigDecimal userNo) {
		this.userNo = userNo;
	}

}