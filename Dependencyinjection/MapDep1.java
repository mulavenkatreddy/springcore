/**
 * 
 */
package com.spring.springcoreprograms;

/**
 * @author bridgeit
 *
 */
public class MapDep1 
{
	private int id;
	private String name;
	private String mailID;
	public MapDep1(int id,String name,String mailID) 
	{
		this.id=id;
		this.name=name;
		this.mailID=mailID;
	}
	public String getUser()
	{
		return ("ID :"+id+" name: "+name+" email: "+mailID);
	}
}
