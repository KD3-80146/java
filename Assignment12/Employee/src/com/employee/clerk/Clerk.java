package com.employee.clerk;

import java.util.Scanner;

import com.employee.Employee;

public class Clerk implements Employee{
	
	double fieldSalary;

	@Override
	public double getSal() {
		
		return fieldSalary;
	}
	
	public void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the fieldSalary");
		this.fieldSalary=sc.nextDouble();
	}
	
	
	

}
