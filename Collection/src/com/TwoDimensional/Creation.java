package com.TwoDimensional;

import java.util.Arrays;
import java.util.Scanner;

public class Creation {
	public static void main(String[] args) {
		int a[][]= {{3,4 ,2},{6,4,1},{9,5,3}};
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the array elements:");
		for(int i=0; i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
			System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		int b[][]=new int [3][2];
		b[0][0]=5;
		b[0][1]=4;
		b[1][0]=2;
		b[1][1]=5;
		b[2][0]=8;
		b[2][1]=6;
		System.out.println("========================================");
		for(int i=0; i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
			System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("=======================================");
		
		int arr[][]=new int[3][3];
		System.out.println("Enter the array elements");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length; j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("=======================================");
		for(int i=0; i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
			System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("=======================================");
		for(int x[]:arr)
		{
			for(int y:x)
			{
				System.out.print(y+" ");
			}
			System.out.println();
		}
		System.out.println("=======================================");
		for(int x[]:a)
		{
			for(int y:x)
			{
				System.out.print(y+" ");
			}
			System.out.println();
		}
		System.out.println("=======================================");
		System.out.println(Arrays.deepToString(arr));
	}

}
