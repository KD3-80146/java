package com.student;

import java.util.Scanner;

public class Student {
      private int rollNo;
      private String name;
      private double marks;
      
      
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
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	void AcceptDate()
      {
    	  Scanner sc=new Scanner(System.in);
    	  System.out.print("Enter the RollNumber =");
    	  this.rollNo=sc.nextInt();
    	  System.out.print("Enter The Name = ");
    	  this.name=sc.next();
    	  System.out.print("Enter the marks =");
    	  this.marks=sc.nextDouble();
    	  
      }
       @Override
    public String toString() {
 	 return "("+"Roll ="+this.rollNo+"  "+"Name is = "+this.name+"   " +"Marks is = " + this.marks+")";
    	
    }
      
}
