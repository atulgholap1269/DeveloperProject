package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class ToggleChar {
	public static void toggleChar(char a[])
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>='A'&&a[i]<='Z')
			{
				a[i]=(char)(a[i]+32);
			}
			else if(a[i]>='a'&&a[i]<='z')
			{
				a[i]=(char)(a[i]-32);
			}
			else
			{
				a[i]=a[i];
				
			}
				
		}
		System.out.println(Arrays.toString(a));
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
		ToggleChar.toggleChar(a);
}
 
}
