package com.ArrayProject;

import java.util.Arrays;
import java.util.Scanner;

public class Organization {
	String department;
	String role;
	Employee e[];
	public Organization(String department, String role, Employee[] e) {
		super();
		this.department = department;
		this.role = role;
		this.e = e;
	}
	@Override
	public String toString() {
		return "department=" + department + ", role=" + role + ", e=" + Arrays.toString(e);
	}

	public void showEmployee(int id)
	{
		for(int i=0;i<e.length;i++)
		{
			if(e[i].employee_Id==id)
			{
				System.out.println(e[i]);
			}
		}
	}
	
	public void updateEmployee(int id, String name)
	{
		for(int i=0;i<e.length;i++)
		{
			if(e[i].employee_Id==12)
			{
				e[i].employee_Name=name;
			}
		}
	}
	public void deletEmployee(int id)
	{
		for(int i=0;i<e.length;i++)
		{
			if(e[i].employee_Id==id)
			{
				e[i]=null;
			}
		}
	}
	public void swapNullRows()
	{
		int j=0;
		for(int i=0;i<e.length;i++)
		{
			if(e[i]!=null)
			{
				e[j]=e[i];
				j++;
			}
			
		}
		e[e.length-1]=null;
	}
	public void show()
	{
		for(int i=0;i<e.length;i++)
		{
		
			if(e[i]!=null)
			{
				System.out.println(e[i]);
			}
		
			else
			{
				try
				{
					throw new NullPointer("employee of array "+i+" is null");
				}
				catch(NullPointer e)
				{
					System.out.println("Mesaagee is "+e.getMessage());
					 System.out.println("Type of class : "+e.getClass());
					 
				}
			}
			
		}
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Department name");
	String departmentName=sc.next();
	System.out.println("Enter role of employee: ");
	String role=sc.next();
	System.out.println("Enter size array employee: ");
	int size=sc.nextInt();
	Employee []e=new Employee[size];
	System.out.println("Enter Employee Details:");
	for(int i=0;i<e.length;i++)
	{
		System.out.println("Enter Employee ID:");
		int empid=sc.nextInt();
		System.out.println("Enter Employee Name:");
		String empName=sc.next();
		System.out.println("Enter salary: ");
		int salary=sc.nextInt();
		e[i]=new Employee(empid, empName, salary);
	}
	Organization obj = new Organization(departmentName, role, e);
	
	obj.showEmployee(12);
	System.out.println("=====================");
	obj.updateEmployee(12, "amey");
	System.out.println(obj);
	System.out.println("=====================");
	obj.deletEmployee(12);
	System.out.println(obj);
	System.out.println("=====================");
	obj.swapNullRows();
	System.out.println(obj);
	System.out.println("=====================");
	obj.show();
	
}
}
