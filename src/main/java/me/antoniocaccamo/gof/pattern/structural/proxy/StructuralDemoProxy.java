/**
 * 
 */
package me.antoniocaccamo.gof.pattern.structural.proxy;

import lombok.extern.slf4j.Slf4j;
import me.antoniocaccamo.gof.pattern.structural.StructuralDemo;

/**
 * @author antoniocaccamo on 2020-01-31
 *
 */

@Slf4j
public class StructuralDemoProxy implements StructuralDemo {

	private static StructuralDemo structuralDemo = new StructuralDemoProxy();


	private StructuralDemoProxy() {
		log.info("");
		log.info(">> In Proxy pattern, a class represents functionality of another class. This type of design pattern comes under structural pattern."); 
		log.info(">> In Proxy pattern, we create object having original object to interface its functionality to outer world.");
		log.info("");

	}


	public static StructuralDemo $() {

		return structuralDemo;
	}




	@Override
	public void demo() {

		Image image = new ProxyImage("test_10mb.jpg");

		//image will be loaded from disk
		image.display(); 
		log.info("");
		//image will not be loaded from disk
		image.display(); 


	}

}
