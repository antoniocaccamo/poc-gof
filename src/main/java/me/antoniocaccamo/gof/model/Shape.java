package me.antoniocaccamo.gof.model;

/**
 * @author antoniocaccamo on 30/01/2020
 */
public interface Shape {

    public enum Type {
        Circle,
        Rectangle,
        Square
    }

    public void draw();
}
