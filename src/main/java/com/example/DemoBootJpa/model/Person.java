package com.example.DemoBootJpa.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Person {
	@Id
	private int person_Id;
	private String person_Name;
	private String person_Tech;
	@Override
	public String toString() {
		return "Person [person_Id=" + person_Id + ", person_Name=" + person_Name + ", person_Tech=" + person_Tech + "]";
	}
	public int getPerson_Id() {
		return person_Id;
	}
	public void setPerson_Id(int person_Id) {
		this.person_Id = person_Id;
	}
	public String getPerson_Name() {
		return person_Name;
	}
	public void setPerson_Name(String person_Name) {
		this.person_Name = person_Name;
	}
	public String getPerson_Tech() {
		return person_Tech;
	}
	public void setPerson_Tech(String person_Tech) {
		this.person_Tech = person_Tech;
	}
	
	

}
