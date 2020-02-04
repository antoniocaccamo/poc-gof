package me.antoniocaccamo.gof.pattern.behavioral.strategy;


import lombok.extern.slf4j.Slf4j;
import me.antoniocaccamo.gof.pattern.behavioral.BehavioralPatternDemo;

/**
 * @author antoniocaccamo on 2020-02-03
 *
 */

@Slf4j
public class BehavorialPatternDemoStrategy implements BehavioralPatternDemo {


	private static final BehavioralPatternDemo instance = new BehavorialPatternDemoStrategy();


	public static BehavioralPatternDemo $() {
		return instance;
	}


	/**
	 *
	 */
	private BehavorialPatternDemoStrategy() {
		log.info("");
		log.info(">> In Strategy pattern, a class behavior or its algorithm can be changed at run time.");				
		log.info(">> In Strategy pattern, we create objects which represent various strategies and a context object whose behavior varies as per its strategy object.");
		log.info(">> The strategy object changes the executing algorithm of the context object.");
		log.info("");
	}

	@Override
	public void demo() {
		
		final int x = 10;
		final int y = 5;

		Context.$().setStrategy( (new AddStrategy()));
		log.info("{} : {}  {} = {}",Context.$().getStrategy().getClass().getSimpleName(),  x, y,  Context.$().applyStrategy(x, y));

		Context.$().setStrategy( (new SubstractStrategy()));	
		log.info("{} : {}  {} = {}",Context.$().getStrategy().getClass().getSimpleName(),  x, y,  Context.$().applyStrategy(x, y));

		Context.$().setStrategy( (new MultiplyStrategy()));		
		log.info("{} : {}  {} = {}",Context.$().getStrategy().getClass().getSimpleName(),  x, y,  Context.$().applyStrategy(x, y));
	}

}
