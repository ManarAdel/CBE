package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the FROLE_FUNC_DETAILS database table.
 * 
 */
@Entity
@Table(name="FROLE_FUNC_DETAILS")
@NamedQuery(name="FroleFuncDetail.findAll", query="SELECT f FROM FroleFuncDetail f")
public class FroleFuncDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private FroleFuncDetailPK id;

	@Column(name="CONCEAL_FLG")
	private BigDecimal concealFlg;

	@Column(name="ENABLE_FLG")
	private BigDecimal enableFlg;

	@Column(name="PRIV_UPDATE")
	private BigDecimal privUpdate;

	@Column(name="REQUIRED_FLG")
	private BigDecimal requiredFlg;

	public FroleFuncDetail() {
	}

	public FroleFuncDetailPK getId() {
		return this.id;
	}

	public void setId(FroleFuncDetailPK id) {
		this.id = id;
	}

	public BigDecimal getConcealFlg() {
		return this.concealFlg;
	}

	public void setConcealFlg(BigDecimal concealFlg) {
		this.concealFlg = concealFlg;
	}

	public BigDecimal getEnableFlg() {
		return this.enableFlg;
	}

	public void setEnableFlg(BigDecimal enableFlg) {
		this.enableFlg = enableFlg;
	}

	public BigDecimal getPrivUpdate() {
		return this.privUpdate;
	}

	public void setPrivUpdate(BigDecimal privUpdate) {
		this.privUpdate = privUpdate;
	}

	public BigDecimal getRequiredFlg() {
		return this.requiredFlg;
	}

	public void setRequiredFlg(BigDecimal requiredFlg) {
		this.requiredFlg = requiredFlg;
	}

}