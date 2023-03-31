package Przeciążanie;

import org.junit.jupiter.api.Test;

public class PlanetTests {
    @Test
    public void info_NoParametersProvided_ReturnsFullInfo() {
        Planet mars = new Planet("Mars", 1.026, 6787, 2, false);
        System.out.println(mars.info());
    }
}
