package com.array;

import java.util.Scanner;

public class SumOfAlternatNumber {
	public static int sumOfAlternate(int a[])
	{
		int sum=0;
		for(int i=0;i<a.length;i=i+2)
		{
			sum=sum+a[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println("Enter array elements");
		Scanner sc = new Scanner(System.in);		
		int a[]=new int[6];
		for(int i=0; i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println(SumOfAlternatNumber.sumOfAlternate(a));
	}

}
