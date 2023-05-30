package com.String;

import java.util.Scanner;

public class ReverseWordExceptFirstAndLast {
	public static void reverseWordExceptFirstAndLast(String s)
	{
		String reverse="";
		String sp[]=s.split(" ");
		for(int i=0; i<sp.length;i++)
		{
			String sr=sp[i];
			String reverseWord="";
			if(i!=0 && i!=sp.length-1 )
			{
			  for(int j=sr.length()-1;j>=0;j--)
			  {
				reverseWord=reverseWord+sr.charAt(j);
			  }
		    }
			else
			{
				reverseWord=reverseWord+sp[i];
			}
			reverse=reverse+reverseWord+" ";
		}
		System.out.println(reverse);
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the string....");
	String s= sc.nextLine();
	ReverseWordExceptFirstAndLast.reverseWordExceptFirstAndLast(s);
}
}
