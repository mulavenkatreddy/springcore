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
public class AOPAfterMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("AOP_After.xml");
		BusinessLogic logic = (BusinessLogic) context.getBean("businessbean");
		
		logic.method1();
		System.out.println();
		System.out.println(logic.method2()+"\n");
		System.out.println(logic.method3());
	}

}
