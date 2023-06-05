package com.StringAssignment;

public class Question23 {
public static void main(String[] args) {
	//count total number of vowels and constonant in string
	String s="my name is atul gholap";
	int countOfVowles=0;
	int countOfDigit=0;
	int countcost=0;
	for(int i=0;i<s.length();i++)
	{
		char c[]=s.toCharArray();
		if(c[i]=='a'|| c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u')
		{
			countOfVowles++;
		}
		else if (Character.isDigit(c[i]))
		{
			countOfDigit++;
		}
		else 
		{
			countcost++;
		}
		
	}
	System.out.println("count of vowles : "+countOfVowles);
	System.out.println("Count of consonent : "+countcost);
	System.out.println("count of digit : "+countOfDigit) ;
}
}
