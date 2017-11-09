package com.jpa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Laptop {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long lid;
	
	private String lapname;
	
	@OneToOne(mappedBy="laptop")
	private Student student;
	
	
	public Laptop() {
		
	}


	
	/*public Student getStudent() {
		return student;
	}
*/


	public void setStudent(Student student) {
		this.student = student;
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
