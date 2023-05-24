package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySortDemo {
 public static void sortElementDemo(int a[])
 {
	 System.out.println(Arrays.toString(a));
	 for(int i=0; i<a.length;i++)
	 {
		 for(int j=i+1;j<a.length;j++)
		 {
		   if(a[i]>a[j])
		    {
			 int temp=a[i];
			 a[i]=a[j];
			 a[j]=temp;
		    }
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
		ArraySortDemo.sortElementDemo(a);
	}
}
