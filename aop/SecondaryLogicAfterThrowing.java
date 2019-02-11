/**
 * 
 */
package com.spring.springcore.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

/**
 * @author bridgeit
 *
 */
@Aspect
public class SecondaryLogicAfterThrowing 
{
	@AfterThrowing(pointcut = "execution(* BusinessLogic.*(..))" , throwing = "error")
	public void advice (JoinPoint jp ,Throwable error)
	{
		System.out.println("method is ready to invoke");  
	    System.out.println("Method Signature: "  + jp.getSignature());  
	    System.out.println("Exception is: "+error);  
	    System.out.println("end of after throwing advice...");  
	}
}
