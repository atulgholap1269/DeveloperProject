package com.ArrayAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class Question17 {//print reverse array minus 2 form all
	public static void reverseArrayItself(int a[])
	{
		int k=a.length-1;
		for(int i=0;i<a.length/2;i++)
		{
			int temp=a[i];
			a[i]=a[k];
			a[k]=temp;
			k--;
			
		}
		for(int j=0;j<a.length;j++)
		{
			a[j]=a[j]-2;
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
	Question17.reverseArrayItself(a);
}
}
