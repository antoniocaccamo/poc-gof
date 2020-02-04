/**
 * 
 */
package me.antoniocaccamo.gof.pattern.behavioral.strategy;

/**
 * @author antoniocaccamo on 2020-02-04
 *
 */
public class AddStrategy implements Strategy {

	@Override
	public int doOperation(int x, int y) {		
		return x + y;
	}

}
