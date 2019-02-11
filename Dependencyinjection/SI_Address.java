/**
 * 
 */
package com.spring.springcoreprograms;

/**
 * @author bridgeit
 *
 */
public class SI_Address 
{
	private String city;
	private String state;
	private int hno;
	public void setCity(String city) 
	{
		this.city = city;
	}
	public void setState(String state) 
	{
		this.state = state;
	}
	public void setHno(int hno) 
	{
		this.hno = hno;
	}
	
	public String getAddress()
	{
		return "house no = "+hno+"\n"+"city ="+city+"\n"+"state = "+state;
	}
	
}
