import org.junit.jupiter.api.Test;

public class PętleForEachOrazFor {
    @Test
    public void forExample() {
        int silnia5 = 1 * 2 * 3 * 4 * 5;
        int silnia4 = 1 * 2 * 3 * 4;
        int silnia1 = 1;
        int silnia0 = 1;
        int silnia6 = obliczSilnię(6);
    }

    private int obliczSilnię(int liczba) {
        int silnia = 1;


        if (liczba>1) {
            for(int i = 2; i<=liczba; i++) {
                silnia = silnia*i;
            }
        }
        return silnia;
    }
    @Test
    public void forEachExample() {
        String[] planety = {"Merkury", "Wenus", "Ziemia", "Mars", "Jowisz", "Saturn", "Uran", "Neptun"};
        String tekst = " Planety naszego układu słonecznego to: ";

        for(String planeta: planety) {
            tekst = tekst + "\n" + planeta;
        }
        System.out.println(tekst);

        }

    }
