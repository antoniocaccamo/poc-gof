package me.antoniocaccamo.gof.creational.factory.abstractfactory;

import lombok.extern.slf4j.Slf4j;

import javax.validation.constraints.NotNull;

/**
 * @author antoniocaccamo on 30/01/2020
 */
@Slf4j
public class ShapeFactoryProducer {

    public static AbstractShapeFactory getShapeFactory(@NotNull  AbstractShapeFactory.Type type) {

        log.info("factory type : {}", type);

        AbstractShapeFactory factory = null;

        switch (type) {
            case Normal:
                factory = new NormalShapeFactory();
                break;
            case Rounded:
                factory = new RoundedShapeFactory();
                break;
            default:
                throw new RuntimeException("no factory type ..");
        }
        return factory;
    }
}
