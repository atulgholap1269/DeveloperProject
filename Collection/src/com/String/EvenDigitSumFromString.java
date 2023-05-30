package com.String;

import java.util.Scanner;

public class EvenDigitSumFromString {
	public static int addEvenDigit(String s)
	{
		int sumOfEven=0;
		for(int i=0;i<s.length();i++)
		{
			if(Character.isDigit(s.charAt(i)))
			{
				int num=Character.getNumericValue(s.charAt(i));
				if(num%2==0)
				{
					sumOfEven=sumOfEven+num;
				}
			}
		}
		return sumOfEven;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string....");
		String s= sc.nextLine();
		System.out.println(EvenDigitSumFromString.addEvenDigit(s));
		
}
}