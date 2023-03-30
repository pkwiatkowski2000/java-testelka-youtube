package TypyReferencyjne;

import KlasyObiektyPola.PlanetarySystem;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TypesTests {

    @Test
    public void doesIntChangeValueTest() {
        int firstInt = 5;
        int secondInt = firstInt;
        firstInt = 6;
        Assertions.assertEquals(5, secondInt);
    }

    @Test
    public void doesObjectChangeValueTest() {
        PlanetarySystem firstSystem = new PlanetarySystem();
        PlanetarySystem secondSystem = firstSystem;
        firstSystem.setNumberOfPlanets(13);
        Assertions.assertEquals(13, secondSystem.getNumberofPlanets());
    }

    @Test
    public void doesStringChangeValueTest() {
        String firstString = "pierwszy";
        String secondString = firstString;
        firstString = "zmieniony";
        Assertions.assertEquals("pierwszy", secondString);
    }

    // String jest szczególnym typem i jest niezmienny.
}

