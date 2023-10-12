package employee.salary;

public class BasePlusCommissionEmployee extends EmployeesSalary{

	
	
	private double grossSales;
	private double commissionRate;
	private double basicSalary=1000;
	@Override
	public void setSalary() {
		
		this.basicSalary+=(this.commissionRate * this.grossSales);
	}
	
	public void acceptData()
	{
		super.acceptData();
		System.out.println("Enter the BasicSalary");
		grossSales=sc.nextDouble();
		System.out.println("Enter the GrossSales");
		grossSales=sc.nextDouble();
		System.out.println("Enter the commissionRate");
		commissionRate=sc.nextDouble();
		
	}

	@Override
	public String toString() {
		return "BasePlusCommissionEmployee [grossSales=" + grossSales + ", commissionRate=" + commissionRate
				+ ", basicSalary=" + basicSalary + ", SSN=" + SSN + ", firstNme=" + firstNme + ", lastName=" + lastName
				+  "]";
	}
	
	

	

}
