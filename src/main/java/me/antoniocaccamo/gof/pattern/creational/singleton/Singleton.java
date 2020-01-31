package me.antoniocaccamo.gof.pattern.creational.singleton;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Singleton {

    private static final Singleton instance = new Singleton();

    private Singleton() {
      log.info("{} instancied", getClass().getName());  
    }

    public void dowork() {
        log.info("making work...");  
    }

    public static Singleton $() {
        return instance;
    }

}



