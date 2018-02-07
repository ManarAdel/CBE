package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the JAVA$OPTIONS database table.
 * 
 */
@Entity
@Table(name="JAVA$OPTIONS")
@NamedQuery(name="Java$option.findAll", query="SELECT j FROM Java$option j")
public class Java$option implements Serializable {
	private static final long serialVersionUID = 1L;

	private String opt;

	@Column(name="\"VALUE\"")
	private String value;

	private String what;

	public Java$option() {
	}

	public String getOpt() {
		return this.opt;
	}

	public void setOpt(String opt) {
		this.opt = opt;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getWhat() {
		return this.what;
	}

	public void setWhat(String what) {
		this.what = what;
	}

}