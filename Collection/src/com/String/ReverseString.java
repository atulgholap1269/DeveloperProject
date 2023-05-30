package com.String;

import java.util.Scanner;

public class ReverseString {
	public static void reverseString(String s)
	{
		System.out.println(s);
		String reverse="";
		for(int i=s.length()-1;i>=0;i--)
		{
			reverse=reverse+s.charAt(i);
		}
		System.out.println(reverse);
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the string....");
	String s= sc.nextLine();
	ReverseString.reverseString(s);
	
}
}
