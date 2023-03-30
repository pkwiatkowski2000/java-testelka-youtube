package KlasyObiektyPola;

public class PlanetarySystem {
    private String starName;
    private String starType;
    private int numberOfPlanets;

    public PlanetarySystem(String name, String type, int planets) {
        starName = name;
        starType = type;
        numberOfPlanets = planets;
    }

    public String getStarName() {
        return starName;
    }

    public void setNumberOfPlanets(int number) {
        numberOfPlanets = number;
    }

    public int getNumberofPlanets() {
        return numberOfPlanets;
    }

    public void printNumberOfPlanets() {
        System.out.println("Number of planets " + numberOfPlanets);
    }


    public void printStarName() {
        System.out.println("Star name: " + starName);
    }

    public void printStarType() {
        System.out.println("Star type: " + starType);
    }
}
