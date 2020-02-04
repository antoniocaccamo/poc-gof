package me.antoniocaccamo.gof.pattern.jee.businessdelegate;

/**
 * @author antoniocaccamo on 04/02/2020
 */
public class BusinessDelegate {

    private final BusinessLookup businessLookup = new BusinessLookup();

    private BusinessService.Type type;


    public void setBusinessType(BusinessService.Type type){
        this.type = type;
    }

    public void doWork(){
        final BusinessService businessService = businessLookup.getBusinessService(type);
        businessService.doWork();
    }

}
