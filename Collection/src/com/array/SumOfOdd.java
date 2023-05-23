package com.array;

import java.util.Scanner;

public class SumOfOdd {
     public static int sumOfOdd(int a[])
     {
    	 int sum=0;
    	 for(int i=0;i<a.length;i++)
    	 {
    		 if(a[i]%2!=0)
    		 {
    			sum=sum+a[i];
    		 }
    	 }
    	 return sum;
     }
	public static void main(String[] args) {
		System.out.println("Enter array element");
		Scanner sc = new Scanner(System.in);
		int a[]=new int[7];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println(SumOfOdd.sumOfOdd(a));
	}
}
