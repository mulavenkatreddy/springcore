/**
 * 
 */
package com.spring.springcoreprograms.springbeanlifecycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author bridgeit
 *
 */
public class ScopeMain 
{
	public static void main(String[] args) 
	{
		 AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);
		 SpringScope ss = context.getBean(SpringScope.class);
		 ss.bean();
		 System.out.println("hashcode of first object: "+ss.hashCode());
		 SpringScope ss1 = context.getBean(SpringScope.class);
		 System.out.println("hashcode of second object: "+ss1.hashCode());
		 context.registerShutdownHook();
	}

}
