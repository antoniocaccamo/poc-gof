package me.antoniocaccamo.gof.pattern.jee.businessdelegate;

/**
 * @author antoniocaccamo on 04/02/2020
 */
public class Client {

    private final BusinessDelegate businessDelegate;

    public Client(BusinessDelegate businessDelegate) {
        this.businessDelegate = businessDelegate;
    }

    public void doWork() {
        businessDelegate.doWork();
    }
}
