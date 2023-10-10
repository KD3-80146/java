package point.create;

import java.util.Scanner;


public class Point2d {
   
	private int x_axis;
	private int y_axis;
	
	
	
	public Point2d() {
		this(0,0);
	}



	public Point2d(int x_axis, int y_axis) {
		this.x_axis = x_axis;
		this.y_axis = y_axis;
	}
	
	public void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter X_axis = ");
		x_axis=sc.nextInt();
		System.out.print("Enter Y_axis = ");
		y_axis=sc.nextInt();
	}
	
      public void display()
      {
    	  System.out.println("*********************");
    	  System.out.println(" X_axis = "+x_axis);
    	  System.out.println("Y_axis =  "+y_axis);
    	  System.out.println("*********************");
    	  
      }
      
      boolean isEqual(Point2d point2)
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
  	double calculateDistance(Point2d point2)
  	{
  	double result=Math.sqrt(Math.pow((this.x_axis-point2.x_axis),2)+Math.pow((this.y_axis-point2.y_axis),2));
  	 return result;
  		
  	}
	
	
	
}
