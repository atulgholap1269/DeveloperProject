package com.ArrayAssignment;

import java.util.Scanner;

public class Question14 {
	public static void frequency(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			int count=1;
			boolean checkDuplicate=false;
			for(int j=i-1;j>=0;j--)
			{
				if(a[i]==a[j])
				{
					checkDuplicate=true;
				}
			}
			if(checkDuplicate==false)
			{
				for(int k=i+1;k<a.length;k++)
				{
					if(a[k]==a[i])
					{
						count++;
					}
				}
			}
			if(count>=1)
			{
			System.out.println("count of ele: "+a[i]+" is "+count);
			}
		}
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter thye size of array");
	int size= sc.nextInt();
	int a[]= new int[size];
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	Question14.frequency(a);
}
}
