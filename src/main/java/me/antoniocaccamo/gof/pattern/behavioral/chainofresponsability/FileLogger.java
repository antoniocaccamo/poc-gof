package me.antoniocaccamo.gof.pattern.behavioral.chainofresponsability;

import lombok.extern.slf4j.Slf4j;

/**
 * @author antoniocaccamo on 2020-02-03
 *
 */
@Slf4j
public class FileLogger extends AbstractLogger {

	/**
	 * @param level
	 */
	public FileLogger(Level level) {
		super(level);
	}

	@Override
	protected void write(String message) {
		log.info("file logger : proprity [{}] messagge : {}", level, message);
	}

}
