/**
 * 
 */
package com.spring.springcoreprograms;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author bridgeit
 *
 */
public class MapWithDepObject 
{
	private int qno;
	private String question;
	private Map<MapDep2, MapDep1> answers;
	public MapWithDepObject(int qno,String question,Map<MapDep2,MapDep1> answers) 
	{
		this.qno=qno;
		this.question=question;
		this.answers=answers;
	}
	public void getAnswers()
	{
		System.out.print(qno+")");
		System.out.println(question);
		System.out.println("posted answers: ");
		Set<Entry<MapDep2,MapDep1>> set = answers.entrySet();
		Iterator<Entry<MapDep2,MapDep1>> itr = set.iterator();
		while(itr.hasNext())
		{
			Entry<MapDep2,MapDep1> entry = itr.next();
			MapDep2 ans = entry.getKey();
			MapDep1 user = entry.getValue();
			System.out.println("answers: "+ans.getAnswers());
			System.out.println("users : "+user.getUser());
			System.out.println("-----------------------------------");
		}
	}
}
