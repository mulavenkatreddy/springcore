/**
 * 
 */
package com.spring.springcoreprograms;

/**
 * @author bridgeit
 *
 */
public class ListDep 
{
	private int  id;
	private String answer;
	private String name;
	
	public ListDep(int id,String answer,String name)
	{
		this.id=id;
		this.answer = answer;
		this.name=name;
	}
	
	public String answers()
	{
		return ("id ="+id+"\n"+"name = "+name+"\n"+"answer = "+answer);
	}
}
