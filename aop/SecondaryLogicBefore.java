/**
 * 
 */
package com.spring.springcore.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author bridgeit
 *
 */
@Aspect
public class SecondaryLogicBefore 
{
	@Pointcut("execution(* BusinessLogic.*(..))")
	public void m()//poincut name
	{}
	 @Before("m()")//applying pointcut on before advice  
	public void advice(JoinPoint jp)
	{
		System.out.println(jp.getSignature());
		System.out.println("method is ready to invoke");
	}
}
