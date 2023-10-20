package com.employee.manager;

import java.util.Scanner;

import com.employee.Employee;

public class Manager implements Employee{
    
       double basicSalary;
       double dearanceAllowance;
	@Override
	public double getSal() {
		// TODO Auto-generated method stub
		return (basicSalary + dearanceAllowance);
	}
	
	public void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Basic salary =");
		this.basicSalary=sc.nextDouble();
		System.out.println("Enter the DearanceAllowance =");
		this.dearanceAllowance=sc.nextDouble();
		}
	public double calcIncentives() {
		return basicSalary*0.2;
		
	}

}
