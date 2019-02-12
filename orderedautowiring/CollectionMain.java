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
public class CollectionMain 
{
	public static void main(String[] args) 
	{
	ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		CollectionBean cb = context.getBean(CollectionBean.class);
		cb.getNameList();
		((AnnotationConfigApplicationContext)context).close();
	}
}