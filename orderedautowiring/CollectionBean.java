/**
 * 
 */
package com.spring.springcore.orderedautowiring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author bridgeit
 *
 */

public class CollectionBean 
{
	@Autowired
	private List<String> nameList;
	
	public void getNameList()
	{
		System.out.println(nameList);
	}
}
