package com.book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class TestBook {

	int menu()
	{
		int choice;
		System.out.println("***********************************");
		System.out.println("Exit Press 0");
		System.out.println("1.Add new Book in list");
		System.out.println("2.Display all books in forward order using random access ");
        System.out.println("3.Search a book with given isbn  ");
		System.out.println("4.Delete a book at given index. ");
		System.out.println("5.Delete a book with given isbn.");
		System.out.println("6.Reverse the list");
		System.out.print("Enter the choice = ");
		Scanner sc=new Scanner(System.in);
		choice=sc.nextInt();
		System.out.println("******************************************");
		return choice;
	}
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		  int index;
		 int choice;
		 TestBook m=new TestBook();
		
		 
		 List<Book> list = new ArrayList<Book>();
		 
		 while((choice=m.menu())!=0)
		 {
			 
			 switch (choice) {
			case 1:
				 Book book=new Book();
				book.acceptBook();
				
		         if(list.contains(book)==true)
		         {
	
		           int key=list.indexOf(book);
		             list.get(key).setQuantity(list.get(key).getQuantity()+book.getQuantity()); 
		         }
		         else
		         {
				list.add(book);
		         }
				break;
			case 2:
				 ListIterator<Book> list2= list.listIterator();
				  while(list2.hasNext())
				  {
					  Book ele=list2.next();
					  System.out.println(ele);
				  }
				break;
				
			case 3:
				System.out.println("Enter the International Standard Serial Number = ");
				 String isbn=sc.next();
				 Book b= new Book();
				 b.setIsBN(isbn);
				 if(list.contains(b))
				 {
					 int key=list.indexOf(b);
					 System.out.println(list.get(key));
				 }
				 
			   break;
			   
			case 4:
				System.out.println("Enter the index ");
				int index1=sc.nextInt();
				if(index1<list.size())
				{
					list.remove(index1);
				}
				else
				{
					System.out.println("Please enter the valid index.....");
				}
				
				break;
				
				
			case 5:
				System.out.println("Enter the International Standard Serial Number = ");
				 String isbn2=sc.next();
				 Book b2= new Book();
				                                                                                 
				 if(list.contains(b2))
				 {
					 int key2=list.indexOf(b2);
					 list.remove(key2);
				 }
				 else
				 {
					 System.out.println("International Standard Serial Number  not found ");
				 }
				 
				
				break;
				
			case 6:
				Collections.reverse(list);
				System.out.println(list);
				
				break;
			
				default:
					System.out.println("Please enter the valid choice..........");
					break;
					
			}
		 }
		 
	}


	}


