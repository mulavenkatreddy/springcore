/**
 * 
 */
package com.spring.springcore.autowiring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * @author bridgeit
 *
 */
@Configuration
//@ComponentScan("com.spring.springcore.autowiring")
public class AutowiringConfig 
{
	@Bean // return a object
	@Primary // used to give priority when to class two or more class implements same interface
	public Amd amdProcessor()
	{
		return new Amd("athlon,AMD fx");
		
	}
	@Bean
	public Intel intelProcessor()
	{
		return new Intel("i3,i5,i7");
	}
	
	@Bean
	public Motorala moto()
	{
		return new Motorala();
	}
}
