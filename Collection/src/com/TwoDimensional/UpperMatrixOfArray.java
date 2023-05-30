package com.TwoDimensional;

import java.util.Scanner;

public class UpperMatrixOfArray {
	public static void upperRightMatrix(int a[][])
	{
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a[i].length;j++)
		{
			if(i>j)
			{
				System.out.print("0"+" ");
			}
			else
			{
				System.out.print(a[i][j]+" ");
			}
			
		}
		System.out.println();
	}
	}
//	public static void lowerRightMatrix(int a[][])
//	{
//	for(int i=0;i<a.length;i++)
//	{
//		for(int j=0;j<a[i].length;j++)
//		{
//			if(i<=j)
//			{
//				System.out.print("0"+" ");
//			}
//			else
//			{
//				System.out.print(a[i][j]+" ");
//			}
//			
//		}
//		System.out.println();
//	}
//	}
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter row size");
	int rSize=sc.nextInt();
	System.out.println("Enter column size");
	int cSize=sc.nextInt();
	int a[][]=new int [rSize][cSize];
	System.out.println("Enter array elements:");
	for(int i=0; i<a.length;i++)
	{
		for(int j=0; j<a[i].length;j++)
		{
			a[i][j]=sc.nextInt();
		}
	}
	for(int x[]:a)
	{
		for(int y:x)
		{
			System.out.print(y+" ");
		}
		System.out.println();
	}
	System.out.println("======================================");
	UpperMatrixOfArray.upperRightMatrix(a);
	System.out.println("======================================");
	//UpperMatrixOfArray.lowerRightMatrix(a);
}
}
