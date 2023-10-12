package employee.salary;

public class TestEmployee {

	public static void main(String[] args) {
		 System.out.println("******************************");
		EmployeesSalary emp3 =new hourlyEmployee();
		
		emp3.acceptData();
		emp3.setSalary();
		System.out.println(emp3.toString());
		 System.out.println("******************************");
	
	  EmployeesSalary emp =new SalariedEmployee();
	  
	  System.out.println("********************");
	  emp.acceptData();
	  emp.setSalary();
	  
	  System.out.println(emp. toString());
	  
	  System.out.println("******************************");
		
		EmployeesSalary emp2 =new CommissionEmployees();
		 System.out.println("********************");
		  emp2.acceptData();
		  emp2.setSalary();
		  System.out.println(emp2.toString());
		  
		  System.out.println("******************************");
	
	  EmployeesSalary emp1 =new BasePlusCommissionEmployee();
	  System.out.println("********************");
	  emp1.acceptData();
      emp1.setSalary();
	  System.out.println(emp1. toString());
  
  System.out.println("******************************");
	  

	  
	}

}
