package employee.salary;

public class SalariedEmployee extends EmployeesSalary{

	private double weeklySalary;
	
	

	@Override
	public  void setSalary() {
		
		  this.weeklySalary=weeklySalary;
	}
	
	public void acceptData()
	{
		super.acceptData();
		System.out.print("Enter the WeeklySalary = ");
		this.weeklySalary=sc.nextDouble();
		
	}

	@Override
	public String toString() {
		return "SalariedEmployee [weeklySalary=" + weeklySalary + ", SSN=" + SSN + ", firstNme=" + firstNme
				+ ", lastName=" + lastName + "]";
	}
	

}
