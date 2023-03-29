import org.junit.jupiter.api.Test;

import java.util.Random;

public class PętlaWhileOrazDoWhile {
    @Test
    public void whileExample() {
        int silnia5 = 1 * 2 * 3 * 4 * 5;
        int silnia4 = 1 * 2 * 3 * 4;
        int silnia1 = 1;
        int silnia0 = 1;
        int silnia6 = obliczSilnię(6);
//        int silnia8 = obliczSilnię2(8);
        czyToMojaLiczba(4);
    }

    private int obliczSilnię(int liczba) {
        int silnia = 1;
        int i = 2;

        if (liczba > 1) {
            while (i <= liczba) {
                silnia = silnia * i;
                i++;
            }
        }
        return silnia;
    }

    /*private int obliczSilnię2(int liczba) {
        int silnia = 1;
        int i = 2;

        if (liczba > 1) {
            do {
                silnia = silnia * i;
                i++;
            }
            while (i <= liczba);
        }
        return silnia;
    }
*/

    private void czyToMojaLiczba(int liczba) {
        int licznik = 0;
        Random generator = new Random();
        while (generator.nextInt(5) != liczba) {
            System.out.println("Liczba nie jest równa " + liczba);
            licznik++;
        }
        System.out.println("Wylosowało moją liczbę. Pętla wykonała się " + licznik + " razy.");
    }

    private void czyToMojaLiczba2(int liczba) {
        int licznik = 0;
        Random generator = new Random();
        do {
            System.out.println("Liczba nie jest równa " + liczba);
            licznik++;
        }
        while (generator.nextInt(5) != liczba);
    }
}
