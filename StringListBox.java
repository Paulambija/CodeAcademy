package org.example.Generics.PirmaUzduotis;

import java.util.ArrayList;
import java.util.List;

public class StringListBox implements ListBox<String> {
   List<String> listas = new ArrayList<>();

    @Override
    public void addElements(String[] values) {
        for(int i=0; i< values.length; i++){
            this.listas.add(values[i]);
        }
    }

    @Override
    public void addElement(String value) {
        listas.add(value);
    }

    @Override
    public List<String> getElements() {
        return listas;
    }
}
