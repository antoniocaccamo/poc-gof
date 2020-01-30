package me.antoniocaccamo.gof.creational;


import lombok.extern.slf4j.Slf4j;
import me.me.antoniocaccamo.gof.creational.Singleton;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(
    name = "creational", 
    mixinStandardHelpOptions = true
)
@Slf4j
public class CreationalCommand implements Runnable {

    @Option(
        names = {"-t", "--type"}, 
        required = true,
        description = "type of creation design pattern",
        type = Type.class
    )
    private Type type;


    @Override
    public void run() {        

        log.info("type : {}", type);

        switch(type){
            case singleton:
                    Singleton.$().dowork();
                break;
        }
    }

    public enum Type {
        singleton
    }

}