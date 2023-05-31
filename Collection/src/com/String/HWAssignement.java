package com.String;

import java.util.Scanner;

public class HWAssignement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any string");
		String str=sc.nextLine();
		char ch[]=str.toCharArray();
		int sum1=0;
		int sum2=0;
		int count =0;
		for(int i=0;i<ch.length;i++)
		{
			
			if(Character.isDigit(ch[i]))
			{
				count++;
			}
		}
		if(count==ch.length)
		{
			for(int i=0;i<3;i++)
			{
			sum1=sum1+ch[i];	
			}
			for(int j=ch.length-1;j>=ch.length-3;j--)
			{
				sum2=sum2+ch[j];
			}
		}
		else
		{
			System.out.println("String contain element other than digit");
		
		}
		
		if(sum1==sum2&&sum1>0&&sum2>0)
		{
			System.out.println("valid ");
		}
		else
		{
			System.out.println("not valid");
		}
		
	}

}
