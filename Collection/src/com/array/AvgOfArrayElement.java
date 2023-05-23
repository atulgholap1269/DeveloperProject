package com.array;

import java.util.Scanner;

public class AvgOfArrayElement {
public static void main(String[] args) {
	float a[]=new float [6];
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter array elements:");
	float sum=0;
	for(int i=0; i<a.length; i++)
	{
		a[i]=sc.nextFloat();
		sum=sum+a[i];
	}
	System.out.println("average of array: "+sum/(a.length));
}
}
