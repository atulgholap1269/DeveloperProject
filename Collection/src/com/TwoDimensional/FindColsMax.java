package com.TwoDimensional;

import java.util.Arrays;
import java.util.Scanner;

public class FindColsMax {
	public static void findColMax(int a[][])
	{
		for(int i=0;i<a[0].length;i++)
		{
			int max=a[0][i];
			for(int j=0;j<a.length;j++)
			{
				if(max<a[j][i])
				{
					max=a[j][i];
				}
			}
			System.out.println("Max element from "+i+"column is "+max);	
		}
		System.out.println("=========================================");
	}
	public static void findColMin(int a[][])
	{
		for(int i=0;i<a[0].length;i++)
		{
			int min=a[0][i];
			for(int j=0;j<a.length;j++)
			{
				if(min>a[j][i])
				{
					min=a[j][i];
				}
			}
			System.out.println("Max element from "+i+"column is "+min);	
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
		System.out.println(Arrays.deepToString(a));
		System.out.println("=======================================");
		FindColsMax.findColMax(a);
		FindColsMax.findColMin(a);
	}

}
