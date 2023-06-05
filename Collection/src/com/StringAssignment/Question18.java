package com.StringAssignment;

public class Question18 {
	public static void main(String[] args) {
		//remove all occurances of character
		String s = "my name is is    atul   gholap";
		char y[] = s.toCharArray();
		char c = 'a';
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			if (y[i] != c) {
				res = res + y[i];
			}
		}

		System.out.println(res);
		
		// Question 21:remove all extra white spaces from string
		String s2="";
		for(int i=0;i<s.length();i++)
		{
			if((s.charAt(i)==' ') && (s.charAt(i+1)==' ') )
			{
				continue;
			}
			else
			{
				s2=s2+s.charAt(i);
			}
		}
		System.out.println(s2);
		
	}

}
