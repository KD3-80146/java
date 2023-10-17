package com.book;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class TestBook {

	int menu()
	{
		int choice;
		System.out.println("Exit Press 0");
		System.out.println("1.Add new Book in list");
		System.out.println("2.Display all Books in forward orders ");
        System.out.println("3.Delete at book given index -- list.remove(index) ");
		System.out.println("4.Check if Book given isbn is list or not ");
		System.out.println("5.Delete all Books");
		System.out.println("6.Display number of books in list");
		System.out.println("7.Sort all books by price in desc order -- list.sort();");
		Scanner sc=new Scanner(System.in);
		choice=sc.nextInt();
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
				list.add(book);
				break;
			case 2:
				 for(Book b:list)
				 {
					 b.displayBook();
					
				 }
				break;
				
			case 3:
				System.out.print("Enter the Index =");
				index=sc.nextInt();
				list.remove(index);
			   break;
			   
			case 4:
				System.out.println("Enter the International Standard Serial Number = ");
				 String isbn=sc.next();
				 Book b= new Book();
				 b.setIsBN(isbn);
				 if(list.contains(b))
				 {
					 System.out.println("found");
				 }
				 else
				 {
					 System.out.println("Not Found");
				 }
				 
				break;
				
				
			case 5:
				list.clear();
				break;
				
			case 6:
				System.out.println("size ="+list.size());
				break;
			case 7:
				class BookPriceComperator implements Comparator<Book> {

					@Override
					public int compare(Book arg0, Book arg1) {
						 int diff=Double.compare(arg0.getPrice(), arg1.getPrice());
						return diff;
					}
					
				}
				BookPriceComperator comperator =new BookPriceComperator();
				list.sort(comperator);
				break;
			default:
				System.out.println("Enter the valid choice ....");
				break;
			}
		 }
		 
	}

}
