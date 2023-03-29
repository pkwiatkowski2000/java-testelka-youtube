import org.junit.jupiter.api.Test;

public class Tablice {
    @Test
    public void example() {
        String[] planety = new String[8];
//        String planety[] = new String[8];


        planety[0] = "Merkury";
        planety[1] = "Wenus";
        String planetaPierwsza = planety[0];
    }

    @Test
    public void example2() {
        String[] planety = {"Merkury", "Wenus", "Ziemia", "Mars", "Jowisz", "Saturn", "Uran", "Neptun"};
        String czwartaPlaneta = planety[3];
    }

    @Test
    public void example3() {
        int[][] srednicaPlanet = new int[8][2];
        srednicaPlanet[0][0] = 1;
        srednicaPlanet[0][1] = 4879;
        srednicaPlanet[1][0] = 2;
        srednicaPlanet[1][1] = 12104;
    }

    @Test
    public void example4() {
        int[][] srednicaPlanet = {{1, 4879}, {2, 12104}, {3, 12756}, {4, 6805}, {5, 142984}, {6, 120536}, {7, 51118}, {8, 49528}};
    }
}