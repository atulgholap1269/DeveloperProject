 package com.ArrayAssignment;

import java.util.Scanner;

public class Question10 {
	public static int maxFromarray(int a[])
	{
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		return max;
	}
	public static int minFromarray(int a[])
	{
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
		}
		return min;
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
	System.out.println("min element from array is : "+Question10.minFromarray(a));
	System.out.println("max element from array is : "+Question10.maxFromarray(a));
}
}
