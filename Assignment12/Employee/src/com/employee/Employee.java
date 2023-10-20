package com.employee;

import java.util.Collection;

public interface Employee {
	
	double getSal();
	default double calcIncentives() {
		return 0.0;
	}
static double calcTotalIncome(Collection<Employee> l1) {
	    double total=0;
	    for(Employee ele:l1)
	    {
	    	total+=ele.calcIncentives()+ele.getSal();
	    	
	    }

		return total;
		
	}
}
