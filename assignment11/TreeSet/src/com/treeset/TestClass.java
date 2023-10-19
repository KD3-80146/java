package com.treeset;


import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;



public class TestClass {

	

	public static void main(String[] args) {
		{
			Set<Book> hashSet= new TreeSet<>();
			
	        hashSet.add(new Book("1",1000.0,"Ujjwal",10));
	        hashSet.add(new Book("2",2000.0,"Ram",20));
	        hashSet.add(new Book("4",5000.0,"Rahim",70));
	        hashSet.add(new Book("5",3000.0,"Rohan",60));
	        hashSet.add(new Book("1",1000.0,"Ujjwal",78));

//	        for(Book b:hashSet)
//	        {
//	        	System.out.println(b);
//	        }
	       Iterator<Book> itr3= hashSet.iterator();
	       
	         while(itr3.hasNext())
	         {
	        	Book i= itr3.next();
	        	System.out.println(i);
	        	 
	         }
			
		}
		//If any book with duplicate isbn is added  ???
		//It will add only 1 occurence object No it is Added
		
		//it Will show the duplicate value 
		
		//Books are stored in which order?
		
		//Book are store in in the sorted order.
		
	

	}

}
