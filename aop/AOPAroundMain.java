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
public class AOPAroundMain 
{

	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("AOP_Around.xml");
		BusinessLogic logic = context.getBean("businessbean",BusinessLogic.class);
		logic.method1();
		System.out.println(logic.method2());
		System.out.println(logic.method3());

	}

}
