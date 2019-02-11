/**
 * 
 */
package com.spring.springcore.autowiring;

import org.springframework.stereotype.Component;

/**
 * @author bridgeit
 *
 */
@Component
public class Amd implements Processor
{
	String series;
	public Amd(String series)
	{
		this.series = series;
	}
	
	public void process() 
	{
		System.out.println("rearly used processor");
		System.out.println("avaliable series are: "+series);
	}
	
	
}
