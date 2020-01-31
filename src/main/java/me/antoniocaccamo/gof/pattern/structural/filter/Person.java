/**
 * 
 */
package me.antoniocaccamo.gof.pattern.structural.filter;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author antoniocaccamo on 2020-01-31
 *
 */

@Getter @Setter @AllArgsConstructor
public class Person {

	private String            name;
	private GenderEnum        gender;
	private MaritalStatusEnum maritalStatus;
	
	
	public enum MaritalStatusEnum {
		SINGLE,
		MARRIED
	}
	
	public enum GenderEnum {
		MALE,
		FEMALE
	}

	@Override
	public String toString() {
		return String.format("Person [name=%s, gender=%s, maritalStatus=%s]", name, gender, maritalStatus);
	}
	
	


}
