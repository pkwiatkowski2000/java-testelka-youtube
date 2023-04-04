package FunkcjeIWyrażeniaLambda;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
// czy dodatnie
        // czy podzielne przez 2
        // czy jest dwucyfrowa


        Function<Integer, Boolean> isPositive = x -> x > 0;
        Function<Integer, Boolean> isEven = x -> x %2 == 0;
        Function<Integer, Boolean> isTwoDigit = x -> Math.abs(x) > 9 && Math.abs(x) < 100;

        printResult(isPositive, 20);
        printResult(isEven, 17);
        printResult(isTwoDigit, 17);
    }

    private static void printResult(Function<Integer, Boolean> function, Integer number) {
        System.out.println("Rezultat metody: " + function.apply(number));
    }
}
