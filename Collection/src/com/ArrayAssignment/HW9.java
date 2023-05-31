package com.ArrayAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class HW9 {
	public static void arrangArray(int a[])
	{
		int left=0;
		  int right=a.length-1;
		  for (int i = 0; i < a.length; i++) 
		  {
		 
		   while(a[left]%2==0)
		   {
		    left++;
		   }
		   while(a[right]%2==1)
		   {
		    right--;
		   }
		 
		   if(left<right)
		   {
		    int temp=a[left];
		    a[left]=a[right];
		    a[right]=temp;
		   }
		  }
		System.out.println(Arrays.toString(a));
		 
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
//	System.out.println("Enter thye size of array");
//	int size= sc.nextInt();
	int a[]= {3,4,6,8,7};
//	for(int i=0;i<a.length;i++)
//	{
//		a[i]=sc.nextInt();
//	}
	HW9.arrangArray(a);
}
}
