package com.array;

import java.util.Scanner;

public class OddNoFromArray {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	 System.out.println("Enter array size: ");
	 int size=sc.nextInt();
	 int a[]=new int[size];
	 for(int i=0;i<a.length;i++)
	 {
		 a[i]=sc.nextInt();
	 }
	 System.out.println("odd elements from array: ");
	 for(int x:a)
	 {
		 if(x%2!=0)
		 {
			 System.out.println(x+",");
		 }
	 }
}
}
