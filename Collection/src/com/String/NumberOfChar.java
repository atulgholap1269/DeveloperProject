 package com.String;

import java.util.Scanner;

public class NumberOfChar {
	public static int numOfChar(String s)
	{
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				count++;
			}
		}
		return count;
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the string....");
	String s= sc.nextLine();
	System.out.println(NumberOfChar.numOfChar(s));
}
}
