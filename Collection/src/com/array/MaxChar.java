package com.array;

import java.util.Scanner;

public class MaxChar {
public static void findMax(char a[])
{
	for(char c:a)
	{
		System.out.println(c +" "+(int)(c));
	}
	char maxChar=a[0];
	for(int i=0;i<a.length;i++)
	{
		if(maxChar<a[i])
		{
			maxChar=a[i];
		}
		
	}
	System.out.println("Maximum character is : "+maxChar);
}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter size of an array");
		int size= sc.nextInt();
		char a[]=new char[size];
		System.out.println("Enter array element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.next().charAt(0);
		}
		MaxChar.findMax(a);
	}
}
