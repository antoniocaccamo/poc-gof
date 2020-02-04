package me.antoniocaccamo.gof.pattern.behavioral.visitor;

/**
 * @author antoniocaccamo on 04/02/2020
 */
public interface Visitor {

    void visit(ElementJson json);
    void visit(ElementXML  xml);

    void end();
}
