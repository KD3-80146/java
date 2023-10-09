package employee.detail;

import java.util.Scanner;

public class Employee {
      
	   String firstName;
	   String lastName;
	   double salary;
	   
	   public Employee()
	   {
		   this("","",0);
	   }
	public Employee(String firstName, String lastName, double salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void acceptEmployee()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Name = ");
		firstName=sc.next();
		
		System.out.println("Enter the Last Name = ");
		firstName=sc.next();
		System.out.println("Enter the Salary = ");
		double x=sc.nextDouble();
		if(x>0)
		{
		   salary=x;
		}
		
	}
	
	public void displayEmployee()
	{
		System.out.println("First Name is = "+firstName);
		System.out.println("Last Name is = "+lastName);
		
		System.out.println("Salary = "+salary);
		
	}
	  
	public void increament()
	{
		this.salary=salary+salary*.10;
	}
	   
	   
}
