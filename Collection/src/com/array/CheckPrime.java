package com.array;

import java.util.Scanner;

public class CheckPrime {

	public static void findPrime(int a[]) {
		for(int i=0;i<a.length;i++)
		{
			boolean isPrime=true;
			for(int j=2;j<a[i];j++)
			{
				if(a[i]%j==0)
				{
					isPrime=false;
					break;
				}
			}
			if(isPrime)
			{
				System.out.println(a[i]);
			}
		}
	}
	public static void main(String[] args) {
		System.out.println("Enter array element");
		Scanner sc = new Scanner(System.in);
		int a[]=new int[7];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		CheckPrime.findPrime(a);
	}
}
