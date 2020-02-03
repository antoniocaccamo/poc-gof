package me.antoniocaccamo.gof.pattern.behavioral.observer;

/**
 * @author antoniocaccamo on 2020-02-03
 *
 */
public abstract class AbstractObserver<T> {
			
	public abstract void onUpdate(T t);

}
