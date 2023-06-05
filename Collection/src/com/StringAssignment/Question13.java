package com.StringAssignment;

public class Question13 {
public static void main(String[] args) {
	//replace white psaces in string
	String s="    My name is atul gholap hello    ";
	s="Hello to "+s.trim();// remove first and last leading white spaces.
	
   // s=s.replaceAll("\\s+", "");// replace all the white spaces in string
	System.out.println(s);
	//Question 14: count of number of word
	String sp[]=s.split(" ");
	int countOfWord=0;
	for(int i=0; i<sp.length;i++)
	{
		countOfWord++;
	}
		System.out.println("Count of word is "+countOfWord);	
	//Question 15: count of first occurance of word
		String sp1[]=s.split(" ");
		String s1=sp1[0];
		int countOfWord1=0;
		for(int i=0; i<sp.length;i++)
		{
			if(s1.equals(sp1[i]))
			{
				countOfWord1++;
			}
		}
		System.out.println(countOfWord1);
}
}
