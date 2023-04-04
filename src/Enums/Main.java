package Enums;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        coffeeMaker.prepare(CoffeeType.CAFFEINFREE);

        CoffeeType capuccino = CoffeeType.CAPUCCINO;
        System.out.println(capuccino.name());

        CoffeeType latte = CoffeeType.valueOf("LATTE");
        System.out.println(latte.name());

        CoffeeType[] coffeeTypes = CoffeeType.values();
        System.out.println(Arrays.toString(coffeeTypes));

        System.out.println(CoffeeType.MOCHA.ordinal());

        System.out.println(latte.equals(CoffeeType.LATTE));
        System.out.println(latte == CoffeeType.LATTE);

        for (CoffeeType coffee: CoffeeType.values()) {
            System.out.println(coffee);
        }
    }
}
