package Przeciążanie;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PlanetTests {
    @Test
    public void info_NoParametersProvided_ReturnsFullInfo() {
        Planet mars = new Planet("Mars", 1.026, 6787, 2, false);

        Assertions.assertEquals("Name: Mars\n" +
                        "Rotation period (days): 1.026\n" +
                        "Diameter (km): 6787\n" +
                        "Moons: 2\n" +
                        "Has rings?: false",
                mars.info());
    }

    @Test
    public void info_MessageProvided_ReturnsFullInfo() {
        Planet mars = new Planet("Mars", 1.026, 6787, 2, false);
        String message = "This is the favourite one!";

        Assertions.assertEquals("Name: Mars\n" +
                        "Rotation period (days): 1.026\n" +
                        "Diameter (km): 6787\n" +
                        "Moons: 2\n" +
                        "Has rings?: falser" +
                        "\n\n" + message,
                mars.info(message));
    }
}
