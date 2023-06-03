package com.ArrayProject;

public class Employee {
	int employee_Id;
	String employee_Name;
	int salaryOfEmployee;

	@Override
	public String toString() {
		return "Employee [employee_Id=" + employee_Id + ", employee_Name=" + employee_Name + ", salaryOfEmployee="
				+ salaryOfEmployee + "]";
	}

	public Employee(int employee_Id, String employee_Name, int salaryOfEmployee) {
		super();
		this.employee_Id = employee_Id;
		this.employee_Name = employee_Name;
		this.salaryOfEmployee = salaryOfEmployee;
	}

}
