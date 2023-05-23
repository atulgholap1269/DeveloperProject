package com.array;

import java.util.Scanner;

public class CoverArrsyCase {
	public void coverCase(char a[])
	{
		for(int i=0; i<a.length;i++)
		{
			if(a[i]>='A'&& a[i]<='Z')
			{
				System.out.print((char)(a[i]+32)+" ");
			}
			else if(a[i]>='a'&& a[i]<='z')
			{
				System.out.print((char)(a[i]-32)+" ");
			}
			else
			{
				System.out.print(a[i]+"is not alphabet ");
			}
		}
	}
public static void main(String[] args) {
	char a[]=new char[5];
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter array elemets");
	for(int i=0; i<a.length; i++)
	{
		a[i]=sc.next().charAt(0);
	}
	CoverArrsyCase obj = new CoverArrsyCase();
	obj.coverCase(a);
}
}
