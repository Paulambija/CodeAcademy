package org.example.Generics.PirmaUzduotis;

import java.util.ArrayList;
import java.util.List;

public class IntegerListBox implements ListBox<Integer> {
    List <Integer> zmones= new ArrayList<>();
    @Override
    public void addElements(Integer[] values) {
        for(int i=0; i<values.length; i++){
            this.zmones.add(values[i]);
        }
    }

    @Override
    public void addElement(Integer value) {
        zmones.add(value);
    }

    @Override
    public List<Integer> getElements() {
        return zmones;
    }
}
