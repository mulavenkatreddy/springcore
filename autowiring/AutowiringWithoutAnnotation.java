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
public class AutowiringWithoutAnnotation {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("Autowiring.xml");
		TextEditor tx =context.getBean("texteditor",TextEditor.class);
		tx.spellCheck();
	}

}
