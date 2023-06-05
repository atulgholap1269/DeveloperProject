package com.StringAssignment;

public class Question22 {
   public static void main(String[] args) {
	   //convert in to toggle case
	String s="my name is Atul gholap";
	for(int i=0;i<s.length();i++)
	{
	   char c=s.charAt(i);
		if(s.charAt(i)>='a'&&s.charAt(i)<='z')
		{
			c=(char)(c-32);
		}
		else if(s.charAt(i)>='A'&&s.charAt(i)<='Z')
		{
			c=(char)(c+32);
		}
		else
		{
			c=c;
		}
		System.out.print(c);	
	}
}
}
