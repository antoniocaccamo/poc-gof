package me.antoniocaccamo.gof.pattern.behavioral.memento;

import lombok.Data;

/**
 * 
 * @author antoniocaccamo on 2020-02-04
 *
 */

@Data
public class Memento {

    private final String state;

    public Memento(String state) {
        this.state = state;
    }
}
