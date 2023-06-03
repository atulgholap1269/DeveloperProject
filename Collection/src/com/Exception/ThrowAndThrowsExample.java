package com.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

class Student
{ 
	Scanner sc = new Scanner(System.in);
	public void acceptName() throws InputMismatchException
	{
		System.out.println("Enter student name");
		String name= sc.nextLine();
		if(name.length()<3)
		{
			throw new InputMismatchException("Name must be minimum 3 character"); 
//			try
//			{
//				throw new InputMismatchException("Name must be minimum 3 character");
//			}
//			catch(InputMismatchException e)
//			{
//				System.out.println(e.getMessage());
//			}
			
		}
		System.out.println("Enterd name is : "+name);// if exception occurs  never reach this statement because exception handle in main method when you work with throws keyword 
	}
}
public class ThrowAndThrowsExample {
	public static void main(String[] args) {
		
	
	Student obj = new Student();
	try {
	obj.acceptName();
	}
	catch(InputMismatchException e)
	{
		System.out.println(e.getMessage());
	}
	}
}
