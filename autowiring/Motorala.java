/**
 * 
 */
package com.spring.springcore.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author bridgeit
 *
 */
@Component
public class Motorala 
{
	@Autowired
	//@Qualifier("intelProcessor")
	Processor cpu;
	
	public void show()
	{
		cpu.process();
	}
}
