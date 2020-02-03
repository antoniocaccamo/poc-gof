package

me.antoniocaccamo.gof.pattern.behavioral.chainofresponsability;

import lombok.Setter;

/**
 * @author antoniocaccamo on 2020-02-03
 *
 */
public abstract class AbstractLogger {
	
	public enum Level {
		DEBUG,
		INFO,
		ERROR
	}
		
	protected final Level level;
	
	
	public AbstractLogger(Level level) {		
		this.level = level;
	}


	@Setter
	protected AbstractLogger nextLogger;
	
	/**
	 * 
	 * @param l
	 * @param message
	 */
	public void logMessage(Level level, String message) {
		if ( this.level.compareTo(level) <=  0 ) {
			write(message);
		}
		if ( nextLogger != null) {
			nextLogger.logMessage(level, message);
		}
	}

	/**
	 * @param message
	 */
	protected abstract void write(String message);

}
