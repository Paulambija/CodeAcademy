package org.example.Generics.PirmaUzduotis;

public class Pagrindine {
    public static void main(String[] args) {

        StringListBox s1 = new StringListBox();
        s1.addElements(new String[]{"Jonas", "Jonaitis", "Jonaitaitis"});
        System.out.println(s1.getElements());
        s1.addElement("Papildomas Jonas");
        System.out.println(s1.getElements());

        IntegerListBox p1 = new IntegerListBox();
        p1.addElement(1);
        System.out.println(p1.getElements());
        p1.addElements(new Integer[]{2, 3, 4, 5});
        System.out.println(p1.getElements());
    }
}
