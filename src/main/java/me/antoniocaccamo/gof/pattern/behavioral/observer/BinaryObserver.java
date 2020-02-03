package me.antoniocaccamo.gof.pattern.behavioral.observer;

import lombok.extern.slf4j.Slf4j;

/**
 * @author antoniocaccamo on 2020-02-03
 *
 */
@Slf4j
public class BinaryObserver extends AbstractObserver<Subject>{

	@Override
	public void onUpdate(Subject subject) {
		log.info("Binary String: " + Integer.toBinaryString( subject.getState() ) ); 		
	}

}
