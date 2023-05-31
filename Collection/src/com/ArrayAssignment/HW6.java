package com.ArrayAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class HW6 {
	public static void repalceByZero(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
			{
				a[i]=1;
			}
		}
		System.out.println(Arrays.toString(a));
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
	HW6.repalceByZero(a);
}
}
