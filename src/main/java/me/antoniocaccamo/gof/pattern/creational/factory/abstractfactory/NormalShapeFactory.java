package me.antoniocaccamo.gof.pattern.creational.factory.abstractfactory;

import lombok.extern.slf4j.Slf4j;
import me.antoniocaccamo.gof.model.Shape;
import me.antoniocaccamo.gof.model.shape.Circle;
import me.antoniocaccamo.gof.model.shape.Rectangle;
import me.antoniocaccamo.gof.model.shape.Square;

import javax.validation.constraints.NotNull;

/**
 * @author antoniocaccamo on 30/01/2020
 */
@Slf4j
public class NormalShapeFactory extends AbstractShapeFactory {
    @Override
    public Shape createShape(Shape.@NotNull Type type) {
        log.info("shape type : {}", type);
        Shape shape = null;
        switch (type){
            case Circle:
                shape = new Circle();
                break;
            case Square:
                shape = new Square();
                break;
            case Rectangle:
                shape = new Rectangle();
                break;
            default:
                throw new RuntimeException("no shape type ..");
        }
        return shape;
    }
}
