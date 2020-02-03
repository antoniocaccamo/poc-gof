package me.antoniocaccamo.gof.pattern.behavioral.command;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

/**
 * @author antoniocaccamo on 2020-02-03
 *
 */
@Slf4j @Getter @Setter @AllArgsConstructor
public class StockItem extends Item {
	
	private final String name;
	private final int    qta;
	
	@Override
	public void sell() {
		log.info("Stock [ Name: {} Quantity: {} ] sold", name, qta);
		
	}
	@Override
	public void buy() {
		log.info("Stock [ Name: {} Quantity: {} ] bought", name, qta);
		
	}


}
