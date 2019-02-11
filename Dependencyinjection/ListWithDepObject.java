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
public class ListWithDepObject 
{
	private int qno;
	private String question;
	private List<ListDep> answers;
	
	public ListWithDepObject(int qno,String question,List<ListDep> answers) 
	{
		this.qno=qno;
		this.question=question;
		this.answers = answers;
	}
	
	public void getAnswers()
	{
		System.out.println(qno+") "+question);
		System.out.println("answers are :");
		Iterator<ListDep> itr = answers.iterator();
		while (itr.hasNext())
		{
			System.out.println(itr.next().answers());
			System.out.println("-----------------------------");
		}
	}
	
}

