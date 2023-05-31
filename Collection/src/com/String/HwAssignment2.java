package com.String;

import java.util.Scanner;

public class HwAssignment2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int num=sc.nextInt();
		int mul1=num*1;
		int mul2=num*2;
		int mul3=num*3;
		String str1=""+mul1;
		String str2=""+mul2;
		String str3=""+mul3;
	    String s=str1.concat(str2).concat(str3);
		System.out.println(s);
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			char c[]= s.toCharArray();
			for(int j=i+1;j<s.length();j++)
			{
			  if(c[i]==c[j])
			  {
				  count++;
			  }
			}
			
		}
		if(count==0)
		{
			System.out.println("fascinating number");
		}
		else
		{
			 System.out.println("not fascinating number");
		} 
		
	}

}
