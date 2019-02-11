/**
 * 
 */
package com.spring.springcore.annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author bridgeit
 *
 */
//@Component
public class Employee 
{
	private String name;
	private int id;
	//class type dependent object
	private Address address;
	//interface type dependent object
	private Company companyName;
	
	@Value("banjara hills")
	//@Value("${area.Name}")//dyanamic way to give value
	private String area;
	
	/*setting values using constructor*/
/*	public Employee(String name, int id, Address address) 
	{
		this.name = name;
		this.id = id;
		this.address = address;
	}*/
	/*setting values using setter methods */
	
	public void setCompanyName(Company companyName) 
	{
		this.companyName = companyName;
	}

	public void setAddress(Address address) 
	{
		this.address = address;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void getDetails()
	{
		System.out.println("name :"+name+"\n"+"id : "+id+"\n"+"address :"+address.getAddress()+",area :"+area+"\ncompany address: "+companyName.address());
	}
	
}
