package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionHaveManeTest {

    private String sex;
    private boolean hasMane;

    public LionHaveManeTest (String sex, boolean hasMane){
         this.sex = sex;
         this.hasMane = hasMane;
         }

    @Parameterized.Parameters
    public static Object [][] haveMane (){
    return new  Object[][]{
            {"Самец", true},
            {"Самка", false},
            {"", false},//должен выдать Exception: Используйте допустимые значения пола животного - самец или самка
    };
    }
    @Mock
    Feline feline;

    @Test
    public void doesHaveMane() throws Exception {
        Lion lion = new Lion(sex, feline);
        boolean actualHaveMane = lion.doesHaveMane();
        boolean expectedHaveMane = hasMane;
        assertEquals(expectedHaveMane, actualHaveMane);

    }
}
