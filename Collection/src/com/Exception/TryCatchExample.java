package com.Exception;
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
public class TryCatchExample {
public static void main(String[] args) {
	Employee e[]=new Employee[2];
	e[0]=new Employee(101,"Atul",67000);
	for(int i=0;i<e.length;i++)
	{
		try {
		if(e[i].salary>60000)
		{
			System.out.println(e[i]);
		}
		}
		catch(Exception o)
		{
			
		}
		System.out.println("hiii");
	}
}
}
