package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline;

    @Test
    public void getSound() {
        Cat cat = new Cat(feline);
        String actualSound = cat.getSound();
        String axpectedSound = "Мяу";
        assertEquals(axpectedSound, actualSound);
    }

    @Test
    public void getFood() throws Exception {
        Cat cat = new Cat(feline);
        List<String> expectedList = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(expectedList);
        List<String> actualList = cat.getFood();
        assertEquals(expectedList, actualList);

    }
}