package com.array;

import java.util.Scanner;

public class MergeArrayAlternateWay2 {
	public static void mergeArray(int a[],int b[])
	{
		int merge[]=new int[a.length+b.length];
		int x=0;
		int y=0;
		for(int i=0;i<merge.length-1;i=i+2)
		{
			merge[i]=a[x];
			x++;
		}
		for(int i=1;i<merge.length-1;i=i+2)
		{
			merge[i]=b[y];
			y++;
			
		}
		merge[merge.length-1]=b[b.length-1];
		for(int i=0; i<merge.length;i++)
		{
			System.out.println(merge[i]+" ");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter arr1 size");
		int size= sc.nextInt();
		int a[]=new int[size];
		
		for(int i=0; i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter arr2 size");
		int size2= sc.nextInt();
		int b[]=new int[size2];
		for(int i=0; i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}
		MergeArrayAlternateWay2.mergeArray(a, b);
	}

}
