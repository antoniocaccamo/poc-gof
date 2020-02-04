package me.antoniocaccamo.gof.pattern.jee.businessdelegate;

import lombok.extern.slf4j.Slf4j;

/**
 * @author antoniocaccamo on 04/02/2020
 */

@Slf4j
public class BusinessServiceEJB implements BusinessService {
    @Override
    public void doWork() {
        log.info("{} : working...", getClass().getSimpleName());
    }
}
