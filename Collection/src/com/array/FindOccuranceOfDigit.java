package com.array;

import java.util.Scanner;

public class FindOccuranceOfDigit {
	public static void findOccurrance(int a[])
	{
		for(int i=0; i<a.length; i++)
		{
			int count=1;
			boolean isVisited=false;
			for(int k=i-1; k >= 0;k--)
			{
				if(a[i]==a[k])
				{
					isVisited=true;
					break;
				}
			}
			if(isVisited==false)
			{
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						count++;
					}
				}
				System.out.println(a[i]+" "+count);
			}
			
		}
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter array size");
		int size= sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter array element");
		for(int i=0; i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		FindOccuranceOfDigit.findOccurrance(a);
	}

}
