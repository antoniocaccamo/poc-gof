package me.antoniocaccamo.gof.pattern.behavioral.memento;


import lombok.extern.slf4j.Slf4j;
import me.antoniocaccamo.gof.pattern.behavioral.BehavioralDemo;
import me.antoniocaccamo.gof.pattern.behavioral.observer.BinaryObserver;
import me.antoniocaccamo.gof.pattern.behavioral.observer.HexObserver;
import me.antoniocaccamo.gof.pattern.behavioral.observer.OctalObserver;
import me.antoniocaccamo.gof.pattern.behavioral.observer.Subject;

/**
 * @author antoniocaccamo on 2020-02-03
 *
 */

@Slf4j
public class BehavorialDemoMemento implements BehavioralDemo {


	private static final BehavioralDemo instance = new BehavorialDemoMemento();


	public static BehavioralDemo $() {
		return instance;
	}


	/**
	 *
	 */
	private BehavorialDemoMemento() {
		log.info("");
		log.info(">> Memento pattern is used to restore state of an object to a previous state.");
		log.info("");
	}

	@Override
	public void demo() {

		Originator originator = new Originator();
		CareTaker careTaker = new CareTaker();

		originator.setState("state #1");
		originator.setState("state #2");
		careTaker.add( originator.saveStateToMemento() );

		originator.setState("state #3");
		careTaker.add( originator.saveStateToMemento() );

		originator.setState("State #4");
		log.info("Current State      : {}" , originator.getState());

		originator.getStateFromMemento(careTaker.get(0));
		log.info("First saved State  : {}" , originator.getState());

		originator.getStateFromMemento(careTaker.get(1));
		log.info("Second saved State : {}" , originator.getState());

	}

}
