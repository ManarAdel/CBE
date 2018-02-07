package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the CBR_SELECT_OP database table.
 * 
 */
@Entity
@Table(name="CBR_SELECT_OP")
@NamedQuery(name="CbrSelectOp.findAll", query="SELECT c FROM CbrSelectOp c")
public class CbrSelectOp implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CbrSelectOpPK id;

	@Column(name="\"DATA\"")
	private String data;

	public CbrSelectOp() {
	}

	public CbrSelectOpPK getId() {
		return this.id;
	}

	public void setId(CbrSelectOpPK id) {
		this.id = id;
	}

	public String getData() {
		return this.data;
	}

	public void setData(String data) {
		this.data = data;
	}

}