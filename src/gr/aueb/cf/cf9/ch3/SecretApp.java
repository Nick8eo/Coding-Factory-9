package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * the user must guess the secret number
 */
public class SecretApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int SECRET = 42;
        int num = 0;

        System.out.print("Please guess the secret number: ");
        while (SECRET != in.nextInt()) {
            System.out.println("You did not guess the secret number\n");
            System.out.print("Please guess the secret number: ");




        }
        System.out.println("You guessed the secret number!");
    }
}
