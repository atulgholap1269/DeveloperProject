package com.ArrayAssignment;

import java.util.Scanner;

public class Question11 {
	public static void countOfDuplicateEle(int a[])
	{
		int c=0;
		for(int i=0;i<a.length;i++)
		{
			int count=1;
			boolean checkDuplicate=false;
			for(int j=i-1;j>=0;j--)
			{
				if(a[i]==a[j])
				{
					checkDuplicate=true;
					break;
					
				}
			}
			if(checkDuplicate==false)
			{
				for(int k=i+1;k<a.length;k++)
				{
					if(a[i]==a[k])
					{
						count++;
						c++;
					}
				}
				if(count>1)
				{
					System.out.println(a[i]+" : "+count);
				}
			}
			
		}
		System.out.println("Total dulpicate elemnt from array is "+c);
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
		Question11.countOfDuplicateEle(a);
	}

}
