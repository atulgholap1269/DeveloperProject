package com.Exception;

public class TryAndCatchDemo3 {
	public static void isValid(int age)
	{
		if(age <18)
		{
			throw new ArithmeticException("Invalid age");
		}
		else
		{
			System.out.println("Valid");
		}
	}
   public static void main(String[] args)
   {
	try
	{
		isValid(12);
	}
	
	catch(ArithmeticException e)
	{
		System.out.println(e);
		System.out.println("Done");
	}
	
}
}
