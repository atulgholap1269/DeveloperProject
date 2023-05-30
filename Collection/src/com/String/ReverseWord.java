package com.String;

import java.util.Scanner;

public class ReverseWord {
	public static void reverseWord(String s)
	{
		String st[]=s.split(" ");
		String reverString="";
		for(int i=0;i<st.length;i++)
		{
			String word=st[i];
			String rWord="";
			for(int j=word.length()-1;j>=0;j--)
			{
				rWord=rWord+word.charAt(j);
			}
			reverString=reverString+" "+rWord;
		}
		System.out.println(reverString);
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the string....");
	String s= sc.nextLine();
	ReverseWord.reverseWord(s);
}
}
