/**
 * 
 */
package me.antoniocaccamo.gof.pattern.structural.filter;

import java.util.List;

/**
 * @author antoniocaccamo on 2020-01-31
 *
 */
public interface Filter {
	
	
	List<Person> filter(List<Person> persons);

}
