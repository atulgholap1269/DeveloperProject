package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class SeachElement {
public void search(int a[], int n)
{
	System.out.println(Arrays.toString(a));
	boolean  isPresent=false;
	
	for(int i=0; i<a.length;i++)
	{
		isPresent=false;
		if(a[i]==n)
		{
			isPresent=true;
			break;
		}
	}
		if(isPresent==true)
		{
			System.out.println("element is present");
			
		}
		else
		{
			System.out.println("element is not present");
			
			
		}
		
	
}
public static void main(String[] args) {
	int a[]= {5,7,3,4,8};
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the element for search");
	int num= sc.nextInt();
	SeachElement obj = new SeachElement();
	obj.search(a, num);
}
}
