package me.antoniocaccamo.gof.pattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

/**
 * @author antoniocaccamo on 2020-02-03
 *
 */
@Slf4j
public class Subject {
	
	
	private List<AbstractObserver<Subject>> observers = new ArrayList<>();
	
	@Getter 
	private int state;
	
	/**
	 * 
	 * @param state
	 */
	public void setState(int state) {
		this.state = state;
		propertyChanged();
	}


	/**
	 * 
	 */
	private void propertyChanged() {
		observers.stream().forEach(os -> os.onUpdate(this));		
	}
	
	
	public void attachObserver(AbstractObserver<Subject> observer) {
		observers.add(observer);
	}

}
