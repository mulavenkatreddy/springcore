package com.spring.springcoreprograms.springbeanlifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class SpringScope 
{
	public void bean()
	{
		System.out.println("spring scope class.");
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
