/**
 * 
 */
package com.spring.springcore.aop;

/**
 * @author bridgeit
 *
 */
public class BusinessLogic 
{
		public void method1()
		{
			System.out.println("method1 is invoked : void return type");
		}
		public int method2()
		{
			System.out.println("method 2 is invoked : int return type : ");
			return 10;
		}
		public String method3()
		{
			System.out.println("method 3 is invoked : String return type :");
			return "hello";
		}
		
		public void validate(int age) throws Exception
		{
			if (age<18)
			{
				throw new ArithmeticException("invalid age");
			}
			else
			{
				System.out.println("valid age");
			}
		}
}
