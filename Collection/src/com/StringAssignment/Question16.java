package com.StringAssignment;

public class Question16 {
public static void main(String[] args) {
	String s="My name is is atul gholap";
	//search all occurance of a character in given string
	for(int i=0; i<s.length(); i++)
	{
		int count=1;
		boolean isVisited=false;
		for(int k=i-1; k >= 0;k--)
		{
			if(s.charAt(i)==s.charAt(k))
			{
				isVisited=true;
				break;
			}
		}
		if(isVisited==false)
		{
			for(int j=i+1;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
				}
			}
			System.out.println(s.charAt(i)+" "+count);
		}
		
	}
}
}
