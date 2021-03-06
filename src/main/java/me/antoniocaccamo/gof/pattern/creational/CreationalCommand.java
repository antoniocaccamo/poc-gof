package me.antoniocaccamo.gof.pattern.creational;


import lombok.extern.slf4j.Slf4j;
import me.antoniocaccamo.gof.pattern.creational.factory.ShapeFactory;
import me.antoniocaccamo.gof.pattern.creational.factory.abstractfactory.AbstractShapeFactory;
import me.antoniocaccamo.gof.pattern.creational.factory.abstractfactory.ShapeFactoryProducer;
import me.antoniocaccamo.gof.pattern.creational.prototype.ShapePrototype;
import me.antoniocaccamo.gof.pattern.creational.singleton.Singleton;
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

        log.info(">> These design patterns provide a way to create objects while hiding the creation logic, rather than instantiating objects directly using new operator.");
        log.info(">> This gives program more flexibility in deciding which objects need to be created for a given use case");

        Shape shape = null;
        switch(type){

            case abstractfactory:
                shape = ShapeFactoryProducer.getShapeFactory(AbstractShapeFactory.Type.Rounded).createShape(Shape.Type.Square);
                shape.shape();
                break;

            case factory:
                shape = ShapeFactory.createShape(Shape.Type.Rectangle);
                shape.shape();

            case prototype:
                shape = ShapePrototype.getShape(Shape.Type.Circle);
                shape.shape();
                break;

            case singleton:
                Singleton.$().dowork();
                break;

            default:
                throw new RuntimeException("no type ..");
        }
    }

    public enum Type {
        abstractfactory,
        factory,
        prototype,
        singleton
    }

}