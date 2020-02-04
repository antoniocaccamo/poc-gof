package me.antoniocaccamo.gof.pattern.behavioral.memento;

import java.util.ArrayList;
import java.util.List;


/**
 * 
 * @author antoniocaccamo on 2020-02-04
 *
 */

public class CareTaker {

    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }


}
