/**
 * 
 */
package com.spring.springcore.autowiring;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author bridgeit
 *
 */
public class TextEditor 
{
	// autowired annotation can be used on properties which supports both bytype and byname modes
	//@Autowired
	private SpellChecker spellChecker;
	
	// using autowiring on constructor
		//@Autowired
		 TextEditor(SpellChecker spellChecker)
		{
			this.spellChecker=spellChecker;
		}
	
		// autowiring annotation can done by using byname and bytype mode
		@Autowired
	   public void setSpellChecker( SpellChecker spellChecker )
	   {
	      this.spellChecker = spellChecker;
	   }
	   
	   public SpellChecker getSpellChecker() 
	   {
	      return spellChecker;
	   }
	   public void spellCheck() 
	   {
	      spellChecker.checkSpelling();
	   }
}
