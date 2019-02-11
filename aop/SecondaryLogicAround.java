/**
 * 
 */
package com.spring.springcore.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author bridgeit
 *
 */
@Aspect
public class SecondaryLogicAround 
{
	@Pointcut("execution(* BusinessLogic.*(..))")
	public void pointcut()
	{}
	@Around("pointcut()")
	public Object advice (ProceedingJoinPoint pjp)
	{
		Object obj = null;
		try 
		{
			System.out.println("method is ready to invoke");
			obj = pjp.proceed();
			System.out.println("method executed successfully");
		} 
		catch (Throwable e) 
		{
			System.out.println("exception occured while proceeding"+e.getMessage());
		}
		return obj;
	}
}
