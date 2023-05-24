package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
   public static void mergeArray(int a[], int b[], int merge[])
   {
	  
	   int count=0;
	   int mergeRemoveDuplicate[]= new int[a.length+b.length];
	   for( int i=0;i<a.length;i++)
	   {
		  merge[i]=a[i];
		  count++;
	   }
	   
	   for(int j=0;j<b.length; j++)
	    {
		 merge[count++]=b[j];
	    }
	   System.out.println(Arrays.toString(merge));
   }
   public static void duplicateElement(int a[])
   {
	   for(int i=0; i<a.length; i++)
  	    {
  		 int count=1;
  		 boolean checkDuplicate=false;
  		 for(int j=i-1; j>=0;j--)
  		 {
  			 if(a[j]==a[i])
  			 {
  				 checkDuplicate=true;
  				 break;
  			 }
  		 }
  		 if(checkDuplicate==false)
  		 {
  			 for(int k=i+1;k<a.length; k++)
  			 {
  				 if(a[i]==a[k])
  				 {
  					 a[k]=0;
  				 }
  			 }
//  			
  			
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
		MergeArray.duplicateElement(merge);
		//System.out.println(Arrays.toString(merge));
	}
}
