import org.junit.jupiter.api.Test;

public class OperatoryMatematyczne {
    @Test
    public void examples() {
        int pierwsza = 11;
        int druga = 2;

        int wynikDodawania = pierwsza + druga;
        int wynikDodawaniaLiczb = 11+2;
        int wynikOdejmowania = pierwsza - druga;
        int wynikMnożenia = pierwsza*druga;

        int wynikDzielenia = pierwsza/druga;

        float pierwszaFloat = 11;
        double wynikDzieleniaDouble = pierwszaFloat/druga;

        int wynikModulo = pierwsza%druga;

        pierwsza = pierwsza + druga;
        pierwsza+= druga;

        System.out.println(druga);
        System.out.println(druga++);
        System.out.println(druga);
        System.out.println(++druga);
        System.out.println(druga);

        int wynik = ++pierwsza + druga;
        }
    }
