package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * The user inserts the temperature in Celsius, and the status of is Raining
 * variable and calculates if it is snowing or not.
 */
public class SnowingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temperature = 0;
        boolean isRaining = false;
        boolean isSnowing = false;

        System.out.printf("Παρακαλώ εισάγετε αν βρέχει (true/false)");
        isRaining = scanner.nextBoolean();
        System.out.printf("Παρακαλώ εισάγετε τη θερμοκρασία");
        temperature = scanner.nextInt();

        isSnowing = isRaining && (temperature < 0);

        System.out.printf("It is snowing:" + isSnowing);
    }
}
