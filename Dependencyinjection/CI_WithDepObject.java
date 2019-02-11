/**
 * 
 */
package com.spring.springcoreprograms;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author bridgeit
 *
 */
public class CI_WithDepObject 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("CI_with_dep_object.xml");
		EmployeeWithDepObject  data = (EmployeeWithDepObject  )context.getBean("employee",EmployeeWithDepObject.class);
		data.employeeDetails();
	}

}
