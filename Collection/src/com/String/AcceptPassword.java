package com.String;

import java.util.Scanner;

public class AcceptPassword {
	public  int uppcaseCount(String p)
	{
		int uc=0;
		for(int i=0;i<p.length();i++)
		{
			if(p.charAt(i)>='A'&& p.charAt(i)<='Z')
			{
				uc++;
			}
		}
		return uc;
	}
	public String reverssWord(String p)
	{
		String last3Char="";
		for(int i=p.length()-1; i>p.length()-4;i--)
		{
			last3Char+=p.charAt(i);
		}
		return last3Char;
	}
	public  int sumOfDigit(String p)
	{
		int sumOfDigit=0;
		for(int i=0; i<p.length();i++)
		if(p.charAt(i)>='0'&& p.charAt(i)<='9')
		{
			sumOfDigit+=Character.getNumericValue(p.charAt(i));
		}
		return sumOfDigit;
	}
	
	public  void truePass(String list, String hint )
	{
		String sp[]=list.split(" ");
		for(int i=0;i<sp.length;i++)
		{
		
             String p=sp[i];
			if(Character.getNumericValue(hint.charAt(0))==this.uppcaseCount(p)&& hint.substring(1,4).equals(this.reverssWord(p))&& Character.getNumericValue(hint.charAt(4))==this.sumOfDigit(p))
			{
				System.out.println("Correct password is :"+p);
				break;
			}
		
		}
	}

public static void main(String[] args) {
   Scanner sc= new Scanner(System.in);
   System.out.println("Enter list of password: ");
   String list=sc.nextLine();
   System.out.println("Enter hint: ");
   String hint=sc.next();
   AcceptPassword obj = new AcceptPassword();
   obj.truePass(list,hint);
  
}
}
