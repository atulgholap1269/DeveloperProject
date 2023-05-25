package com.arrayOfObject;

import java.util.Arrays;
import java.util.Scanner;

public class Student1 {
int id;
String name;
int marks[];
Student1(int id, String name,  int marks[])
{
	this.id=id;
	this.name=name;
	this.marks=marks;
}
public String toString()
{
	return id+" "+name+" "+Arrays.toString(marks);
	
}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of student");
	int size=sc.nextInt();
	Student1 s[]= new Student1[size];
	System.out.println("Enter student details:");
	for(int i=0;i<s.length;i++)
	{
		System.out.println("Enter student id: ");
		int id= sc.nextInt();
		System.out.println("Enter student name:");
		String name= sc.next();
		System.out.println("Enter student no of subject");
		int no=sc.nextInt();
		int mk[]= new int[no];
		for(int j=0; j<mk.length;j++)
		{
		mk[j]=sc.nextInt();	
		}
		s[i]=new Student1(id,name,mk);
	}
	for(int i=0;i<s.length;i++)
	{
		System.out.println(s[i]);
	}
}
}
