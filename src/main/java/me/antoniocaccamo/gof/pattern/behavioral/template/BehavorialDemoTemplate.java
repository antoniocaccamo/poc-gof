package me.antoniocaccamo.gof.pattern.behavioral.template;


import lombok.extern.slf4j.Slf4j;
import me.antoniocaccamo.gof.pattern.behavioral.BehavioralDemo;

/**
 * @author antoniocaccamo on 2020-02-03
 *
 */

@Slf4j
public class BehavorialDemoTemplate implements BehavioralDemo {


	private static final BehavioralDemo instance = new BehavorialDemoTemplate();


	public static BehavioralDemo $() {
		return instance;
	}


	/**
	 * 
	 */
	private BehavorialDemoTemplate() {
		log.info("");
		log.info(">> In Template pattern, an abstract class exposes defined way(s)/template(s) to execute its methods.");
		log.info(">> Its subclasses can override the method implementation as per need but the invocation is to be in the same way as defined by an abstract class.");
		log.info(">> This pattern comes under behavior pattern category");		
		log.info("");
	}

	@Override
	public void demo() {

		GameTemplate game = new CricketGame();

		game.play();

		log.info("");

		game = new FootballGame();

		game.play();

	}

}
