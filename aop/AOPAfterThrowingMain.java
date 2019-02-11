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
public class AOPAfterThrowingMain 
{
	public static void main(String[] args) {
		
	ApplicationContext context = new ClassPathXmlApplicationContext("AOP_AfterThrowing.xml");
	BusinessLogic logic = context.getBean("businessbean",BusinessLogic.class);
		try {
			logic.validate(12);
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}
}