package com.sunbeam;
class Box<t>{
	private t obj;
	public void set(t val)
	{
		this.obj=val;
		
	}
	public t get()
	{
		return obj;
	}
			
}
public class Test {
	
	public static void printDisplayableBox(Box<? extends Displayable> b)
	{
		b.get().display();
	}
	public static void printBox(Box<?>b)
	{
		System.out.println(b.get().toString());
		
	}
	public static void main(String[] args) {
		
		Person p1=new Person();
		
      Box <Person> b1=new Box<>();
       b1.set(new Person("ram",29));
       
      
       printDisplayableBox(b1);
      
	}

}
