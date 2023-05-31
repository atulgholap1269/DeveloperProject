package com.ArrayAssignment;

import java.util.Scanner;

public class Question12 {
	public static void uniquElemet(int a[])
	{
		for(int i=0; i<a.length;i++)
		{
			boolean checkDuplicate=false;
			int count=1;
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
					}
				}
				if(count==1)
				{
					System.out.println("Unique element is "+a[i]+" ");
				}
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
		Question12.uniquElemet(a);
	}

}
