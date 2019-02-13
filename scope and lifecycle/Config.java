/**
 * 
 */
package com.spring.springcoreprograms.springbeanlifecycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author bridgeit
 *
 */
@Configuration
public class Config 
{
	@Bean()
	public NoOfCharacters chara()
	{
		return new NoOfCharacters("hello");
	}
}
