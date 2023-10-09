package hardware.invoice;

import java.util.Scanner;


   public class Invoice {
    
	  String partNumber;
	 String partDescription;
	 int quantity;
      double price;
      double bill;
	 public Invoice()
	{
		this("","",0,0,0);
	}
	public Invoice(String partNumber, String partDescription, int quantity, double price,double bill) {
		
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.quantity = quantity;
		this.price = price;
		this.bill=bill;
	}
	
	
	
   public String getPartNumber() {
		return partNumber;
	}
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	public String getPartDescription() {
		return partDescription;
	}
	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
public void acceptInvoice()
{
        Scanner sc=new Scanner(System.in);
   
	   System.out.print("Enter the part Name = ");
	   partNumber=sc.next();
	   System.out.print("Enter the part Discription = ");
	   partDescription=sc.next();
	   System.out.print("Enter the Quantity = ");
	   quantity=sc.nextInt();
	   System.out.print("Enter the Price = ");
	   price=sc.nextDouble();
	  
	   sc.close();
	   
   }
   
   
   public void displayInvoice()
   {
	   System.out.println("Part Name = "+partNumber);
	   System.out.println("Part Discription = "+partDescription);
	   System.out.println("Quantity = "+quantity);
	   System.out.println("Price = "+price);
	   calculateBill();
   }
   
   public void calculateBill()
   {
	   System.out.println("Bill is ="+price*quantity);
   }
   
	
	
	
	
}
		