package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
   public static void printReverse(char a[])
   {
	 for(int i=a.length-1;i>=0;i--)  
	 {
		 System.out.print(a[i]+" ");
	 }
   }
   public static void reverseArray(char a[])
   {
	   int j=a.length-1;
	   for(int i=0;i<a.length/2;i++)
	   {
		   char temp=a[i];
		   a[i]=a[j];
		   a[j]=temp;
		   j--;
	   }
	   System.out.println(Arrays.toString(a));
   }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter size of an array");
		int size= sc.nextInt();
		char a[]=new char[size];
		System.out.println("Enter array element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.next().charAt(0);
		}
		ReverseArray.reverseArray(a);
	}
}
