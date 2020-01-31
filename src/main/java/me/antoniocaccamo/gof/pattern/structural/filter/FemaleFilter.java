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

public class FemaleFilter implements Filter {

	@Override
	public List<Person> filter(List<Person> persons) {		
		return persons.stream()
				.filter(p -> Person.GenderEnum.FEMALE.equals(p.getGender()))
				.collect(Collectors.toList());
	}

}
