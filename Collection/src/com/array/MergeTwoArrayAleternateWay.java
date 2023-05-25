package com.array;

import java.util.Scanner;

public class MergeTwoArrayAleternateWay {
    public static void mergeArray(int a[], int b[])
    {
    	int merge[]=new int[a.length+b.length];
    	int count=0;
    	int x=0;
    	int y=0;
    	for(int i=0; i<merge.length;i=i+2)
    	{
    		merge[i]=a[x]; // 1    2   3 
    		x++;           // 0    2   4
    		
    	}
    	for(int i=1;i<merge.length;i=i+2)
    	{
    		merge[i]=b[y];// 1  4  2  5  3  6
    		y++;          // 0  1  2  3  4  5
    		
    	}
    	for(int i=0;i<merge.length;i++)
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
	MergeTwoArrayAleternateWay.mergeArray(a, b);
	}
}
