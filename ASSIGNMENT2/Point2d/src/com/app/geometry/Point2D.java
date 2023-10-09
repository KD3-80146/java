package com.app.geometry;
import java.util.Scanner;

import java.lang.Math; 

public class Point2D {
   
	 int x_axis;
	 int y_axis;
	 
	public Point2D() {
		this(1,2);
	}

	public Point2D(int x_axis, int y_axis) {
		
		this.x_axis = x_axis;
		this.y_axis = y_axis;
	}
	
	
	

	public void accept()
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the x_axis = ");
		this.x_axis=sc.nextInt();
		System.out.print("Enter the y_axis = ");
		this.y_axis=sc.nextInt();
		sc.close();
		
	}
	
	
	public String toString() {
		return "Point2D [x_axis=" + x_axis + ", y_axis=" + y_axis + "]";
	}

	public void display()
	{
		
		System.out.println(toString());
	}
	boolean isEqual(Point2D point2)
	{
		if(this.x_axis==point2.x_axis && this.y_axis==point2.y_axis)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	double calculateDistance(Point2D point2)
	{
	double result=Math.sqrt(Math.pow((this.x_axis-point2.x_axis),2)+Math.pow((this.y_axis-point2.y_axis),2));
	 return result;
		
	}
	
}



