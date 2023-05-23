package com.array;

import java.util.Scanner;

public class DisplayEvenPositionElement {
       public static void displayEvenPositionElement(int a[])
       {
    	   for(int i=0;i<a.length;i++)
    	   {
    		   if(i%2==0)
    		   {
    		   System.out.print(a[i]+" ");
    		   }
    	   }
       }
	
	
	public static void main(String[] args) {
		System.out.println("Enter array element");
		Scanner sc = new Scanner(System.in);
		int a[]=new int[7];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		DisplayEvenPositionElement.displayEvenPositionElement(a);
	}
}
