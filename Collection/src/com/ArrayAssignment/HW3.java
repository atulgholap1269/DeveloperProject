package com.ArrayAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class HW3 {
	public static void reveseArray(int a[])
	{//6,7,8,9
		int j=a.length-1;
		for(int i=0;i<a.length/2;i++)
		{
			int temp=a[i];//7
			a[i]=a[j];//9 8
			a[j]=temp;//    7 6
			j--;
		}
		System.out.println(Arrays.toString(a));
		for(int i=0;i<a.length;i++)
		{
			a[i]=a[i]-2;
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
	HW3.reveseArray(a);
}
}
