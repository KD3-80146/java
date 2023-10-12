package employee.salary;

import java.util.Scanner;

public class CommissionEmployees extends  EmployeesSalary{

	private double grossSales=0;
	private double commissionRate;
	
	
	@Override
	public void setSalary() {
		
		 grossSales*=commissionRate;
	}


	
	@Override
	public void acceptData()
	{
		 Scanner sc=new Scanner(System.in);
		 super.acceptData();
		 System.out.print("Enter the grossSales = ");
		 
		  grossSales=sc.nextDouble();
		  System.out.print("Enter the CommissionRate = ");
		  commissionRate=sc.nextDouble();
		  
	}


	@Override
	public String toString() {
		return "CommissionEmployees [grossSales=" + grossSales + ", commissionRate=" + commissionRate + ", SSN=" + SSN
				+ ", firstNme=" + firstNme + ", lastName=" + lastName + ", " +"]";
	}
	
	

}
