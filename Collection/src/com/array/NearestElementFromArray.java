package com.array;

import java.util.Scanner;

public class NearestElementFromArray {
public static void findNearestElemnt(int a[], int input)
{
	
	int diff=input-a[0];
	if (diff<0)
	{
		diff=diff*-1;
	}
	int diff2;
	int nearestI=a[0];
	for(int i=0; i<a.length;i++)
	{
     diff2=input-a[i];
     if(diff2<0)
     {
    	 diff2=diff2*-1;
    	
     }
     if(diff2<diff)
     {
    	 nearestI=a[i] ;
    	 diff=diff2;
     }
	
	}
	System.out.println("Neares elemnt="+nearestI);
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
		//int a[]= {1,2,3,4,5,6,7,8};
		System.out.println("Enter user input:");

		int userIn=sc.nextInt();
		NearestElementFromArray.findNearestElemnt(a, userIn);
	}
}
