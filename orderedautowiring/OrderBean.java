/**
 * 
 */
package com.spring.springcore.orderedautowiring;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author bridgeit
 *
 */
public class OrderBean 
{
	@Autowired(required = true)
	private List<Names> beanList;
	
	 public void printBeanList() 
	 {

		System.out.println(beanList);

	 }
}
