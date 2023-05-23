package com.array;

import java.util.Scanner;

public class CountPositiveNegativeNumber {
  public static void countPositiveNegative(int a[])
  {
	  int countP=0;
	  int  countN=0;
	  for(int x:a)
	  {
		  
		  if(x>0)
		  {
			  countP++;
		  }
		  else
		  {
			  countN++;
		  }
		  
	  }
	  System.out.println("Positive element count is: "+countP);
	  System.out.println("Negative element count is: "+countN);
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
		CountPositiveNegativeNumber.countPositiveNegative(a);
	}
}
