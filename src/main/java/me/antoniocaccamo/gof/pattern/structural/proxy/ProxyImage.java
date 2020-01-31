package me.antoniocaccamo.gof.pattern.structural.proxy;

public class ProxyImage implements Image {
	
	
	private final RealImage realImage;
	
	
	private final String path;
	
	public ProxyImage(String path) {
		this.path = path;
		this.realImage = new RealImage(path);
		
	}
	

	@Override
	public void display() {
		
		realImage.display();

	}

}
