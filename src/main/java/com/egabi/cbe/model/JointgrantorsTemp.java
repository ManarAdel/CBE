package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the JOINTGRANTORS_TEMP database table.
 * 
 */
@Entity
@Table(name="JOINTGRANTORS_TEMP")
@NamedQuery(name="JointgrantorsTemp.findAll", query="SELECT j FROM JointgrantorsTemp j")
public class JointgrantorsTemp implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//This Table Doesn't have A PK 
	//Generated Id 
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
	

	@Column(name="\"A\"")
	private String a;

	private String b;

	private String busdate;

	private String zz;

	public JointgrantorsTemp() {
	}

	public String getA() {
		return this.a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public String getB() {
		return this.b;
	}

	public void setB(String b) {
		this.b = b;
	}

	public String getBusdate() {
		return this.busdate;
	}

	public void setBusdate(String busdate) {
		this.busdate = busdate;
	}

	public String getZz() {
		return this.zz;
	}

	public void setZz(String zz) {
		this.zz = zz;
	}

}