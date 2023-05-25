package com.arrayOfObject;

import java.util.Arrays;
import java.util.Scanner;

class Stud
{
	int id;
	String name;
	int marks;
	public Stud(int id, String name, int marks) {
		
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Stud [id=" + id + ", name=" +"Mark = "+marks;
	}
}
public class Course {
	int cid;
	String cname;
	Student sd;
	public Course(int cid, String cname, Student sd) 
	{
		super();
		this.cid = cid;
		this.cname = cname;
		this.sd = sd;
	}
		@Override
		public String toString() 
		{
			return "Course [cid=" + cid + ", cname=" + cname + sd;
		}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of course:");
		int size = sc.nextInt();
		Course c[]=new Course[size];
		System.out.println("Enter course details:");
		for(int i=0;i<c.length;i++)
		{
			System.out.println("Enter course id:");
			int cid=sc.nextInt();
			System.out.println("Enter the course name:");
			String cname=sc.next();
			System.out.println("Enter the student details:");
			System.out.println("Enter id:");
			int id=sc.nextInt();
			System.out.println("Enter student name:");
			String name=sc.next();
			System.out.println("Enter the marks");
			int marks =sc.nextInt();
			c[i]=new Course(cid,cname,new Student(id,name,marks));
		}
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
		for(Course co:c)
		{
			if(co.sd.mark>80)
			{
			System.out.println(co);
			}
		}
	}

}
