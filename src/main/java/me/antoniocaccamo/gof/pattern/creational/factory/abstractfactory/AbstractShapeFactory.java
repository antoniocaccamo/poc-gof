package me.antoniocaccamo.gof.pattern.creational.factory.abstractfactory;

import me.antoniocaccamo.gof.model.Shape;

import javax.validation.constraints.NotNull;

/**
 * @author antoniocaccamo on 30/01/2020
 */
public abstract class AbstractShapeFactory {

    public enum Type {
        Normal,
        Rounded
    }

    public  abstract  Shape createShape(@NotNull Shape.Type type);
}
