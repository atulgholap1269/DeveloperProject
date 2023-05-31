package com.ArrayAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class HW11 {
	public static void checkPerfectSqaure(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=1;j<=a[i]/2;j++)
			{
				if(a[i]==(j*j))
				{
					System.out.print("Perfect Square"+a[i]);
				}
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
	System.out.println(Arrays.toString(a));
	HW11.checkPerfectSqaure(a);
}
}
