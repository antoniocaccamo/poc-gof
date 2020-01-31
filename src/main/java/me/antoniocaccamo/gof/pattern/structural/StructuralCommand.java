package me.antoniocaccamo.gof.pattern.structural;


import lombok.extern.slf4j.Slf4j;
import me.antoniocaccamo.gof.pattern.structural.adapter.StructuralDemoAdapter;
import me.antoniocaccamo.gof.pattern.structural.bridge.StructuralDemoBridge;
import me.antoniocaccamo.gof.pattern.structural.decorator.StructuralDemoDecorator;
import me.antoniocaccamo.gof.pattern.structural.filter.StructuralDemoFilter;
import me.antoniocaccamo.gof.pattern.structural.proxy.StructuralDemoProxy;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(
        name = "structural",
        mixinStandardHelpOptions = true
)
@Slf4j
public class StructuralCommand implements Runnable {

    @Option(
            names = {"-t", "--type"},
            required = true,
            description = "type of structural design pattern",
            type = Type.class
    )
    private Type type;


    @Override
    public void run() {
        log.info(">> These design patterns concern class and object composition.");
        log.info(">> Concept of inheritance is used to compose interfaces and define ways to compose objects to obtain new functionalities.");
        

        StructuralDemo demo = null;
        
        switch(type){

            case adapter:
                demo = StructuralDemoAdapter.$();
                break;
                
            case bridge:            	
            	demo = StructuralDemoBridge.$();            	
            	break;
            	
            case decorator:            	
            	demo = StructuralDemoDecorator.$();
            	break;
            	
            case filter:            	
            	demo = StructuralDemoFilter.$();
            	break;
            	
            case proxy:            	
            	demo = StructuralDemoProxy.$();
            	break;
            

            default:
                throw new RuntimeException("no type ..");
        }
        demo.demo();
    }

    public enum Type {
        adapter  ,
        bridge   ,
        decorator,
        proxy,
        filter
    }

}