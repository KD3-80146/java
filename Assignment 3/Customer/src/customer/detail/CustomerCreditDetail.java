package customer.detail;

import java.util.Scanner;

public class CustomerCreditDetail {

	
	private int accNumber ;
	private int balBeginning ;
	private int chargePayed ;
	private int totalAmmountSpend;
	private int  creditLimit ;
	
	
	
	public CustomerCreditDetail() {
		this(1,4000,100,0,20);
	}



	public CustomerCreditDetail(int accNumber, int balBeginning, int chargePayed, int totalAmmountSpend,
			int creditLimit) {
		
		this.accNumber = accNumber;
		this.balBeginning = balBeginning;
		this.chargePayed = chargePayed;
		this.totalAmmountSpend = totalAmmountSpend;
		this.creditLimit = creditLimit;
	}

	public void accept()
	{
		System.out.println("CRADIT LIMIT IS 4000");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Amount you want to use = ");
		totalAmmountSpend=sc.nextInt();
		if(totalAmmountSpend>balBeginning)
		{
			System.out.println("Credit Limit Exceeded");
			
		}
	}

	public void newBalance()
	{
		if(this.balBeginning>creditLimit)
		{
		this.balBeginning+=chargePayed-totalAmmountSpend;
		System.out.println("Remaing Balance"+balBeginning);
		}
		else
		{
			System.out.println("Credit Limit Exceeded");
		}
	}

	
	
	

	
}
