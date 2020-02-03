package me.antoniocaccamo.gof.pattern.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author antoniocaccamo on 2020-02-03
 *
 */
public class Broker {
	
	private List<CommandOrder> commmandOrders = new ArrayList<CommandOrder>(); 

	   public void takeOrder(CommandOrder order){
		   commmandOrders.add(order);		
	   }
	   
	   
	   public void placeOrders() {
		   
		   commmandOrders.stream()
		   .forEach( o -> o.execute() );
		   
		   commmandOrders.clear();
	   }

}
