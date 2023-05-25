package com.arrayOfObject;

import java.util.Scanner;

class Employee
{
	int id;
	String name;
	int salary;
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
public class Test {
	public static void main(String[] args) {
		Employee emp[]= new Employee[3];
//		emp[0]=new Employee(101, "Yash",67000);
//		emp[1]=new Employee(102, "Atul",57000);
//		emp[2]=new Employee(103, "Vijay",47000);
//		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee details");
		for(int i=0; i<emp.length;i++)
		{
			System.out.println("Enter employeeId");
			int id=sc.nextInt();
			System.out.println("Enter employee name");
			String name=sc.next();
			System.out.println("Enter salary:");
			int salary=sc.nextInt();
			emp[i]=new Employee(id,name,salary);
		}
		for(int i=0;i<emp.length;i++)
		{
			System.out.println(emp[i]);
		}
		System.out.println("========================================");
		for(Employee e:emp)
		{
			if(e.salary>50000)
			{
			System.out.println(e);
			}
		}
	}

}
