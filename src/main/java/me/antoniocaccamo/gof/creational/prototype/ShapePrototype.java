package me.antoniocaccamo.gof.creational.prototype;

import me.antoniocaccamo.gof.model.Shape;
import me.antoniocaccamo.gof.model.shape.Circle;
import me.antoniocaccamo.gof.model.shape.Rectangle;
import me.antoniocaccamo.gof.model.shape.Square;

import javax.validation.constraints.NotNull;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author antoniocaccamo on 30/01/2020
 */

public class ShapePrototype {

    private static final ConcurrentHashMap<Shape.Type, Shape> shapeHashMap = new ConcurrentHashMap();

    static {
        shapeHashMap.putIfAbsent(Shape.Type.Circle   , new Circle());
        shapeHashMap.putIfAbsent(Shape.Type.Rectangle, new Rectangle());
        shapeHashMap.putIfAbsent(Shape.Type.Square   , new Square());
    }


    public static Shape getShape(@NotNull  Shape.Type type){
        Shape shape = shapeHashMap.get(type);
        return (Shape) shape.clone();
    }

}
