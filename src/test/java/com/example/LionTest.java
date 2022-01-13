package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;


@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;


    @Test
    public void getKittens() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        int actualKittens = lion.getKittens();
        int expectedKittens = 1;
        assertEquals(expectedKittens, actualKittens);
    }


    @Test
    public void getFood() throws Exception {
        Lion lion = new Lion("Самец", feline);
        List<String> expectedList = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(expectedList);
        List<String> actualList = lion.getFood();
        assertEquals(expectedList, actualList);
    }
}