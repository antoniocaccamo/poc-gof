package me.antoniocaccamo.gof.creational.factory.abstractfactory;

import lombok.extern.slf4j.Slf4j;
import me.antoniocaccamo.gof.model.Shape;
import me.antoniocaccamo.gof.model.shape.rounded.RoundedCircle;
import me.antoniocaccamo.gof.model.shape.rounded.RoundedRectangle;
import me.antoniocaccamo.gof.model.shape.rounded.RoundedSquare;

import javax.validation.constraints.NotNull;

/**
 * @author antoniocaccamo on 30/01/2020
 */
@Slf4j
public class RoundedShapeFactory extends AbstractShapeFactory {
    @Override
    public Shape createShape(Shape.@NotNull Type type) {
        log.info("shape type : {}", type);
        Shape shape = null;
        switch (type){
            case Circle:
                shape = new RoundedCircle();
                break;
            case Square:
                shape = new RoundedSquare();
                break;
            case Rectangle:
                shape = new RoundedRectangle();
                break;
            default:
                throw new RuntimeException("no shape type ..");
        }
        return shape;
    }
}
