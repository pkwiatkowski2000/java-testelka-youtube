package Enums;

public class CoffeeMaker {

    public void prepare (int cofeeType) {

        //1: latte
        //2: mocha
        //3: capuccino
        //4: macchiato
        //5: flat white
        //6: espresso
        //7, 8: bezkofeinowa

        switch (cofeeType) {
            case 1:
                System.out.println("Przygotowuję latte...");
                break;
            case 2:
                System.out.println("Przygotowuję mocha...");
                break;
            case 3:
                System.out.println("Przygotowuję cappuccino...");
                break;
            case 4:
                System.out.println("Przygotowuję macchiato...");
                break;
            case 5:
                System.out.println("Przygotowuję flat white...");
                break;
            case 6:
                System.out.println("Przygotowuję espresso...");
                break;
            case 7:
                System.out.println("Przygotowuję kawę bezkofeinową...");
                break;
            default:
                System.out.println("Nie ma takiego programu, wybierz ponownie");
        }
    }
}
