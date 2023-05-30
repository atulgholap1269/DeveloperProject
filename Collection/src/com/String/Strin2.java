package com.String;

public class Strin2 {
	public static void main(String[] args) {
//		String str="Hello";
//		String str1="hello";
//		String str2=new String("Hello");
//		String str3=new String("Hello");
//		System.out.println(str==str1);
//		System.out.println(str2==str3);
//		
//		System.out.println(str.equals(str1));
//		System.out.println(str.equalsIgnoreCase(str1));
//		System.out.println(str.compareTo(str1));//written difference bet two String
		
		String s="I like india country";
		char c[]=s.toCharArray();
		for(char ch:c)
		{
			System.out.print(ch+" ");
		}
		System.out.println("==============================");
		String s2="java, c,c++,python";
		String st[]=s2.split(",");
		for(String ss:st)
		{
			System.out.print(ss+" ");
		}
		
		System.out.println("==============================");
		char ch1[]= {'w','e','l','c','o','m','e'};
		String st2=new String(ch1);
		System.out.println(st2);
	}

}
