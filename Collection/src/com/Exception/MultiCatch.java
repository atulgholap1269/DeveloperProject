package com.Exception;

public class MultiCatch {
public static void main(String[] args) {
	try
	{
		int a[]=null;
		System.out.println(a[5]/0);
	}
	catch(IndexOutOfBoundsException i)
	{
		System.out.println(i);
	}
	catch(ArithmeticException e)
	{
		e.printStackTrace();
	}
//	catch(Exception e)
//	{
//		//System.out.println(e);
//		e.printStackTrace();
//		System.out.println("Hiiii");
//	}
	finally
	{
		System.out.println("finallyblock");
	}
}
}
