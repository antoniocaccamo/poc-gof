package me.antoniocaccamo.gof.pattern.behavioral.memento;

import lombok.Data;

@Data
public class Originator {

    private String state;

    public Memento saveStateToMemento(){
        return new Memento(state);
    }

    public void getStateFromMemento(Memento memento){
        state = memento.getState();
    }

}
