package com.ArrayAssignment;

import java.util.Scanner;

public class Question6 {
	public static int average(int a[])
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		int avg=sum/a.length;
		return avg;
		
	}
	public static double average1(double a[])
	{
		double sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		double avg=sum/a.length;
		return avg;
		
	}
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter thye size of array");
	int size= sc.nextInt();
	int a[]= new int[size];
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	System.out.println("Enter thye size of array");
	int size1= sc.nextInt();
	double b[]= new double[size1];
	for(int i=0;i<b.length;i++)
	{
		b[i]=sc.nextDouble();
	}
	System.out.println(Question6.average(a));
	System.out.println(Question6.average1(b));
}
}
