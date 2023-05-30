package com.assignmentTwoDimensional;

public class Question4 {
	public static void main(String[] args) {
		
	int a[][]= {{22,31,9},{12,5,16},{34,42,2}};
    for(int i=0;i<a[0].length;i++)
     {
    	int max=a[0][i];
	   for(int j=0;j<a.length;j++)
	    {
		   if(max<a[j][i])
		   {
			   max=a[j][i];
		   }
		 
	    }
	   System.out.println(max);
     }
	}
}
