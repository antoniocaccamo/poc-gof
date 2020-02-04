/**
 * 
 */
package me.antoniocaccamo.gof.pattern.behavioral.strategy;

import lombok.Getter;
import lombok.Setter;

/**
 * @author antoniocaccamo on 2020-02-04
 *
 */
public class Context {
	
	private final static Context instance = new Context();
	
	@Getter @Setter
	private Strategy strategy;
	
	private Context() {}
	
	
	/**
	 * @return the instance
	 */
	public static Context $() {
		return instance;
	}
	
	
	public int applyStrategy(int x, int y) {
		return strategy.doOperation(x, y);
	}

}
