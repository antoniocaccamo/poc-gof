package me.antoniocaccamo.gof.pattern.structural.decorator;

import me.antoniocaccamo.gof.model.Shape;

/**
 * @author antoniocaccamo on 2020-01-31
 *
 */

public abstract class ShapeDecorator extends Shape {
	
	protected final Shape decoratedShape;

	public ShapeDecorator(Shape shape) {
		super();
		this.decoratedShape = shape;
	}
	
	public void shape() {
		decoratedShape.shape();
	}

}
