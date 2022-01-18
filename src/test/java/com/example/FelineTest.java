package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FelineTest {

    Feline feline = new Feline();

    @Test
    public void eatMeat() throws Exception {
        List<String> actualList = feline.eatMeat();
        List<String> expectedList = List.of("Животные", "Птицы", "Рыба");
        System.out.println(feline.eatMeat());
        assertEquals(expectedList, actualList);
    }

    @Test
    public void getFamily() {
        String actualFamily = feline.getFamily();
        String expectedFamily = "Кошачьи";
        assertEquals(expectedFamily, actualFamily);
    }

    @Test
    public void getKittens() {
        int actualKittens = feline.getKittens();
        int expectedKittens = 1;
        assertEquals(expectedKittens, actualKittens);
    }
}