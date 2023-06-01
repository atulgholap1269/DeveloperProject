package com.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatchHandelExample {
public static void main(String[] args) {
	int a[];
	try
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		a= new int[size];
		int sum=0;
		System.out.println("Enter array elements:");
		for(int i=0; i<a.length;i++)
		{
			a[i]=sc.nextInt();
			sum+=a[i];
		}
		System.out.println("Sum of all array elements :"+sum);
		System.out.println("Average of array elements : "+(sum/0));
		sc.close();
		
	}
	catch( ArithmeticException | InputMismatchException | ArrayIndexOutOfBoundsException e )
	{
		System.out.println("Error type is: "+e.getClass());
		System.out.println("Error Message:"+e.getMessage());
	}// we can not declare generic exception in multi-catch handler
//	catch(InputMismatchException e1)
//	{
//		System.out.println("Error message: "+e1.getMessage());
//		System.out.println("Error type : "+e1.getClass());
//	}
//	catch(ArrayIndexOutOfBoundsException e2)
//	{
//		System.out.println("Error message: "+e2.getMessage());
//		System.out.println("Error type : "+e2.getClass());
//	}
	catch(Exception e3)// this is generic catch handler. Must declare below of all the catch. If you declare other catch will become unreachable catch block
	{
		System.out.println("Error message: "+e3.getMessage());
		System.out.println("Error type : "+e3.getClass());
	}
}
}
