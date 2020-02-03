package me.antoniocaccamo.gof.pattern.behavioral.chainofresponsability;


import lombok.extern.slf4j.Slf4j;
import me.antoniocaccamo.gof.pattern.behavioral.BehavioralDemo;

/**
 * @author antoniocaccamo on 2020-02-03
 *
 */

@Slf4j
public class BehavorialDemoChainOfResponsability implements BehavioralDemo {


	private static final BehavioralDemo instance = new BehavorialDemoChainOfResponsability();


	public static BehavioralDemo $() {
		return instance;
	}


	/**
	 * 
	 */
	private BehavorialDemoChainOfResponsability() {
		log.info("");
		log.info(">> The chain of responsibility pattern creates a chain of receiver objects for a request.");
		log.info(">> This pattern decouples sender and receiver of a request based on type of request.");
		log.info(">> This pattern comes under behavioral patterns."); 
		log.info(">> In this pattern, normally each receiver contains reference to another receiver.");
		log.info(">> If one object cannot handle the request then it passes the same to the next receiver and so on.");
		log.info("");
	}

	@Override
	public void demo() {

		AbstractLogger  loggerChain = BehavorialDemoChainOfResponsability.getChainOfResponsability();


		loggerChain.logMessage( AbstractLogger.Level.INFO, "This is an information.");
		loggerChain.logMessage(AbstractLogger.Level.DEBUG, "This is an debug level information.");
		loggerChain.logMessage(AbstractLogger.Level.ERROR, "This is an error information.");

	}

	/**
	 * @return
	 */
	private static AbstractLogger getChainOfResponsability() {
		AbstractLogger   errorLogger = new ErrorLogger(AbstractLogger.Level.ERROR);
		AbstractLogger    fileLogger = new FileLogger(AbstractLogger.Level.DEBUG);
		AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.Level.INFO);

		errorLogger.setNextLogger(fileLogger);
		fileLogger.setNextLogger(consoleLogger);

		return errorLogger;
	}

}
