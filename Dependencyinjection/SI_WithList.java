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
public class SI_WithList 
{

	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("SI_with_list.xml");
		SI_ListWithDepObject ques = (SI_ListWithDepObject)context.getBean("result");
		ques.getAnswers();
		
	}

}
