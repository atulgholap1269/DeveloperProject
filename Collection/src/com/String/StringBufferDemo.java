package com.String;

public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer sb= new StringBuffer();
		sb.append("pune");//add string to index
		System.out.println(sb);
		
		String s2=sb.toString();//if we give String-buffer to string still it is created in another memory location
		System.out.println(s2);
		System.out.println(s2.equals(sb));// false
		
		StringBuffer sb2= new StringBuffer("pune");//if created another string-buffer having same string with previous still it refer another memory location
		System.out.println(sb+" "+sb2);
		System.out.println(sb.equals(sb2));//false
		sb=sb2;                            // we assign same memory location for both string-biffer
		System.out.println(sb.equals(sb2));//true
//		
//		sb.append(" welcome");// add another string it will add from last index of first string
//		System.out.println(sb);
//		
//		sb.insert(4," love ");// insert string from specific index
//		System.out.println(sb);
//		
//		//System.out.println(sb.reverse()); reverse string
//		String str=" clean pune";
//		sb.append(str);   // also give string object as parameter
//		System.out.println(sb);
//		
//		sb.delete(5, 9);
//		System.out.println(sb);
		 
		 
	}

}
