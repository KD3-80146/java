package employee.salary;

import java.util.Scanner;

 abstract public class EmployeesSalary {
	
     protected int SSN;
     protected String firstNme;
     protected String lastName;
     
     Scanner sc=new Scanner(System.in);
     
     
     
  
	public EmployeesSalary() {
	}

	public EmployeesSalary(int sSN, String firstNme, String lastName, Scanner sc) {
		SSN = sSN;
		this.firstNme = firstNme;
		this.lastName = lastName;
		
	}

	@Override
	public String toString() {
		return "EmployeesSalary [SSN=" + SSN + ", firstNme=" + firstNme + ", lastName=" + lastName + "]";
	}

	public void acceptData()
     {
    	
    	
    	 System.out.print("Enter Employee Id = ");
    	 this.SSN=sc.nextInt();
    	 
    	 System.out.print("Enter Employee FirstName= ");
    	 this.firstNme=sc.next();
    	 
    	 System.out.print("Enter Employee Lastname =");
    	 this.lastName=sc.next();
     
     }
	
	  abstract public void setSalary();
     
     

}
