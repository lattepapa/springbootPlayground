package com.fast.driller.p3.e9_InterfaceInherritance.InherritanceClassAndInterface;

import java.util.ArrayList;

public class Shelf {
    protected ArrayList<String> shelf;

    public Shelf() {
        shelf = new ArrayList<String>();
    }

    public ArrayList<String> getShelf() {
        return shelf;
    }

    int getCount() {
        return shelf.size();
    }
}
