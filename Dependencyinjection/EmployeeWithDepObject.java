package com.spring.springcoreprograms;

public class EmployeeWithDepObject 
{
	private int id;
	private String name;
	Address address;

	
	public EmployeeWithDepObject(int id,String name,Address address) 
	{
		this.id=id;
		this.name =name;
		this.address =address;
	}
	public void employeeDetails()
	{
		System.out.println("employee id = "+id+"\n"+"employee name = "+name+"\n"+"address = "+address.getAddress());
	}
}
