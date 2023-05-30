package com.assignmentTwoDimensional;

import java.util.Arrays;

public class Question1 {
public static void main(String[] args) {
	int a[][]=new int[3][4];
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a[i].length;j++)
		{
			a[i][j]=j;
		}
	}
	System.out.println(Arrays.deepToString(a));
}
}
