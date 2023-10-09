package employee.date;

import java.util.Scanner;

public class Dates {
    int day;
    int month;
    int year;
    
    public Dates()
    {
    	this(0,0,0);
    }
    public Dates(int day,int month,int year)
    {
    	this.day=day;
    	this.month=month;
    	this.year=year;
    }
    
    
    public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void acceptDay()
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("******************");
    	System.out.print("Enter The day =");
    	this.day=sc.nextInt();
    	System.out.print("Enter The Month =");
    	this.month=sc.nextInt();
    	System.out.print("Enter The Year =");
    	this.year=sc.nextInt();
    	System.out.println("**************");
    	
    }
    
    public void displayDay()
    {
    	System.out.println("*****************");
    	System.out.println("Date is "+day+"/"+month+"/"+year);
    	System.out.println("****************");
    }
}
