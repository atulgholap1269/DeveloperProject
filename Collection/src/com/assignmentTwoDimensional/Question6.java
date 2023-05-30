package com.assignmentTwoDimensional;

import java.util.Scanner;

public class Question6 {
	public static void checkSparase(int a[][])
	{
		int k=0;int count=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				k++;
				if(a[i][j]==0)
				{
					count++;
				}
			}
		}
		if(count>(k/2))
		{
			System.out.println("Sprase array");
		}
		else
		{
			System.out.println("not sprase array");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row size");
		int rSize=sc.nextInt();
		System.out.println("Enter column size");
		int cSize=sc.nextInt();
		int a[][]=new int[rSize][cSize];
		System.out.println("Enter array elements:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		Question6.checkSparase(a);
	}
 
}
