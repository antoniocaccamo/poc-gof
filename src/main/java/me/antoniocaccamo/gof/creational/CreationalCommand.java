package me.antoniocaccamo.gof.creational;


import lombok.extern.slf4j.Slf4j;
import me.antoniocaccamo.gof.creational.factory.ShapeFactory;
import me.antoniocaccamo.gof.creational.factory.abstractfactory.AbstractShapeFactory;
import me.antoniocaccamo.gof.creational.factory.abstractfactory.ShapeFactoryProducer;
import me.antoniocaccamo.gof.creational.singleton.Singleton;
import me.antoniocaccamo.gof.model.Shape;
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

        Shape shape = null;
        switch(type){

            case abstractfactory:
                shape = ShapeFactoryProducer.getShapeFactory(AbstractShapeFactory.Type.Rounded).createShape(Shape.Type.Square);
                shape.draw();
                break;

            case factory:
                shape = ShapeFactory.createShape(Shape.Type.Rectangle);
                shape.draw();

            case singleton:
                Singleton.$().dowork();
                break;

            default:
                throw new RuntimeException("no type ..");
        }
    }

    public enum Type {
        abstractfactory,
        singleton,
        factory
    }

}