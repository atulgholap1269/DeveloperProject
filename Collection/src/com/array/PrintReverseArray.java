package com.array;

import java.util.Scanner;

public class PrintReverseArray {
	public static void main(String[] args) {
		int a[]=new int[5];
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter array elemets");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=a.length-1; i>=0;i--)
		{
			System.out.print(a[i]+",");
		}
	}

}
