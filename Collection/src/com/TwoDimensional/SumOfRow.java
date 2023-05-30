package com.TwoDimensional;

import java.util.Scanner;

public class SumOfRow {

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
		SumOfRow.sumOfRow(a);
		
		
	}
}
