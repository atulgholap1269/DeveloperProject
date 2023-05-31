package com.ArrayAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class Question9 {
	public static void makeEvenOddArray(int a[])
	{
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				count++;
		    }
		}
		int even[]=new int[count];
		int odd[]= new int[a.length-count];
		int c=0, b=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				even[c]=a[i];
				c++;
		    }
			else
			{
				odd[b]=a[i];
				b++;
			}
	}
		System.out.println("even element array: "+Arrays.toString(even));
		System.out.println("odd element array: "+Arrays.toString(odd));
		
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
	
	Question9.makeEvenOddArray(a);
}
}
