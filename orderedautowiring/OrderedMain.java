/**
 * 
 */
package com.spring.springcore.orderedautowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author bridgeit
 *
 */
public class OrderedMain 
{ 
	public static void main(String[] args) 
	{
	ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
	OrderBean ob = context.getBean(OrderBean.class);
	ob.printBeanList();
	((AnnotationConfigApplicationContext)context).close();
	}
}
