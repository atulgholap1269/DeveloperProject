package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class RepalceEleWhichDiviBy3 {
    public static void replace(int a[])
    {
    	for(int i=0; i<a.length;i++)
    	{
    		if(a[i]%3==0)
    		{
    			a[i]=0;
    		}
    	}
    	System.out.println(Arrays.toString(a));
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter arr1 size");
		int size= sc.nextInt();
		int a[]=new int[size];
		
		for(int i=0; i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		RepalceEleWhichDiviBy3.replace(a);
	}
}
