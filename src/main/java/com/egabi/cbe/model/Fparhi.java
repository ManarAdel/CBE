package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the FPARHIS database table.
 * 
 */
@Entity
@Table(name="FPARHIS")
@NamedQuery(name="Fparhi.findAll", query="SELECT f FROM Fparhi f")
public class Fparhi implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long glno;

	public Fparhi() {
	}

	public long getGlno() {
		return this.glno;
	}

	public void setGlno(long glno) {
		this.glno = glno;
	}

}