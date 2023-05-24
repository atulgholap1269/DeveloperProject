package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicateElement {
  public static void removeDuplicate(int a[])
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
		RemoveDuplicateElement.removeDuplicate(a);
	}
}
