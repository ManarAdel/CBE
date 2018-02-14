package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the TXT database table.
 * 
 */
@Entity
@NamedQuery(name="Txt.findAll", query="SELECT t FROM Txt t")
public class Txt implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
	//This Table Doesn't have A PK 
	//Generated Id 
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
	


	private String txt;

	public Txt() {
	}

	public String getTxt() {
		return this.txt;
	}

	public void setTxt(String txt) {
		this.txt = txt;
	}

}