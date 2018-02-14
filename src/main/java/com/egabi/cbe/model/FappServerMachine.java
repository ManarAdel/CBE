package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the FAPP_SERVER_MACHINE database table.
 * 
 */
@Entity
@Table(name="FAPP_SERVER_MACHINE")
@NamedQuery(name="FappServerMachine.findAll", query="SELECT f FROM FappServerMachine f")
public class FappServerMachine implements Serializable {
	private static final long serialVersionUID = 1L;
	
			//This Table Doesn't have A PK 
			//Generated Id 
			@Id
		    @GeneratedValue(strategy=GenerationType.IDENTITY)
		    private Long id;

	@Column(name="MACHINE_NAME")
	private String machineName;

	public FappServerMachine() {
	}

	public String getMachineName() {
		return this.machineName;
	}

	public void setMachineName(String machineName) {
		this.machineName = machineName;
	}

}