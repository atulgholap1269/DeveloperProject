package com.ArrayAssignment;

import java.util.Scanner;

public class Question2 {
	public static float avgArray(int a[])
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("sum = "+sum);
		float avg=(float)sum/a.length;
		System.out.print("Average of array is:");
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
	System.out.println(Question2.avgArray(a));
}
}
