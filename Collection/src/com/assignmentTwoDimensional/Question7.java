package com.assignmentTwoDimensional;

import java.util.Arrays;
import java.util.Scanner;

public class Question7 {
	public static void transposeArray(int a[][])
	{    
		int transpose[][]=new int[a.length][a[0].length];
		for(int i=0;i<a.length;i++)
		{
			 
			for(int j=0;j<a[i].length;j++)
			{
			 transpose[i][j]=a[j][i];
				
			}
		}
		System.out.println(Arrays.deepToString(transpose));
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
	Question7.transposeArray(a);
}
}
