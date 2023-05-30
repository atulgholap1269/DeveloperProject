package com.AssignmentArrayObject;

import java.util.Scanner;

class Department
{
	int did;
	String dname;
	public Department(int did, String dname) {
		super();
		this.did = did;
		this.dname = dname;
	}
	@Override
	public String toString() {
		return "Department [did=" + did + ", dname=" + dname + "]";
	}
	
}
class MyDate
{
	int day;
	int month;
	int year;
	public MyDate(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	@Override
	public String toString() {
		return "MyDate [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	
}
public class Employee1 {
  int emp_id;
  String emp_name;
  int salary;
  Department d;
  MyDate m;
public Employee1(int emp_id, String emp_name, int salary, Department d, MyDate m) {
	super();
	this.emp_id = emp_id;
	this.emp_name = emp_name;
	this.salary = salary;
	this.d = d;
	this.m = m;
}
@Override
public String toString() {
	return "emp_id=" + emp_id + ", emp_name=" + emp_name + ", salary=" + salary+d +m
			;
}
  public static void main(String[] args) {
	 
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter number of employee: ");
	  int size=sc.nextInt();
	Employee1 e[]=new Employee1[size];
	for(int i=0;i<e.length;i++)
	{
		System.out.println("Enter employee id: ");
		int eid=sc.nextInt();
		System.out.println("Enter employee name: ");
		String name= sc.next();
		System.out.println("Enter salary: ");
		int salary=sc.nextInt();
		System.out.println("Enter number of department details:");
		System.out.println("Enter department id");
		int did= sc.nextInt();
		System.out.println("Enter department name:");
		String dname= sc.next();
		System.out.println("Enter date details");
		System.out.println("Enter day:");
		int day=sc.nextInt();
		System.out.println("Enter month:");
		int month= sc.nextInt();
		System.out.println("Enter year");
		int year= sc.nextInt();
		e[i]=new Employee1(eid, name,salary, new Department(did, dname), new MyDate(day, month, year) );
	}
	
	for(int i=0;i<e.length;i++)
	{
		for(int j=i+1;j<e.length;j++)
		{
			if(e[i].d.dname.equals(e[j].d.dname))
			{
		     System.out.println(e[i]);
		     System.out.println(e[j]);
			}
		}
	}
}
}
