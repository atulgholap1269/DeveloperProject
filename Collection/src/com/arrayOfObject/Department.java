package com.arrayOfObject;

import java.util.Arrays;
import java.util.Scanner;

class Employe
{
	int eid;
	String ename;
	int salary;
	public Employe(int eid, String ename, int salary)
	{
		this.eid=eid;
		this.ename=ename;
		this.salary=salary;
	}
	public String toString()
	{
		return "eid = "+eid+" ename = "+ename+" salary = "+salary;
	}
}
public class Department {
	int did;
	String dname;
	Employe e[];
	public Department(int did, String dname, Employe e[])
	{
		this.did=did;
		this.dname=dname;
		this.e=e;
	}
	public String toString()
	{
		return "did = "+did+" dname = "+dname+ " employee details : "+ Arrays.toString(e);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size:");
		int size=sc.nextInt();
		Department d[]= new Department[size];
		System.out.println("Enter department details:");
		for(int i=0; i<d.length;i++)
		{
			System.out.println("Enter department id:");
			int did=sc.nextInt();
			System.out.println("Enter department name:");
			String dname= sc.next();
			System.out.println("Enter employee array size");
			int size1= sc.nextInt();
			Employe e[]= new Employe[size1];
			for(int j=0; j<e.length;j++)
			{
				System.out.println("Employee id:");
				int eid= sc.nextInt();
				System.out.println("Employee name:");
				String ename= sc.next();
				System.out.println("employee salary:");
				int salary= sc.nextInt();
				e[j]=new Employe(eid,ename,salary);
			}
			d[i]= new Department(did,dname,e);
			
		}
		System.out.println("====================================");
		for(Department di:d)
		{
			System.out.println(di);
		}
		
		
	}
}