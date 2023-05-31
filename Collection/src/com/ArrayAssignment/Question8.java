package com.ArrayAssignment;

import java.util.Scanner;

public class Question8 {
	public static void printNegativeElement(int a[])
	{
		int count=0;
		for(int i=0;i<a.length; i++)
		{
			if(a[i]<0)
			{
				System.out.print(a[i]+" ");
				count++;
			}
		}
		System.out.println("total negative elemnet in array is "+count);
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
		Question8.printNegativeElement(a);
	}

}
