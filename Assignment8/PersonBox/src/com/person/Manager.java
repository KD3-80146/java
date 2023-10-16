package com.person;

import java.util.Scanner;

public class Manager extends Person {
	
	private double bonus;
	private double salary;
	
	 
	
	public void acceptData()

	{
		super.acceptData();
		  Scanner sc= new Scanner(System.in);
		  System.out.print("Enter the salary = ");
		  this.salary=sc.nextDouble();
		  System.out.print("Enter the bonus = ");
		 this.bonus=sc.nextDouble();
		  setSalary();
		 
	}
	 public void setSalary() {
		  this.salary+=bonus;
	 }
	@Override
	public String toString() {
		return "Manager [bonus=" + bonus + ", salary=" + salary + ", getEmpid()=" + getEmpid() + ", getName()="
				+ getName() +  "]";
	}
	
	  
	
}
