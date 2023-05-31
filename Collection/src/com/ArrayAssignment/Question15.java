package com.ArrayAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class Question15 {
	public static void mergeArray(int a[], int b[])
	{
		int merge[]=new int[a.length+b.length];
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			merge[i]=a[i];
			count++;
		}
		for(int j=0;j<b.length;j++)
		{
			boolean isAdded=false;
			for(int k=count-1;k>=0;k--)
			{
				if(b[j]==merge[k])
				{
					isAdded=true;
				}
			}
			if(isAdded==false)
			{
				merge[count]=b[j];
				count++;
			}
		}
		 System.out.println(Arrays.toString(merge));
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
	System.out.println("Enter thye size of array");
	int size1= sc.nextInt();
	int b[]= new int[size1];
	for(int i=0;i<b.length;i++)
	{
		b[i]=sc.nextInt();
	}
	Question15.mergeArray(a, b);
}
}
