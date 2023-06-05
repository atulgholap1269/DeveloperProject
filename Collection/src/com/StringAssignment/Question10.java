package com.StringAssignment;

import java.util.regex.Pattern;

public class Question10 {

	public static void main(String[] args) {

		String s = "HELLO&WOLRD:HELLO";
		System.out.println(s);
		String sp[] = s.split("[&]");
		for (String st : sp) {
			System.out.println(st + " ");
		}
		// Question11
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'O') {
				count++;
			}
		}
		System.out.println("count of character O is " + count);

		int count1 = 0;
		char first = s.charAt(0);
		// Question 11
		for (int i = 0; i < s.length(); i++) {
			if (first == s.charAt(i)) {
				count1++;
			}
		}
		System.out.println("count of " + first + " is " + count1);
		
	}

}
