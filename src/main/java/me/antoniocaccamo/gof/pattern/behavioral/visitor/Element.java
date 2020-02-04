package me.antoniocaccamo.gof.pattern.behavioral.visitor;

import lombok.Getter;

import java.util.UUID;

/**
 * @author antoniocaccamo on 04/02/2020
 */
public abstract  class Element {

    @Getter
    private final String uuid = UUID.randomUUID().toString();


    public abstract void accept(Visitor v);

}
