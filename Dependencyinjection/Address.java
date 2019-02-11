/**
 * 
 */
package com.spring.springcoreprograms;

/**
 * @author bridgeit
 *
 */
public class Address 
{
	private String city;
	private String state;
	private int hno;
	public Address(int hno,String city,String state)
	{
		this.hno=hno;
		this.city=city;
		this.state=state;
	}
	public String getAddress()
	{
		return "house no = "+hno+"\n"+"city ="+city+"\n"+"state = "+state;
	}
}
