package average;

import java.util.Scanner;

public class average {
	public static void main(String[] args)
	Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the first double value: ");
		if (scanner.hasNextDouble()) {
			double num1 = scanner.nextDouble();
			scanner.nextLine(); 

			System.out.print("Enter the second double value: ");
			if (scanner.hasNextDouble()) {
				double num2 = scanner.nextDouble();
				
				double average = (num1 + num2) / 2;
				System.out.println("The average is: " + average);
			} else {
				System.out.println("Error: Second input is not a double value.");
			}
		} else {
			System.out.println("Error: First input is not a double value.");
		}

		
	}

}
