package com.String;

import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagraph {
	public static boolean ckeckAnagraph(String str1,String str2)
	{
	boolean isAnagraph=false;
	if(str1.length()==str2.length())
	{
		String st1=str1.toLowerCase();
		String st2=str2.toLowerCase();
		System.out.println(st1);
		System.out.println(st2);
		System.out.println("======================================");
		
		char ch1[]=st1.toCharArray();
		char ch2[]=st2.toCharArray();
		System.out.println(Arrays.toString(ch1));
		System.out.println(Arrays.toString(ch2));
		System.out.println("==================After sorting====================");
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		System.out.println(Arrays.toString(ch1));
		System.out.println(Arrays.toString(ch2));
		System.out.println("====================Result=================");
		
		String s1=new String(ch1);
		String s2=new String(ch2);
		
		if(s1.equals(s2))
		{
			isAnagraph=true;
		}
		else
		{
			isAnagraph=false;
		}
	}
	else
	{
		isAnagraph=false;
	}
	return isAnagraph;
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter first string");
	String str1 = sc.nextLine();
	System.out.println("Enter second String");
	String str2 = sc.nextLine();
    if(CheckAnagraph.ckeckAnagraph(str1, str2))
    {
    	System.out.println("String are anagraph string");
    }
    else
    {
    	System.out.println("String are not anagraph string");

    }
}
}
