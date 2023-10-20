package com.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.employee.clerk.Clerk;
import com.employee.labour.Labour;
import com.employee.manager.Manager;

public class TestClass {

	public static void main(String[] args) {
		
      List<Employee>l1=new ArrayList<>();
      
        Scanner sc=new Scanner(System.in);
      
        int choice;
        do {
        	System.out.println("1 Enter Manager");
        	System.out.println("2 Enter Labour");
        	System.out.println("3 Enter clerk");
        	System.out.println("4 Total TotalIncome");
        	System.out.println("Enter choice");
        	choice=sc.nextInt();
        	switch (choice) {
			case 1:
				  Manager m1 =new Manager();
				  m1.accept();
			      l1.add(m1);
				break;
			case 2:
				  Labour l =new Labour();
				  l.acceptdata();
			      l1.add(l);
				break;
				
			case 3:
				  Clerk c =new Clerk();
				  c.accept();
			      l1.add(c);
				break;
			case 4:
				 double emp=Employee.calcTotalIncome(l1);
				 System.out.println(emp);
				break;

			default:
				break;
			}
        	
        }while(choice!=0);
        

	}

}
