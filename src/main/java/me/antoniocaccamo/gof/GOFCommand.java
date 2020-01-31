package me.antoniocaccamo.gof;

import io.micronaut.configuration.picocli.PicocliRunner;
import io.micronaut.context.annotation.Value;
import lombok.extern.slf4j.Slf4j;
import me.antoniocaccamo.gof.pattern.behavioral.BehavioralCommand;
import me.antoniocaccamo.gof.pattern.creational.CreationalCommand;
import me.antoniocaccamo.gof.pattern.structural.StructuralCommand;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;


@Command(name = "gof",
        description = "gof",
        mixinStandardHelpOptions = true,
        subcommands = {
            CreationalCommand.class,
            StructuralCommand.class,
            BehavioralCommand.class
        }
)
@Slf4j
public class GOFCommand implements Runnable {

    @Value("${micronaut.application.name}")
    private String name;


    @Option(names = {"-v", "--verbose"}, description = "...")
    boolean verbose;



    public static void main(String[] args) throws Exception {
        PicocliRunner.run(GOFCommand.class, args);
    }

    public void run() {    
        CommandLine.usage(this, System.out);
    }
}
