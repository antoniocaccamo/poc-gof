/**
 * 
 */
package me.antoniocaccamo.gof.pattern.structural.bridge;

import java.util.Arrays;

import lombok.extern.slf4j.Slf4j;
import me.antoniocaccamo.gof.pattern.structural.StructuralPatternDemo;

/**
 * @author antoniocaccamo on 2020-01-31
 *
 */
@Slf4j
public class StructuralPatternDemoBridge implements StructuralPatternDemo {


	private static StructuralPatternDemo structuralDemo = new StructuralPatternDemoBridge();


	private StructuralPatternDemoBridge() {
		log.info("");
		log.info(">> Bridge is used where we need to decouple an abstraction from its implementation so that the two can vary independently.");
		log.info(">> This type of design pattern comes under structural pattern as this pattern decouples implementation class and abstract class by providing a bridge structure between them"); 
		log.info(">> This pattern involves an interface which acts as a bridge which makes the functionality of concrete classes independent from interface implementer classes.");
		log.info(">> Both types of classes can be altered structurally without affecting each other");
		log.info("");
	}



	public static StructuralPatternDemo $() {

		return structuralDemo;
	}



	@Override
	public void demo () {

		Arrays.asList(
				new Circle(4,    3, 1, new DrawRed())    ,
				new Square(20, -12, 8, new DrawRed())     , 
				new Circle(7,   13, 4, new DrawBlue())   
				).stream().forEach( s -> s.draw());;

	}

}
