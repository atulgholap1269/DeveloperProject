package com.StringAssignment;

public class Question1 {
	public static void main(String[] args) {
		String a= new String("My name is Atul Gholap");
		String b="My name is Atul Gholap";
		System.out.println(a);
		System.out.println(b);
		a=b;
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(a==b);
		String c="My name is Atul Gholap";
		System.out.println(c.hashCode());
		System.out.println(a==c);
		b=b+" leaving in Pune";
		System.out.println(b);
		System.out.println(b.hashCode());
		System.out.println(b==c);
		 System.out.println(b==a);
		 System.out.println(a==c);
		 String d=new String("My name is Atul Gholap");
		 System.out.println(a.hashCode());
		 System.out.println(d.hashCode());
		 System.out.println(a==d);
		  
		  
		 
		
	}

}
