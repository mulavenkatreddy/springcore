/**
 * 
 */
package com.spring.springcoreprograms.springbeanlifecycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author bridgeit
 *
 */
public class CharCountMain 
{
	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		NoOfCharacters characters = context.getBean(NoOfCharacters.class);
		characters.CountChar();
		context.registerShutdownHook();
		context.close();
	}

}
