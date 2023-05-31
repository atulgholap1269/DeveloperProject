package com.ArrayAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class Question5 {
	
	public static void reverseArray(int a[])
	{
	
		
	   int j=a.length-1;
	   int b[]=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
		b[i]=a[j]-2;
		j--;
		}
	  System.out.println(Arrays.toString(b));
		
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
	
		Question5.reverseArray(a);
		
	}
}
