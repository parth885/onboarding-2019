package com.amdocs;

public class Employee {

	private EmployeeData data = new EmployeeData(null, null, null, null);

	public Employee() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Employee(String name, String designation, String department, EmployeeData e) {
		super();
		this.data.name = name;
		this.data.designation = designation;
		this.data.department = department;
	}

}
