package com.array;

import java.util.Scanner;

public class SumOfEvenIndexElement {
	
	public static void sumOfEvenIndexElement(int a[])
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			if(i%2!=0)
			{
				sum=sum+a[i];
			}
		}
		System.out.println(sum);
	}
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter array size: ");
	int size= sc.nextInt();
	int a[]=new int[size];
	System.out.println("enter array elements");
	for(int i=0;i<size;i++)
	{
		a[i]=sc.nextInt();
	}
	SumOfEvenIndexElement.sumOfEvenIndexElement(a);
	
}
}
