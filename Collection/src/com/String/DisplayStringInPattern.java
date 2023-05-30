package com.String;

import java.util.Scanner;

public class DisplayStringInPattern {
	public static void displayPattern(String s)
	{
		String sp[]=s.split(" ");
		for(int i=0;i<sp.length;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(sp[j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string....");
		String s= sc.nextLine();
		DisplayStringInPattern.displayPattern(s);
}
}
