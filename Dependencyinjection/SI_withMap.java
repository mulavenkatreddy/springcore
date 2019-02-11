/**
 * 
 */
package com.spring.springcoreprograms;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author bridgeit
 *
 */
public class SI_withMap 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("SI_with_map.xml");
		SI_MapWithDepObject ans = (SI_MapWithDepObject)context.getBean("ques");
		ans.getAnswers();
	}

}
