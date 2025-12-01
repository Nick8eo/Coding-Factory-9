package gr.aueb.cf.cf9.review.senior_level;

import java.util.Scanner;

public class EvenApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        boolean result = false;

        System.out.print("Please enter a number: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number: ");
            scanner.nextLine();
        }
        num = scanner.nextInt();

        result = isEven(num);

        System.out.println("The number is even: " + result);
    }

    public static boolean isEven(int num) {
        return num % 2 ==0;
    }
}
