package org.test;

public class Sam1 {
	public Sam1() {

	System.out.println("Default Constructor");
	
	}
public Sam1(int id)
{
	System.out.println("Int Parameterized Constructor");
	System.out.println(id);
}
private void sam1() {
     System.out.println("Method");
	
	
}
public static void main(String[] args) {
	
	Sam1 s=new Sam1();
	Sam1 s1=new Sam1(101);
	s.sam1();
	s1.sam1();
	
}


}
