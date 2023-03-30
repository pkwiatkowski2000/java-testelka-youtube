package KlasyObiektyPola;

import org.junit.jupiter.api.Test;

public class PlanetarySystemTests {

    @Test
    public void firstTest() {
     PlanetarySystem solarSystem = new PlanetarySystem();
        System.out.println("Star name is: " + solarSystem.starName);
    }
}
