package com.goit.gojavaonline.module8.test;


import com.goit.gojavaonline.module8.*;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;


import java.util.TreeSet;

public class ShifratorTest {
    private static TreeSet<Flower> set;

    @BeforeClass
    public static void setUp() throws Exception {
        set = new TreeSet<>();
        set.add(new Romashka("red", 25, 30));
        set.add(new Rose("red", 15, 22));
        set.add(new Astra("white", 10, 20));
        set.add(new Tulip("pink", 15, 35));
    }

    @Test
    public void testCollectionToString() throws Exception {

        final String result = new Shifrator().collectionToString(set);
        final String waitingResult = "Astra color='white', price=20, lenght=10 Rose color='red', price=22, lenght=15 Romashka color='red', price=30, lenght=25 Tulip color='pink', price=35, lenght=15 ";
        Assert.assertEquals(waitingResult, result);

    }

    @Test
    public void testEncryptor() throws Exception {

        final String textForEncrypted = "Test text for Encrypted";
        final String waitingResult = "\u0086\u0097¥¦R¦\u0097ª¦R\u0098¡¤Rw \u0095¤«¢¦\u0097\u0096";
        Assert.assertEquals(waitingResult, new Shifrator().encryptor(textForEncrypted));
    }

    @Test
    public void testDecoder() throws Exception {
        final String waitingResult = "Test text for Encrypted";
        final String textForDecoder = "\u0086\u0097¥¦R¦\u0097ª¦R\u0098¡¤Rw \u0095¤«¢¦\u0097\u0096";
        Assert.assertEquals(waitingResult, new Shifrator().decoder(textForDecoder));
    }
}
