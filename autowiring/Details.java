/**
 * 
 */
package com.spring.springcore.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @author bridgeit
 *
 */
public class Details 
{
	
	@Autowired
	//@Qualifier annotation is use to specify which exact bean to be wired
	@Qualifier("student1")
	//@Qualifier("student2")
	private Student student;
	
	public Details() 
	{
		System.out.println("-----student details-------");
	}
	
	public void printAge()
	{
		System.out.println("age : "+student.getAge());
	}
	
	public void printName()
	{
		System.out.println("name : "+student.getName());
	}
	
	
	public void printHeight()
	{
		System.out.println("height : "+student.getHeight());
	}
}
