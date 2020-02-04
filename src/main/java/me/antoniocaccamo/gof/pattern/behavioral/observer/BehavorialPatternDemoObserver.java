package me.antoniocaccamo.gof.pattern.behavioral.observer;


import lombok.extern.slf4j.Slf4j;
import me.antoniocaccamo.gof.pattern.behavioral.BehavioralPatternDemo;

/**
 * @author antoniocaccamo on 2020-02-03
 *
 */

@Slf4j
public class BehavorialPatternDemoObserver implements BehavioralPatternDemo {


	private static final BehavioralPatternDemo instance = new BehavorialPatternDemoObserver();


	public static BehavioralPatternDemo $() {
		return instance;
	}


	/**
	 * 
	 */
	private BehavorialPatternDemoObserver() {
		log.info("");
		log.info(">> Observer pattern is used when there is one-to-many relationship between objects such as if one object is modified, its depenedent objects are to be notified automatically.");		
		log.info("");
	}

	@Override
	public void demo() {

		Subject subject = new Subject();
		
		subject.attachObserver(new BinaryObserver());
		subject.attachObserver(new OctalObserver());
		subject.attachObserver(new HexObserver());

		log.info("First state change: 15");	
		subject.setState(15);
		log.info("Second state change: 10");	
		subject.setState(10);

	}

}
