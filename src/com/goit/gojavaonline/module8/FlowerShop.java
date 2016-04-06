package com.goit.gojavaonline.module8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

public class FlowerShop {


    public static void main(String[] args) {

        TreeSet<Flower> flowers = new TreeSet<>(); //Отсортированная коллекция
        flowers.add(new Rose("red", 15, 25));
        flowers.add(new Rose("red", 60, 70));
        flowers.add(new Astra("white", 55, 23));
        flowers.add(new Astra("white", 70, 29));
        flowers.add(new Tulip("pink", 25, 17));
        flowers.add(new Tulip("pink", 30, 30));
        flowers.add(new Romashka("white", 20, 7));

        flowersPrint(flowers);



        System.out.println();

        Shifrator shifrator = new Shifrator();
        String flofers = shifrator.collectionToString(flowers);
        System.out.println(flofers);
        System.out.println();
        String result = shifrator.encryptor(flofers);
        System.out.println(result);
        System.out.println();
        String decoderResult = shifrator.decoder(result);
        System.out.println(decoderResult);



//        Rose rose1 = new Rose("red", 60, 18);
//        Rose rose2 = new Rose("red", 50, 15);
//        Rose rose3 = new Rose("red", 40, 12);
//        Rose rose4 = new Rose("yellow", 70, 19);
//        Rose rose5 = new Rose("pink", 80, 27);
//        Rose rose6 = new Rose("red", 35, 8);
//        Rose rose7 = new Rose("white", 60, 15);
//        Rose rose8 = new Rose("white", 70, 17);
//        Rose rose9 = new Rose("white", 80, 21);
//        Rose rose10 = new Rose("blue", 60, 35);
//        ArrayList<Rose> roseList = new ArrayList<>(); // Теперь коллекций  несколько))
//        roseList.add(rose1);
//        roseList.add(rose2);
//        roseList.add(rose3);
//        roseList.add(rose4);
//        roseList.add(rose5);
//        roseList.add(rose6);
//        roseList.add(rose7);
//        roseList.add(rose8);
//        roseList.add(rose9);
//        roseList.add(rose10);
//
//        rosePrint(roseList);
//        System.out.println();
//
//        HashMap<Integer, Integer> listofRoseShurbs = new HashMap<>();
//        listofRoseShurbs.put(1, 25);
//        listofRoseShurbs.put(2, 18);
//        listofRoseShurbs.put(3, 8);
//        listofRoseShurbs.put(4, 24);
//        listofRoseShurbs.put(5, null);
//        listofRoseShurbs.put(6, 7);
//        listofRoseShurbs.put(8, 23);
//        listofRoseShurbs.put(9, 3);
//        listofRoseShurbs.put(10, 2);
//
//        roseShurbPrint(listofRoseShurbs);
    }

    public static void flowersPrint(TreeSet<Flower> name){
        for (Flower flower : name) {
            System.out.println(flower);

        }
    }

    public static void rosePrint(ArrayList<Rose> name){
        for (Rose rose: name) {
            System.out.println(rose);
        }
    }

    public static void roseShurbPrint(HashMap<Integer,Integer> name){
        for (HashMap.Entry<Integer, Integer> pair : name.entrySet())
        {
            Integer key = pair.getKey();
            Integer value = pair.getValue();
            System.out.println("Shurb number: " + key + " contains " + value + " roses.");
        }
    }
}
