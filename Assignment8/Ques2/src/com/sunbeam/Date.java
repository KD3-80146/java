package com.sunbeam;

import java.util.Scanner;

public class Date  implements Displayable{
	
	private int day;
	private int month;
	private int year;
	
	public void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the day = ");
		day = sc.nextInt();
		System.out.println("Enter the month = ");
		month = sc.nextInt();
		System.out.println("Enter the year = ");
		year = sc.nextInt();
	}
	
	public void display()
	{
		System.out.println("Date is = "+day+"/"+month+"/"+year);
	}

	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	

}
