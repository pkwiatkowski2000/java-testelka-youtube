package KonwersjaJawna;

public class Main {
    public static void main(String[] args) {
        double fraction = 2.67;
        long longNumber = 1080;

        //byte -> short -> int -> long -> float -> double
        //        char -> int -> long -> float -> double

        long number = (long) fraction;
        System.out.println(number);

        int intNumber = (int)  longNumber;
        System.out.println(intNumber);

        int otherNumber = (int) (3 + 2L);
    }
}
