package com.example.springboot.dto;

public class StudentDto {

	private String name;
	private String ssn;
	
	public StudentDto(){}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
}
