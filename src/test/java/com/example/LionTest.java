package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

//@RunWith(Parameterized.class)
@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;
   // private String sex;
   // private boolean expectedHaveMane;

   // public LionTest (String sex, boolean expectedHaveMane){
   //     this.sex = sex;
   //     this.expectedHaveMane = expectedHaveMane;
   //     }

        //@Parameterized.Parameters
        //public static Object [][] doesHaveMane (){
        //return new  Object[][]{
        //        {"Самец", true},
        //        {"Самка", false},
        //};
        //}

    @Test
    public void doesHaveMane() throws Exception {
        Lion lion = new Lion("Самец", feline);
        boolean actualHaveMane = lion.doesHaveMane();
        boolean expectedHaveMane = true;
        assertEquals(expectedHaveMane, actualHaveMane);

    }

    @Test
    public void getKittens() throws Exception {
        Lion lion = new Lion("Самец", feline);
        int actualKittens = lion.getKittens();
        int expectedKittens = 1;
        assertEquals(expectedKittens, actualKittens);
    }



    @Test
    public void getFood() throws Exception {
        Lion lion = new Lion("Самец", feline);
        List<String> actualList = lion.getFood();
        List<String> expectedList = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expectedList, actualList);
    }
}