package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

//@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    Lion lion = new Lion("Самец");
    public LionTest() throws Exception {
    }
    //Lion lion;

    @Test
    public void getKittens() throws Exception {
        //Lion lion = new Lion("Самец");
        int actualKittens = lion.getKittens();
        int expectedKittens = 2;
        assertEquals(expectedKittens, actualKittens);
    }

    @Test
    public void doesHaveMane() throws Exception {
        //Lion lion = new Lion("Самец");
        boolean actualHaveMane = lion.doesHaveMane();
        boolean expectedHaveMane = true;
        assertEquals(expectedHaveMane, actualHaveMane);

    }

    @Test
    public void getFood() throws Exception {
        //Lion lion = new Lion("Самец");
        List<String> actualList = lion.getFood();
        List<String> expectedList = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expectedList, actualList);
    }
}