package me.antoniocaccamo.gof.pattern.jee.businessdelegate;

import lombok.extern.slf4j.Slf4j;
import me.antoniocaccamo.gof.pattern.jee.JEEPatternDemo;

/**
 * @author antoniocaccamo on 04/02/2020
 */

@Slf4j
public class JEEPatternDemoBusinessDelegate implements JEEPatternDemo {

    private static JEEPatternDemoBusinessDelegate instance = new JEEPatternDemoBusinessDelegate();

    public static JEEPatternDemo $() {
        return instance;
    }

    private JEEPatternDemoBusinessDelegate(){
        log.info("");
        log.info(">> Business Delegate Pattern is used to decouple presentation tier and business tier.");
        log.info(">> It is basically use to reduce communication or remote lookup functionality to business tier code in presentation tier code.");
        log.info(">> In business tier we have following entities :");
        log.info(">>\t Client - Presentation tier code may be JSP, servlet or UI java code.");
        log.info(">>\t Business Delegate - A single entry point class for client entities to provide access to Business Service methods.");
        log.info(">>\t LookUp Service - Lookup service object is responsible to get relative business implementation and provide business object access to business delegate object.");
        log.info(">>\t Business Service - Business Service interface. Concrete classes implement this business service to provide actual business implementation logic.");
        log.info("");
    }

    @Override
    public void demo() {

        BusinessDelegate businessDelegate = new BusinessDelegate();
        businessDelegate.setBusinessType(BusinessService.Type.EJB);

        Client client = new Client(businessDelegate);

        client.doWork();

        businessDelegate.setBusinessType(BusinessService.Type.JMS);

        client.doWork();

    }
}
