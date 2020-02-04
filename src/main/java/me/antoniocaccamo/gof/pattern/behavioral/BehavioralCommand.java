package me.antoniocaccamo.gof.pattern.behavioral;


import lombok.extern.slf4j.Slf4j;
import me.antoniocaccamo.gof.pattern.behavioral.chainofresponsability.BehavorialPatternDemoChainOfResponsability;
import me.antoniocaccamo.gof.pattern.behavioral.command.BehavorialPatternDemoCommand;
import me.antoniocaccamo.gof.pattern.behavioral.memento.BehavorialPatternDemoMemento;
import me.antoniocaccamo.gof.pattern.behavioral.observer.BehavorialPatternDemoObserver;
import me.antoniocaccamo.gof.pattern.behavioral.strategy.BehavorialPatternDemoStrategy;
import me.antoniocaccamo.gof.pattern.behavioral.template.BehavorialPatternDemoTemplate;
import me.antoniocaccamo.gof.pattern.behavioral.visitor.BehavorialPatternDemoVisitor;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(
        name = "behavioral",
        mixinStandardHelpOptions = true
)
@Slf4j
public class BehavioralCommand implements Runnable {

    @Option(
            names = {"-t", "--type"},
            required = true,
            description = "type of creation behavioral design pattern",
            type = Type.class
    )
    private Type type;


    @Override
    public void run() {

        log.info(">> These design patterns are specifically concerned with communication between objects.");

        BehavioralPatternDemo demo ;
        switch(type){

            case chain:
                demo = BehavorialPatternDemoChainOfResponsability.$();
                break;
                
            case command:
            	demo = BehavorialPatternDemoCommand.$();
            	break;

            case memento:
                demo = BehavorialPatternDemoMemento.$();
                break;
            	
            case observer:
            	demo = BehavorialPatternDemoObserver.$();
            	break;
            	
            case  strategy:
            	demo  = BehavorialPatternDemoStrategy.$();
            	break;
            	
            case template:
            	demo = BehavorialPatternDemoTemplate.$();
            	break;

            case visitor :
                demo = BehavorialPatternDemoVisitor.$();
                break;

            default:
                throw new RuntimeException("no type ..");
        }
        
        demo.demo();
    }

    public enum Type {
        chain,
        command,
        memento,
        observer,
        strategy,
        template,
        visitor
    }

}