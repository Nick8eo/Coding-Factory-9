package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Previews a menu until user selects exit
 */
public class MenuApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Please select one of the following:");
            System.out.println("1. New Form");
            System.out.println("2. Delete Form");
            System.out.println("3. Exit");
            choice = in.nextInt();

        } while (choice != 3);
    }
}
