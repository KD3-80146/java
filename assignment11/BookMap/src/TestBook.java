

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Set;



public class TestBook {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		 int choice;
     HashMap<String,Book> map=new HashMap<String, Book>();
      do {
    
      System.out.println("Press Zero for Exit ");
     System.out.println("1.Add Book");
     System.out.println("2.Find Book");
      System.out.print("Enter the choice ");
      choice=sc.nextInt();
     switch (choice) {
	case 1:
		Book b=new Book();
		b.acceptBook();
		map.put(b.getIsBN(), b);
		break;
		
	case 2:
		String isbn;
		System.out.println("Enter the isbn no =");
		isbn=sc.next();
		Book book=map.get(isbn);
		System.out.println(book);
		break;
	default:
		System.out.println("Please enter the valid choice ............");
		break;
	}
//     
//     Set<String> keys = map.keySet();
//     System.out.println("Keys: " + keys);
//     
//     Collection<Book> values = map.values();
//     System.out.println("Values: " + values);
     
      }while(choice!=0);
}
}