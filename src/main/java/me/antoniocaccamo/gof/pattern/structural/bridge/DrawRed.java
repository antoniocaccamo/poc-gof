package me.antoniocaccamo.gof.pattern.structural.bridge;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 * @author antoniocaccamo on 2020-01-31
 *
 */
@Slf4j
public class DrawRed implements DrawAPI{

	@Override
	public void drawCircle(int radius, int x, int y) {
		log.info("Drawing Circle[ color: red, radius: {}, x: {}, y: {}]", radius,x , y);		
	}
	

	@Override
	public void drawSquare(int side, int x, int y) {
		log.info("drawing Square[ color: red, side: {}, x: {}, y: {}]", side,x , y);		
	}

	
}
