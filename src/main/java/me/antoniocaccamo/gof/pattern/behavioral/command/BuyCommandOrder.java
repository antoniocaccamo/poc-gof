/**
 * @author antoniocaccamo on 2020-02-03

 */
package me.antoniocaccamo.gof.pattern.behavioral.command;

/**
 * @author antoniocaccamo on 2020-02-03
 *
 */
public class BuyCommandOrder<T extends Item> implements CommandOrder {
	
	private final T item;
	
	/**
	 * 
	 */
	public BuyCommandOrder(T t) {
		item = t;
	}

	@Override
	public void execute() {
		item.buy();
	}

}
