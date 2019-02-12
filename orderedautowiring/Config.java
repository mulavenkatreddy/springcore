/**
 * 
 */
package com.spring.springcore.orderedautowiring;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author bridgeit
 *
 */

@Configuration
public class Config 
{
	@Bean
	public CollectionBean getCollectionBean()
	{
		return new CollectionBean();
	}
	
	@Bean
	public List<String> nameList()
	{
		return Arrays.asList("venkat","vamshi","rakesh","lallu");
	}
	
	@Bean
	public Map<Integer, String> nameMap()
	{
	    Map<Integer, String>  nameMap = new HashMap<>();
	    nameMap.put(1, "venkat");
	    nameMap.put(2, "venu");
	    nameMap.put(3, "srinu");
	    nameMap.put(4, "manoj");
	    return nameMap;
	}
	
	@Bean
	public MapBean getMapBean()
	{
		return new MapBean();
	}
	
	@Bean
	public OrderBean getOrderBean()
	{
		return new OrderBean();
	}
	
	@Bean
	@Order(3)
	public Names getName()
	{
		return new Names("venkat");
	}
	@Bean
	@Order(2)
	public Names getName1()
	{
		return new Names("chinni");
	}
	@Bean
	@Order(1)
	public Names getName2()
	{
		return new Names("badri");
	}
}
