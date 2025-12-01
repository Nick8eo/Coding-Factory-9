package gr.aueb.cf.cf9.ch4;

import java.util.Scanner;

/**
 * shows stars using for
 */
public class StarsHorizontalApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;

        System.out.print("Please give the number of stars: ");
        num = in.nextInt();

        //HORIZONTAL STARS

        for (int i = 1; i <=num; i++) {
            System.out.print("*");
        }

        //VERTICAL STARS

        for (int i = 1; i <= num; i++) {
            System.out.println("*");

        }

        // GRID numXumn

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.print("*");

            }
            System.out.println();
        }

        // 1, 2, 3 ... stars
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
