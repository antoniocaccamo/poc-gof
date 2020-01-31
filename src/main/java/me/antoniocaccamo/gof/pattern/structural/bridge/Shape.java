/**
 * 
 */
package me.antoniocaccamo.gof.pattern.structural.bridge;

/**
 * @author antoniocaccamo on 2020-01-31
 *
 */
public abstract class Shape {
	
	
	protected DrawAPI drawAPI;

	public Shape( DrawAPI drawAPI) {		
		this.drawAPI = drawAPI;
	}
	
	public abstract void draw();

}
