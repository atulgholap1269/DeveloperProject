package com.AssignmentArrayObject;

import java.util.Arrays;
import java.util.Scanner;
class Date
{
	int day;
	int name;
	int year;
	public Date(int day, int name, int year) {
		super();
		this.day = day;
		this.name = name;
		this.year = year;
	}
	@Override
	public String toString() {
		return "Date [day=" + day + ", name=" + name + ", year=" + year + "]";
	}
	
}
public class Employee {
  int id;
  String name;
  int salary;
  Date d;

public Employee(int id, String name, int salary,Date d ) {

	this.id = id;
	this.name = name;
	this.salary = salary;
	this.d=d;
}
@Override
public String toString() {
	return "id=" + id + ", name=" + name + ", salary=" + salary + d;
}
  public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter employee details: ");
	Employee obj[] = new Employee[3];
	for(int i=0;i<obj.length;i++)
	{
		System.out.println("Enter id: ");
		int id=sc.nextInt();
		System.out.println("Enter name: ");
		String name= sc.next();
		System.out.println("Enter salary: ");
		int salary= sc.nextInt();
		System.out.println("Enter date of joining:");
		
		
		 System.out.println("Enter day:  ");
		 int day=sc.nextInt();
		 System.out.println("Enter month");
		 int month=sc.nextInt();
		 System.out.println("Enter year");
		 int year=sc.nextInt();
		
	
	obj[i]=new Employee(id, name, salary, new Date(day, month,year));
	}
	for(int i=0; i<obj.length-1;i++)
	{
		for(int j=i+1;j<obj.length;j++)
		{
			if(obj[i].d.day==obj[j].d.day)
			{
				System.out.println(obj[i]);
				System.out.println(obj[j]);
			}
		}
	}
	System.out.println("===================================");
}
}
