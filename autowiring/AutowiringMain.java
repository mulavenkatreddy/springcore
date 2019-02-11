/**
 * 
 */
package com.spring.springcore.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author bridgeit
 *
 */
public class AutowiringMain 
{

	public static void main(String[] args) 
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(AutowiringConfig.class);
		Motorala mot = context.getBean(Motorala.class);
		mot.show();
	}

}
