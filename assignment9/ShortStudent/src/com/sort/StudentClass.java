package com.sort;

import java.util.Comparator;

public class StudentClass  {
	
	private int rollNo;
	private String name;
	private String city;
	private double marks;
	
	
	
	public StudentClass() {
		
	}
	public StudentClass(int rollNo, String name, String city, double marks) {
		
		this.rollNo = rollNo;
		this.name = name;
		this.city = city;
		this.marks = marks;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "StudentClass [rollNo=" + rollNo + ", name=" + name + ", city=" + city + ", marks=" + marks + "]";
	}
	
	
	
	
	

}
