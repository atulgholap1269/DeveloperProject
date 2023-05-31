package com.String;

import java.util.Arrays;
import java.util.Scanner;

public class SortStringInDescending {
	public static void sortInDescen(String str)
	{
		String sp[]=str.split(" ");
		for(int i=0;i<sp.length;i++)
		{
			
			for(int j=i+1;j<sp.length;j++)
			{
				if(sp[i].length()<sp[j].length())
				{
					String temp=sp[i];
					sp[i]=sp[j];
					sp[j]=temp;
				}
				else if(sp[i].length()==sp[j].length())
				{
					if(sp[i].compareTo(sp[j])>0)
					{
						String temp=sp[i];
						sp[i]=sp[j];
						sp[j]=temp;
					}
				}
			}
		}
		System.out.println(Arrays.toString(sp));
	}
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter first string");
	String str1 = sc.nextLine();
	SortStringInDescending.sortInDescen(str1);
	}
}
