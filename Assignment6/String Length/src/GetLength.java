import java.util.Scanner;

public class GetLength {
	
	 String getData;
	 
	 
	 public GetLength() {
		
	}

	public GetLength(String getData) {
		
		this.getData = getData;
	}

	public void acceptData()
	 {
		Scanner sc= new Scanner(System.in);
		
		
		 System.out.println("Enter the length =");
		 this.getData=sc.next();
	 }

	@Override
	public String toString() {
		return "GetLength [getData=" + getData + "]";
	}
	 
	 
	
	

}
