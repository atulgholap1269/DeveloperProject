package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class ReplaceLastElementByZero {
public static void replaceLast(int a[])
{
	for(int i=0; i<a.length;i++)
	{
		if(a[a.length-1]<0)
		{
			a[a.length-1]=a[0];
		}
	}
	System.out.println(Arrays.toString(a));
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter arr1 size");
		int size= sc.nextInt();
		int a[]=new int[size];
		
		for(int i=0; i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		ReplaceLastElementByZero.replaceLast(a);
	}
}
