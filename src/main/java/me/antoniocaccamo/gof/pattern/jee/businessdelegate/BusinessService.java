package me.antoniocaccamo.gof.pattern.jee.businessdelegate;

/**
 * @author antoniocaccamo on 04/02/2020
 */
public interface BusinessService {

    void doWork();

    enum Type{
        EJB,
        JMS
    }
}
