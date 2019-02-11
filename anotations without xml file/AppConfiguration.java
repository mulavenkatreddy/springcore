/**
 * 
 */
package com.spring.springcore.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author bridgeit
 *
 */
//configuration class which contains method returning beans to IOC container
@Configuration
//@ComponentScan(basePackages = {"com.spring.springcore.annotations"} )
//@PropertySource("classpath:info.properties")
public class AppConfiguration 
{
	//bean represents method contains some object to return 
	@Bean
	public Address getAddress()
	{
		return new Address(201,"hyderabad","telangana");
	}
	
	//injecting dependency object using Constructor
	//@Bean
	/*public Employee getEmployeeDetails()
	{
		return new Employee("venkat reddy",21,getAddress());
	}
	*/
	@Bean
	public Company getComapanyDetails()
	{
		
		return new CompanyAddress();
	
	}
	
	//injecting dependency object using setter method
	@Bean
	public Employee getEmployeeDetails()
	{
		Employee emp = new Employee();
				emp.setId(21);
				emp.setName("venkat reddy");
		emp.setAddress(getAddress());
		emp.setCompanyName(getComapanyDetails());
		return emp;
	}
}
