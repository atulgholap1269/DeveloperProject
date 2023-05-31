package com.ArrayAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class Question7 {
	public static void insertElement(int a[],int b, int index)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==5)
			{
				a[i]=b;
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
	System.out.println("Enter element to insert in an array");
	int b= sc.nextInt();
	System.out.println("Enter index for element");
	int index=sc.nextInt();
	Question7.insertElement(a, b,index);
}
}
