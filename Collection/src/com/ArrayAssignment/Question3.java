package com.ArrayAssignment;

import java.util.Scanner;

public class Question3 {
	public static void searchElemnt(int a[], int n)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==n)
			{
				System.out.println("Element is present & index of element is "+i);
			}
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
		 System.out.println("Enter element for search");
		 int ele=sc.nextInt();
		 Question3.searchElemnt(a, ele);
	}
}
