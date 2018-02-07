package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the FWCBR_EXTRA_ROWS database table.
 * 
 */
@Entity
@Table(name="FWCBR_EXTRA_ROWS")
@NamedQuery(name="FwcbrExtraRow.findAll", query="SELECT f FROM FwcbrExtraRow f")
public class FwcbrExtraRow implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private FwcbrExtraRowPK id;

	@Column(name="START_ROW")
	private BigDecimal startRow;

	public FwcbrExtraRow() {
	}

	public FwcbrExtraRowPK getId() {
		return this.id;
	}

	public void setId(FwcbrExtraRowPK id) {
		this.id = id;
	}

	public BigDecimal getStartRow() {
		return this.startRow;
	}

	public void setStartRow(BigDecimal startRow) {
		this.startRow = startRow;
	}

}