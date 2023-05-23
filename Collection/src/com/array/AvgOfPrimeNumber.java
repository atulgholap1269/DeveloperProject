package com.array;

import java.util.Scanner;

public class AvgOfPrimeNumber {
	public static float sumOfPrime(int a[]) 
	{
		
		int sum=0;
		int count=0;
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
	  			sum=sum+a[i];
	  			count++;
	 	  	}
	  	}
	  	float avg =(float)sum/count;
	  return avg;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter size of an array");
		int size= sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter array element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println(AvgOfPrimeNumber.sumOfPrime(a));
	}

}
