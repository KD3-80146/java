package com.person;
class Box<T extends Person> {
private T obj;

public T get() {
return this.obj;
}
public void set(T obj) {
	
this.obj = obj;

}
  public  void  acceptData()
  {
	  obj.acceptData();
   }

 
  
}


public class PersonBox {

	 public static void main(String [] args)
	 {
		
		 Box<Employee> b1 = new Box<>();
		 b1.set(new Employee());
		 b1.acceptData();
		   
         System.out.println(b1.get());
         
//         12
       
		  
		
		 
		 
		
	 }
	
}
