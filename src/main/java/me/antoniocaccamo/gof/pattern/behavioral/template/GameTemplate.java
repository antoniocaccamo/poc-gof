package me.antoniocaccamo.gof.pattern.behavioral.template;

/**
 * @author antoniocaccamo on 2020-02-03
 *
 */
public abstract class GameTemplate {


	abstract void initialize();
	abstract void startPlay();
	abstract void endPlay();

	//template method
	public final void play(){

		//initialize the game
		initialize();

		//start game
		startPlay();

		//end game
		endPlay();
	}

}
