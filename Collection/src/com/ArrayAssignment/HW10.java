package com.ArrayAssignment;

import java.util.Scanner;

public class HW10 {
	public static void minChar(char a[])
	{
		char min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
		}
		System.out.println(min);
	}
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter size of an array");
	int size= sc.nextInt();
	char a[]=new char[size];
	System.out.println("Enter array element");
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.next().charAt(0);
	}
	HW10.minChar(a);
}
}
