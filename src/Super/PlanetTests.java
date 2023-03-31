package Super;

import org.junit.jupiter.api.Test;

public class PlanetTests {
    @Test
    public void test() {
        Planet earth = new Planet("Earth");
        Planet mars = new Planet("Mars", 687, 3389.5f, false);
    }
}
