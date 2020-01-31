/**
 * 
 */
package me.antoniocaccamo.gof.pattern.structural.decorator;

import lombok.extern.slf4j.Slf4j;
import me.antoniocaccamo.gof.model.Shape;
import me.antoniocaccamo.gof.model.shape.Circle;
import me.antoniocaccamo.gof.model.shape.Square;
import me.antoniocaccamo.gof.pattern.structural.StructuralDemo;

/**
 * @author antoniocaccamo on 2020-01-31
 *
 */

@Slf4j
public class StructuralDemoDecorator implements StructuralDemo {

	private static StructuralDemo structuralDemo = new StructuralDemoDecorator();


	private StructuralDemoDecorator() {
		log.info("");
		log.info(">> Decorator pattern allows to add new functionality an existing object without altering its structure."); 
		log.info(">> This type of design pattern comes under structural pattern as this pattern acts as a wrapper to existing class.");				
		log.info(">> This pattern creates a decorator class which wraps the original class and provides additional functionality keeping class methods signature intact");
		log.info("");

	}


	public static StructuralDemo $() {

		return structuralDemo;
	}




	@Override
	public void demo() {


		Shape circle  = new Circle();
		
		Shape decorateCircle = new RedShapeDecorator(new Circle());
		
		Shape decorateSquare = new RedShapeDecorator(new Square());

		log.info("Circle with normal border");
		circle.shape();
		
		log.info("");

		log.info("Circle of red border");
		decorateCircle.shape();
		
		log.info("");

		log.info("Square of red border");
		decorateSquare.shape();

	}

}
