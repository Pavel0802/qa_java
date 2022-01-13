package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionHaveManeTest {

    @Before
    public void setup(){
        MockitoAnnotations.openMocks(this);
    }
    private final String sex;
    private final boolean hasMane;

    public LionHaveManeTest(String sex, boolean hasMane) {
        this.sex = sex;
        this.hasMane = hasMane;
    }

    @Parameterized.Parameters
    public static Object[][] haveMane() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},

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
