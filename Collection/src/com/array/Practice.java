 package com.array;

import java.util.Arrays;
import java.util.Scanner;


public class Practice
{
	public static void main(String[] args) {
		int a[]= {1,2,3,9,10,6,7,8};
	    int input=11;
		int diff=input-a[0] ;
		int nearest=0;
		if(diff<0)
		{
			diff=diff*-1;
		}
		int diff2;
		for(int i=0;i<a.length;i++)
		{
			diff2=input-a[i];
			if(diff2<0)
			{
				diff2=diff*-1;
			}
			if(diff2<diff)
			{
				nearest=a[i];
				diff=diff2;
			}
		}
		System.out.println("Nearest element is "+nearest);
	}
}