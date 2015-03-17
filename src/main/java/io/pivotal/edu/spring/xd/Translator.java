package io.pivotal.edu.spring.xd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;

public class Translator {

	private String language;	// Requested language.
	
	public Translator(String language){
		this.language = language;
	}
	/**
	 *	Translate into the given language / dialect. 
	 */
	public String translate(String something){
		System.out.println("=============>"+something);
		if ("american-teenager".equalsIgnoreCase(language)) {
			return "Like, " + something;
		} 
		
		//	Canadian:
		return something + ", eh?";
	}
}