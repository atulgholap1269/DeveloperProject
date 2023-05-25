package com.arrayOfObject;

import java.util.Scanner;

public class Student {
  int id;
  String name;
  int mark;



public Student(int id, String name, int mark) {
	super();
	this.id = id;
	this.name = name;
	this.mark = mark;
}
@Override
public String toString()
{
	return "id=" + id + ", name=" + name + ", mark=" + mark ;
}
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the size'");
	int size=sc.nextInt();
	Student s[]= new Student[size];
	System.out.println("enter student details:");
	 for(int i=0; i<s.length;i++)
	 {
		System.out.println("enter  the student id:");
		int sid=sc.nextInt();
		System.out.println("enter the student name:");
		String sname=sc.next();
		System.out.println("Enter Marks:");
		int mark= sc.nextInt();
		s[i]=new Student(sid,sname,mark);
				
	 }
	 for(int i=0; i<s.length;i++)
	 {
		  System.out.println(s[i]+" ");
	 }
	 for(Student st:s)
	 {
		 if(st.mark>=90)
		 {
		 System.out.println(st);
		 }
	 }
}
}
