package com.person;

import java.util.Scanner;

public class Employee extends Person{
	 

	  private double salary;
	  
	  
	  public Employee() {
		super();
		
	}


	public Employee(int empid, String name) {
		
		
	}
	public void setSalary() {
		
	}


	public void acceptData()
	  {
		  super.acceptData();
		  Scanner sc= new Scanner(System.in);
		  
		  System.out.print("Enter the salary = ");
		  this.salary=sc.nextDouble();
	  }


	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", getEmpid()=" + getEmpid() + ", getName()=" + getName()
				+ "]";
	}
	
	 
	  
}
