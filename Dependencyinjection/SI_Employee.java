/**
 * 
 */
package com.spring.springcoreprograms;

/**
 * @author bridgeit
 *
 */
public class SI_Employee 
{
	private String name;
	private int id;
	private SI_Address address;
	public void setName(String name) 
	{
		this.name = name;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	
	public void setAddress(SI_Address address) {
		this.address = address;
	}
	public void getDetails()
	{
		System.out.println("employee id = "+id +"   "+"employee details = "+name+" \n address : "+address.getAddress());
	}
	
}
