package com.String;

import java.util.Scanner;

public class NumberOfVowels {
	public static int checkVowels(String s)
	{
		int count=0;
		for(int i=0;i<s.length()-1;i++)
		{
			char c=s.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
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
		System.out.println(NumberOfVowels.checkVowels(s));
}
}
