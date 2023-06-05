package com.StringAssignment;

public class Question5 {
  public static void main(String[] args) {
//	String s="My name is Atul Gholap";
//	System.out.println(s.length());
//	String b="Atul Gholap";
//	System.out.println(s.compareTo(b));
	String z="atul banshi gholap";
	for(int i=0; i<z.length();i++)
	{
		char c=z.charAt(i);
		if(c>='a'&& c<='z')
		{
		c=(char)(c-32);
		
		}
		System.out.print(c);
	}
	
}
}
