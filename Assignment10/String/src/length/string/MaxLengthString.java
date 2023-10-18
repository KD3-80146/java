package length.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MaxLengthString {

	
	
	private static final Comparator<String> ComparatorLength = null;

	public static void main(String[] args)
	{
		List<String> list= new ArrayList<>();
		
		list.add("Rammmmm");
		list.add("Runm");
		list.add("Bananaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		list.add("gedddddddddddddddddddd");
		list.add("Bultrrrrrrr");
		list.add("Ramhh");
//		int index=0;
//		 int MaxLengthString = MIN_VILUE;
//	        for (int i = 0; i <list.size(); i++) {
//	            
//				if ( MaxLengthString > list.get(i).length())
//				{
//					MaxLengthString=list.get(i).length();
//					index=i;
//				}
//	        }
//		 System.out.println(list.get(index));
		class ComparatorLength implements Comparator<String>{

			@Override
			public int compare(String arg0, String arg1) {
				  int diff=arg0.length()-arg1.length();
				return diff;
			}
			
			
		}
		ComparatorLength comparator = new ComparatorLength();
      	System.out.println(Collections.max(list,comparator));
		
		
		
	}
}
