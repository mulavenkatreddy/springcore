/**
 * 
 */
package com.spring.springcoreprograms;

/**
 * @author bridgeit
 *
 */
public class SI_MapDep 
{
	private int id;
	private String name;
	private String mailID;
	
	/*public SI_MapDep(int id,String name,String mailID)
	{
		this.id = id;
		this.name = name;
		this.mailID = mailID;
	}*/
	public SI_MapDep()
	{
		
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setMailID(String mailID) {
		this.mailID = mailID;
	}
	
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getMailID() {
		return mailID;
	}
	public String getUser()
	{
		return ("ID :"+id+" name: "+name+" email: "+mailID);
	}
}
