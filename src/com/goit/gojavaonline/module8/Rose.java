package com.goit.gojavaonline.module8;

import com.goit.gojavaonline.module8.Flower;

public class Rose extends Flower implements Comparable<Flower> {

       private String color;
       private int price;
       private int lenght;



        public Rose(String color, int lenght, int price) {
            this.color = color;
            this.lenght = lenght;
            this.price = price;
        }


        @Override
        public String getColor() {
            return color;
        }

        @Override
        public void setColor(String color) {
            this.color = color;
        }

        @Override
        public int getPrice() {
            return price;
        }

        @Override
        public void setPrice(int price) {
            this.price = price;
        }

        @Override
        public int getLenght() {
            return lenght;
        }

        @Override
        public void setLenght(int lenght) {
            this.lenght = lenght;
        }

        @Override
        public String toString() {
            return "Rose " +
                    "color='" + color + '\'' +
                    ", price=" + price +
                    ", lenght=" + lenght;
        }


        @Override
        public int compareTo(Flower o) {
            return this.getPrice() - o.getPrice();
        }
    }
