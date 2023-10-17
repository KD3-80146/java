package com.book;

import java.util.Scanner;

public class Book {
	
     private String isBN;
     private double price;
     private String authorName;
     private int quantity;
     
     
	public Book() {
		
	}
	public Book(String isBN, double price, String authorName, int quantity) {
		super();
		this.isBN = isBN;
		this.price = price;
		this.authorName = authorName;
		this.quantity = quantity;
	}
	public String getIsBN() {
		return isBN;
	}
	public void setIsBN(String isBN) {
		this.isBN = isBN;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public void acceptBook()
	{
		 Scanner sc= new Scanner(System.in);
		System.out.print("Enter the International Standard Serial Number =");
		this.isBN=sc.next();
		System.out.print("Enter the Price = ");
		this.price=sc.nextDouble();
		System.out.print("Enter the Authorname =");
		this.authorName=sc.next();
		System.out.print("Enter the Quntity = ");
		this.quantity=sc.nextInt();
	}
	
	public void displayBook()
	{
		System.out.println("International Standard Serial Number is "+this.isBN);
		System.out.println("Price is ="+this.price);
		System.out.println("Author Name is = "+this.authorName);
		System.out.println("Quantity = "+this.quantity);
	}
	
	@Override
	public boolean equals(Object obj) {
		
		return super.equals(obj);
	}
	
     
     
}
