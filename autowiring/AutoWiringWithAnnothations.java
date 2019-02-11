/**
 * 
 */
package com.spring.springcore.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author bridgeit
 *
 */
public class AutoWiringWithAnnothations 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("AutoWiringAnnotation.xml");
		TextEditor tx =context.getBean("texteditor",TextEditor.class);
		tx.spellCheck();
	}

}
