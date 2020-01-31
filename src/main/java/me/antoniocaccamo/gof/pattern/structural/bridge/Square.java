package me.antoniocaccamo.gof.pattern.structural.bridge;

public class Square extends Shape {

	private final int side,  x,  y;

	public Square(int side, int x, int y, DrawAPI drawAPI) {
		super(drawAPI);
		this.side = side;
		this.x = x;
		this.y = y;
	}

	@Override
	public void draw() {
		drawAPI.drawSquare(side, x, y);		
	}
}
