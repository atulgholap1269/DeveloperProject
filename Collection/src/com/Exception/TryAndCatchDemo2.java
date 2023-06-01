package com.Exception;

public class TryAndCatchDemo2 {
public static void isValid(int age)
{
	try
	{
		if(age<18)
		{
			throw new ArithmeticException("Invalid age");
		}
		else
		{
			System.out.println("valid");
		}
	}
	catch(ArithmeticException e)
	{
		System.out.println(e);
	}
	
}
public static void main(String[] args) {
	isValid(19  );
	System.out.println("Done");
}
}
