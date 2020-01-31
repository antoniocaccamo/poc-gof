/**
 * 
 */
package me.antoniocaccamo.gof.pattern.structural.filter;

import java.util.List;

/**
 * @author antoniocaccamo on 2020-01-31
 *
 */
public class OrFilter implements Filter {
	
	private final Filter first;
	private final Filter second;
	

	public OrFilter(Filter first, Filter second) {
		super();
		this.first = first;
		this.second = second;
	}

	@Override
	public List<Person> filter(List<Person> persons) {
		
		List<Person> fp  = first.filter(persons);		
		List<Person> sp = second.filter(persons);
		
		sp.stream()
			.forEach( p ->  {if ( ! fp.contains(p)) fp.add(p);}
			);			
		
		return fp;
		
	}
	
	

}
