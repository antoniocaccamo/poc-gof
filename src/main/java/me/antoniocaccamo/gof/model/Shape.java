package me.antoniocaccamo.gof.model;

import lombok.extern.slf4j.Slf4j;

/**
 * @author antoniocaccamo on 30/01/2020
 */
@Slf4j
public abstract class Shape implements  Cloneable {

    public enum Type {
        Circle,
        Rectangle,
        Square
    }

    public void shape() {
        log.info("shaping a {} ", getClass().getSimpleName());
    }

    @Override
    public Object clone()  {
        log.info("cloning instance {} of {}", hashCode(), getClass().getSimpleName());
        Object clone = null;
        try {
            clone = super.clone();

        } catch (CloneNotSupportedException e) {
            log.error("error occurred : {}", e);
        }
        return clone;
    }
}
