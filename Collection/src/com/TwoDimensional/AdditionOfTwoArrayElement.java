package com.TwoDimensional;

import java.util.Arrays;
import java.util.Scanner;

public class AdditionOfTwoArrayElement {
	public static void addTwo2DArray(int a[][], int b[][])
	{
		int merge[][]= new int[a.length][a[0].length];
		for(int i=0;i<a.length;i++)
		{
			
			for(int j=0;j<a[i].length;j++)
			{
				merge[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println(Arrays.deepToString(merge));
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[][]= new int[3][2];
		
		int b[][]= new int[3][2];
		System.out.println("Enter array1 elements:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter array2 elements:");
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		
		AdditionOfTwoArrayElement.addTwo2DArray(a, b);
		
	}

}
