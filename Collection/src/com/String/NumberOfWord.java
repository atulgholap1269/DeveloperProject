package com.String;

import java.util.Scanner;

public class NumberOfWord {
	public static void findNumberOfWord(String s)
	{
		String sp[]=s.split(" ");
		int count=0;
		for(int i=0;i<sp.length;i++)
		{
			count++;
		}
		System.out.println("Number of word: "+count);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string....");
		String s= sc.nextLine();
		NumberOfWord.findNumberOfWord(s);
}
}