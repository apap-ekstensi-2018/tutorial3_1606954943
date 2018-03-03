package com.example.tutorial3.model;

public class StudentModel {
	private String name;
	private String npm;
	private double gpa;
	
	public StudentModel(String npm, String name, double gpa) {
		this.npm = npm;
		this.name = name;
		this.gpa = gpa;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getNpm() {
		return npm;
	}



	public void setNpm(String npm) {
		this.npm = npm;
	}



	public double getGpa() {
		return gpa;
	}



	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

}
