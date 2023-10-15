package array.sring;

import java.util.Scanner;

public class ArrayString {

	public static void main(String[] args) {
		     
		
		Scanner sc=new Scanner(System.in);
		    
		     int size;
		     System.out.print("Enter the Size of array = ");
		     size=sc.nextInt();
		     
		
        	String[] arr= new String[size];	
        	System.out.println("Enter the First Array element ");
        	for(int i=0;i<size;i++)
        	{
        		arr[i]=sc.next();
        	}
        	String[] arr2= new String[size];	
        	System.out.println("Enter the Second Array element ");
        	for(int i=0;i<size;i++)
        	{
        		arr2[i]=sc.next();
        	}
		   
        	
        	for(int i=0;i<size;i++)
        	{
        		if(arr[i].equals(arr2[i]))
        		{
        			System.out.println("Element the are equal "+arr[i]);
        		}
        	}
		

	}

}
