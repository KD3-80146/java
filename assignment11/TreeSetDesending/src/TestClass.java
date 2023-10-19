


import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;



public class TestClass {

	class IteratorComparator implements Comparator<Book> {

		@Override
		public int compare(Book b1, Book b2) {
			int diff=b1.getIsBN().compareTo(b2.getIsBN());
			return diff;
		}
		
	}

	public static void main(String[] args) {
		{
			TreeSet<Book> Set= new TreeSet<>();
			
	        Set.add(new Book("1",1000.0,"Ujjwal",10));
	        Set.add(new Book("2",2000.0,"Ram",20));
	        Set.add(new Book("4",5000.0,"Rahim",70));
	        Set.add(new Book("5",3000.0,"Rohan",60));
	        Set.add(new Book("1",1000.0,"Ujjwal",78));

//	        for(Book b:hashSet)
//	        {
//	        	System.out.println(b);
//	        }
	       Iterator<Book> itr3= Set.iterator();
	       
	         while(itr3.hasNext())
	         {
	        	Book i= itr3.next();
	        	System.out.println(i);
	        	 
	         }
	         System.out.println();
	         
	         Iterator<Book>it4=Set.descendingIterator();
	         
	         while(it4.hasNext())
	         {
	        	 Book i2=it4.next();
	        	 System.out.println(i2);
	         }
			
		}
		//If any book with duplicate isbn is added  ???
		//It will add only 1 occurence object No it is Added
		
		//it Will show the duplicate value 
		
		//Books are stored in which order?
		
		//Book are store in in the sorted order.
		
	

	}

}
