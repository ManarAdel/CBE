package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the FHELP_HKEYS database table.
 * 
 */
@Entity
@Table(name="FHELP_HKEYS")
@NamedQuery(name="FhelpHkey.findAll", query="SELECT f FROM FhelpHkey f")
public class FhelpHkey implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long keyno;

	private String aname;

	private String ename;

	private String shortcut;

	public FhelpHkey() {
	}

	public long getKeyno() {
		return this.keyno;
	}

	public void setKeyno(long keyno) {
		this.keyno = keyno;
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

	public String getShortcut() {
		return this.shortcut;
	}

	public void setShortcut(String shortcut) {
		this.shortcut = shortcut;
	}

}