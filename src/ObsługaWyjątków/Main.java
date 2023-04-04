package ObsługaWyjątków;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int password = 1111;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Password: ");

        int providedPassword = 0;

        try {
            providedPassword = scanner.nextInt();
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }

            if (password == providedPassword) {
                System.out.println("You've been logged in.");
            } else {
                System.out.println("Incorrect password.");
            }

            System.out.println("End of the program.");
    }
}