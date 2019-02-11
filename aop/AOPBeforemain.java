package com.spring.springcore.aop;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.springcore.aop.BusinessLogic;

/**
 * 
 */

/**
 * @author bridgeit
 *
 */
public class AOPBeforemain {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("AOP_Before.xml");
		BusinessLogic logic = (BusinessLogic) context.getBean("businessbean");
		logic.method1();
		System.out.println();
		System.out.println(logic.method2()+"\n");
		System.out.println(logic.method3());
	}

}
