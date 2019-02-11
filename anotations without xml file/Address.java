/**
 * 
 */
package com.spring.springcore.annotations;

import org.springframework.stereotype.Component;

/**
 * @author bridgeit
 *
 */
//@Component
public class Address 
{
	private int flatNo;
	private String city;
	private String state;
	
	public Address(int hno, String city, String state) 
	{
		this.flatNo = hno;
		this.city = city;
		this.state = state;
	}
	
	public String getAddress()
	{
		return "flatNo : "+flatNo+",city : "+city+",state: "+state;
	}
}
