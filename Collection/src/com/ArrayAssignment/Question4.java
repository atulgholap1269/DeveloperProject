package com.ArrayAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class Question4 {
	public static void copyArry(int a[])
	{
		int b[]=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
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
		
		Question4.copyArry(a);
	}
}
