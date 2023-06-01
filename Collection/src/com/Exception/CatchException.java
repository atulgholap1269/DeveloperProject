package com.Exception;

public class CatchException {
public static void main(String[] args) {
	try
	{
		Class.forName("com.jdbc.driver");
	}
	catch(ClassNotFoundException e)
	{
		e.printStackTrace();
		 System.out.println("Hii");
		 
	}
}
}
