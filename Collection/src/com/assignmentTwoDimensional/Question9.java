package com.assignmentTwoDimensional;

import java.util.Scanner;



public class Question9 {
	public static void sumOfColOfArray(int a[][])
	{
		for(int i=0;i<a[0].length;i++)
		{
			int sum=0;
			for(int j=0;j<a.length;j++)
			{
				sum=sum+a[j][i];
				System.out.println(a[j][i]+" ");
			}
			System.out.print(" sum = "+sum);
			System.out.println();
		}
	}
	public static void sumOfRow(int a[][])
	{
		for(int i=0;i<a.length;i++)
		{
			int sum=0;
			for(int j=0;j<a[i].length;j++)
			{
				sum=sum+a[i][j];
				System.out.println(a[i][j]+" ");
			}
			System.out.println(" sum = "+sum);
			System.out.println();
		}
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter row size");
	int rSize=sc.nextInt();
	System.out.println("enter cloumn size");
	int cSize=sc.nextInt();
	int a[][]=new int[rSize][cSize];
	for(int i=0; i<a.length;i++)
	{
		for(int j=0;j<a[i].length;j++)
		{
			a[i][j]=sc.nextInt();
		}
	}
	Question9.sumOfColOfArray(a);
	Question9.sumOfRow(a);
}
}
