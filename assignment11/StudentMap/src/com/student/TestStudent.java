package com.student;

import java.lang.invoke.SwitchPoint;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class TestStudent {

	public static void main(String[] args) {
		  
    Scanner sc =new Scanner(System.in);
//        Student sc= new Student();
//        sc.AcceptDate();
//        System.out.println(sc);
		Map<Integer, Student> map = new HashMap<>();
		
		int choice;
		do {
			System.out.println("Press 0 for exit");
			System.out.println("1. Add Student ");
			System.out.println("2. Display Student");
			System.out.println("3. Find Student ");
			System.out.print("Enter you choice");
			choice=sc.nextInt();
			switch (choice) {
			case 1:
				Student student=new Student();
				student.AcceptDate();
				map.put(student.getRollNo(), student);
				break;
			case 2:
//				Collection<Student> value=map.values();
//				System.out.println(value);
				Set<Entry<Integer,Student>> entries = map.entrySet();
		        for(Entry<Integer,Student> entry : entries) {
		        	System.out.println(entry.getKey() + " -- " + entry.getValue());
		        }
		        
				break;
				
			case 3:
				System.out.print("Enter the Student Roll no ");
				int roll=sc.nextInt();
				Student student2=map.get(roll);
				if(student2!=null)
				System.out.println(student2);
				else
					System.out.println("Student not found......");
				

			default:
				System.out.println("Enter the valid choice ............");
				break;
			}
		}while (choice!=0);
		
	}

}
