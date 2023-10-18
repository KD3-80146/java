package length.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxLengthString {

	
	private static final int MIN_VILUE = 0;

	public static void main(String[] args)
	{
		List<String> list= new ArrayList<>();
		
		list.add("Ram");
		list.add("Runm");
		list.add("Banana");
		list.add("ge");
		list.add("Bultrrrrrrr");
		list.add("Ramhh");
		int index=0;
		 int MaxLengthString = MIN_VILUE;
	        for (int i = 0; i <list.size(); i++) {
	            
				if ( MaxLengthString > list.get(i).length())
				{
					MaxLengthString=list.get(i).length();
					index=i;
				}
	        }
		 System.out.println(list.get(index));
//		System.out.println(Collections.max(list));
		
		
		
	}
}
