package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the FREP_DESFORMAT database table.
 * 
 */
@Entity
@Table(name="FREP_DESFORMAT")
@NamedQuery(name="FrepDesformat.findAll", query="SELECT f FROM FrepDesformat f")
public class FrepDesformat implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private FrepDesformatPK id;

	private String desformat;

	public FrepDesformat() {
	}

	public FrepDesformatPK getId() {
		return this.id;
	}

	public void setId(FrepDesformatPK id) {
		this.id = id;
	}

	public String getDesformat() {
		return this.desformat;
	}

	public void setDesformat(String desformat) {
		this.desformat = desformat;
	}

}