import org.junit.jupiter.api.Test;

public class OperatoryRelacyjneILogiczne {
    @Test
    public void example() {
        int pierwszaZmienna = 2;
        int drugaZmienna = 4;
        int trzeciaZmienna = 2;

        boolean warunek = pierwszaZmienna == trzeciaZmienna;
        boolean warunek2 = 2 == 2;
        boolean warunek3 = pierwszaZmienna != trzeciaZmienna;

        boolean warunek4 = pierwszaZmienna < drugaZmienna;
        boolean warunek5 = pierwszaZmienna > drugaZmienna;
        boolean warunek6 = pierwszaZmienna <= trzeciaZmienna;
        boolean warunek7 = pierwszaZmienna >= trzeciaZmienna;

        boolean prawda = true;
        boolean fałsz = false;

        boolean warunek8 = !prawda;
        boolean warunek9 = fałsz && prawda;
        boolean warunek10 = fałsz || prawda;
        boolean warunek11 = fałsz == prawda;
        boolean warunek12 = fałsz != prawda;
        boolean warunek13 = prawda != fałsz;

        String pierwszaCzęść = "Na śniadanie zjadłem dzisiaj ";
        String drugaCzęść = "jajecznicę ";
        String trzeciaCzęść = "na maśle.";

        String tekst = pierwszaCzęść + drugaCzęść + trzeciaCzęść;
        int liczba = 123;
        String tekstzLiczbą = tekst + liczba;
        String tekstzBoolean = tekst + prawda;
    }
}
