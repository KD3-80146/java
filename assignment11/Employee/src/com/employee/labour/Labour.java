package com.employee.labour;

import java.util.Scanner;

import com.employee.Employee;

public class Labour implements Employee{
    
	double hours;
	double rate;
	
	public void acceptdata() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the hour");
		this.hours=sc.nextDouble();
		System.out.println("Enter the Rate");
		this.rate=sc.nextDouble();
	}
	@Override
	public double getSal() {
		// TODO Auto-generated method stub
		return (hours * rate);
	}
	public double calcIncentives()
	 {
		   if(this.hours>300)
		return (hours * rate)*0.5;
		return 0;
	}

}
