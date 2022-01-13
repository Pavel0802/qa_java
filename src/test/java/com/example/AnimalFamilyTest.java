package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnimalFamilyTest {

    @Test
    public void getFamily() {
        Animal animal = new Animal();
        String excepted = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        String actual = animal.getFamily();
        assertEquals(excepted, actual);
    }
}
