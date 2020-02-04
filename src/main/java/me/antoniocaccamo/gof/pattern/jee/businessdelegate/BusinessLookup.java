package me.antoniocaccamo.gof.pattern.jee.businessdelegate;

/**
 * @author antoniocaccamo on 04/02/2020
 */
public class BusinessLookup {

    public BusinessService getBusinessService(BusinessService.Type type){

        BusinessService service = null;

        switch (type) {
            case EJB:
                service = new BusinessServiceEJB();
                break;

            case JMS:
                service = new BusinessServiceJMS();
                break;

            default:
                throw new RuntimeException(String.format("business service %s not found", type));
        }

        return service;

    }
}
