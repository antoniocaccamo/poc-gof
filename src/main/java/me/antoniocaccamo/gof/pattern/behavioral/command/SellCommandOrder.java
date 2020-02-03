/**
 * @author antoniocaccamo on 2020-02-03

 */
package me.antoniocaccamo.gof.pattern.behavioral.command;

/**
 * @author antoniocaccamo on 2020-02-03
 *
 */
public class SellCommandOrder<T extends Item> implements CommandOrder {
	
	private final T item;
	
	/**
	 * 
	 */
	public SellCommandOrder(T t) {
		item = t;
	}

	@Override
	public void execute() {
		item.sell();
	}

}
