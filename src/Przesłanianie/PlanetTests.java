package Przesłanianie;

import org.junit.jupiter.api.Test;

public class PlanetTests {
    @Test
    public void info_MessageProvided_ReturnsFullInfo() {
        Planet mars = new Planet("Mars", 1.026, 6787, 2, false);
        String message = "This is the favourite one!";
        System.out.println(mars.info(message));
    }
}
