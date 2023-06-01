package com.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TrycatchExample1 {
public static void main(String[] args) {
	try {
	int rollNo=123;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter no of subject:");
	int noOfSubject=sc.nextInt();
	int marks[]=new int [noOfSubject];
	int sum=0;
	System.out.println("Enter marks per subject:");
	for(int i=0;i<marks.length;i++)
	{
		marks[i]=sc.nextInt();
		sum+=marks[i];
	}
	System.out.println("Total marks of student: "+sum);
	 System.out.println("Average of student mark is :"+(sum/0));
	}
	catch(ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException | InputMismatchException a )
	{
		System.out.println("Error type : "+a.getClass());
		System.out.println("Error message : "+a.getMessage());
	}
	catch(Exception e)
	{
		System.out.println("Error type : "+e.getClass());
		System.out.println("Error message : "+e.getMessage());
	}
	System.out.println("still continue..........");
}
}
