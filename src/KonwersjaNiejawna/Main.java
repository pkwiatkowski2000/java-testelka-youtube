package KonwersjaNiejawna;

public class Main {
    public static void main(String[] args) {
        int number = 250;
        byte byteNumber = 20;
        float floatNumber = 20.7f;
        char character = 'a';

        //byte -> short -> int -> long -> float -> double
        //        char -> int -> long -> float -> double

        float floatCastNumber = number;
        System.out.println(floatCastNumber);

        int intCastNumber = byteNumber;
        System.out.println(intCastNumber);

        int ascii = character;
        System.out.println(ascii);


    }
}
