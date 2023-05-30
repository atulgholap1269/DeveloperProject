package com.AssignmentArrayObject;

import java.util.Scanner;

public class Student {
int roll;
String name;
int age;
int marks;
public Student(int roll, String name, int age, int marks) {
	super();
	this.roll = roll;
	this.name = name;
	this.age = age;
	this.marks = marks;
}
@Override
public String toString() {
	return "Student [roll=" + roll + ", name=" + name + ", age=" + age + ", marks=" + marks + "]";
}
public static void main(String[] args) {
	Student s[]= new Student[4];
	Scanner sc = new Scanner(System.in);
	for(int i=0;i<s.length;i++)
	{
		System.out.println("Enter roll number");
		int roll= sc.nextInt();
		System.out.println("Enter namee");
		String name=sc.next();
		System.out.println("enter age:");
		int age= sc.nextInt();
		System.out.println("Enter marks: ");
		int marks=sc.nextInt();
		s[i]=new Student(roll,name,age,marks);
	}
	for(int i=0;i<s.length;i++)
	{
		if(s[i].marks>60&&s[i].age<15)
		{
			System.out.println(s[i]);
		}
	}
}
}
