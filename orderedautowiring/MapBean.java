/**
 * 
 */
package com.spring.springcore.orderedautowiring;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author bridgeit
 *
 */
public class MapBean 
{
	
	private Map<Integer, String> nameMap;
	
	@Autowired
    public void setNameMap(Map<Integer, String> nameMap) 
    {
        this.nameMap = nameMap;
    }
 
    public void printNameMap() 
    {
        System.out.println(nameMap);
    }
}
