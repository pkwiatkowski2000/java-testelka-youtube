package KlasyObiektyPola;

import org.junit.jupiter.api.Test;

public class PlanetarySystemTests {

    @Test
    public void firstTest() {
        PlanetarySystem planetarySystem = new PlanetarySystem();
        PlanetarySystem solarSystem = new PlanetarySystem("sun", "yellow dwarf", 8);
    }
}