/**
 * 
 */
package com.spring.springcoreprograms;

/**
 * @author bridgeit
 *
 */

public class Employee 
{
	Address address;
	private String name;
	private int id;
	
	public Employee()
	{
		System.out.println("employee details of bridgelabz");
	}
	public Employee(int id , String name,Address address)
	{
		this.name = name;
		this.id  = id;
		this.address = address;
	}
	public void getDetails()
	{
		System.out.println("employee id = "+id +"   "+"employee details = "+name);
	}
	
}
