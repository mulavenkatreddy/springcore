/**
 * 
 */
package com.spring.springcore.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author bridgeit
 *
 */
public class EmployeeMain 
{

	public static void main(String[] args) 
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
		//Employee emp = context.getBean("employee",Employee.class);
		Employee emp = context.getBean("getEmployeeDetails",Employee.class);
		emp.getDetails();
		
		((AnnotationConfigApplicationContext)context).close();
	}

}
