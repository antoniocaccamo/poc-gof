 package me.antoniocaccamo.gof.pattern.behavioral.template;
 
 
 import lombok.extern.slf4j.Slf4j;



/**
 * @author antoniocaccamo on 2020-02-03
 *
 */

@Slf4j
public class FootballGame extends GameTemplate {


	@Override
	void initialize() {
		log.info("Football Game Initialized! Start playing.");
	}

	@Override
	void startPlay() {
		log.info("Football Game Started. Enjoy the game!");
	}
	
	@Override
	void endPlay() {
		log.info("Football Game Finished!");
	}


}
