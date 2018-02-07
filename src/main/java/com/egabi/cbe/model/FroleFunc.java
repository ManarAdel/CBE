package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the FROLE_FUNC database table.
 * 
 */
@Entity
@Table(name="FROLE_FUNC")
@NamedQuery(name="FroleFunc.findAll", query="SELECT f FROM FroleFunc f")
public class FroleFunc implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private FroleFuncPK id;

	@Column(name="PRIV_DELETE")
	private BigDecimal privDelete;

	@Column(name="PRIV_INSERT")
	private BigDecimal privInsert;

	@Column(name="PRIV_PRINT")
	private BigDecimal privPrint;

	@Column(name="PRIV_QUERY")
	private BigDecimal privQuery;

	@Column(name="PRIV_UPDATE")
	private BigDecimal privUpdate;

	public FroleFunc() {
	}

	public FroleFuncPK getId() {
		return this.id;
	}

	public void setId(FroleFuncPK id) {
		this.id = id;
	}

	public BigDecimal getPrivDelete() {
		return this.privDelete;
	}

	public void setPrivDelete(BigDecimal privDelete) {
		this.privDelete = privDelete;
	}

	public BigDecimal getPrivInsert() {
		return this.privInsert;
	}

	public void setPrivInsert(BigDecimal privInsert) {
		this.privInsert = privInsert;
	}

	public BigDecimal getPrivPrint() {
		return this.privPrint;
	}

	public void setPrivPrint(BigDecimal privPrint) {
		this.privPrint = privPrint;
	}

	public BigDecimal getPrivQuery() {
		return this.privQuery;
	}

	public void setPrivQuery(BigDecimal privQuery) {
		this.privQuery = privQuery;
	}

	public BigDecimal getPrivUpdate() {
		return this.privUpdate;
	}

	public void setPrivUpdate(BigDecimal privUpdate) {
		this.privUpdate = privUpdate;
	}

}