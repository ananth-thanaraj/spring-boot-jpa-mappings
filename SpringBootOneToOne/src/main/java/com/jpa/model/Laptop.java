package com.jpa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Laptop {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long lid;
	
	private String lapname;
	
	
	public Laptop() {
		
	}


	public Long getLid() {
		return lid;
	}


	public void setLid(Long lid) {
		this.lid = lid;
	}


	public String getLapname() {
		return lapname;
	}


	public void setLapname(String lapname) {
		this.lapname = lapname;
	}

	
}
