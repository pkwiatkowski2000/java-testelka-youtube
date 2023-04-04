package ObsługaWyjątków;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int password = 1111;

        System.out.println("Password: ");

        int providedPassword = 0;

        /*try {
            providedPassword = scanner.nextInt();
        } catch (InputMismatchException e) {
            e.printStackTrace();
            String test = null;
            test.length();
        } finally {
            System.out.println("Cleanup.");
            scanner.close();
        }*/

        try (Scanner scanner = new Scanner(System.in)) {
            providedPassword = scanner.nextInt();
        } catch (InputMismatchException | IllegalStateException e) {
            e.printStackTrace();

            if (password == providedPassword) {
                System.out.println("You've been logged in.");
            } else {
                System.out.println("Incorrect password.");
            }

            System.out.println("End of the program.");
        }
    }
}