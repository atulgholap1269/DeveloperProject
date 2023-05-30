package com.String;

import java.util.Scanner;

public class ToggleCase {
	public static void covertToggleCase(String s)
	{
		for(int i=0; i<s.length();i++)
		{
		   char c=s.charAt(i);
			if(c>='a'&& c<='z')
			{
				c=(char) (c-32);
			}
			else if(c>='A'&&c<='Z')
			{
				c=(char) (c+32);
			}
			else
			{
				c=c;
			}
			System.out.print(c);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string....");
		String s= sc.nextLine();
		ToggleCase.covertToggleCase(s);
}
}