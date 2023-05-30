package com.String;

import java.util.Scanner;

public class SumOfDigitInString {
	public static int sumOfDigit(String s)
	{
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
//			if(s.charAt(i)>='0' && s.charAt(i)<='9')
//			{
//				System.out.println(s.charAt(i));
//				sum=sum+Character.getNumericValue(s.charAt(i));
//			}
			if(Character.isDigit(s.charAt(i)))
			{
				System.out.println(s.charAt(i));
				sum=sum+Character.getNumericValue(s.charAt(i));
			}
			
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string....");
		String s= sc.nextLine();
		System.out.println(SumOfDigitInString.sumOfDigit(s));
	}
}
