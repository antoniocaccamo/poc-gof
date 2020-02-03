package me.antoniocaccamo.gof.pattern.behavioral.memento;

import lombok.Data;

@Data
public class Memento {

    private final String state;

    public Memento(String state) {
        this.state = state;
    }
}
