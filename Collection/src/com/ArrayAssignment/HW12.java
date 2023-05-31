package com.ArrayAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class HW12 {
	public static void shuffleArray(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			int temp=a[0];
			a[0]=a[a.length-1];
			a[a.length-1]=temp;
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
	HW12.shuffleArray(a);
	
}
}
