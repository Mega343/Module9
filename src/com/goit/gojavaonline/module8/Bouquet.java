package com.goit.gojavaonline.module8;


import java.util.HashSet;

public class Bouquet {

    HashSet<Flower> list;

    public Bouquet(Flower flower) {
        list.add(flower);
    }

    public Bouquet(HashSet<Flower> name) {
        if (!name.isEmpty())
            list.addAll(name);
        // else
        // error
    }

}
