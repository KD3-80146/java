package com.maxarray;

public class FindMaxArray {
	
	 static <T extends Number> T findMin(T[] arr)
	 {
		 
		T min= arr[0];
	    
		for (T ele : arr) {
		if(ele.doubleValue()<min.doubleValue())
		{
			min=ele;
		}
		
			
		}
		return min;
		   
	 	
//		 Arrays.sort(arr);
//		 return arr[0];
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Integer []arr= {12,33,44,12};
		 Integer min= findMin(arr);
		 System.out.println(min);
		 
		 Double []arr2= {12.1,33.2,44.4,12.7};
		 Double  min2= findMin(arr2);
		 System.out.println(min2);
		 
		 Byte []arr4= {1,2,3,4};
		 Byte min3=findMin(arr4);
		 System.out.println(min3);
		 
		 Long []arr5= {1L,2L,3L,4L};
		 Long min4=findMin(arr5);
		 System.out.println(min4);
		 
		 
		 
		 

	}

}
