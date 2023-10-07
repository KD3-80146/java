package numberConvert;
import java.util.*;

public class numberCovert {

	public static void main(String[] args) {
		
		 int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number = ");
		
		num=sc.nextInt();
		System.out.println("Given number ="+num);
		
		String binary =Integer.toBinaryString(num);
		
		System.out.println("binary is =" + binary);
		
		String octal=Integer.toOctalString(num);
		
		System.out.println("Ocatl is =" + octal);
		
		String hexaDecimal =Integer.toHexString(num);
		
		System.out.println("HexaDecimal is =" + hexaDecimal);
						
		
		
		
		
	     
		 
		
		

	}

}
