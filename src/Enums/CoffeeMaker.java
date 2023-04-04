package Enums;

public class CoffeeMaker {

    public void prepare(CoffeeType cofeeType) {

        String message = switch (cofeeType) {
            case LATTE -> "Przygotowuję latte...";
            case MOCHA -> "Przygotowuję mocha...";
            case CAPUCCINO -> "Przygotowuję capuccino...";
            case MACCHIATO -> "Przygotowuję macchiato...";
            case FLATWHITE -> "Przygotowuję flat white...";
            case ESPRESSO -> "Przygotowuję espresso...";
            case CAFFEINFREE -> "Przygotowuję kawę bezkofeinową...";

        };

        System.out.println(message);
    }
}


        //1: latte
        //2: mocha
        //3: capuccino
        //4: macchiato
        //5: flat white
        //6: espresso
        //7, 8: bezkofeinowa


        /*switch (cofeeType) {
            case LATTE:
                System.out.println("Przygotowuję latte...");
                break;
            case MOCHA:
                System.out.println("Przygotowuję mocha...");
                break;
            case CAPUCCINO:
                System.out.println("Przygotowuję cappuccino...");
                break;
            case MACCHIATO:
                System.out.println("Przygotowuję macchiato...");
                break;
            case FLATWHITE:
                System.out.println("Przygotowuję flat white...");
                break;
            case ESPRESSO:
                System.out.println("Przygotowuję espresso...");
                break;
            case CAFFEINFREE:
                System.out.println("Przygotowuję kawę bezkofeinową...");
                break;
            default:
                System.out.println("Nie ma takiego programu, wybierz ponownie");*/

