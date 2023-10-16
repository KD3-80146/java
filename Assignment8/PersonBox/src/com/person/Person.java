package com.person;

import java.util.Scanner;

abstract public class Person {

	private int empid;
	private String name;
	
	
	
	public Person() {
		super();
	}

	public Person(int empid, String name) {
		super();
		this.empid = empid;
		this.name = name;
		
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public void acceptData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Employee Id = ");
		this.empid=sc.nextInt();
		System.out.print("Enter the Name = ");
		this.name=sc.next();
		
		
	}

	@Override
	public String toString() {
		return "Perosn [empid=" + empid + ", name=" + name +  "]";
	}
	
	abstract public void setSalary();
	
	
	
}
