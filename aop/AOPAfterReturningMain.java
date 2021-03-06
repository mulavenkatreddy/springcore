/**
 * 
 */
package com.spring.springcore.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author bridgeit
 *
 */
public class AOPAfterReturningMain
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("AOP_AfterReturning.xml");
		BusinessLogic logic = context.getBean("businessbean",BusinessLogic.class);
		System.out.println(logic.method2());
		System.out.println(logic.method3());
	}

}
