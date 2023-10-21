package com.array;

import java.util.Scanner;

public class ArrayEqual {
	static <T>int countIf(T[]arr,T key,Check<T>c){

		int count=0;
		for(T ele:arr)
		{
			if(c.compare(ele, key))
			{
				count++;
			}
		}

		return count;

	}

	public static void main(String[]args)
	{
		Double []arr= {1.2,2.7,2.2,3.3,4.4};
		System.out.println("Enter the key you want to search");
       Scanner sc=new Scanner(System.in);
        double key;
        key=sc.nextDouble();
        
		int count=countIf(arr, key, (a,b)->a.equals(b));
		if(count>=1)
		System.out.println("Element found");
		else
		{
			System.out.println("Element not found");
		}

		
	}
}
