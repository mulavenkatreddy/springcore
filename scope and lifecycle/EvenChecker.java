/**
 * 
 */
package com.spring.springcoreprograms.springbeanlifecycle;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author bridgeit
 *
 */
public class EvenChecker 
{
	private int num;
	
	@Autowired
	public EvenChecker(int num) 
	{
		this.num=num;
	}
	
	public void check()
	{
		if (num%2==0)
		{
			System.out.println("even number");
		}
		else
		{
			System.out.println("odd number");
		}
	}
	
	public void beanIntilization()
	{
		System.out.println("bean is ready to create");
	}
	public void beanDestory()
	{
		System.out.println("bean is going to destory");
	}
	
}
