/**
 * 
 */
package me.antoniocaccamo.gof.pattern.structural.filter;

import java.util.ArrayList;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import me.antoniocaccamo.gof.pattern.structural.StructuralDemo;

/**
 * @author antoniocaccamo on 2020-01-31
 *
 */

@Slf4j
public class StructuralDemoFilter implements StructuralDemo {
	
	private static StructuralDemo structuralDemo = new StructuralDemoFilter();
	
	
	private StructuralDemoFilter() {
		log.info("");
		log.info(">> Filter pattern or Criteria pattern is a design pattern that enables developers to filter a set of objects, using different criteria, chaining them in a decoupled way through logical operations.");
		log.info(">> This type of design pattern comes under structural pattern as this pattern is combining multiple criteria to obtain single criteria.");
		log.info("");
	
	}


    public static StructuralDemo $() {
    	
       return structuralDemo;
    }

	
	

	@Override
	public void demo() {
		List<Person> persons = new ArrayList<Person>();

	      persons.add(new Person("Robert"	, Person.GenderEnum.MALE  , Person.MaritalStatusEnum.SINGLE));
	      persons.add(new Person("John"		, Person.GenderEnum.MALE  , Person.MaritalStatusEnum.MARRIED));
	      persons.add(new Person("Laura"	, Person.GenderEnum.FEMALE, Person.MaritalStatusEnum.MARRIED));
	      persons.add(new Person("Diana"	, Person.GenderEnum.FEMALE, Person.MaritalStatusEnum.SINGLE));
	      persons.add(new Person("Mike"		, Person.GenderEnum.MALE  , Person.MaritalStatusEnum.SINGLE));
	      persons.add(new Person("Bobby"	, Person.GenderEnum.MALE  , Person.MaritalStatusEnum.SINGLE));

	      Filter male           = new MaleFilter();
	      Filter female         = new FemaleFilter();
	      Filter single         = new SingleFilter();
	      Filter singleMale     = new AndFilter(single, male);
	      Filter singleOrFemale = new OrFilter(single, female);
	      
	      log.info("Males: ");
	      printPersons(male.filter(persons));
	      
	      log.info("");
	      
	      log.info("Females: ");
	      printPersons(male.filter(persons));
	      
	      log.info("");
	      
	      log.info("Sigle Male: ");
	      printPersons(singleMale.filter(persons));
	      
	      log.info("");
	      
	      log.info("Sigle or Female: ");
	      printPersons(singleOrFemale.filter(persons));

	}


	private static void printPersons(List<Person> persons) {
		persons.stream().forEach( p -> log.info("\t{}", p));		
	}

}
