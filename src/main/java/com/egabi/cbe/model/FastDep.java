package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the FAST_DEP database table.
 * 
 */
@Entity
@Table(name="FAST_DEP")
@NamedQuery(name="FastDep.findAll", query="SELECT f FROM FastDep f")
public class FastDep implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long code;

	private String aname;

	private String ename;

	public FastDep() {
	}

	public long getCode() {
		return this.code;
	}

	public void setCode(long code) {
		this.code = code;
	}

	public String getAname() {
		return this.aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public String getEname() {
		return this.ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

}