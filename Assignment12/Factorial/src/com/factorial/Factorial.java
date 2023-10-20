package com.factorial;

import java.util.Scanner;
import java.util.stream.Stream;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number ");
		int key=sc.nextInt();
		Stream<Integer> strm = Stream.iterate(1, x -> x + 1)
				.limit(key);
		Integer factorial = strm.reduce(1, (a,e) -> a *e);
		System.out.println("Factorial= : " + factorial);
	}

}
