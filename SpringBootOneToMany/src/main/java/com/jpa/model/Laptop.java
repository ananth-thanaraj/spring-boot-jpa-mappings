package com.jpa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Laptop {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long lid;
	
	private String lname;
	
	@ManyToOne
	@JoinColumn(name="sid")
	private Student student;
	
	public Laptop() {
		
	}

	public Long getLid() {
		return lid;
	}

	public void setLid(Long lid) {
		this.lid = lid;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	/*public Student getStudent() {
		return student;
	}*/

	public void setStudent(Student student) {
		this.student = student;
	}

	

}
