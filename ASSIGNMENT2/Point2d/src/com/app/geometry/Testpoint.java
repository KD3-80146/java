package com.app.geometry;

public class Testpoint {

	public static void main(String[] args) {
		 Point2D point1=new Point2D();
		 Point2D point2=new Point2D();
		 
		 boolean b;
		 b=point1.isEqual(point2);
		 if(b) {
			 System.out.println();
		 }else {
			 double res;
			 res = point1.calculateDistance(point2);
			 System.out.println(res);
		 }
		
		
		 
		 
		 
//		 
		 

	}

}
