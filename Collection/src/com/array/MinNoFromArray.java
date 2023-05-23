package com.array;

import java.util.Scanner;

public class MinNoFromArray {
	public void findMinium(int arr[])
	{
		int min=arr[0];
		for(int i=0; i<arr.length; i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
		}
		System.out.println("Minimum value from array: "+min);
	}
	public static void main(String[] args) {
		int a[]=new int[5];
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter array elemets");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		MinNoFromArray obj = new MinNoFromArray();
		obj.findMinium(a);
		int max=a[0];
		for(int i=0; i<a.length; i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println("max value from array: "+max);
		
		for(int x:a)//enhaced for loop allow you to access elements only in forword direction 
		{
			System.out.print(x+" ");
		}
	}

}
