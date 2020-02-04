package me.antoniocaccamo.gof.pattern.behavioral.command;


import lombok.extern.slf4j.Slf4j;
import me.antoniocaccamo.gof.pattern.behavioral.BehavioralPatternDemo;

/**
 * @author antoniocaccamo on 2020-02-03
 *
 */

@Slf4j
public class BehavorialPatternDemoCommand implements BehavioralPatternDemo {


	private static final BehavioralPatternDemo instance = new BehavorialPatternDemoCommand();


	public static BehavioralPatternDemo $() {
		return instance;
	}


	/**
	 * 
	 */
	private BehavorialPatternDemoCommand() {
		log.info("");
		log.info(">> Command pattern is a data driven design pattern and falls under behavioral pattern category.");
		log.info(">> A request is wrapped under an object as command and passed to invoker object."); 
		log.info(">> Invoker object looks for the appropriate object which can handle this command and passes the command to the corresponding object which executes the command");		
		log.info("");
	}

	@Override
	public void demo() {
		StockItem si = new  StockItem( "ABC",  10);
		
		BuyCommandOrder<StockItem>   buy = new BuyCommandOrder<StockItem>(si);
		SellCommandOrder<StockItem> sell = new SellCommandOrder<StockItem>(si);
		
		Broker broker = new Broker();
		broker.takeOrder(buy);
		broker.takeOrder(sell);
		
		
		broker.placeOrders();
		
	}

}
