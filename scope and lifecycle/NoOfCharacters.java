/**
 * 
 */
package com.spring.springcoreprograms.springbeanlifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author bridgeit
 *
 */

public class NoOfCharacters 
{
	
	private String word;
	
	@Autowired
	public NoOfCharacters(String word) 
	{
		this.word=word;
	}
	
	public void CountChar()
	{
		int size = word.length();
		System.out.println("bean created successfully");
		System.out.println("number of character in word : "+size);
	}
	@PostConstruct
	public void beanIntilization()
	{
		System.out.println("bean is ready to intilize");
		
	}
	@PreDestroy
	public void beanDestory()
	{
		System.out.println("bean is going to destory");
	}
}
