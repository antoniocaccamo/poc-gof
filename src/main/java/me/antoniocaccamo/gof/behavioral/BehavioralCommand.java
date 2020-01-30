package me.antoniocaccamo.gof.behavioral;


import lombok.extern.slf4j.Slf4j;
import me.antoniocaccamo.gof.creational.singleton.Singleton;
import me.antoniocaccamo.gof.model.Shape;
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

        Shape shape = null;
        switch(type){

            case adapter:
                Singleton.$().dowork();
                break;

            default:
                throw new RuntimeException("no type ..");
        }
    }

    public enum Type {
        adapter
    }

}