package com.ArrayAssignment;

import java.util.Scanner;

public class HW4 {
	public static void checkEqualArray(int a[],int b[]) 
	{
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					count++;
				}
			}
		}
		if(count==a.length)
		{
			System.out.println("both array are equal");
		}
		else
		{
			System.out.println("both ");
		}
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
	
	int b[]= new int[size];
	for(int i=0;i<b.length;i++)
	{
		b[i]=sc.nextInt();
	}
}
}
