package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Count the numbers of iterations.
 * when the user inserts -1,
 * the while-do loop will stop.
 */
public class IterationsCountApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int iterations = 0;

        System.out.println("Please enter a number:");
        num = in.nextInt();

        while (num != -1) {
            iterations++;
            System.out.println("Please enter a number:");
            num = in.nextInt();
        }
        System.out.printf("The count of iterations is %d", iterations);
    }
}
