import org.junit.jupiter.api.Test;

public class Zmienne_i_klasa_String {
    @Test
    public void examples() {
        byte number;
        number = 8;

        int intNumber = 21;
        long longNumber =123864L;

        float floatNumber = 123.67F;
        double doubleNumber = 8883.68;

        boolean isTrue = false;

        char letterA = 'a';
        char alsoLetterA ='\u0061';
        System.out.println(letterA);
        System.out.println(alsoLetterA);

        String text = "Moja ulubiona książka to \"Wszechświaty równoległe\"";
        System.out.println(text);
    }
}