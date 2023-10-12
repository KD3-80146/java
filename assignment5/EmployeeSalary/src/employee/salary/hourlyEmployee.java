package employee.salary;

public class hourlyEmployee extends EmployeesSalary {
	  
	
	private double wage;
	private double hours;
	
	
	@Override
	public void setSalary() {
		if(hours<=40)
			{
				this.wage*=hours;
				
			}
			else
				if(hours>40)
			{
					this.wage=(40*this.wage) +(hours-40)*(wage*1.5);		
			}
			
		
	}
	
	
    public void acceptData()
    {
    	super.acceptData();
    	System.out.println("Enter the Hourly wage = ");
        wage=sc.nextDouble();
        System.out.println("Enter the hourly hours =");
        hours=sc.nextDouble();
    }


	@Override
	public String toString() {
		return "hourlyEmployee [wage=" + wage + ", hours=" + hours + ", SSN=" + SSN + ", firstNme=" + firstNme
				+ ", lastName=" + lastName +  "]";
	}
    
    
	
	
}