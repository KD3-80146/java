package com.employee;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TestEmployee {
	
	
	public static void main(String[] args) {
		int choice;
		List<Employee> link= new LinkedList<Employee>();
		do {
		Scanner sc=new Scanner(System.in);
		System.out.println("*******************************");
		System.out.println("Press 0 for Exit");
	    System.out.println("1 Add Employee  ");
	    System.out.println("2 Delete Employee");
	    System.out.println("3 Find Employee");
	    System.out.println("4 Sort Employee");
	    System.out.println("5 Edit employee at specific index ");
	    System.out.print("Enter Choice =");
	    choice=sc.nextInt();
	    System.out.println("****************************************");
	    switch (choice) {
		case 1:
			Employee e1=new Employee();
			 e1.acceptDeta();
			link.add(e1);
			break;
		case 2:
			System.out.println("Enter the index =");
			int index=sc.nextInt();
			link.remove(index);
	       break;
		case 3:
			System.out.println("Enter the Employee Id you want to search = ");
			 int id=sc.nextInt();
			 Employee e2=new Employee();
			 e2.setEmpId(id);
			 if(link.contains(e2))
			 {
				 int index2=link.indexOf(e2);
				System.out.println(link.get(index2));
				 
			 }
			 
		case 4:
			 class EmployeeCompare implements Comparator<Employee>{

				@Override
				public int compare(Employee arg0, Employee arg1) {
					   int diff= Integer.compare(arg0.getEmpId(),arg1.getEmpId());
					return diff;
				}
				 
			 }
			 EmployeeCompare employee =new EmployeeCompare();
			Collections.sort(link, employee);
			 
			break;
			
		case 5:
			System.out.println("Enter emp id to be modified: ");
			int id2= sc.nextInt();
			Employee key = new Employee();
			key.setEmpId(id2);
			int index3 = link.indexOf(key);
			if(index3 == -1)
			System.out.println("Employee not found.");
			else {
			Employee oldEmp = link.get(index3);
			System.out.println("Employee Found: " + oldEmp);
			System.out.println("Enter new information for the Employee");
			Employee newEmp = new Employee();
			newEmp.acceptDeta();
			
			link.set(index3, newEmp);
			}
		default:
			
			break;
		}
	    
		}while(choice!=0);

	}

}
