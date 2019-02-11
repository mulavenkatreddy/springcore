/**
 * 
 */
package com.spring.springcore.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

/**
 * @author bridgeit
 *
 */
@Aspect
public class SecondaryLogicAfterReturning 
{
 @AfterReturning(pointcut = "execution(* BusinessLogic.*(..))",returning= "result")//applying pointcut on before advice  
	public void advice(JoinPoint jp,Object result)
	{
		System.out.println("method is ready to invoked");
		System.out.println("Method Signature: "  + jp.getSignature());  
        System.out.println("Result in advice: "+result);  
        System.out.println("end of after returning advice...");
	}
}
