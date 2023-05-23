package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class ChangeToAlternateCharacter {
	public static void changeToAelternateCharacter(char a[])
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]=='z')
			{
				a[i]='b';
			}
			else if(a[i]=='Z')
			{
				a[i]='B';
			}
			else if(a[i]=='Y')
			{
				a[i]='A';
			}
			else if(a[i]=='y')
			{
				a[i]='a';
			}
			else
			{
			a[i]=(char)(a[i]+2);
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
	ChangeToAlternateCharacter.changeToAelternateCharacter(a);
}
}
