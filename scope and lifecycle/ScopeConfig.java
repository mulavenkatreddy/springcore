/**
 * 
 */
package com.spring.springcoreprograms.springbeanlifecycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @author bridgeit
 *
 */
@Configuration
public class ScopeConfig 
{
	@Bean
	/*object creation is done only once*/
	//@Scope(value="singleton")
	/*object creation is done multiple times*/
	@Scope(value = "prototype")
	public SpringScope getObject()
	{
		return new SpringScope();
	}
}
