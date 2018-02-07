package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the FSERVER_CONFIG database table.
 * 
 */
@Entity
@Table(name="FSERVER_CONFIG")
@NamedQuery(name="FserverConfig.findAll", query="SELECT f FROM FserverConfig f")
public class FserverConfig implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"HOST\"")
	private String host;

	@Column(name="\"PATH\"")
	private String path;

	private BigDecimal port;

	@Column(name="REP_DESTYPE")
	private String repDestype;

	@Column(name="REP_SERVER")
	private String repServer;

	private BigDecimal usrno;

	public FserverConfig() {
	}

	public String getHost() {
		return this.host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public BigDecimal getPort() {
		return this.port;
	}

	public void setPort(BigDecimal port) {
		this.port = port;
	}

	public String getRepDestype() {
		return this.repDestype;
	}

	public void setRepDestype(String repDestype) {
		this.repDestype = repDestype;
	}

	public String getRepServer() {
		return this.repServer;
	}

	public void setRepServer(String repServer) {
		this.repServer = repServer;
	}

	public BigDecimal getUsrno() {
		return this.usrno;
	}

	public void setUsrno(BigDecimal usrno) {
		this.usrno = usrno;
	}

}