package me.antoniocaccamo.gof.pattern.behavioral.visitor;


import lombok.extern.slf4j.Slf4j;
import me.antoniocaccamo.gof.pattern.behavioral.BehavioralPatternDemo;

import java.util.Arrays;
import java.util.List;

/**
 * @author antoniocaccamo on 2020-02-03
 *
 */

@Slf4j
public class BehavorialPatternDemoVisitor implements BehavioralPatternDemo {


	private static final BehavioralPatternDemo instance = new BehavorialPatternDemoVisitor();


	public static BehavioralPatternDemo $() {
		return instance;
	}


	/**
	 *
	 */
	private BehavorialPatternDemoVisitor() {
		log.info("");
		log.info(">> In Visitor pattern, we use a visitor class which changes the executing algorithm of an element class.");
		log.info(">> By this way, execution algorithm of element can vary as and when visitor varies.");
		log.info(">> This pattern comes under behavior pattern category.");
		log.info(">> As per the pattern, element object has to accept the visitor object so that visitor object handles the operation on the element object");
		log.info("");
	}

	@Override
	public void demo() {

		List<Element> elements = Arrays.asList(
				new ElementXML(),
				new ElementXML(),
				new ElementJson(),
				new ElementXML(),
				new ElementJson()
		);

		Visitor visitor = new VisitorElement();
		elements.stream()
				.forEach(e -> e.accept(visitor));

		visitor.end();

	}

}
