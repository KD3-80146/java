package com.employee;

import java.util.Objects;
import java.util.Scanner;

public class Employee {

     private int empId;
     private String name;
     private double salary;
     
     
	
	public Employee() {
		super();
	}
	public Employee(int empId, String name, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void acceptDeta()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the EmpId =");
		this.empId=sc.nextInt();
		System.out.print("Enter the Name  =");
		this.name=sc.next();
		System.out.print("Enter the Salary =");
		this.salary=sc.nextDouble();
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Employee)) {
			return false;
		}
		Employee other = (Employee) obj;
		return empId == other.empId ;
	}
	
	
     
     
}
