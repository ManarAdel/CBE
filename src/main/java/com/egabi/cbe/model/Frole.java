package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the FROLES database table.
 * 
 */
@Entity
@Table(name="FROLES")
@NamedQuery(name="Frole.findAll", query="SELECT f FROM Frole f")
public class Frole implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ROLE_ID")
	private long roleId;

	private String aname;

	private String ename;

	//bi-directional many-to-one association to CbrReportsAccess
	@OneToMany(mappedBy="frole")
	private List<CbrReportsAccess> cbrReportsAccesses;

	public Frole() {
	}

	public long getRoleId() {
		return this.roleId;
	}

	public void setRoleId(long roleId) {
		this.roleId = roleId;
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

	public List<CbrReportsAccess> getCbrReportsAccesses() {
		return this.cbrReportsAccesses;
	}

	public void setCbrReportsAccesses(List<CbrReportsAccess> cbrReportsAccesses) {
		this.cbrReportsAccesses = cbrReportsAccesses;
	}

	public CbrReportsAccess addCbrReportsAccess(CbrReportsAccess cbrReportsAccess) {
		getCbrReportsAccesses().add(cbrReportsAccess);
		cbrReportsAccess.setFrole(this);

		return cbrReportsAccess;
	}

	public CbrReportsAccess removeCbrReportsAccess(CbrReportsAccess cbrReportsAccess) {
		getCbrReportsAccesses().remove(cbrReportsAccess);
		cbrReportsAccess.setFrole(null);

		return cbrReportsAccess;
	}

}