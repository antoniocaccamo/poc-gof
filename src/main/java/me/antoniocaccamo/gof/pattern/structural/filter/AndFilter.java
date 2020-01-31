/**
 * 
 */
package me.antoniocaccamo.gof.pattern.structural.filter;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author antoniocaccamo on 2020-01-31
 *
 */
public class AndFilter implements Filter {
	
	private final Filter firstFilter;
	private final Filter secondFilter;
	

	public AndFilter(Filter first, Filter second) {
		super();
		this.firstFilter = first;
		this.secondFilter = second;
	}
	
	@Override
	public List<Person> filter(List<Person> persons) {
					
		return firstFilter.filter(secondFilter.filter(persons));
		
	}
	
	

}
