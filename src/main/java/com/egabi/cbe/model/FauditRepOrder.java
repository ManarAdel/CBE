package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the FAUDIT_REP_ORDER database table.
 * 
 */
@Entity
@Table(name="FAUDIT_REP_ORDER")
@NamedQuery(name="FauditRepOrder.findAll", query="SELECT f FROM FauditRepOrder f")
public class FauditRepOrder implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private FauditRepOrderPK id;

	@Column(name="ITEM_ORDER")
	private BigDecimal itemOrder;

	public FauditRepOrder() {
	}

	public FauditRepOrderPK getId() {
		return this.id;
	}

	public void setId(FauditRepOrderPK id) {
		this.id = id;
	}

	public BigDecimal getItemOrder() {
		return this.itemOrder;
	}

	public void setItemOrder(BigDecimal itemOrder) {
		this.itemOrder = itemOrder;
	}

}