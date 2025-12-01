package gr.aueb.cf.cf9.review.senior_level;

import java.util.Scanner;

/**
 * creates a message that contains the name of the user and the age.
 */
public class StrConCat {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String firstname = "";
        int age = 0;
        String message = "";

        System.out.println("Please enter your first name: ");
        firstname = scanner.nextLine();

        System.out.println("Please enter your age: ");

        while (!scanner.hasNextInt()) {
            System.out.println("Please enter a valid age");
            scanner.nextLine();
        }
        age = scanner.nextInt();

        message = createMessage(firstname, age);
        System.out.println(message);

    }

    public static String createMessage(String firstname, int age) {
        return String.format("Hello, my name is %s and I am %d years old", firstname, age);
    }


}
