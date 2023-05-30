package com.assignmentTwoDimensional;

import java.util.Arrays;
import java.util.Scanner;

public class Question2 {
	   public static void main(String[] args) {
		   int a[][]=new int[3][5];
		   Scanner sc = new Scanner(System.in);
	       System.out.println("Enter array elements");
	       for(int i=0;i<a.length;i++)
	       {
	    	   for(int j=0;j< 5;j++)
	    	   {
	    		   a[i][j]=sc.nextInt();
	    	   }
	       }
	     
	   }
	   
}
