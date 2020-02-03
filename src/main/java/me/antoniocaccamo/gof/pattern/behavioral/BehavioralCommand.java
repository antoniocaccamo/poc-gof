package me.antoniocaccamo.gof.pattern.behavioral;


import lombok.extern.slf4j.Slf4j;
import me.antoniocaccamo.gof.pattern.behavioral.chainofresponsability.BehavorialDemoChainOfResponsability;
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

        BehavioralDemo demo ;
        switch(type){

            case chain:
                demo = BehavorialDemoChainOfResponsability.$();
                break;

            default:
                throw new RuntimeException("no type ..");
        }
        
        demo.demo();
    }

    public enum Type {
        chain
    }

}