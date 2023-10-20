package com.array;

import java.util.Random;
import java.util.stream.Stream;

public class RandomSum {
	 public static void main(String[]args)
	 {
		 Random r = new Random();
		
Stream<Integer> strm = Stream.generate(() -> r.nextInt(10)).limit(10);
       
        Integer sum = strm.reduce(0, (a,e) -> a + e);
       
        System.out.println("Sum : " + sum);
	 }

	
	 

}
