/**
 * 
 */
package com.spring.springcoreprograms;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

/**
 * @author bridgeit
 *
 */
public class SI_MapWithDepObject 
{
	private int qno;
	private String question;
	private Map<SI_MapDep1, SI_MapDep> answers;
	
	
	public void setQno(int qno) {
		this.qno = qno;
	}


	public void setQuestion(String question) {
		this.question = question;
	}


	public void setAnswers(Map<SI_MapDep1, SI_MapDep> answers) {
		this.answers = answers;
	}


	public void getAnswers()
	{
		System.out.print(qno+")");
		System.out.println(question);
		System.out.println("posted answers: ");
		Set<Entry<SI_MapDep1,SI_MapDep>> set = answers.entrySet();
		Iterator<Entry<SI_MapDep1,SI_MapDep>> itr = set.iterator();
		while(itr.hasNext())
		{
			Entry<SI_MapDep1,SI_MapDep> entry = itr.next();
			SI_MapDep1 ans = entry.getKey();
			SI_MapDep user = entry.getValue();
			System.out.println("answers: "+ans.getAnswers());
			System.out.println("users : "+user.getUser());
			System.out.println("-----------------------------------");
		}
	}
	
}
