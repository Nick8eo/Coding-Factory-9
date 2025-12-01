package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

public class MenuApp2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        while (true) {
            System.out.println("Please select one of the following:");
            System.out.println("1. New Form");
            System.out.println("2. Delete Form");
            System.out.println("3. Exit");
            choice = in.nextInt();
            if (choice == 3) {
                break;
            }
        }
    }
}

