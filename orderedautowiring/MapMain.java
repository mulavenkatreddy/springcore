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

public class MapMain 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		MapBean mb = context.getBean(MapBean.class);
		mb.printNameMap();
		((AnnotationConfigApplicationContext)context).close();
	}

}
