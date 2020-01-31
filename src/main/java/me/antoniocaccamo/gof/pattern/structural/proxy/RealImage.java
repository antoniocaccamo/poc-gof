package me.antoniocaccamo.gof.pattern.structural.proxy;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 * @author antoniocaccamo on 2020-01-31
 *
 */

@Slf4j
public class RealImage implements Image {

	private String path;

	public RealImage(String path) {
		this.path = path;
		loadFromDisk();
	}

	@Override
	public void display() {
		log.info("Displaying image {}" , path);
	}

	private void loadFromDisk(){
		log.info("Loading image {}" , path);
	}

}
