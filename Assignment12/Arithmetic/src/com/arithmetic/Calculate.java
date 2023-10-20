package com.arithmetic;

import java.util.Scanner;

public class Calculate  {
	
	static void calculate(double num1, double num2, Arithmetic op) {
		double result = op.calc(num1, num2);
		System.out.println("Result: "+result);
		}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int choice;
		do {
		
		System.out.println("Press 0 for exit");
		System.out.println("1.Add");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.print("Enter the choice");
		choice=sc.nextInt();
		
		switch (choice) {
		case 1:
		    System.out.print("Enter the two number =");
			double x;
			x=sc.nextDouble();
			
			double y;
			y=sc.nextDouble();
			 Calculate.calculate(y, x,(a,b)-> a+b);
			
			break;
        case 2:
        	System.out.print("Enter the two number =");
			double q;
			q=sc.nextDouble();
			
			double p;
			p=sc.nextDouble();
			Calculate.calculate(q, p,(a,b)-> a-b);
			break;
        case 3:
        	System.out.print("Enter the two number =");
			double z;
			z=sc.nextDouble();
			
			double u;
			u=sc.nextDouble();
			Calculate.calculate(z, u,(a,b)-> a*b);
			
			break;
        case 4:
        	System.out.print("Enter the two number =");
			double l;
			l=sc.nextDouble();
			
			double m;
			m=sc.nextDouble();
			Calculate.calculate(l, m,(a,b)-> a/b);
			
			break;

		default:
			System.out.println("Please Enter the valid choice....");
			break;
		}
		
		
		
		
		}while(choice!=0);
	}

	
	


}
