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
public class Intel implements Processor
{
	String series;
	public Intel(String series)
	{
		this.series=series;
	}
	
	public void process() 
	{
		System.out.println("mostly commonly used processor");
		System.out.println("avaliable series are: "+series);
	}

}
