/**
 * 
 */
package com.spring.springcoreprograms.springbeanlifecycle;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author bridgeit
 *
 */
public class EvenCheckerMain 
{
	public static void main(String[] args) 
	{
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("PrimeChecker.xml");
		EvenChecker ev = context.getBean("checker",EvenChecker.class);
		ev.check();
		context.registerShutdownHook();
	}

}
