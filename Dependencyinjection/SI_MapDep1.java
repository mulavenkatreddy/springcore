/**
 * 
 */
package com.spring.springcoreprograms;

/**
 * @author bridgeit
 *
 */
public class SI_MapDep1 
{
	private int id;
	private String answer;
	private String date;
	
	public SI_MapDep1() {
	// TODO Auto-generated constructor stub
		}
	/*public SI_MapDep1(int id,String answer,String date) 
	{
		this.id=id;
		this.answer=answer;
		this.date=date;
	}*/
	
	public void setId(int id) {
		this.id = id;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	
	public int getId() {
		return id;
	}

	public String getAnswer() {
		return answer;
	}

	public String getDate() {
		return date;
	}

	public String getAnswers()
	{
		return ("ID: "+id+" "+"Answer: "+answer+" "+"Date: "+date);
	}

	
}
