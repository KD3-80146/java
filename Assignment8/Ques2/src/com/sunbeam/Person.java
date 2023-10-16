package com.sunbeam;

import java.util.Scanner;

public class Person implements Displayable{

	private String name ;
	private int age;
	
	public Person() {
		super();
	}



	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}



	public void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name = ");
		name = sc.next();
		System.out.println("Enter Age = ");
		age = sc.nextInt(); 
	}
	
 

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Name is = "+name);
    	System.out.println("Age is = "+age);
	}
}
