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
public class SI_withDepObject 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("SI_with_dep_object.xml");
		SI_Employee emp = (SI_Employee)context.getBean("employee");
		emp.getDetails();
	}

}
