package com.assignmentTwoDimensional;

import java.util.Scanner;

public class Question10 {
	public static void sumOfDiagonal(int a[][])
	{
		int sumOfDia=0;
		for(int i=0; i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(i==j)
				{
					sumOfDia=sumOfDia+a[i][j];
				}
			}
		}
		System.out.println(sumOfDia);
		
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
		for(int i=0; i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		Question10.sumOfDiagonal(a);
}
}
