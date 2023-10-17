package com.sort;

import java.util.Arrays;
import java.util.Comparator;
 
class StudentCompare implements Comparator<StudentClass>
{

	@Override
	public int compare(StudentClass arg0, StudentClass arg1) {
		int diff = -arg0.getCity().compareTo(arg1.getCity());
		 
		   if(diff==0)
		   {
			diff= -Double.compare(arg0.getMarks(),arg1.getMarks());
		
			if(diff==0)
			{
				diff = arg0.getName().compareTo(arg1.getName());
				return diff;
			}
		}
		
		
		return diff;
		
	}
	
}

public class TestStudent {

	public static void main(String[] args) {
		
		StudentCompare studentCompare =new StudentCompare();
		
		StudentClass []studentClass =new StudentClass[5];
		
		
		studentClass[0]=new StudentClass(1,"Ram","Karad",100);
		studentClass[1]=new StudentClass(2,"Aryan","Karad",100);
		studentClass[2]=new StudentClass(5,"Sudhanshu","Pune",99);
		studentClass[3]=new StudentClass(4,"satya","Delhi",59);
		studentClass[4]=new StudentClass(3,"Shivam","Arrah",28);
		
		
		
		for(StudentClass ele:studentClass)
		
		System.out.println(ele);
		
		
		
		
		Arrays.sort(studentClass,studentCompare);
		
		
		System.out.println();
       System.out.println();
       
		for(StudentClass ele:studentClass)
			
			System.out.println(ele);
		

	}

}
