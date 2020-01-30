package me.antoniocaccamo.gof.structural;


import lombok.extern.slf4j.Slf4j;
import me.antoniocaccamo.gof.creational.factory.ShapeFactory;
import me.antoniocaccamo.gof.creational.factory.abstractfactory.AbstractShapeFactory;
import me.antoniocaccamo.gof.creational.factory.abstractfactory.ShapeFactoryProducer;
import me.antoniocaccamo.gof.creational.prototype.ShapePrototype;
import me.antoniocaccamo.gof.creational.singleton.Singleton;
import me.antoniocaccamo.gof.model.Shape;
import me.antoniocaccamo.gof.structural.adapter.Player;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

import java.util.Arrays;

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

        Shape shape = null;
        switch(type){

            case adapter:
                Player.play(Arrays.asList(
                        "D:\\development\\workspaces\\at.video.mp4",
                        "D:\\development\\workspaces\\at.video.mkv",
                        "D:\\development\\workspaces\\at.video.txt",
                        "D:\\development\\workspaces\\at.video.mp3"
                ));
                break;

            default:
                throw new RuntimeException("no type ..");
        }
    }

    public enum Type {
        adapter
    }

}