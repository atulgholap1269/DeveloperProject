package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
   public static void mergeArray(int a[], int b[], int merge[])
   {
	  
	   int count=0;
	  // int mergeRemoveDuplicate[]= new int[a.length+b.length];
	   for( int i=0;i<a.length;i++)
	   {
		  merge[i]=a[i];
		  count++;
	   }
	   
	   for(int j=0;j<b.length; j++)
	    {
		  boolean isAdded=false;
		  for(int k=count-1; k>=0;k--)
		  {
			  if(merge[k]==b[j])
			  {
				  isAdded=true;
				  break;
			  }
		  }
		  if(isAdded==false)
		  
			  merge[count]=b[j];
		  count++;
		  }
		
	    
	   System.out.println(Arrays.toString(merge));
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
		System.out.println("Enter arr2 size");
		int size2= sc.nextInt();
		int b[]=new int[size2];
		for(int i=0; i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}
		 int merge[]=new int[a.length+b.length];
		//int k[]=new int [size+size2];
		MergeArray.mergeArray(a, b,merge);
		
		//System.out.println(Arrays.toString(merge));
	}
}
