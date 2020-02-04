package me.antoniocaccamo.gof.pattern.behavioral.visitor;

/**
 * @author antoniocaccamo on 04/02/2020
 */
public class ElementJson extends Element {

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
