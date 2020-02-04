package me.antoniocaccamo.gof.pattern.structural;


import lombok.extern.slf4j.Slf4j;
import me.antoniocaccamo.gof.pattern.structural.adapter.StructuralPatternDemoAdapter;
import me.antoniocaccamo.gof.pattern.structural.bridge.StructuralPatternDemoBridge;
import me.antoniocaccamo.gof.pattern.structural.decorator.StructuralPatternDemoDecorator;
import me.antoniocaccamo.gof.pattern.structural.filter.StructuralPatternDemoFilter;
import me.antoniocaccamo.gof.pattern.structural.proxy.StructuralPatternDemoProxy;
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
        

        StructuralPatternDemo demo = null;
        
        switch(type){

            case adapter:
                demo = StructuralPatternDemoAdapter.$();
                break;
                
            case bridge:            	
            	demo = StructuralPatternDemoBridge.$();
            	break;
            	
            case decorator:            	
            	demo = StructuralPatternDemoDecorator.$();
            	break;
            	
            case filter:            	
            	demo = StructuralPatternDemoFilter.$();
            	break;
            	
            case proxy:            	
            	demo = StructuralPatternDemoProxy.$();
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