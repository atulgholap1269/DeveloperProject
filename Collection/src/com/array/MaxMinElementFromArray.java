package com.array;

import java.util.Scanner;

public class MaxMinElementFromArray {
	public static void MaxMinElementFromArray(int a[])
	{
		int min=a[0];
		for(int i=0; i<a.length;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
		}
		System.out.println("min element from array is: "+min);
		
		int max=a[0];
		for(int i=0; i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println("max element from array is: "+max);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter size of an array");
		int size= sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter array element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		MaxMinElementFromArray.MaxMinElementFromArray(a);
	}

}
