package com.array;

import java.util.Scanner;

public class DuplicateElement {
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
    					 count++;
    				 }
    			 }
    			 if(count>1)
    			 {
    				 System.out.println(a[i]+" "+count);
    			 }
    		 }
    	 }
     }
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter array size");
		int size= sc.nextInt();
		System.out.println("Enter array element");
		int a[]=new int[size];
		for(int i=0; i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		DuplicateElement.duplicateElement(a);
	}
}
