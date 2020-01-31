package me.antoniocaccamo.gof.pattern.structural.decorator;

import lombok.extern.slf4j.Slf4j;
import me.antoniocaccamo.gof.model.Shape;

/**
 * @author antoniocaccamo on 2020-01-31
 *
 */

@Slf4j
public class RedShapeDecorator extends ShapeDecorator {

	public RedShapeDecorator(Shape shape) {
		super(shape);
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public void shape() {	
		super.shape();
		log.info("Border Color: Red");
	}
	

}
