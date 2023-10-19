package com.book;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;



public class TestBook {
	
	public static void main(String[] args)
	{
		Set<Book> hashSet= new HashSet<>();
		
        hashSet.add(new Book("1",1000.0,"Ujjwal",10));
        hashSet.add(new Book("2",2000.0,"Ram",20));
        hashSet.add(new Book("4",5000.0,"Rahim",70));
        hashSet.add(new Book("5",3000.0,"Rohan",60));
        hashSet.add(new Book("1",1000.0,"Ujjwal",10));

//        for(Book b:hashSet)
//        {
//        	System.out.println(b);
//        }
       Iterator<Book> itr3= hashSet.iterator();
       
         while(itr3.hasNext())
         {
        	Book i= itr3.next();
        	System.out.println(i);
        	 
         }
		
	}
	//If any book with duplicate isbn is added  ???
	//yes it is Added
	
	//it Will show the duplicate value 
	
	//Books are stored in which order?
	
	//Book are store in in the address of there Hashvalue.
	
	//How to Solve That problem (Duplicate)?
	 
	// To solve the value we have to write hashCode along with equal method in the class

}
