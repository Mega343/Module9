package com.goit.gojavaonline.module8;

import java.util.TreeSet;

public class Shifrator {

    private int key = 50;
    private int value = 256;

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public static String collectionToString(TreeSet<Flower> name){
        StringBuilder s = new StringBuilder();
        for (Flower flower : name) {
            s.append(flower + " ");
        }
        String result = s.toString();
            return result;
        }

    public String encryptor(String s){
        String result = "";
      //  StringBuilder temp = new StringBuilder();
        char[] mas = s.toCharArray(); // преобразовываем строку в символы
        int[] charCodes = new int[mas.length];
        for (int i = 0; i < mas.length; i++) {
            charCodes[i] = Integer.valueOf(mas[i]); //преобразовали в ASCII код
        }

        int[] encryptedMassive = new int[charCodes.length];
        for (int i = 0; i < charCodes.length; i++) {
            encryptedMassive[i] = (charCodes[i] + getKey())%getValue();// шифруем
        }

        char[] charEncryptedMassive = new char[encryptedMassive.length];
        for (int i = 0; i < encryptedMassive.length; i++) {
          charEncryptedMassive[i] =  (char)(encryptedMassive[i]); //перевели в массив символов
        }

        for (int i = 0; i < charEncryptedMassive.length; i++) {
           result += String.valueOf(charEncryptedMassive[i]); // преобразовали к строке
        }
        return result;
    }


    public String decoder(String s){
        String result = "";
        char[] mas = s.toCharArray(); // преобразовываем строку в символы
        int[] charCodes = new int[mas.length];
        for (int i = 0; i < mas.length; i++) {
            charCodes[i] = Integer.valueOf(mas[i]); //преобразовали в ASCII код
        }

        int[] decoderMassive = new int[charCodes.length];
        for (int i = 0; i < charCodes.length; i++) {
            decoderMassive[i] = (charCodes[i] - getKey() + getValue())%getValue(); // decoder
        }

        char[] charDecoderMassive = new char[decoderMassive.length];
        for (int i = 0; i < decoderMassive.length; i++) {
            charDecoderMassive[i] =  (char)(decoderMassive[i]);//перевели в массив символов
        }

        for (int i = 0; i < decoderMassive.length; i++) {
            result += String.valueOf(charDecoderMassive[i]);
        }
        return result;
    }

}

