/**
 * 
 */
package com.spring.springcoreprograms;

/**
 * @author bridgeit
 *
 */
public class SI_ListDep 
{
	private int  id;
	private String answer;
	private String name;
	
	public void setId(int id) {
		this.id = id;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String answers()
	{
		return ("id ="+id+"\n"+"name = "+name+"\n"+"answer = "+answer);
	}
	
}
