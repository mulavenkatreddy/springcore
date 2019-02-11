/**
 * 
 */
package com.spring.springcoreprograms;

import java.util.Iterator;
import java.util.List;

/**
 * @author bridgeit
 *
 */
public class SI_ListWithDepObject 
{
	private int qno;
	private String question;
	private List<SI_ListDep> answers;
	
	
	public void setQno(int qno) {
		this.qno = qno;
	}


	public void setQuestion(String question) {
		this.question = question;
	}


	public void setAnswers(List<SI_ListDep> answers) {
		this.answers = answers;
	}


	public void getAnswers()
	{
		System.out.println(qno+") "+question);
		System.out.println("answers are :");
		Iterator<SI_ListDep> itr = answers.iterator();
		while (itr.hasNext())
		{
			System.out.println(itr.next().answers());
			System.out.println("-----------------------------");
		}
	}
	
}
