package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the CBR_EXTRA_ROWS database table.
 * 
 */
@Entity
@Table(name="CBR_EXTRA_ROWS")
@NamedQuery(name="CbrExtraRow.findAll", query="SELECT c FROM CbrExtraRow c")
public class CbrExtraRow implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CbrExtraRowPK id;

	private BigDecimal flag;

	@Column(name="START_ROW")
	private BigDecimal startRow;

	public CbrExtraRow() {
	}

	public CbrExtraRowPK getId() {
		return this.id;
	}

	public void setId(CbrExtraRowPK id) {
		this.id = id;
	}

	public BigDecimal getFlag() {
		return this.flag;
	}

	public void setFlag(BigDecimal flag) {
		this.flag = flag;
	}

	public BigDecimal getStartRow() {
		return this.startRow;
	}

	public void setStartRow(BigDecimal startRow) {
		this.startRow = startRow;
	}

}