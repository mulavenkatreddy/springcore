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
public class CI_WithList 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("CI_with_list.xml");
		ListWithDepObject list = (ListWithDepObject)context.getBean("question");
		list.getAnswers();

	}

}
