package me.antoniocaccamo.gof.pattern.behavioral.chainofresponsability;

import lombok.extern.slf4j.Slf4j;

/**
 * @author antoniocaccamo on 2020-02-03
 *
 */
@Slf4j
public class ConsoleLogger extends AbstractLogger {

	/**
	 * @param level
	 */
	public ConsoleLogger(Level level) {
		super(level);
	}

	@Override
	protected void write(String message) {
		log.info("console logger : proprity [{}] messagge : {}", level, message);
	}

}
