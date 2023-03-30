package KlasyObiektyPola;

public class PlanetarySystem {
    private String starName;
    private String starType;
    private int numberOfPlanets;

    public PlanetarySystem(String starName, String starType, int numberOfPlanets) {
        this.starName = starName;
        this.starType = starType;
        this.numberOfPlanets = numberOfPlanets;

        System.out.println("Name of star is: " + starName + ", star type is " + starType + ", number of planets is " + numberOfPlanets);
    }

    public PlanetarySystem() {

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
        System.out.println("Number of planets: " + numberOfPlanets);
    }


    public void printStarName() {
        System.out.println("Star name: " + starName);
    }

    public void printStarType() {
        System.out.println("Star type: " + starType);
    }
}
