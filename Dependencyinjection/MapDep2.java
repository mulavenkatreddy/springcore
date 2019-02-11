/**
 * 
 */
package com.spring.springcoreprograms;

/**
 * @author bridgeit
 *
 */
public class MapDep2 
{
	private int id;
	private String answer;
	private String date;
	public MapDep2(int id, String answer,String date) 
	{
		this.id = id;
		this.answer = answer;
		this.date = date;
	}
	public String getAnswers()
	{
		return ("ID: "+id+" "+"Answer: "+answer+" "+"Date: "+date);
	}
}
