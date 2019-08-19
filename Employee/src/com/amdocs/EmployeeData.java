package com.amdocs;

public class EmployeeData {
	public String name;
	public String designation;
	public String department;
	public String doorNo;
	public String street;
	public String city;
	public String pincode;
	public EmployeeData(String doorNo, String street, String city, String pincode) {
		
		// TODO Auto-generated constructor stub
		this.doorNo = doorNo;
		this.street = street;
		this.city = city;
		this.pincode = pincode;
	}
}