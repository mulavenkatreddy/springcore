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
public class CI_withMap 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("CI_with_map.xml");
		MapWithDepObject ans = (MapWithDepObject)context.getBean("question");
		ans.getAnswers();
		
	}

}
