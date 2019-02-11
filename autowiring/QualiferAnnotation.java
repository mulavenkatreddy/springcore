/**
 * 
 */
package com.spring.springcore.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author bridgeit
 *
 */
public class QualiferAnnotation 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("QualiferAnnotation.xml");
		Details de =context.getBean("details",Details.class);
		de.printName();
		de.printAge();
		de.printHeight();
	}

}
