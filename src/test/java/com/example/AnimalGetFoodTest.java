package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AnimalGetFoodTest {

    private final String animalKind;
    private final List<String> food;
    private final Animal animal;

    public AnimalGetFoodTest(String animalKind, List<String> food) {
        this.animalKind = animalKind;
        this.food = food;
        this.animal = new Animal();
    }

    @Parameterized.Parameters
    public static Object[][] getAnimalTypeData() {
        return new Object[][]{
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")},
        };
    }

    @Test
    public void getFoodTest() throws Exception {
        List<String> excepted = food;
        List<String> actual = animal.getFood(animalKind);
        assertEquals(excepted, actual);
    }
}
