package gr.aueb.cf.cf9.ch8;

import java.util.Scanner;

public class Arithmetic1App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int result = 0;

        System.out.println("Please enter two numbers: ");
        num1 = in.nextInt();
        num2 = in.nextInt();

        result = num1 / num2; // Αν το num2 == 0 θα δώσει Arithmetic Exception

        System.out.println("Result : " + result);
    }
}
