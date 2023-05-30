package com.TwoDimensional;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaxElementFromRow {
	public static void findMaxElementFromArray(int a[][])
	{
		for(int i=0; i<a.length; i++)
		{
			int max=a[i][0];
			for(int j=0; j<a[i].length;j++)
			{
				if(max<a[i][j])
				{
					max=a[i][j];
				}
				
			}
			System.out.println("Maximum element from row "+i+" is"+max);
		 }
		System.out.println("=======================================");
	  }

	
		public static void findMinElementFromArray(int a[][])
		{
			for(int i=0; i<a.length; i++)
			{
				int min=a[i][0];
				for(int j=0; j<a[i].length;j++)
				{
					if(min>a[i][j])
					{
						min=a[i][j];
					}
					
				}
				System.out.println("Minimum element from row "+i+" is"+min);
			}
		
	     }
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of rows:");
	int rSize=sc.nextInt();
	System.out.println("Enter the number of colomn:");
	int cSize=sc.nextInt();
	int a[][]=new int[rSize][cSize];
	for(int i=0; i<a.length;i++)
	{
		for(int j=0; j<a[i].length;j++)
		{
			a[i][j]=sc.nextInt();
		}
	}
	System.out.println(Arrays.deepToString(a));
	System.out.println("======================================");
	FindMaxElementFromRow.findMaxElementFromArray(a);
	FindMaxElementFromRow.findMinElementFromArray(a);
}
}
